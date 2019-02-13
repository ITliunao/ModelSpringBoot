package com.zhengyuan.liunao.controller.dealcontroller;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhengyuan.liunao.entity.Stu;
import com.zhengyuan.liunao.service.StuService;
import com.zhengyuan.liunao.tools.ExcelUtil;

@Controller
public class StuInfoDownload {
	@Autowired
	StuService stuService;

	@RequestMapping(value = "/Sys/export")
	@ResponseBody
	public void export(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Stu> list = stuService.findAll();
		// excel标题
		String[] title = { "学号", "姓名", "性别", "年级", "班级", "手机号", "qq号" };
		// excel文件名
		String fileName = "学生信息表" + System.currentTimeMillis() + ".xls";
		// sheet名
		String sheetName = "学生信息表";
		String[][] content = new String[list.size()][7];
		for (int i = 0; i < list.size(); i++) {
			content[i] = new String[title.length];
			Stu stu = list.get(i);
			content[i][0] = stu.getNum();
			content[i][1] = stu.getName();
			content[i][2] = stu.getSex();
			content[i][3] = stu.getGradeid();
			content[i][4] = stu.getClassid();
			content[i][5] = stu.getPhone();
			content[i][6] = stu.getQq();
		}

		Workbook wb = ExcelUtil.getHSSFWorkbook(null, new Stu(), list);
		this.setResponseHeader(response, fileName);
		OutputStream os = response.getOutputStream();
		wb.write(os);
		os.flush();
		os.close();
	}

	// 发送响应流方法
	public void setResponseHeader(HttpServletResponse response, String fileName) {
		try {
			try {
				fileName = new String(fileName.getBytes(), "ISO8859-1");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.setContentType("application/octet-stream;charset=ISO8859-1");
			response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
			response.addHeader("Pargam", "no-cache");
			response.addHeader("Cache-Control", "no-cache");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
