package org.cfx._01regex;

/**
 * @author RTX 9090
 */
public class RegexTest01 {
    public static void main(String[] args) {
        //身份证
        String regex = "^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";
        String id = "123333232";
        System.out.println(id.matches(regex));
    }
}
