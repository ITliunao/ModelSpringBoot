package com.zhengyuan.liunao.service;

import java.util.List;

import com.zhengyuan.liunao.entity.ClassScore;

public interface ClassScoreService {
	public List<ClassScore> findClassScore(String gradeid, String classid);
}
