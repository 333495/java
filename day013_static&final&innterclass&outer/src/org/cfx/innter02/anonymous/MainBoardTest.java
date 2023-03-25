package org.cfx.innter02.anonymous;

/**
 * @author RTX 9090
 * 匿名内部类 解决了 某一些实现类只写一次还要创建一个类文件的情况
 */
public class MainBoardTest {
    public static void main(String[] args) {
        // 创建 打印机对象
        Printer print = new Printer();

        MainBoard board = new MainBoard();
        board.swap(print);

        /**
         * 键盘匿名内部类
         */
        IUsb iUsb = new IUsb(){
            @Override
            public void install() {
                System.out.println("键盘安装中....");
            }
        };
        iUsb.install();

        /**
         * 鼠标匿名内部类
         */
        IUsb iUsb1 = new IUsb(){
            @Override
            public void install() {
                System.out.println("鼠标安装......");
            }
        };
        iUsb1.install();

        /**
         * 拉姆达表达式
         */
        IUsb iUsb2 = () -> System.out.println("主板安装 CPU 中......");
        iUsb2.install();
    }
}