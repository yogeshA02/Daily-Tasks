class Node 
{
    int key;
    Node left, right;

    public Node(int item) 
    {
        key = item;
        left = right = null;
    }
}

public class BinaryTree 
{
    Node root;


    BinaryTree(int key) 
    {
        root = new Node(key);
    }

    BinaryTree() 
    {
        root = null;
    }


    // inseting a node
    void insert(int key) 
    {

        root = insertRec(root, key);
    }



    Node insertRec(Node root, int key) 
    {
        
        if (root == null) 
        {
            root = new Node(key);
            return root;
        }

    
        if (key < root.key)
            root.left = insertRec(root.left, key);

        else if (key > root.key)
            root.right = insertRec(root.right, key);

        
        return root;
    }

    
    void inorder() 
    {
        inorderRec(root);
    }


    void inorderRec(Node root) 
    {
        if (root != null) 
        {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

   
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /*we createing the following binary tree
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */


        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // printing the  inorder traversal of the Binary Tree
        tree.inorder();
    }
}
