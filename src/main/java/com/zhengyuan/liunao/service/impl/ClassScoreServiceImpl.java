package com.zhengyuan.liunao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhengyuan.liunao.entity.ClassScore;
import com.zhengyuan.liunao.mapper.ClassScoreMapper;
import com.zhengyuan.liunao.service.ClassScoreService;

@Service
public class ClassScoreServiceImpl implements ClassScoreService {

	@Autowired
	ClassScoreMapper classScore;

	@Override
	public List<ClassScore> findClassScore(String gradeid, String classid) {
		// TODO Auto-generated method stub
		return classScore.findClassScore(gradeid, classid);
	}

}
