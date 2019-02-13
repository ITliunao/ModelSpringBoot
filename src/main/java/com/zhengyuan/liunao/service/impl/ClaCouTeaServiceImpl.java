package com.zhengyuan.liunao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhengyuan.liunao.entity.ClaCouTea;
import com.zhengyuan.liunao.mapper.ClaCouTeaMapper;
import com.zhengyuan.liunao.service.ClaCouTeaService;

@Service
public class ClaCouTeaServiceImpl implements ClaCouTeaService {

	@Autowired
	ClaCouTeaMapper claCouTeaMapper;

	@Override
	public List<ClaCouTea> findClaCouTea(String gradeid, String classid) {
		// TODO Auto-generated method stub
		return claCouTeaMapper.findClaCouTea(gradeid, classid);
	}

}
