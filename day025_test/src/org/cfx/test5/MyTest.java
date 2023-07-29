package org.cfx.test5;

import java.io.*;
import java.util.*;

/**
 * @author RTX 9090
 * 5.交易明细文本文件内容如下：（20分）（附加题）
 * 有一个TransRecord.txt文件,保存的是交易记录明细。一行是一条交易明细，每行分6列。
 * 请编码，实现如下功能：
 * 5.1、设计一个交易记录类TransRecord (字段数据类型自己决定)。（5分）
 * 5.2、解析文件(IO流)，将文件中数据，将每条交易明细封装为1个TransRecord对象。所有TransRecord对象，添加到一个集合中，并且打印到控制台；（就是将对象添加到集合并打印集合）（5分）
 * BufferedReader 方法readLine()
 * 5.3、完成一个功能（方法）：输入客户号，查询交易明细记录并打印出来，封装成一个方法，通过传入客户号作为参数（5分）
 * 5.4、定义一个方法，按金额升序排序，并且打印到控制台；Set自然或定制排序（5分）
 *
 *
 */
public class MyTest {
    public static ArrayList<TransRecord> tr = new ArrayList<>();
    static File file = new File("H:\\Desktop\\TransRecord.txt");
    public static void main(String[] args) {
        System.out.println("===================1====================");
        try (BufferedReader reader = new BufferedReader(new FileReader(file));){
            String line;
            while ((line = reader.readLine()) != null){
                String[] str = line.split("-");
                TransRecord trans = new TransRecord(str[0], Integer.valueOf(str[1]), str[2], str[3],str[4], str[5]);
                tr.add(trans);
            }
            System.out.println(tr);


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("===================2====================");

        find("003");



        System.out.println("===================3====================");

        print();

//        sort(tr);
    }

        /*
          完成一个功能（方法）：输入客户号，查询交易明细记录并打印出来，
          封装成一个方法，通过传入客户号作为参数（5分）
         */
    public static boolean find(String number){

        for (int i = 0; i < tr.size(); i++) {
            if (tr.get(i).getPeople().equals(number)){
                System.out.println(tr.get(i));
            }
        }
        return false;
    }

    /*
        定义一个方法，按金额升序排序，并且打印到控制台；Set自然或定制排序（5分）
     */
    public static void print(){
        tr.sort(new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                TransRecord tr1 = (TransRecord)o1;
                TransRecord tr2 = (TransRecord)o2;

                return tr1.getPrice() - tr2.getPrice();
            }
        });
        System.out.println(tr);
    }

    public static void sort(ArrayList<TransRecord> list){
        TreeSet<TransRecord> trs = new TreeSet<>(list);
        for (TransRecord transRecord : trs) {
            System.out.println(transRecord);
        }

    }
}
