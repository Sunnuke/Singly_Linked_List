public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        head = null;
    }

    public void removeAt(int num) {
        Node toRemove = find(num);
        Node curr = head;
        while (curr.next != null) {
            if (curr.next == toRemove) {
                curr.next = toRemove.next;
            }
            curr = curr.next;
        }
    }

    public Node find(int num) {
        Node curr = head;
        if (head != null || head.next != null) {
            while (curr.next != null) {
                if (curr.value == num) {
                    return curr;
                }
                curr = curr.next;
            }
        }
        return null;
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
            return;
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