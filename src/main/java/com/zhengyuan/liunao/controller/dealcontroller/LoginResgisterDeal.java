package com.zhengyuan.liunao.controller.dealcontroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.zhengyuan.liunao.entity.Stu;
import com.zhengyuan.liunao.entity.Teacher;
import com.zhengyuan.liunao.entity.User;
import com.zhengyuan.liunao.service.StuService;
import com.zhengyuan.liunao.service.TeacherService;
import com.zhengyuan.liunao.service.UserService;
import com.zhengyuan.liunao.tools.MyTool;

@Controller
@RequestMapping("/Sys")
public class LoginResgisterDeal {

	@Autowired
	UserService userService;

	@Autowired
	StuService stuService;

	@Autowired
	TeacherService teacherService;

	@RequestMapping(value = "/dealLogin")
	@ResponseBody
	public String getInfo(@RequestParam(value = "num") String num, @RequestParam(value = "psw") String psw,
			@RequestParam(value = "identify") String identify, HttpSession httpSession) {
		String dataJson = "fail";

		List<Stu> stuList = new ArrayList<>();
		stuList = stuService.findStu(num, psw);
		List<Teacher> teaList = new ArrayList<>();
		teaList = teacherService.findTeacher(num, psw);

		List<User> userList = new ArrayList<>();
		userList = userService.findUser(num, psw);

		if (Integer.parseInt(identify) == 2 && stuList.size() > 0) {
			String name = stuList.get(0).getName();
			String photo = stuList.get(0).getPhoto();
			String account = stuList.get(0).getNum();
			httpSession.setAttribute("account", account);
			httpSession.setAttribute("name", name);
			httpSession.setAttribute("photo", photo);
			dataJson = JSON.toJSONString(stuList);
			return dataJson;
		} else if (Integer.parseInt(identify) == 1 && teaList.size() > 0) {
			String name = teaList.get(0).getName();
			String photo = teaList.get(0).getPhoto();
			String account = teaList.get(0).getNum();
			httpSession.setAttribute("account", account);
			httpSession.setAttribute("name", name);
			httpSession.setAttribute("photo", photo);
			dataJson = JSON.toJSONString(teaList);
			return dataJson;
		} else if (Integer.parseInt(identify) == 0 && userList.size() > 0) {
			String account = userList.get(0).getAccount();
			String name = userList.get(0).getName();
			System.out.println("account:" + account);
			httpSession.setAttribute("account", account);
			httpSession.setAttribute("name", name);
			httpSession.setAttribute("photo", "admin.png");
			dataJson = JSON.toJSONString(userList);
			return dataJson;
		} else {
			return "fail";
		}

	}

	@RequestMapping(value = "/uploadImg", method = RequestMethod.POST)
	public @ResponseBody Object updatePersonal(@RequestParam("photo") MultipartFile file, HttpServletRequest request)
			throws IllegalStateException, IOException {
		Map<String, Object> map = new HashMap<String, Object>();
		String name = System.currentTimeMillis() + "_" + file.getOriginalFilename();

		String imgAbsolutePath = MyTool.SaveImg(file, MyTool.getImg(), name);
		map.put("code", 0);
		map.put("message", "上传成功");
		map.put("data", name);
		return map;
	}

	@RequestMapping(value = "/registerStuDeal")
	@ResponseBody
	public String registerDeal(@RequestBody Map map) {
		System.out.println(map.toString());
		if (stuService.addStu(map) > 0) {
			return "success";
		}

		return "failure";
	}

	@RequestMapping(value = "/registerTeaDeal")
	@ResponseBody
	public String registerTeaDeal(@RequestBody Map map) {

		/*
		 * Teacher teacher = JSON.parseObject(data, Teacher.class);
		 * System.out.println(teacher); Map map = new HashMap(); map.put("num",
		 * teacher.getNum()); map.put("name", teacher.getName()); map.put("phone",
		 * teacher.getPhone()); map.put("photo", teacher.getPhoto()); map.put("psw",
		 * teacher.getPsw()); map.put("qq", teacher.getQq()); map.put("sex",
		 * teacher.getSex());
		 */
		if (teacherService.addTeacher(map) > 0) {
			return "success";
		}

		return "failure";
	}

}
