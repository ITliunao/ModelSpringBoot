package com.zhengyuan.liunao.controller.viewcontroller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Sys")
public class ViewRoute {
	@RequestMapping("/loginView")
	public String loginView(HttpSession httpSession) {
		if (httpSession.getAttribute("name") != null) {
			httpSession.removeAttribute("name");
			httpSession.removeAttribute("account");
			httpSession.removeAttribute("photo");
		}
		return "login";
	}

	@RequestMapping("/adminIndex")
	public String index() {
		return "adminIndex";
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@RequestMapping("/teacherInfo")
	public String member_list() {
		return "teacherInfo";
	}

	@RequestMapping("/stuInfo")
	public String info() {
		return "stuInfo";
	}

	@RequestMapping("/parseStu")
	public String parseStu() {
		return "parseStu";
	}

	@RequestMapping("/stuAdd")
	public String StuRegister() {
		return "stuAdd";
	}

	@RequestMapping("/stuModi")
	public ModelAndView stuModi(ModelAndView mav, @RequestParam("num") String num) {
		mav.addObject("num", num);
		mav.setViewName("stuModi");
		return mav;
	}

	@RequestMapping("/ClassScore")
	public String ClassScore() {
		return "ClassScore";
	}

	@RequestMapping("/ClaCouSco")
	public String ClaCouSco() {
		return "ClaCouSco";
	}
}
