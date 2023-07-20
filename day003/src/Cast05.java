/**
 * 比较运算 得到的结果是 布尔类型
 * > < >= <= == !=
 * 运算优先级   自加/自减  > 乘除 > 加减 > 比较运算
 */
public class Cast05 {
    public static void main(String[] args) {
        System.out.println(3 > 5);//false
        System.out.println(3 -1 < 5 + 2);//true
        System.out.println(5 >= 5);//true
        System.out.println(4 >= 5);//false
        System.out.println(3 != 6);//true != 表示不等于;
        System.out.println(3 == 6);//fales == 表示等于;
        System.out.println(3 != 5 ? true : false);//true

        int a = 3;
        int b = 5;
        System.out.println(a++ >= b++);
        System.out.println(a);
        System.out.println(b);
        System.out.println(++a >= b--);
        System.out.println(b);

        /**
         * 需求1:
         * 	int a = 10;
         * 	int b = 10;
         * 	int c = 10;
         * 	a = b++;//a 10 b 11
         * 	c = --a;//c 9  a 9
         * 	b = ++a;//b 10 a 10
         * 	a = c--;//a 9 c 8
         * 请分别计算出a,b,c的值
         */

        int a1 = 10;
        int b1 = 10;
        int c = 10;
        a1 = b1++;
        c = --a1;
        b1 = ++a1;
        a1 = c--;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c);

        /**
         * 需求2:
         * 	int x = 4;
         * 	int y = (x++)+(++x)+(x*10);
         *
         * 计算出x,y的值
         */
        int x = 4;
        int y = (x++)+(++x)+(x*10); // 4 6 60
        System.out.println(x);
        System.out.println(y);

        /**
         * int i=10;
         * int j=(i++)+(++i);//22
         * int k=(--i)+(i--); //22
         * i 10
         */
        int i=10;
        int j=(i++)+(++i);//
        int k=(i--)+(--i);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
