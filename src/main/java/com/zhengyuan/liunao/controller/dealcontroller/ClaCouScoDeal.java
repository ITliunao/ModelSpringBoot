package com.zhengyuan.liunao.controller.dealcontroller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.zhengyuan.liunao.entity.ClaCouSco;
import com.zhengyuan.liunao.service.ClaCouScoService;
import com.zhengyuan.liunao.tools.Layui;

@RestController
@RequestMapping("/Sys")
public class ClaCouScoDeal {

	@Autowired
	ClaCouScoService claCouScoService;

	@RequestMapping("/getClaCouSco")
	public String getClaCouSco(@RequestParam("key[grade]") String grade, @RequestParam("key[cla]") String cla,
			@RequestParam("key[coursename]") String coursename, HttpSession session) {
		List<ClaCouSco> list = claCouScoService.findStusScores(grade, cla, coursename);
		Layui l = Layui.data(list.size(), list);
		return JSON.toJSONString(l);
	}
}
