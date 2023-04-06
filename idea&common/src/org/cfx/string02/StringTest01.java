package org.cfx.string02;

import java.util.Arrays;

/**
 * @author RTX 9090
 */
public class StringTest01 {
    public static void main(String[] args) {
        String name = """
                床前明月光，
                疑是地上霜；
                举头望明月，
                低头思故乡。 
                """;
        System.out.println(name);

        String string = "";// 表示 在堆中存在一个 空的字符串
        String string1 = null;// 表示 在栈中有一个变量为 string1 的变量 但是没有引用堆中的内存地址。
        String string2 = new String();// 表示在堆中新开辟了一个空间 存放了空字符串。

        String str1 = "A";
        String str2 = "A";
        String str3 = new String("A");
        System.out.println(str1 == str2);//true
        System.out.println(str3 ==str2);//false

        System.out.println("================================");
        String str5 = new String("bb");
        String str4 = "bb";
        String str6 = "b";
        String str7 = "b";
        String str8 = str6 + str7;// 变量拼接会 直接在常量池创建
        String str9 = "b" + "b";// 常量拼接 直接会检测常量池中的值
        System.out.println(str4 == str5);//false
        System.out.println(str4 == str8);//false
        System.out.println(str4 == str9);//true










        System.out.println("================================");
        /*
         *  开始转着玩， String 转 StringBuilder 再转 StringBuffer
         */
        StringBuilder stringBuilder;

        stringBuilder = new StringBuilder("11111111111");

        System.out.println(stringBuilder);

        String st1 = stringBuilder.toString();
        System.out.println(st1.length());

        StringBuilder st2 = new StringBuilder(st1);
        st2.append("1111");
        System.out.println(st2);

        String st3 = st2.toString();
        StringBuffer stringBuffer = new StringBuffer(st3);
        stringBuffer.append("1111");
        System.out.println(stringBuffer);

        /**
         * 修改 String 的字符串   转 StringBuffer 再调用方法，再转回String
         */
        String str = "1111";
        StringBuffer buffer = new StringBuffer(str);
        StringBuffer qwer = buffer.append("qwer");
        System.out.println(qwer.toString());
    }
}
