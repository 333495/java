package org.cfx.commonclass.exception;

/**
 * @author RTX 9090
 */
public class LoginExceptionTest02 {
    public static final String USER_NAME = "cfx123";
    public static final String USER_PASSWORD = "123cfx";
    public static void main(String[] args) {
        login("cfx12","123cfx");

        // 这行不执行
        System.out.println("hhhhhhhhhhhhhhhh");
    }

    public static boolean login(String name, String password){
        if (!USER_NAME.equals(name) && USER_PASSWORD.equals(password)){
            throw new LoginException1("登录失败！");
        }
        System.err.println("登录成功！");
        return true;
    }
}

class LoginException1 extends RuntimeException{
    public LoginException1() {
        super();
    }

    public LoginException1(String message) {
        super(message);
    }
}
