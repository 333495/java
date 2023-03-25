package org.cfx.enum05;

/**
 *  枚举
 * @author RTX 9090
 */
public enum Week3 {
    MON("周一"),
    THUE("周二"),
    WED("周三"),
    THUR("周四"),
    FRI("周五"),
    SAT("周六"),
    SUN("周天");

    private String name;

    Week3(String name) {
        this.name = name;
    }

    Week3(){}

}
