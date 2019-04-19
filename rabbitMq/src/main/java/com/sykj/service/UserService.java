package com.sykj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sykj.entity.User;
import com.sykj.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	public User getUserById(List<Integer> uidList){
		return userMapper.getUserById(uidList.get(0));
	}
	public User getUserById(ArrayList<Integer> uidList){
		return userMapper.getUserById(uidList.get(0));
	}
}
