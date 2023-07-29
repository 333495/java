package org.cfx.homework;

import java.lang.annotation.*;

/*
  @author RTX 9090
 */

/**
 * 可以写在类型，字段，方法上
 * 作用于运行时
 * 可以在导出时，被文档化
 * 可以继承注解
 * @author RTX 9090
 */
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface VIP {
    /**
     * 默认VIP等级为1级
     */
    String value() default "1";
}
