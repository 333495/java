package org.cfx._03customarray;

/**
 * @author RTX 9090
 */
public class ChenArray02Test {
    public static void main(String[] args) {
        ChenArray02 chenArray02 = new ChenArray02();
        System.out.println("===========初始值==============");
        System.out.println("可用容量："+chenArray02.getCapacity());
        System.out.println("已用容量："+chenArray02.getIndex());

        System.out.println("=============添加元素============");
        /**
         * 添加元素
         */
        chenArray02.add("1111");
        chenArray02.add(1111);
        chenArray02.add("李四");
        System.out.println(chenArray02);
        System.out.println("可用容量："+chenArray02.getCapacity());
        System.out.println("已用容量："+chenArray02.getIndex());

        System.out.println("===========根据id查元素=============");
        System.out.println(chenArray02.selectById(0));

        System.out.println("============根据元素查id=============");
        System.out.println("元素的id是："+chenArray02.selectByName(1111));

        System.out.println("============根据id修改元素=============");
        chenArray02.updateById(1,111111111);
        System.out.println(chenArray02);

        System.out.println("============根据元素删除元素=============");
        System.out.println(chenArray02.deleteByName("李四"));
        System.out.println(chenArray02);
        System.out.println("可用容量："+chenArray02.getCapacity());
        System.out.println("已用容量："+chenArray02.getIndex());

        System.out.println("============查询元素=============");
        chenArray02.add("李四");
        System.out.println(chenArray02);
        System.out.println(chenArray02.selectById(2));
        System.out.println("可用容量："+chenArray02.getCapacity());
        System.out.println("已用容量："+chenArray02.getIndex());

        System.out.println("============根据id删除元素=============");
        chenArray02.deleteById(2);
        System.out.println(chenArray02);
        System.out.println("可用容量："+chenArray02.getCapacity());
        System.out.println("已用容量："+chenArray02.getIndex());
    }

}