package binarytree;

import java.util.ArrayList;
import java.util.List;

import static binarytree.BinaryTree.init;

/**
 * Created by kaszy on 2017-09-19 01:12.
 */
public class Mytree2 {
    private Node root;
    private List<Node> list = new ArrayList<Node>();
    public Mytree2(){
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

    public void inOrder(Node node){
        if(node.lchild!=null){
            inOrder(node.lchild);
        }
        list.add(node);
        if(node.rchild!=null){
            inOrder(node.rchild);
        }
    }
    public List<Node>getResult(){
        return list;
    }

    public static void main(String[] args) {
        Mytree2 mytree2 = new Mytree2();
        mytree2.inOrder(mytree2.root);
        System.out.println("中序遍历的结果为：");
        for(Node node:mytree2.getResult()){
            System.out.print(node.data+" ");
        }
    }
}
