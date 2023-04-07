package org.cfx;

import java.util.Comparator;

/**
 * @author RTX 9090
 */
public class DogComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        org.cfx.Dog d1 = (org.cfx.Dog)o1;
        org.cfx.Dog d2 = (org.cfx.Dog)o2;
        if (d1.age > d2.age) {
            return 1;
        }else if (d1.age < d2.age) {
            return -1;
        }else {
            return d1.name.compareTo(d2.name);
        }
    }
}
