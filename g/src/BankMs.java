import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * 测试类
 */
public class BankMs {
    static ArrayList<Bank> banks = new ArrayList<>();
    static Bank bank = new Bank();
    public static void main(String[] args) {

//        page(choose);

        while (true) {
            int choose = menu();
            switch (choose) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("请输入正确的操作！");
                    menu();
            }
        }
    }


    /**
     * 主界面
     */
    public static int menu(){
        System.out.println("==========欢迎使用银行管理系统==========");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 注册账户");
        System.out.println("2. 登录账户");
        System.out.println("3. 查看账户");
        System.out.println("4. 退出");
        System.out.println("请选择操作：");
        int choose = scanner.nextInt();
        if (choose == 1) {
            return 1;
        }else if (choose == 2) {
            if(checkNull()) {
                register();
                return menu();
            }else {
                return 2;
            }
        }else if(choose == 3){
            if (checkNull()) {
                register();
                return menu();
            }else {
                return 3;
            }
        }else if (choose == 4){
            return 4;
        }else {
            return 0;
        }
    }


    /**
     * 注册界面
     */
    public static void register(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================开账户==================");
        System.out.println("请输入姓名：");
        String setName = scanner.next();
        System.out.println("请输入账户：");
        String setUserName = scanner.next();
        System.out.println("请输入密码：");
        String setPassWord = scanner.next();
        String i = BankMs.ranDomBankId(banks);
        System.out.println("恭喜您注册成功！你的卡号是：" + i + "\t请牢记您的卡号！");
        bank.setName(setName);
        bank.setUserName(setUserName);
        bank.setPassWord(setPassWord);
        bank.setBankId(Integer.parseInt(i));
        System.out.println(bank.getUserName());

    }

    /**
     * 登录界面
     */
    public static void login(){
        Scanner scanner = new Scanner(System.in);
//        Bank bank = new Bank();
        boolean success;
        do {
            System.out.println("==================登录界面==================");
            System.out.println("请输入您的账户：");
            String setUserName = scanner.next();
            System.out.println("请输入您的密码：");
            String setPassWord = scanner.next();
            System.out.println("请输入你的余额：");
            double setMoney = scanner.nextDouble();
            if (check(setUserName,setPassWord)){
                System.out.println("登录成功！");
                bank.setMoney(setMoney);
                success = false;
            } else {
                System.out.println("账户或密码不对！登录失败!");
                success = true;
            }
        } while (success);
    }


    /**
     * 判断登录信息
     */
    public static boolean check(String userName,String passWord){

        return bank.getUserName().equals(userName) && bank.getPassWord().equals(passWord);
    }
    /**
     * 判断是否需要开账户
     */
    public static boolean checkNull(){
        if("".equals(bank.getUserName()) || bank.getUserName() == null) {
            System.out.println("您还没有账户呢！请先开户！");
            return true;
        }else {
            return false;
        }
    }

    /**
     * 随机卡号
     */
    public static String ranDomBankId(ArrayList<Bank> bank){
        String bankId = "";
        Random rand = new Random();
        boolean result;
        do {
            for (int i = 0; i < 8; i++) {
                bankId += rand.nextInt(10);
            }
            result = !checkBankId(bankId, bank);
        } while (result);
        return bankId;
    }

    /**
     * 判断卡号是否可用
     */
    public static boolean checkBankId(String bankId,ArrayList<Bank> banks){
        for (Bank value : banks) {
            if (value.equals(bankId)) {
                //不可用
                return false;
            }
        }
        //可用
        return true;
    }

    /**
     * 展示账户
     */
    public static void show(){
        if (bank.getMoney() ==0.0){
            System.out.println("Please login!");
            login();
        }else {
            System.out.print("你的姓名为："+bank.getUserName()+"\t");
            System.out.print("卡号是："+bank.getBankId()+"\t");
            System.out.println("可用余额："+bank.getMoney()+"\t");
        }
    }


}