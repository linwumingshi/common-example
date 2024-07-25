package com.power.doc.annotation;

import com.power.doc.enums.ErrorCodeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description:
 * 错误码注解
 *
 * @author yu 2018/06/28.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ErrorCode {
    ErrorCodeEnum value();
}
