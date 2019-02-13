package com.zhengyuan.liunao.controller.dealcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.zhengyuan.liunao.entity.ClassScore;
import com.zhengyuan.liunao.entity.ClassScoreRecord;
import com.zhengyuan.liunao.service.ClassScoreService;
import com.zhengyuan.liunao.tools.Layui;

@RestController
@RequestMapping("/Sys")
public class ClassScoreDeal {

	@Autowired
	ClassScoreService classScoreService;

	@RequestMapping("/getClassScore")
	public String getClassScore() {
		List<ClassScore> cs = classScoreService.findClassScore("001", "001");
		List<ClassScoreRecord> list = new ArrayList<ClassScoreRecord>();
		String chinese = "";
		String math = "";
		String english = "";
		String num = "";
		String name = "";
		for (int i = 0; i < cs.size(); i++) {
			String s = cs.get(i).getScore();
			String[] s1 = s.split(",");
			num = cs.get(i).getNum();
			name = cs.get(i).getName();
			for (int j = 0; j < s1.length; j++) {
				if (s1[j].contains("语文:")) {
					chinese = s1[j].substring(s1[j].indexOf(":") + 1);

				} else if (s1[j].contains("数学:")) {
					math = s1[j].substring(s1[j].indexOf(":") + 1);
				} else {
					english = s1[j].substring(s1[j].indexOf(":") + 1);
				}
			}
			list.add(new ClassScoreRecord(num, name, chinese, math, english));
			chinese = "";
			math = "";
			english = "";
		}
		int total = list.size();
		System.out.println(list);
		Layui l = Layui.data(total, list);

		return JSON.toJSONString(l);
	}
}
