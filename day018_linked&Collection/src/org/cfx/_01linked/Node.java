package org.cfx._01linked;

/**
 * @author RTX 9090
 */
public class Node {
    Object data;
    Node next;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
        //next 是 null
    }
}
