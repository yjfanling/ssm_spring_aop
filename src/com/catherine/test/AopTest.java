package com.catherine.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.catherine.service.UserService;
import com.catherine.service.UserServiceImpl;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopTest {
	@Test
	public void test(){
		UserServiceProxy usproxy=new UserServiceProxy();
		UserService us=new UserServiceImpl();
		UserService us_powerUp=usproxy.getUserServiceProxy(us);
		us_powerUp.find();
	}
	
	@Resource(name="userService")
	UserService us;
	@Test
	public void test2(){
		us.delete();
	}
}
