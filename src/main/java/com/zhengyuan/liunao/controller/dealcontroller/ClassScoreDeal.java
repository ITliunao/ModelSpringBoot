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
		float score1 = 0;
		float score2 = 0;
		float score3 = 0;
		for (int i = 0; i < cs.size(); i++) {
			List<ClassScoreRecord> data = new ArrayList<>();

			String num = cs.get(i).getNum();
			String name = cs.get(i).getName();
			if (i > 0 && cs.get(i - 1).equals(num) || i == 0) {
				if (cs.get(i).getCoursename().equals("语文")) {
					score1 = cs.get(i).getScores();
				} else if (cs.get(i).getCoursename().equals("数学")) {
					score2 = cs.get(i).getScores();
				} else {
					score3 = cs.get(i).getScores();
				}

				data.add(new ClassScoreRecord(num, name, score1, score2, score3));
				System.out.println(data.toString());
			}
		}
		return "";
	}
}
