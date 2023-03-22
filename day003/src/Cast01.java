/**
 * 类型转换
 */

public class Cast01 {
    public static void main(String[] args) {
        //类型转换：将数据从一种格式、内容，转换为另一种格式、内容
        long a = 2;//数据类型决定了 内存分配的大小
        //需要把long类型a转换成int 或者 byte
        int c = 1;//预测c现在是5，但以后可能是222；c要从int变成一个long
        //数据类型转换有两种：1.从小放到大里面  2.从大的数据类型 里面放到小的数据类型里面。

        //隐式转换
        long a1 = 5;//a1是long类型，5是int
        byte b = 5; //-128~127 所以5可以直接装下
        int i = b;
        long cc = i;
        float f = cc;

        //大转小 强行转换语法: 数据类型变量名 =(要转换的数据类型)值;
        long l = (long)f;//把float类型装进long类型 不可以直接装。需要用强制转换。

        //char是字符，是ascii表示。

        double d = 3.1415926;
        int ii = (int) d;
        System.out.println(ii);//数据丢失。大的数据类型转小的数据类型会造成数据丢失。

        byte b1 = (byte) 128;
        System.out.println(b1);//-128

        byte b2 = 1;
        short b3 = 2;
        int b4 = b2 +b3;//当运算的算式中，所以的数据类型都是小于int的 但是运算的结果会被自动提升为 int 类型// 。
        System.out.println(b4);
        short bb3 = (short)(b3 + b4);//转结果就行了
        float ff = 2.0f;
        float fff = ff + b4;//当运算的算式中存在数据类型大丁int的算式最后的结果值取决于精度最高的数据类型


        int a2 = 2122222222;
        int a3 = 2122222222;
        int a4 = a2 + a3;//表达式只看格式
        System.out.println(a4);
    }
}
