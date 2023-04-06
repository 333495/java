package org.cfx.commonclass.exception;

/**
 * @author RTX 9090
 */
public class LoginExceptionTest01 {
    public static final String USER_NAME = "cfx";
    public static final String USER_PASSWORD = "123";
    public static void main(String[] args) {
        login("cfx","123");
    }

    public static boolean login(String name, String password){
        if (!USER_NAME.equals(name) && USER_PASSWORD.equals(password)){
            throw new LoginException("登录失败！");
        }
        System.err.println("登录成功！");
        return true;
    }
}
class LoginException extends RuntimeException{
    public LoginException() {
        super();
    }

    public LoginException(String message) {
        super(message);
    }
}
