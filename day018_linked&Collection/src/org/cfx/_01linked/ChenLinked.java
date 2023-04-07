package org.cfx._01linked;


/**
 * @author RTX 9090
 */
public class ChenLinked {
    private Node first;
    int num;

    public ChenLinked() {
    }

    public ChenLinked(Object obj) {
        this.first = new Node(obj);
        num++;
    }

    /**
     *  添加元素
     */
    public void add(Object obj) {
        Node node = new Node(obj);
        if (first == null) {
            first = node;
        }else {
            /*
                this.first.next是下一个元素的地址
                因为this.first是当前元素而next 才是下一个元素
             */
            // this.first.next = node;不能这样写
            /*
                因为如果this.first.next不为null
                那么this.first.next就不是当前的尾节点我每次添加都需要找的是尾节点
                什么时候是尾节点
             */
            Node temp = first;
            while (temp.next != null) {
              temp = temp.next;
            }
            temp.next = node;
        }
        num++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = first;
        sb.append("[");
        if (first != null) {
            sb.append(first.data);
            temp = temp.next;
            while (temp != null) {
                sb.append(", ").append(temp.data);
                temp = temp.next;
            }
            sb.append("]");
        }
        return sb.toString();
    }
}
