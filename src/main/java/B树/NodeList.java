package B树;

import java.util.ArrayList;
//树节点的值
public class NodeList {
    public int size  ;
    public ArrayList<Integer> nodes ;
    public NodeList(int size) {
        this.size = size;
        nodes = new ArrayList<>();

    }

    @Override
    public String toString() {
        return "NodeList{" +
                "size=" + size +
                ", nodes=" + nodes +
                '}';
    }

    //    检查长度
    public boolean checkLength(){
        if(nodes.size()>=size-1)
        return true;
        else
            return false;
    }

}
