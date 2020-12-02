package com.ibeetl.admin.core.gen;


import com.ibeetl.admin.core.annotation.MyConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;



//用於自定義注解測試
public class MyConstraintValidator implements ConstraintValidator<MyConstraint, Object> {

    private long max = 1;
    private long min = 1;

    public void initialize(MyConstraint constraintAnnotation) {
        max =  constraintAnnotation.max();
        min =  constraintAnnotation.min();
        System.out.println("my validator init");
    }


    public boolean isValid(Object o, ConstraintValidatorContext context) {
        if(o == null){
            return  true;
        }
        if(o.toString().trim().length()>=min&&o.toString().trim().length()<=max){
            return true;
        }
        return false;
    }
}