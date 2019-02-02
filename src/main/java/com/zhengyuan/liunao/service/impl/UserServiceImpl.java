package com.zhengyuan.liunao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhengyuan.liunao.entity.User;
import com.zhengyuan.liunao.mapper.UserMapper;
import com.zhengyuan.liunao.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> findUser(String account, String psw) {
		// TODO Auto-generated method stub
		return userMapper.findUser(account, psw);
	}

}
