package com.zhengyuan.liunao.controller.dealcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zhengyuan.liunao.entity.Teacher;
import com.zhengyuan.liunao.service.TeacherService;
import com.zhengyuan.liunao.tools.Layui;

@Controller
@RequestMapping("/Sys")
public class TeacherInfoDeal {
	@Autowired
	TeacherService teacherService;

	int mylim;
	int mystart;

	@RequestMapping(value = "/getTeaInfo")
	@ResponseBody
	public Object getStuInfo(@RequestParam("limit") String limit, @RequestParam("page") String page) {
		int lim = Integer.parseInt(limit);
		int start = (Integer.parseInt(page) - 1) * lim;
		mylim = lim;
		mystart = start;
		Map<String, Object> map = new HashMap<>();
		map.put("start", start);
		map.put("pagesize", lim);
		List<Teacher> allTeacher = teacherService.findAllTeacher(map);
		int total = teacherService.teacherCount();
		Layui l = Layui.data(total, allTeacher);
		return JSON.toJSON(l);
	}

	@RequestMapping("/getTeaByName")
	@ResponseBody
	public String getStuByName(@RequestParam("key[id]") String name) {
		if (name.equals("")) {
			Map<String, Object> map = new HashMap<>();
			map.put("start", mystart);
			map.put("pagesize", mylim);
			List<Teacher> teacherList = teacherService.findAllTeacher(map);
			int total = teacherService.teacherCount();
			Layui l = Layui.data(total, teacherList);
			return JSON.toJSONString(l);
		} else {
			List<Teacher> teacherList = teacherService.findTeacherByName(name, mystart, mylim);
			int total = teacherList.size();
			Layui l = Layui.data(total, teacherList);
			System.out.println(JSON.toJSONString(l));
			return JSON.toJSONString(l);
		}

	}
}
