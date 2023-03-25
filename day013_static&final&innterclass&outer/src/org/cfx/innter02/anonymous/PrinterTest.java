package org.cfx.innter02.anonymous;

/**
 * @author RTX 9090
 */
public class PrinterTest {
    public static void main(String[] args) {
        AbstractPrinter printer = new AbstractPrinter() {
            @Override
            public void install() {
                System.out.println("华为打印 🐓 安装.......");
            }
        };
        printer.install();
    }

}