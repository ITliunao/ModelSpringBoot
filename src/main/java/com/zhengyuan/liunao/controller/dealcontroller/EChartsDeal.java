package com.zhengyuan.liunao.controller.dealcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zhengyuan.liunao.entity.Stu;
import com.zhengyuan.liunao.service.StuService;

@Controller
@RequestMapping("/Sys")
public class EChartsDeal {
	@Autowired
	StuService stuService;

	@RequestMapping("/stuParseDeal")
	@ResponseBody
	public String stuParseDeal() {
		int class1 = 0;
		int class2 = 0;
		int class3 = 0;
		List<Stu> stuList = stuService.echartStu();
		for (int i = 0; i < stuList.size(); i++) {
			if (stuList.get(i).getClassid().equals("一班")) {
				class1++;
			} else if (stuList.get(i).getClassid().equals("二班")) {
				class2++;
			} else if (stuList.get(i).getClassid().equals("三班")) {
				class3++;
			}
		}
		Map map = new HashMap();
		map.put("一班", class1);
		map.put("二班", class2);
		map.put("三班", class3);
		String jsonString = JSON.toJSONString(map);
		System.out.println(jsonString);
		return jsonString;
	}
}
