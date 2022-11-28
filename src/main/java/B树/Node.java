package B树;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//树节点
public class Node {
    public NodeList value;
    public Node left;
    public Node right;
    public Node center;

    public Node(NodeList value, Node left, Node center,Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.center = center;
    }
 public void add(int no){
      ArrayList<Integer> nodeV= this.value.nodes;
        if(this.value.nodes.size()<this.value.size-1){
//            说明还有空位

            this.value.nodes.add(no);
            Collections.sort(nodeV);
            System.out.println(nodeV);
        }else {
            System.out.println("头节点满了");
//            去叶子节点
//            判断大小
            if(nodeV.get(0)>=no){
//                放左边
                System.out.println("左边");
                if(this.left!=null) {
                    this.Ladd(no);
                }
                else{
                    NodeList nodes=new NodeList(3);
                    nodes.nodes.add(no);
                    this.left = new Node(nodes,null,null,null);
                }

            }else if(nodeV.get(1)<=no){
//
                System.out.println("右边");
                if(this.right!=null) {
                    this.Radd(no);
                }
                else{
                    NodeList nodes=new NodeList(3);
                    nodes.nodes.add(no);
                    this.right = new Node(nodes,null,null,null);
                }
            }else {
                System.out.println("中间");
                if(this.center!=null){
                    this.Cadd(no);
                }else {
                    NodeList nodes=new NodeList(3);
                    nodes.nodes.add(no);
                    this.center = new Node(nodes,null,null,null);
                }
            }

        }
 }
 public void Ladd(Integer no){
//放到叶子节点
     if(this.left.left!=null){
//         递归
         this.left.left.Ladd(no);
     }else {
//         已经是叶子节点了
//         判断长度
        if(this.left.value.checkLength()) {
            //满了
//            分裂
            System.out.println(this.left.value.nodes);
            System.out.println("分裂");
//            分裂公式 Math.ceil(size/2)位置的元素 变为兄弟节点 然后将其放到父元素中
            int index =(int)Math.ceil(this.left.value.size/2);
          int fatherV=  this.left.value.nodes.get(index) ;
//          父元素添加
           if( this.value.checkLength()){
//
           }
          this.left.value.nodes.remove(index);
//          新增父元素 判断父元素

            NodeList nodes=new NodeList(3);
//            添加值
            nodes.nodes.add(fatherV);
//            创建父元素
            Node father  = new Node(nodes,null,null,null);
//            替换
            father.left = this.left;
            this.left = father;




        }else {

//            加入
            this.value.nodes.add(no);
        }
     }


 }
 public void Radd(Integer no){
//放到叶子节点
     if(this.right!=null){
//         递归
         this.right.Radd(no);
     }else {
//         已经是叶子节点了
//         判断长度
         if(this.value.checkLength()) {
//满了
//            分裂
             System.out.println(this.value.nodes);
             System.out.println("分裂");
         }else {
//            加入
             this.value.nodes.add(no);
         }
     }
 }

    public void Cadd(Integer no){
//放到叶子节点
        if(this.center!=null){
//         递归
            this.center.Cadd(no);
        }else {
//         已经是叶子节点了
//         判断长度
            if(this.value.checkLength()) {
//满了
//            分裂
                System.out.println(this.value.nodes);
                System.out.println("分裂");
            }else {
//            加入
                this.value.nodes.add(no);
            }
        }
    }
}
