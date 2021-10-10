/*
 * that encodes an expanded version of an AVL balanced binary search tree
*
 */

/**
 *
 * @author Taylor Vu 
 */
public class BalancedBinarySearchTree  {
    TreeNode root; // a field storing root node of the tree ( a TreeNode object)
    public BalancedBinarySearchTree(){ // constructor with no parameters that initalized the fields
        root = null;
    }
    

    public void insert(int data) {
        TreeNode node = new TreeNode();
        if (root == null) {
            root = node;
            return;
        }

        TreeNode currentNode = root;
        TreeNode parentNode = null;

        while (true) {
            parentNode = currentNode;
            if (currentNode.data == data)
                throw new IllegalArgumentException("Duplicates nodes note allowed in Binary Search Tree");

            if (currentNode.data > data) {
                currentNode = currentNode.left;
                if (currentNode == null) {
                    parentNode.left = node;
                    return;
                }
            } else {
                currentNode = currentNode.right;
                if (currentNode == null) {
                    parentNode.right = node;
                    return;
                }
            }
        }
    }


    
    public TreeNode fetch(TreeNode node, int value) {
		if(null == node) {
			return null;
		}
	 // we found the value
		if(node.data == value) {
			return node;
		}  
		//Value is less than node value. so go left sub tree
		else if(value < node.data)
			return fetch(node.left,value);
		//Value is greater than node value. so go right sub tree
		else 
			return fetch(node.right,value);
	}
// end of fetch method
     
     public static TreeNode minkey(TreeNode curr) {
    	 while(curr.left != null) {
    		 curr = curr.left;
    	 }
    	 return curr;
     }
     public static TreeNode minimumElement(TreeNode root) {
 		if (root.left == null)
 			return root;
 		else {
 			return minimumElement(root.left);
 		}
 	}
  
     public boolean delete(int targetKey){//method that deletes a vale given by parameter from AVL tree 
         boolean found;
         TreeNodeWrapper p = new TreeNodeWrapper();
         TreeNodeWrapper c = new TreeNodeWrapper();
         TreeNode largest;
         TreeNode nextLargest;
         found = findNode(targetKey, p, c);
         if(found == false) // node not found
             return false;
         else // identify the case number
         {if(c.get().left == null && c.get().right == null) // case 1: delete if node has no children
             
         {if(p.get().left == c.get()) // deleted node is a left child
         p.get().left = null;
            else
         p.get().right = null;
         } // end of case 1 
         else if(c.get().left == null || c.get().right == null) // case 2: 1 child
         {  if(p.get().left == c.get()) // deleted node is a left child
         
            { if (c.get().left != null) //deleted node has a left chold
            p.get().right = c.get().left;
            else 
            p.get().left = c.get().right;
         }// end of case 2
         }
         else // case 3: deleted node has two children
         {  nextLargest = c.get().left;
                 largest = nextLargest.right;
                 if(largest != null)//left child cas a right subtree
                 { while(largest.right != null)//move down right subtree
                    { nextLargest = largest;
                      largest = largest.right;
                    }
                 c.get().data = largest.data;//overwrite deleted node
                 nextLargest.right = largest.left; // save the left subtree
                 }
                 else //left child does not have a right subtree 
                 {  nextLargest.right = c.get().right;//save the right subtree
                    if(p.get().left == c.get()) // deleted node is a left child
                    p.get().left = nextLargest; // jump around deleted node
                    else //deleted node is a right child
                        p.get().right = nextLargest; //jump around deleted node
                 }
                 }// end of case 3
         return true;
         }
         }// end of delete method
  
 	public boolean update(int targetKey)
    {
        if(delete(targetKey) == false)
            return false;
        return true;
    }// end of update 
 	
 	 private boolean findNode(int targetKey, TreeNodeWrapper parent, TreeNodeWrapper child)//method that finds a value in AVL tree given by the parameter 
     {
         parent.set(root);
         child.set(root);
         if(root == null) // tree is empty
             return true;
         while(child.get() != null)
         {
             if(child.get().data == 0)//node found
                 return true;
             else
             {
                 parent.set(child.get());
                 if(child.get().data < 0)
                     child.set(child.get().left);
                 else
                     child.set(child.get().right);
             }
         }//end of while 
         return false;
     }// end of find Node
     
     public void LNRtraversal(TreeNode root){
         if( root == null){
             return;
         }
         LNRtraversal(root.left);
         System.out.printf("%s ", root.data);
         LNRtraversal(root.right);
     }
     
     public void visit(TreeNode root){
         if(root == null) // check for an empty tree
             System.out.println(" the structure is empty");
         else 
             LNRtraversal(root);
     }
     
     public void TraverseLNR(){// a method that transverse the AVL Tree in LRN order and outputs the values 
         if(root.left != null)//transverse the left subtree
             LNRtraversal(root.left);
         visit(root); //operate on the root node
         if(root.right != null)//traverse the right subtree
             LNRtraversal(root.right);
     }
     public void TraverseLRN(){ // method traverse the AVL tree in LRN order and outputs the values
         if(root.left != null) // traverse left subtree
             LNRtraversal(root.left);
        if(root.right != null)// traverse right subtree
            LNRtraversal(root.right);
        visit(root); //operate on the root node
     }
     public void TraverseNRL(){//method that traverses the AVL tree in NRL order and outputs the values
         visit(root);//operate on the  root node 
         if(root.right != null)//traverse right subtress
             LNRtraversal(root.right);
         if(root.left != null)// traverse left subtree
             LNRtraversal(root.left); 
     }
     public void TraverseNLR(){//method that traverses the AVL tree in NLR order and outputs the values
         visit(root);//operate on the root node
         if(root.right != null)//traverse right subtree
             LNRtraversal(root.right);
         if(root.left != null)// traverse left subtree 
             LNRtraversal(root.left);
        }
     public void TraverseRLN(){ //method traverses AVL tree in RLN order and outputs the values
         if(root.right != null) // traverse to right subtree
             LNRtraversal(root.right);
         if(root.left != null)
             LNRtraversal(root.left); // traverse to left subtree
         visit(root); // operate on root node
     }
     public void TraverseRNL(){ //method that traverses the AVL tree in RNL Ooder and outputs the values
         if(root.right != null)//traverse to right subtree
             LNRtraversal(root.right);
         visit(root);// operate on root node
         if(root.left != null)// traverse to left subtree
             LNRtraversal(root.left);
     }		
}