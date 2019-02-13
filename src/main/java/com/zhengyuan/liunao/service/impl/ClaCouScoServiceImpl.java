package com.zhengyuan.liunao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhengyuan.liunao.entity.ClaCouSco;
import com.zhengyuan.liunao.mapper.ClaCouScoMapper;
import com.zhengyuan.liunao.service.ClaCouScoService;

@Service
public class ClaCouScoServiceImpl implements ClaCouScoService {

	@Autowired
	ClaCouScoMapper claCouScoMapper;

	@Override
	public List<ClaCouSco> findStusScores(String gradeid, String classid, String coursename) {
		// TODO Auto-generated method stub
		return claCouScoMapper.findStusScores(gradeid, classid, coursename);
	}

}
