/**
 * @author shkstart
 * @create 2022-07-02-9:51
 */
public class BirnaryTreeDemo {
    public static void main(String[] args) {
        BinnaryTree binnaryTree=new BinnaryTree();
        Node node1=new Node(1,"张继涛");
        Node node2=new Node(2,"曾子澳");
        Node node3=new Node(3,"梅舜钦");
        Node node4=new Node(4,"袁星");

        node1.setLeft(node2);
        node1.setRight(node3);
        node3.setRight(node4);
     binnaryTree.setRoot(node1);
        System.out.println("前序遍历");
       binnaryTree.pre();
        System.out.println("**************************8");
        binnaryTree.con();

    }


}



class BinnaryTree{
    private Node root;

    public void setRoot(Node root) {
        this.root = root;
    }
    //前序
    public void pre(){
        if(this.root!=null){
            this.root.pre();
        }else {
            System.out.println("二叉树为空");
        }

    }
    //中序
    public void con(){
        if(this.root!=null){
            this.root.con();
        }else {
            System.out.println("二叉树为空");
        }

    }

    public void pos(){
        if(this.root!=null){
            this.root.pos();
        }else {
            System.out.println("二叉树为空");
        }

    }




}
class Node{
    private int no;
    private  String name;
    private Node left;
    private Node right;

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }


    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

     public  void pre(){
        //先输入根节点
         System.out.println(this);
         if(this.left!=null){
             this.left.pre();
         }
         if(this.right!=null){
             this.right.pre();
         }
     }
     public  void con(){
         if(this.left!=null){
            this.left.con();
         }
         System.out.println(this);
         if(this.right!=null){
             this.right.con();
         }
    }


     public  void pos(){
         if(this.left!=null){
             this.left.pos();
         }
         if(this.right!=null){
             this.right.pos();
         }
         System.out.println(this);
     }





}