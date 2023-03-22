public class MethodTest02 {
    public static void main(String[] args) {
        //用方法求和并判断是否为偶数
        int c = sum(1,2);
        System.out.println("两数和是："+ c + "\n他们的和是：" + (c % 2 == 0 ? "偶数" : "奇数"));


        //判断密码是否正确
        int id = 2;
        MethodTest02 M = new MethodTest02();
        System.out.println(M.login(id));

        //转出int 对应的码
//        System.out.println((int)'坤');
//        System.out.println((int)'坤');
//        System.out.println((int)'你');
//        System.out.println((int)'太');
//        System.out.println((int)'美');


        System.out.println((char) sum(22371,1));
        System.out.println((char) sum(22371,1));
        System.out.println((char) sum(20318,2));
        System.out.println((char) sum(22826,0));
        System.out.println((char) sum(0,32654));


    }
    //定义一个方法
    public static int sum(int a , int b){
        return a + b;
    }

    //返回String类型
    public  String login(int userPass){
        if (userPass != 2){
            return "密码不对";
        }
        return "登录成功";
    }

}
