package com.zhengyuan.liunao.controller.dealcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zhengyuan.liunao.entity.ClaCouTea;
import com.zhengyuan.liunao.service.ClaCouTeaService;
import com.zhengyuan.liunao.tools.Layui;

@Controller
@RequestMapping("/Sys")
public class ClaCouTeaDeal {

	@Autowired
	ClaCouTeaService claCouTeaService;

	@RequestMapping("/getClaCouTea")
	@ResponseBody
	public String getClaCouTea(@RequestParam("key[grade]") String grade, @RequestParam("key[cla]") String cla) {
		List<ClaCouTea> list = claCouTeaService.findClaCouTea(grade, cla);
		Layui l = Layui.data(list.size(), list);
		return JSON.toJSONString(l);
	}
}
