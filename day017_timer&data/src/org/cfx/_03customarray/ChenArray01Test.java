package org.cfx._03customarray;

/**
 * @author RTX 9090
 */
public class ChenArray01Test {
    public static void main(String[] args) {
        //创建数组对象
        ChenArray01 chenArray = new ChenArray01();
        //查看初始化容量
        System.out.println("实际容量："+chenArray.getCapacity());
        System.out.println("已用空间："+chenArray.getIndex());
        System.out.println("=============================");
        chenArray.add("1121");
        chenArray.add("李四");
        chenArray.add("12五");
        chenArray.add(new User01("何亮"));
        System.out.println("实际容量："+chenArray.getCapacity());
        System.out.println("已用空间："+chenArray.getIndex());
        System.out.println("=============================");
        System.out.println(chenArray);
        System.out.println("=============================");
        Object selectId = chenArray.selectById(1);
        System.out.println("查询到了："+selectId);
        System.out.println("=============================");
        int index = chenArray.selectByName("何亮");
        System.out.println(index == -1 ? "e眼丁真 鉴定为：找不到对象！！！！" : ("找到啦"+index));
        System.out.println("=============================");
        chenArray.updateById(2,"123");
        System.out.println(chenArray);
        System.out.println("=============================");
        chenArray.deleteById(0);
        System.out.println(chenArray);
        System.out.println("=============================");
        int flag = chenArray.deleteByName("李四");
        System.out.println(flag == -1 ? "e眼丁真 鉴定为：找不到对象！！！！" : ("删除成功！"));
        System.out.println(chenArray);



    }
}