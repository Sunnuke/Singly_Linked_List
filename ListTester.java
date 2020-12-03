public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.removeAt(10);
        System.out.println("Node: " + sll.find(4) + "| Value " + sll.find(4).value);
        sll.printValues();
    }
}