package com.zhengyuan.liunao.controller.dealcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhengyuan.liunao.entity.ClassScore;
import com.zhengyuan.liunao.service.ClassScoreService;

@RestController
@RequestMapping("/Sys")
public class ClassScoreDeal {

	@Autowired
	ClassScoreService classScoreService;

	@RequestMapping("/getClassScore")
	public String getClassScore() {
		List<ClassScore> cs = classScoreService.findClassScore("001", "001");
		float sc1 = 0;
		float sc2 = 0;
		float sc3 = 0;
		for (int i = 0; i < cs.size(); i++) {
			String s = cs.get(i).getScore();
			String[] s1 = s.split(",");
			for (int j = 0; j < s1.length; j++) {
				if (s1[j].equals("语文:")) {
					sc1 = Float.parseFloat(s1[j].substring(s1[j].indexOf(":") + 1));
				} else if (s1[j].e) {

				}
			}
		}
		return cs.toString();
	}
}
