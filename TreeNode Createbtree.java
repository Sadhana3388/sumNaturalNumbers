import java.util.Arrays;
class TreeNode{
 int data;
 TreeNode left;
 TreeNode right;
 public TreeNode(int val){
 this.data=val;
 this.left=null;
 this.right=null;
 }
 }
 public class Main{
 public static TreeNode Createbtree(int[]arr,int i,int n){
 if(i>n){
 return null;
 }
 TreeNode root=new TreeNode(arr[i-1]);
 root.left=Createbtree(arr,2*i,n);
 root.right=Createbtree(arr,2*i+1,n);
 return
 }
 public static void pre(TreeNode root){
if(root==null){
return;
}
System.out.println(root.data+"");
pre(root.left);
pre(root.right);
}
public static voidmain(String[] args){
int[] arr=(1,2,3,4,5,6,7};
TreeNode btree=Createbtree(arr,1,arr.length);
System.out.println(btree);
pre(btree);
}

 