class Tree {
    int data;
    Tree right;
    Tree left;

    Tree(int data) {
        this.data = data;
        right = null;
        left = null;
    }

    public static void main(String args[]) {
        Tree obj = new Tree(10);
        obj.right = new Tree(20);
        obj.left = new Tree(30);

        System.out.println(obj.data);
        System.out.println(obj.data.right);
        System.out.println(obj.data.left);
    }
}