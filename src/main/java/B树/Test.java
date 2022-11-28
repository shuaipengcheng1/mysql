package B树;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        NodeList nodeList = new NodeList(3);
        Tree t = new Tree();
        t.Header = new Node(nodeList,null,null,null);
        t.add(4);

        t.add(2);
        t.add(3);
        t.add(0);
        t.add(-1);
        t.centerLoop(t.Header);
    }
}
