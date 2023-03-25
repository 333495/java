package org.cfx.enum05;

/**
 * @author RTX 9090
 *
 * 使用枚举  enum简化常量的声明，解决入侵性问题
 */

public enum Week2 {
    /**
     * Week2
     */
    MON("周一"),
    THUE("周二"),
    WED("周三"),
    THUR("周四"),
    FRI("周五"),
    SAT("周六"),
    SUN("周天"),;

    private String name;

    Week2(){}

    Week2(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
