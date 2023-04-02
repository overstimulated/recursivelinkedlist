public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addInOrder("ABC");
        linkedList.addInOrder("ABA");
        linkedList.addInOrder("ABB");
        linkedList.addInOrder("BBB");

        // iterate through the list and print the elements
        Node<String> linkedList1 = linkedList.getHead();
        while (linkedList1 != null) {
            System.out.println(linkedList1.getData());
            linkedList1 = linkedList1.getNext();
        }

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.addInOrder(4);
        linkedList2.addInOrder(2);
        linkedList2.addInOrder(6);
        linkedList2.addInOrder(1);

        // iterate through the list and print the elements
        Node<Integer> nextList = linkedList2.getHead();
        while (nextList != null) {
            System.out.println(nextList.getData());
            nextList = nextList.getNext();
        }
    }
}
