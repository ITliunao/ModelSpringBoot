package com.zhengyuan.liunao.service;

import java.util.List;

import com.zhengyuan.liunao.entity.ClaCouTea;

public interface ClaCouTeaService {
	public List<ClaCouTea> findClaCouTea(String gradeid, String classid);
}
