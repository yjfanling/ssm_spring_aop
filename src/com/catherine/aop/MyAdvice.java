package com.catherine.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * �Զ���֪ͨ��
 * @author 45969
 *
 */
public class MyAdvice {
	//before ǰ��֪ͨ����Ŀ�귽��ǰ����
	public void before(){
		System.out.println("before");
	}
	//after ����֪ͨ������֪ͨ�� ��Ŀ�귽������ã������Ƿ�����쳣����ִ�� finally
	public void after(){
		System.out.println("after");
	}
	//afterReturning�ɹ�֪ͨ������֪ͨ����Ŀ�귽��ִ�в��ҳɹ�֮����ã���������쳣�򲻵���
	public void afterReturning(){
		System.out.println("afterReturning");
	}
	//afterThrowing�쳣֪ͨ������֪ͨ����Ŀ�귽��ִ�г����쳣ʱ����
	public void afterThrowing(){
		System.out.println("afterThrowing");
	}
	//around����֪ͨ ��Ҫ�����ֶ�����Ŀ�귽�������ҿ�������֪ͨ
	public Object around(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("around");
		Object procced=pjp.proceed();
		System.out.println("around after");
		return procced;
	}
}
