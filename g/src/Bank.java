import java.util.ArrayList;
import java.util.Random;

/**
 * 银行管理系统
 */
public class Bank {
    private String name;
    private int bankId;
    private String userName;
    private String passWord;
    private double money;

    public Bank() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", bankId=" + bankId +
                ", userName='" + userName + '\'' +
                ", passWord=" + passWord +
                ", money=" + money +
                '}';
    }
    
}
