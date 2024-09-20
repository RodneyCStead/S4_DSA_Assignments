package Assignment_2;

public class Main {
    public static void main(String[] args) {
        DoubleDimension dd = new DoubleDimension(3, 3);

        // Insert elements
        dd.insert(0, 0, 1);
        dd.insert(0, 1, 2);
        dd.insert(0, 2, 3);
        dd.insert(1, 0, 4);
        dd.insert(1, 1, 5);
        dd.insert(1, 2, 6);
        dd.insert(2, 0, 7);
        dd.insert(2, 1, 8);
        dd.insert(2, 2, 9);

        // Traverseing the array
        System.out.println("Array elements:");
        dd.traverse();

        // Searching for an element
        int searchValue = 5;
        boolean found = dd.search(searchValue);
        System.out.println("Element " + searchValue + " found: " + found);

        // Deleteing an element
        dd.delete(1, 1);
        System.out.println("Array after deleting the specified element above");
        dd.traverse();
    }
}
