/**
 *
 */
public class Arr03 {
    public static void main(String[] args) {
        //定义数组
        int a[] = new int[]{1,2,3,4,5};
        //将数组中的元素全部取出来
        //for
        for (int i = 0; i < a.length; i++) {
//            a[i] = 11;
            System.out.println(a[i]);
        }

        //foreach
        /*
            for(源中元素类型 e : 源){
                e就是每次循环中 取到的元素
            }
            源 ： 要被遍历的数组
            源中元素类型： 数组中元素的类型
            e ：就是element（元素）
         */
        for (int j : a) {
            System.out.println(j);
        }
        /*
            增强for比一般for简单
            区别：
                1. 增强for没有索引这个概念
                2. 只想拿到元素就用增强for
                3. 想操作数组 修改元素 a[i] = 444; 增强for不能操作数组
         */

        //倒着输出
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }
}
