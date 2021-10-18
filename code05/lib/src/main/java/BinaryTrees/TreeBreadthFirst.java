package BinaryTrees;

public class TreeBreadthFirst {

    public BinaryTreesNode root;


    public TreeBreadthFirst() {
        root = null;
    }

    public void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }


    public int height(BinaryTreesNode root)
    {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.getLeftNode());
            int rheight = height(root.getRightNode());

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    public void printCurrentLevel(BinaryTreesNode root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.getData() + " ");
        else if (level > 1) {
            printCurrentLevel(root.getLeftNode(), level - 1);
            printCurrentLevel(root.getRightNode(), level - 1);
        }
    }
}

