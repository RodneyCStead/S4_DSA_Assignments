package Assignment_2;

public class DoubleDimension {
    private int[][] array;
    private int rows;
    private int cols;

    public DoubleDimension(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        array = new int[rows][cols];
    }

    public void insert(int row, int col, int value) {
        try {
            array[row][col] = value;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage());
        }
    }

    public void traverse() {
        try {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error while traversing the array: " + e.getMessage());
        }
    }

    public boolean search(int value) {
        try {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (array[i][j] == value) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error while searching the array: " + e.getMessage());
        }
        return false;
    }

    public void delete(int row, int col) {
        try {
            if (row >= 0 && row < rows && col >= 0 && col < cols) {
                int deletedValue = array[row][col];
                array[row][col] = 0; // Assuming 0 is the default value
                System.out.println("Deleted element: " + deletedValue);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}