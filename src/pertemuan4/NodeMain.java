package pertemuan4;

public class NodeMain {
    public void display(Node current) {
        while (current != null) {
            System.out.print(" " + current.getValue());
            current = current.getNode();
        }
    }

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.setNode(node2);
        node2.setNode(node3);
        node3.setNode(node4);
        node4.setNode(node5);

        Node current = node1;

        NodeMain nm = new NodeMain();
        nm.display(current);


    }
}