/*
 * demonstrates all the functionality of all methods from the Binary Search Tree
 */

/**
 *
 * @author Taylor Vu 
 */
public class TaylorVuAssignment7 {
    public static void main(String[] args)
    {
  
   BalancedBinarySearchTree t = new BalancedBinarySearchTree();
    t.insert(1);
    t.insert(2);
    t.insert(3);
    t.insert(4);
    t.insert(5);
    t.insert(6);
    t.insert(7);
    t.insert(8);
    t.insert(9);
  //tests out the traverse methods
    System.out.println();
    t.TraverseLNR();
    t.TraverseLRN();
    t.TraverseNLR();
    t.TraverseNRL();
    t.TraverseRLN();
    t.TraverseRNL();
    TreeNode root = null;
	//fetches the node
    System.out.println(t.fetch(root , 1));
    System.out.println(t.fetch(root, 6));
    System.out.println(t.fetch(root, 5));
    //deletes node
    t.delete(6);
    t.delete(5);
    
    //update node
    t.update(5);
    System.out.println(t.fetch(root, 6));
    System.out.println(t.fetch(root, 5));
    
    }
}
