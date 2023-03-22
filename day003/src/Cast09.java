/**
 * 求出下面的变量值
 * int a = 7;
 * int b = 3;
 * int c = a++ + ++b;
 * int d = c-- + --c;
 * 求a/b/c/d的值
 */
public class Cast09 {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int c = a++ + ++b;//c 11  a 8 b 4
        int d = c-- + --c;//d 20 c 9
        System.out.println(a);//8
        System.out.println(b);//4
        System.out.println(c);//9
        System.out.println(d);//20
    }
}
