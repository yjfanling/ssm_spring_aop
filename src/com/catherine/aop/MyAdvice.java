package com.catherine.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 自定义通知类
 * @author 45969
 *
 */
public class MyAdvice {
	//before 前置通知，在目标方法前调用
	public void before(){
		System.out.println("before");
	}
	//after 最终通知（后置通知） 在目标方法后调用，无论是否出现异常都会执行 finally
	public void after(){
		System.out.println("after");
	}
	//afterReturning成功通知（后置通知）在目标方法执行并且成功之后调用，如果出现异常则不调用
	public void afterReturning(){
		System.out.println("afterReturning");
	}
	//afterThrowing异常通知（后置通知）在目标方法执行出现异常时调用
	public void afterThrowing(){
		System.out.println("afterThrowing");
	}
	//around环绕通知 需要我们手动调用目标方法，并且可以设置通知
	public Object around(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("around");
		Object procced=pjp.proceed();
		System.out.println("around after");
		return procced;
	}
}
