/*
 * that encodes a wrapper for the TreeNode class 
 */

/**
 *
 * @author Taylor Vu 
 */
public class TreeNodeWrapper {
    TreeNode TreeNodeRef = null;//reference to a tree node
    public TreeNodeWrapper(){
        
    }
    public TreeNode get(){ //method that returns the TreeNode from wrapper
        return TreeNodeRef;
    }
    public void set(TreeNode t){ //method that adds a TreeNode to the wrapper 
        TreeNodeRef = t;
    }
}
