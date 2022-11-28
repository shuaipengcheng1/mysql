package B树;

public class Tree {
//    中序
    public Node Header;
    private final int  SIZE=4;



    public void  centerLoop(Node node){
//        左中右
        if(node.left!=null){
            centerLoop(node.left);
        }
        System.out.println(node.value);
        if (node.right!=null){
            centerLoop(node.right);
        }

    }
  public void add (int no){
        if(Header!=null){
            Header.add(no);
        }
  }
}
