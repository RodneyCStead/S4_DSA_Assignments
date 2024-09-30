package Assignment_4;

public class LinkedList {

    public Node head; // head of the list
    public Node tail; // the end of the list
    public int size;

    public Node createLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    // insert into a linked list
    // 1. If linked list does not exsist, then create it
    // 2. Inserting at the start of the linked list
    // 3. Inserting at the end of the linked list
    // 4. Inserting into any location between the start and end of the linked list

    public void insertInLinkedList(int nodeValue, int location) {

        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = node;
            node.next = nextNode;
        }
        size++;
    }
    //Traverse a linked list
    public void traverseLinkedList() {
        if (head == null) {
            System.out.println ("Linked list does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i ++) {
                System.out.print (tempNode.value);
                if (i != size - 1) {
                    System.out.print (" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print ("\n");
    }
    //Search for a node in a linked list
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print(" Found the node: " + tempNode.value + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node not found! \n");
        return false;
    }

    //Deleteing a node from a linked list

}
