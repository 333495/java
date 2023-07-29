package org.cfx;

/**
 * @author RTX 9090
 */
public class People {
    private Integer code;
    private Integer location;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public People(Integer code, Integer location) {
        this.code = code;
        this.location = location;
    }

    public People(){}

    @Override
    public String toString() {
        return "People{" +
                "code=" + code +
                ", location=" + location +
                '}';
    }
}
