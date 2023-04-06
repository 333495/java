package org.cfx.string02;

import java.util.Arrays;
import java.util.Locale;

/**
 * @author RTX 9090
 */
public class StringTest02 {
    public static void main(String[] args) {

        String str;
        // 常用方法：
        // 1.char charAt(int index) 返回 char指定索引处的字符。 不能超过下标范围
        str = "123qwer";
        System.out.println(str.charAt(1));

        // 2.String concat(String str) 将指定的字符串连接到该字符串的末尾。 相当于：+
        String concat = str.concat("tyuiop");
        System.out.println("concat:" + concat);
        System.out.println("str : " + str);


        /*
         * 3.boolean contains(CharSequence s) 判断当前对象是否包含连续的参数s。s可以是以下三个子类的对象
         * CharSequence接口，包含下面子类：String、StringBuffer、StringBuilder
         */
        str = "12137788525oiwisklask";
        boolean contains = str.contains("oiw");//判断当前对象str是否包含连续的参数abc
        System.out.println("是否包含：" + contains);

        // 4.boolean endsWith(String suffix) 判断当前字符串是否以指定的后缀suffix结尾。（参数必须连续）
        str = "我在学Java.mp4";
        boolean endsWith = str.endsWith(".mp4");
        System.out.println(endsWith);
        // 5.boolean startsWith(String prefix) 判断当前字符串是否以指定的前缀prefix开头。  （参数必须连续）
        str = "我在学Java.mp4";
        boolean startsWith = str.startsWith("我");
        System.out.println(startsWith);

        /*
         * 8.void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
         * srcBegin：字符串开始下标
         * srcEnd：字符串结束下标(不包含)
         * dstBegin：数组dst的下标
         * 将此字符串中的字符复制到目标字符数组dst中。  (含头不含尾)[srcBegin,srcEnd)
         */
        str = "qwer1231121";
        char[] dest = new char[4];
        str.getChars(1, 5, dest, 0);// 将字符串str中下标2开始到6结束【不包含6】的字符复制到数组dst中，从数组的下标1开始粘贴
        System.out.println(Arrays.toString(dest));

        // 9.int indexOf(String s) 返回s第一次在当前对象str中出现的索引 ，-1表示没有找到（注意：这里s必须也是匹配连续的字符串）
        int indexOf = str.indexOf("12");
        System.out.println("下标：" + indexOf);

        // 10.int indexOf(String s, int fromIndex) 返回s在当前对象指定下标fromIndex后第一次出现的索引  (str是作为一个整体匹配下标的)
        int indexOf2 = str.indexOf("21",4);
        System.out.println("下标：" + indexOf2);

        // 11.int lastIndexOf(String str) 返回指定子字符串最后一次出现的字符串中的索引。
        int q = str.lastIndexOf("1");
        System.out.println(q);
        // 12.int lastIndexOf(String str, int fromIndex) 返回指定子字符串的最后一次出现的字符串中的索引，从指定索引开始向前搜索。
        int q1 = str.lastIndexOf("1",4);
        System.out.println(q1);
        // 13.boolean isEmpty() 当 length()为 0时，返回 true 。
        System.out.println(str.isEmpty());
        // 14.int length() 返回此字符串的长度。
        System.out.println(str.length());
        // 15.boolean matches(String regex)  判断当前字符串对象是否匹配给定的正则表达式regex，通常用来进行权限限制，字符格式限制   	一般用了做校验：如，用户名和密码的合法性
        str = "abDc1";
        // 匹配a-z或者A-Z之间任意多个字符
        String regex = "^[a-zA-Z0-9]+$";
        boolean matches = str.matches(regex);// 判断str是否满足a-z或者A-Z之间任意一个字符的要求
        System.out.println("是否满足:" + matches);

        /*
         * 16.String replace(CharSequence target, CharSequence replacement)   将当前字符串中的target替换为replacement,通常用来和谐用语
         * 父接口：CharSequence
         *			该接口的实现类：String、StringBuffer、StringBuilder
         */
        str = "撒比东西，NM，我把NM";// 和谐用语
        String string = str.replace("撒比东西","我爱你");

        System.out.println(string);
        System.out.println(string.replace("NM", "爱你"));

        /**
         * replace()和replaceAll()，replaceFirst()区别
         * replace()只能匹配String、StringBuffer、StringBuilder对象
         * replaceAll()和replaceFirst()可以匹配正则表达式，更灵活
         * 如：
         */
        // 17.String replaceAll(String regex, String replacement) regex是正则表达式，将当前字符串中的regex全部替换为replacement
        System.out.println(str.replaceAll("N", "11"));

        // 18.String replaceFirst(String regex, String replacement)  将当前字符串中的第一个regex替换为replacement
        System.out.println(str.replaceFirst("NM", "11"));

        // 19.String[] split(String regex)  将当前字符串对象按照给定的正则表达式regex分割为String[]
        str = "172.168.11.65;192.168.11.66;172.168.11.69;169.168.11.169;";
        // 请将当前str中所有的ip地址打印出来
        System.out.println("================================================================");
        String[] strings = str.split(";");
        for (String strs:strings) {
            if (strs.startsWith("172")){
                System.out.println(strs);
            }
        }

        // 20.CharSequence subSequence(int beginIndex, int endIndex)  从当前字符串中beginIndex和endIndex之间截取子串（含头不含尾）
        str = "123456789";
        CharSequence subSequence = str.subSequence(2, 5);
        System.out.println(subSequence);

        // 21.String substring(int beginIndex)   从当前字符串中截取beginIndex到最后的子串
        String substring = str.substring(2,8);
        System.out.println(substring);
        // 22.String substring(int beginIndex, int endIndex)  从当前字符串中beginIndex和endIndex之间截取子串（含头不含尾）
        str = "172.168.11.65;192.168.11.66;172.168.11.69;169.168.11.169;";
        // 请将字符串中ip是172开头的 最后一段打印出来
        /*
         * 思路：
         * 1. 将字符串str先进行按照;分割
         * 2. 遍历字符串数组，判断字符串以172开头的
         * 3. 在以172的字符串中，再截取最后一个.后面的字符，打印
         */

        System.out.println("================================================================");
        String[] str1 = str.split(";");
        for (String strs:str1) {
            if (strs.startsWith("172")){
                System.out.println(strs);
            }
        }

        // 23.char[] toCharArray() 将此字符串转换为新的字符数组。  方便遍历当前所有的字符
        str = "abcdefc";
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }

        // 24.String toUpperCase() 将此字符转换为全大写	一般用于验证码
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);
        // 25.String toLowerCase() 将此字符转换为全小写	一般用于验证码
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);

        // 26.String trim() 将当前字符串对象中字符前面和后面的空格去除	用了避免用户的一些不当输入
        str = "		12waqw		dsdw1 	213213	";
        String trim = str.trim();
        System.out.println(trim);

        // 27.static String valueOf(Object obj) 将其他类型转换为String对象
        String valueOf = String.valueOf(1);// 这里其实是1的包装类Integer
        System.out.println(valueOf);
    }
}

class PrintLastSegment {
    public static void main(String[] args) {
        String ipAddress = "172.168.11.65;192.168.11.66;172.168.11.69;169.168.11.169;";
        String[] ipAddresses = ipAddress.split(";");

        for (String ip : ipAddresses) {
            if (ip.startsWith("172")) {
                String[] segments = ip.split("\\.");
                System.out.println(segments[3]);
            }
        }
    }
}

