/**
 * 数组 和 赋值
 */
public class Arr02 {
    static int[] dd;
    public static void main(String[] args) {
       //定义数组
        int[] i = new int[]{1,2,3,4,5};
        //取值    数组名[索引]
        System.out.println(i[1]);
        //赋值
        i[2] = 666666;
        System.out.println(i[2]);
        //无论是获取值 还是 修改元素值 都需要  数组名[索引]

        //定义数组  动态初始化
        double[] d = new double[9];
        System.out.println(d[1]);
        String[] s = new String[3];
        System.out.println(s[2]);//  null
        char[] c = new char[2];
        System.out.println(c[1]);
        /*
            动态声明的 数组 会根据数据类型 分配默认值
         */

        System.out.println(c.length);

        /*
            数组没有开辟空间会报空指针异常（注意）
         */
        System.out.println(dd);

    }
}
