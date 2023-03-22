/**
 * 定义数组 和 初始化
 */
public class Arr01 {
    public static void main(String[] args) {
        // 初始化数组 分2种
        //静态初始化
        int[] b = new int[]{1,2,3,4,5};//int[] b = {1,1221,2};
        /*
            int[] b = new int[]{1,2,3,4,5};
            new ---表示开辟空间
            int[]  开了一个存放int[] 的空间
            {1,2,3,4,5} 开了空间里面住了这些元素
            静态初始化表示：我明确知道要放那些数据 以及数据的个数 的情况下使用
         */

        //动态初始化
        String[] c;
        c = new String[5];
        /*
            c = new String[5];
            new ---表示开辟空间
            String[]  开了一个存放String[] 的空间
            [5] 表示 存放哪些数据我不清楚，但可以存5个数据
         */
        //一边声明一边初始化
        // 静态初始化语法：数据类型[] 数组名 = new 数据类型[]{元素1,元素2};
        double[] d = new double[]{1,23,2};

        // 动态初始化语法：数据类型[] 数组名 = new 数据类型[n];
        String[] s = new String[2];

        //还有一种(不推荐)
        double d1[] = new double[]{1,2,3};//不推荐


    }
}
