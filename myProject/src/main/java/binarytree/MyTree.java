package binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaszy on 2017-09-19 00:53.
 */
public class MyTree {
    private Node root;
    private List<Node> list = new ArrayList<Node>();
    public MyTree(){
        init();
    }
    public class Node{
        private String data;
        private Node lchild;
        private Node rchild;
        public Node(String data,Node lchild,Node rchild){
            this.data=data;
            this.lchild=lchild;
            this.rchild=rchild;
        }
    }
    public void init(){
        Node x = new Node("X",null,null);
        Node y = new Node("Y",null,null);
        Node d = new Node("d",x,y);
        Node e=new Node("e",null,null);
        Node f=new Node("f",null,null);
        Node c=new Node("c",e,f);
        Node b=new Node("b",d,null);
        Node a=new Node("a",b,c);
        root=a;
    }
    public void preOrder(Node node){
        list.add(node);
        if(node.lchild!=null){
            preOrder(node.lchild);
        }
        if(node.rchild!=null){
            preOrder(node.rchild);
        }
    }
    public List<Node>getResult(){
        return list;
    }

    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        myTree.preOrder(myTree.root);
        System.out.println("先序遍历结果为：");
        for(Node node: myTree.getResult()){
            System.out.print(node.data+" ");
        }
    }
}
