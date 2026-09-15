class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Node leftmost = root;

        while (leftmost != null) {
            Node current = leftmost;
            Node dummy = new Node(0);
            Node tail = dummy;

            while (current != null) {

                if (current.left != null) {
                    tail.next = current.left;
                    tail = tail.next;
                }

                if (current.right != null) {
                    tail.next = current.right;
                    tail = tail.next;
                }

                current = current.next;
            }

            leftmost = dummy.next;
        }

        return root;
    }
}