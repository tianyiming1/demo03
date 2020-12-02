package com.ibeetl.admin.core.annotation;

import com.ibeetl.admin.core.gen.MyConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



//用於自定義注解測試
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
//代表处理逻辑是MyConstraintValidator类
@Constraint(validatedBy = MyConstraintValidator.class)
public @interface MyConstraint {
    String message() default "参数校验不通过，请重新输入";;
    long min();
    long max();
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}