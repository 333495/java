package org.cfx.annotation;

import java.lang.annotation.*;

/**
 * @author RTX 9090
 */
//作用于类、方法
@Target({ElementType.TYPE,ElementType.METHOD})
//在运行结束后，才失效
@Retention(RetentionPolicy.RUNTIME)
//可以导出为文档
@Documented
//注解可以被继承
@Inherited
public @interface Person {
    String name() default "666";
}
