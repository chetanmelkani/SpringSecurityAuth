package com.rd22.auth;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogTraceAspect {

	static final Logger LOGGER = LoggerFactory.getLogger(LogTraceAspect.class);

	public LogTraceAspect() {
	}


	@Before("execution(* com.hellokoding.*.*.*.*(..))")
	public void printLogs(JoinPoint joinPoint) throws Throwable {
		print(joinPoint, "enter ");
	}
	
	@After("execution(* com.hellokoding.*.*.*.*(..))")
	public void printLogsAfter(JoinPoint joinPoint) throws Throwable {
		print(joinPoint, "exit ");
	}


	private void print(JoinPoint joinPoint, String str) throws Throwable {
		StringBuilder logText = new StringBuilder();

		Method method = ((MethodSignature) joinPoint.getSignature())
			.getMethod();
		
		logText.append(method.getDeclaringClass());
		logText.append(" ");
		logText.append(method.getName());
		logText.append(" ");
		
		LOGGER.debug(str + logText.toString());
		
		//joinPoint.proceed();
		
	}
	
	@Before("execution(* com.hellokoding.*.*.*(..))")
	public void printLogs2(JoinPoint joinPoint) throws Throwable {
		print(joinPoint, "enter ");

	}
}
