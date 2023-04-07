package cn.ronghuanet._02array;

public class _04XiongArrayTest {
    public static void main(String[] args) {
        _03XiongArray xiongArray = new _03XiongArray();

        System.out.println(xiongArray.capacity());
        System.out.println(xiongArray.length());

        xiongArray.add(3);
        xiongArray.add('c');
        xiongArray.add("sss");
        xiongArray.add(new User("zs"));
        xiongArray.add(new User("zy"));
        xiongArray.add(new User("clj"));
        xiongArray.add(new User("zyy"));
        xiongArray.add(3);
        xiongArray.add("sss");

        System.out.println(xiongArray.length());
        System.out.println(xiongArray.capacity());
        System.out.println(xiongArray);
        System.out.println("===============================================");
        System.out.println(xiongArray.get(1));
        System.out.println(xiongArray.get(3));
        System.out.println(xiongArray.get(7));
        System.out.println("===============================================");
        System.out.println(xiongArray.getIndex("sss"));
        System.out.println(xiongArray.getIndex(new User("zs")));
        System.out.println(xiongArray.getIndex(new Integer(3)));
        System.out.println(xiongArray.getIndex('c'));
        System.out.println("===============================================");
        System.out.println(xiongArray);
        xiongArray.update(0,'g');
        System.out.println(xiongArray);
        System.out.println("===============================================");
        xiongArray.delete(0);
        System.out.println(xiongArray);
        System.out.println("===============================================");
        xiongArray.delete(new Integer(3));
        System.out.println(xiongArray);

    }
}
