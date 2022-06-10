package com.zxc.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class log implements MethodBeforeAdvice {
    //method 要执行的目标的对象方法
    //args 参数
    //target 目标对象
    public void before(Method method, Object[] args, Object target) {
        System.out.println((target != null ? target.getClass().getName() : null) + "的" + method.getName() + "被执行了");
    }
}
