package com.zhengyuan.liunao.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class MyTool {
	public static String SaveImg(MultipartFile file, String dir, String imgName) {
		File direction = new File(dir);
		if (!direction.exists()) {
			direction.mkdir();
		}
		File myFile = new File(direction, imgName);
		System.out.println("addr:" + myFile.getAbsolutePath());
		try {
			FileInputStream fis = (FileInputStream) file.getInputStream();
			FileOutputStream fos = new FileOutputStream(myFile);
			int len = 0;
			byte[] b = new byte[1024];
			while ((len = fis.read(b)) != -1) {
				fos.write(b);
			}
			fos.close();
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (myFile.getAbsolutePath());
	}

	public static String getImg() {
		String imgPath = "";
		/*
		 * try {
		 * 
		 * // 部署成jar时，永远不能读取图片，只能通过字节流读取 File path = new
		 * File(ResourceUtils.getURL("classpath:").getPath()); imgPath =
		 * path.getParentFile().getParentFile().getParentFile().getParent() +
		 * File.separator + "uploads" + File.separator;
		 * 
		 * System.out.println("xxx-->ddd:" + imgPath); } catch (FileNotFoundException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }
		 */

		imgPath = "F:/uploads/";
		return imgPath;
	}

}
