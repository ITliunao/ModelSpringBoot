package com.zhengyuan.liunao.controller.dealcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zhengyuan.liunao.entity.Stu;
import com.zhengyuan.liunao.service.StuService;
import com.zhengyuan.liunao.tools.Layui;

@Controller
@RequestMapping("/Sys")
public class StuInfoDeal {

	@Autowired
	StuService stuService;

	@RequestMapping(value = "/getStuInfo")
	@ResponseBody
	public Object getStuInfo(@RequestParam("limit") String limit, @RequestParam("page") String page) {
		int lim = Integer.parseInt(limit);
		int start = (Integer.parseInt(page) - 1) * lim;
		Map<String, Object> map = new HashMap<>();
		map.put("start", start);
		map.put("pagesize", lim);
		List<Stu> allStu = stuService.findAllStu(map);
		int total = stuService.stuCount();
		Layui l = Layui.data(total, allStu);
		return JSON.toJSON(l);
	}

	@RequestMapping("/getStuByName")
	@ResponseBody
	public String getStuByName(@RequestParam("key[id]") String name, @RequestParam("limit") String limit,
			@RequestParam("page") String page) {
		int lim = Integer.parseInt(limit);
		int start = (Integer.parseInt(page) - 1) * lim;
		if (name.equals("")) {
			Map<String, Object> map = new HashMap<>();
			map.put("start", start);
			map.put("pagesize", lim);
			List<Stu> stuList = stuService.findAllStu(map);
			int total = stuService.stuCount();
			Layui l = Layui.data(total, stuList);
			return JSON.toJSONString(l);
		} else {
			List<Stu> stuList = stuService.findStuByName(name, start, lim);
			int total = stuList.size();
			Layui l = Layui.data(total, stuList);
			System.out.println(JSON.toJSONString(l));
			return JSON.toJSONString(l);
		}
	}

	@RequestMapping("/deleteStus")
	@ResponseBody
	public String deleteStus(@RequestParam("nums") Object nums) {
		String datas = nums.toString();
		System.out.println(datas);
		String[] str = datas.split(",");
		List<String> data = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			data.add(str[i]);
		}

		System.out.println(data.toString());
		if (stuService.deleteByForeach(data) > 0) {
			return "success";
		} else {
			return "fail";
		}
	}

	@RequestMapping("/deleteStu")
	@ResponseBody
	public String deleteStu(@RequestParam("num") String num) {
		if (stuService.deleteStu(num) > 0) {
			return "success";
		} else {
			return "fail";
		}
	}

	@RequestMapping("/getStuByNum")
	@ResponseBody
	public String getStuByNum(@RequestParam("num") Object num) {
		String stuNo = num.toString();
		List<Stu> stuList = new ArrayList<>();
		stuList = stuService.getStuByNum(stuNo);
		int total = stuList.size();
		Layui l = Layui.data(total, stuList);
		return JSON.toJSONString(l);
	}

	@RequestMapping("/updateStu")
	@ResponseBody
	public String updateStu(@RequestBody Map map) {
		System.out.println(map.toString());
		stuService.updateStu(map);
		return "";

	}
}
