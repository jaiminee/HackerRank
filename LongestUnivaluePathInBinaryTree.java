
public class LongestUnivaluePathInBinaryTree {
	static int ans;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		//System.out.println(root.val);
		root.left = new TreeNode(4);
		//System.out.println(root.left.val);
		//root.left.val = 4;
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(4);
		root.right.right = new TreeNode(0);
		//root.right.right.right = new TreeNode(0);
		ans = 0;
		ans= getPath(root);
		System.out.println(ans);
	}
	public static int getPath(TreeNode node){
		if(node == null)
			return 0;
		int leftVal = getPath(node.left);
		int rightVal = getPath(node.right);
		int ansLeft=0,ansRight = 0;
		if(node.left!=null && node.left.val==node.val) {
			ansLeft += leftVal+1;
		}
		if(node.right!=null && node.right.val==node.val) {
			ansRight += rightVal+1;
		}
		ans = Math.max(ans, ansLeft + ansRight);
		 int temp = Math.max(ansLeft, ansRight);
		System.out.println("ans"+ans);
		System.out.println("temp"+temp);
		if(ansLeft>0 && ansRight==0) {
			return ans;
		}
		if (ansRight>0 && ansLeft==0) {
			return ans;
		}
		if(ansRight>0 && ansLeft>0) {
			return Math.max(ansLeft, ansRight);
		}
		else {
			return ans;
		}
		
	}
}
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val= val;
	}
}
