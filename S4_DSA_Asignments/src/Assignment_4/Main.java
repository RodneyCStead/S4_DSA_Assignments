package Assignment_4;


public class Main {

    public static void main (String[] args) {
        LinkedList sda = new LinkedList();
        sda.insertInLinkedList(1,0);
        sda.insertInLinkedList(2,1);
        sda.insertInLinkedList(3,2);
        sda.insertInLinkedList(4,3);
        sda.insertInLinkedList(5,4);
        sda.insertInLinkedList(6,5);

        sda.traverseLinkedList();
        sda.searchNode(6); // expected to return true
        sda.searchNode(7); // expected to return false
    }
}
