package com.zhengyuan.liunao.controller.dealcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.zhengyuan.liunao.service.ClaCouScoService;
import com.zhengyuan.liunao.tools.Layui;

@RestController
@RequestMapping("/Sys")
public class ClaCouScoDeal {

	@Autowired
	ClaCouScoService claCouScoService;

	@RequestMapping("/getClaCouSco")
	public String getClaCouSco(String classid) {
		System.out.println(classid);
		List list = claCouScoService.findStusScores("001", "001", "语文");
		Layui l = Layui.data(list.size(), list);
		return JSON.toJSONString(l.toString());
	}
}
