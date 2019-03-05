package com.catherine.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.catherine.service.UserService;
import com.catherine.service.UserServiceImpl;
/**
 * UserService代理类
 * @author 45969
 *
 */
public class UserServiceProxy {
	public UserService getUserServiceProxy(UserService us){
		return (UserService) Proxy.newProxyInstance(UserServiceProxy.class.getClassLoader(), UserServiceImpl.class.getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("开启事务");
				Object invoke=method.invoke(us, args);
				System.out.println("提交/回滚");
				return invoke;
			}
		});
		
	}
}
