public class Control01 {
    public static void main(String[] args) {
        /*
            打印1-10 到6是终止循环 后面的也不执行
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 6){
                break;
            }
        }

        /*
            打印1-10 不打印6 后面的继续执行
         */
        for (int i = 0; i < 10; i++) {
            if (i == 6 || i == 3){
                continue;
            }
            System.out.println(i);
        }

        /*  一个循环 如果循环中出现了6  终止当前的方法 后面的循环也不会被执行 循环外面的语句也不会被执行到*/
        for (int i = 0; i < 10; i++) {
            if (i == 6){
                return;//直接返回方法体，循坏外的也不用执行
            }
            System.out.println(i);
        }
        System.out.println("666666");
    }
}
