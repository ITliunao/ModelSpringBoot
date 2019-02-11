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
		List<ClassScoreRecord> data = new ArrayList();
		String num;
		String name;
		String score1;
		String score2;
		String score3;
		for (int i = 0; i < cs.size(); i++) {
			data.get(i).setNum(cs.get(i).getNum());
			data.get(i).setName(cs.get(i).getName());

			while (true) {
				if (cs.get(i).getNum() == cs.get(i + 1).getNum() && i != cs.size() - 1) {
					if (cs.get(i + 1).getCoursename() == "数学") {
						data.get(i).setScore2(cs.get(i + 1).getScores());
						i++;
					}
				} else if (cs.get(i).getNum() != cs.get(i + 1).getNum()) {
					break;
				}
			}
		}
		return "";
	}
}
