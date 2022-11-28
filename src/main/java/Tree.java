public class Tree {
    public Node header = null;

    public void push(Node node) {
        if (header == null) {
            header = node;
        } else {
            header.add(node);
        }

    }

    public void centerLoop() {
        header.centerLoop();
    }

    public void lastLoop() {
        header.lastLoop();
    }
}
