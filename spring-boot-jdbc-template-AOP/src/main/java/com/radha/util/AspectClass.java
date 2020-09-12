package com.radha.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class AspectClass {

    @Before("execution(* com.radha.controller.EmployeeController.getEmployees())")
    public void getEmployeesBeforeAdvice(){

        System.out.println("getEmployees before method..");
    }

    @After("execution(* com.radha.controller.EmployeeController.getEmployees())")
    public void getEmployeesAfterAdvice(){

        System.out.println("getEmployees After method..");
    }

    @AfterReturning("allMethods()")
    public void getEmployeesAfterReturningAdvice(){

        System.out.println("getEmployees AfterReturning method..");
    }

    @AfterThrowing(pointcut = "execution(* com.radha.controller.EmployeeController.getEmployees())",throwing="ex")
    public void getEmployeesAfterThrowingAdvice(Exception ex){

        System.out.println("getEmployees AfterThrowing method.. "+ex);
    }

   @Pointcut("execution(* com.radha.controller.EmployeeController.getEmployees())")
    public void allMethods(){}

    @Around("@annotation(com.radha.util.Loggable)")
    public List<String> getDepartmentAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){

        List<String> deptList = null;
        try {
            System.out.println("before getDepartment method ");
            deptList = (List<String>) proceedingJoinPoint.proceed();
            deptList.add("Test Department");
            System.out.println("after getDepartment method ");
            System.out.println(deptList);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return deptList;
    }


}
