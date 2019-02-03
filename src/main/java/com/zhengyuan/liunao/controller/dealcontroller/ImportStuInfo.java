package com.zhengyuan.liunao.controller.dealcontroller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zhengyuan.liunao.tools.ExcelUtil;

@Controller
public class ImportStuInfo {
	@RequestMapping("/Sys/ImportStu")
	@ResponseBody
	public String uploadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Map map = ExcelUtil.excel2json(file);
		return "";

	}

}
