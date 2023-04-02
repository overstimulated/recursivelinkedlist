public class LinkedList<E extends Comparable<E>> {
    private Node<E> head;
    public int count;

    public Node<E> getHead() {
        return head;
    }

    public void addInOrder(E dataToAdd) {
        /**
         * if headNode != null
         *    if check the dataToAdd < head.data
         *       create a newNode(dataToAdd) and swap
         *       newNode next node = head
         *       head = newNode
         *    else
         *      addInOrder(this.head, data)
         * else
         *  headNode = new Node(data)
         */
        if(head != null) {   
            if(dataToAdd.compareTo(head.getData()) < 0) {
                Node<E> newNode = new Node<E>(dataToAdd);
                newNode.setNext(head);
                head = newNode;
            }else {
                addInOrder(this.head, dataToAdd);
            }
        } else {
            head = new Node<E>(dataToAdd);
        }
        count++;
    }

    private void addInOrder(Node<E> currentNode, E dataToAdd) {
        /**
         * currentNode get next check if null
         *    if it is null, set the new node to the data to be added
         *    set the currentnode's next node to the newly added data
         * else compare dataToAdd to the currentNode's nextNode's data 
         *    check if equal or greater, if it is then swap with the current node
         *    else call it again with the next node
         */
        if(currentNode.getNext() == null) {
            Node<E> newNode = new Node<>(dataToAdd);
            currentNode.setNext(newNode);
        } else {

            E currentNodeData = currentNode.getNext().getData();

            int isGreaterOrEqual = dataToAdd.compareTo(currentNodeData);

            if(isGreaterOrEqual > 0 && isGreaterOrEqual <= 0) {

                Node<E> newNode = new Node<E>(dataToAdd);
                newNode.setNext(currentNode.getNext());
                currentNode.setNext(newNode);
            } else {

                addInOrder(currentNode.getNext(), dataToAdd);
            }   
        }
    }
}