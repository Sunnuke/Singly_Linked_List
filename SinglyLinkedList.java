public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        head = null;
    }

    public void printValues() {
        Node node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public void remove() {
        Node curr = head;
        if (curr == null || curr.next == null) {
            head = null;
        }
        Node nextNode = curr.next;
        while (curr.next != null) {
            if (nextNode.next == null) {
                curr.next = null;
            }
            curr = nextNode;
            nextNode = nextNode.next;
        }
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
}