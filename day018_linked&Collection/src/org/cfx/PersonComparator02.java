package org.cfx;

import java.util.Comparator;

/**
 * @author RTX 9090
 */
public class PersonComparator02 implements Comparator{
    /**
        0 表示相等
        > 0 升序
        < 0 降序
     */
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Person && o2 instanceof Person){
            Person p1 = (Person) o1;
            Person p2 = (Person) o2;
            if (p1.age > p2.age) {
                return 1;
            }else if (p1.age < p2.age) {
                return -1;
            }else if (p1.name.compareTo(p2.name) > 0){
                return 1;
            }
        }
        return 0;
    }
}
