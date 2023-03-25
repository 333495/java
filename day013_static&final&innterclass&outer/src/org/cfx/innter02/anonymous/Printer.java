package org.cfx.innter02.anonymous;

/**
 * @author RTX 9090
 */
public class Printer implements IUsb{

    @Override
    public void install() {
        System.out.println("打印 🐓 安装中.......");
    }
}
