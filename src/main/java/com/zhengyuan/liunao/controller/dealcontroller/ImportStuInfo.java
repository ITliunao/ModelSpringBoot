package com.zhengyuan.liunao.controller.dealcontroller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
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
	public String uploadImg(@RequestParam("excel") MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 判断文件名是否为空

		Map<String, Object> map = new HashMap<String, Object>();
		// 获取文件名
		File f = (File) file;
		System.out.println(f);
		String name = f.getAbsolutePath();

		System.out.println(name);
		// 判断文件大小、即名称
		long size = file.getSize();

		InputStream is = new FileInputStream(new File(name));
		ExcelUtil.readExcelContent(is);
		for (int i = 2; i <= map.size() + 1; i++) {
			System.out.println(map.get(i));
		}
		return "";

	}

}
