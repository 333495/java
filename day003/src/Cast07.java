/**
 * 三目运算
 *      x ? y : z
 *      x表示布尔类型的值 或者是 结果为布尔类型的 表达式
 *      y和z： 可以是表达式 也可以是 需要执行的代码
 *            一般情况下 y和z 是相同的数据类型 但也可以不一样
 *            如果 你需要用一个变量来接收 三目表达式的值 那么 y和z 就必须是同一个类型
 */
public class Cast07 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(a<b ? 3 :"是错的");

        int c = a>b ? b : a;
        System.out.println(c);

        //1. 例如小明学习java 考试成绩  >=110 显示 非常优秀  否则输出 还有很大的提升空间。
        int score = 120;
        System.out.println(score>=110 ? "非常优秀" : "有很大提升空间");


        //3.假如有abc三个变量，求abc最小数字。


    }
}
