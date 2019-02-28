package challenges;

class BinaryTree  
{ 
	static int counter=0; 
     Node root; 
   
    /* Compute the "maxDepth" of a tree -- the number of  
       nodes along the longest path from the root node  
       down to the farthest leaf node.*/
    int maxDepth(Node node)  
    { 
        if (node == null) {
        	System.out.println("counter "+counter +" 0");
        	counter++; 
        	return 0; 
        }
            
        else 
        { 
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left); 
            int rDepth = maxDepth(node.right); 
   
            /* use the larger one */
            if (lDepth > rDepth) {
            	System.out.println("counter "+counter+"  "+(lDepth + 1));
            	   return (lDepth + 1); 
            }
             
             else {
            	 System.out.println("counter "+counter+"  "+(rDepth + 1));
            	 return (rDepth + 1); 
             }
                
        } 
    } 
       
    /* Driver program to test above functions */
    public static void main(String[] args)  
    { 
        BinaryTree tree = new BinaryTree(); 
   
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
   
        System.out.println("Height of tree is : " +  
                                      tree.maxDepth(tree.root)); 
    } 
} 