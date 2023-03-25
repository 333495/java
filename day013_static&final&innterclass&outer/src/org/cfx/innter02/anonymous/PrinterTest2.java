package org.cfx.innter02.anonymous;

/**
 * @author RTX 9090
 */
public class PrinterTest2 {
    public static void main(String[] args) {
        AbstractPrinter2 printer = new AbstractPrinter2() {
            @Override
            public void in(){
                System.out.println("打印机安装...");
            }
        };
        printer.in();
    }
}
