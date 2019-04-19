package com.sykj.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sykj.entity.User;
import com.sykj.util.RabbitMQ;

@RestController
public class UserControl {
	@Resource
	private RabbitMQ rabbitMQ;

	
	@RequestMapping("/getUser/{uid}")
	public Object getUserSend(@PathVariable (value="uid") Integer uid){
		//推送信息
		String beanName="userService";
        String methodName="getUserById";//调用的方法
        //参数  
        //查询id是1和2的用户信息
        List<Object> paramList = new ArrayList<>();
        paramList.add(uid);
        //异步调用
        rabbitMQ.pushMessageToMQ(beanName, methodName, paramList);
		return "已发送";
	}
	@RequestMapping("/getUserSyc/{uid}")
	public Object getUserSyc(@PathVariable (value="uid") Integer uid){
		//推送信息
		String beanName="userService";
		String methodName="getUserById";//调用的方法
		//参数  
		//查询id是1和2的用户信息
		List<Object> paramList = new ArrayList<>();
		paramList.add(uid);
		//异步调用
		User u=(User)(rabbitMQ.pushAndReceiveMessageToMQ(beanName, methodName, paramList));
		return u;
	}
}
