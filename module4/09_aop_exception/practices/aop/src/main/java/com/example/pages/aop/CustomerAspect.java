package com.example.pages.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CustomerAspect {
    @AfterReturning(pointcut = "execution(public * com.example.pages.model.service.CustomerService.findAll(..))")
    public void log(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        System.out.println("đã gọi hàm : "+method);
    }
}
