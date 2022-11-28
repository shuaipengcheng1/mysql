public class Node {
    public Node left;
    public Node right;
    public int no;

    public Node(Node left, Node right,int no) {
        this.left = left;
        this.right = right;
        this.no = no;
    }
    public Node(){

    }

    public void add(Node num){
        if(this.no> num.no){
           if(this.left!=null){
                 this.left.add(num);
           }else {
               this.left = num;
           }
        }else {
            if(this.right!=null){
                this.right.add(num);
            }else {
                this.right = num;
            }
        }
    }
    public void centerLoop(){
        //        左中右
        if(this.left!=null){
           this.left.centerLoop();
        }
        System.out.println(this.no);
        if(this.right!=null){
            this.right.centerLoop();
        }
    }
    public  void lastLoop(){
        if(this.right!=null){
            this.right.centerLoop();
        }
        if(this.left!=null){
            this.left.centerLoop();
        }
        System.out.println(this.no);

    }

}
