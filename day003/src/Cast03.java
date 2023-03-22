/**
 * 自加自减
 */

public class Cast03 {
    public static void main(String[] args) {
        int i = 5;
        //在变量的前面或者后面写  ++ 或  --
        int j = i++;
        //++ --  如果是++表示变量自加1    --表示变量自减1
        System.out.println(i);//6
        System.out.println(j);//5

        int k = 5;
        int l = ++k;
        System.out.println(k);//6
        System.out.println(l);//6
        /*
        符号在前 和 符号在后
        如果 符号在前 表示 自加/自减 操作先运算 然后在计算表达式的值
        如果 符号在后 表示 自加/自减 先计算表达式的值，在计算自加/自减运算
         */

        int aa = 5;
        int bb = 3;
        int cc = ++aa + bb++;
        System.out.println(aa);//6
        System.out.println(bb);//4
        System.out.println(cc);//9


        int o = 3;//3
        int p = o++ + o--;//a 3  b 7
        int q = o++ + ++p + p--;// 3 + 8 + 8
        System.out.println(o);//4
        System.out.println(p);//7
        System.out.println(q);//19
    }
}
