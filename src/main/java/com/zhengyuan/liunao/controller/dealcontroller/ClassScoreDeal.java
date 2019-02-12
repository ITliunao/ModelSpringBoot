package com.zhengyuan.liunao.controller.dealcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhengyuan.liunao.entity.ClassScore;
import com.zhengyuan.liunao.entity.ClassScoreRecord;
import com.zhengyuan.liunao.service.ClassScoreService;

@RestController
@RequestMapping("/Sys")
public class ClassScoreDeal {

	@Autowired
	ClassScoreService classScoreService;

	@RequestMapping("/getClassScore")
	public String getClassScore() {
		List<ClassScore> cs = classScoreService.findClassScore("001", "001");
		List<List> list = new ArrayList<>();
		List l = new ArrayList<>();
		String num = null;
		String name = null;
		float s1 = 0;
		float s2 = 0;
		float s3 = 0;
		int n = 0;
		for (int i = 0; i < cs.size(); i++) {
			list.add(l);
		}
		for (int i = 0; i < cs.size(); i++) {
			if (i == 0) {
				num = cs.get(i).getNum();
				name = cs.get(i).getName();
				if (cs.get(i).getCoursename().equals("语文")) {
					s1 = cs.get(i).getScores();
				}
				list.get(i).add(new ClassScoreRecord(num, name, s1, s2, s3));
			} else if (i > 0 && cs.get(i).getNum().equals(cs.get(i - 1).getNum())) {
				n = i;
				if (cs.get(i).getCoursename().equals("数学")) {

				}
			}
		}
		return list.toString();
	}
}
