package Assignment_7;

public class Main {
    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();

        // Test decimalToBinary
        System.out.println();
        System.out.println("Converting decimal to binary as follows 0 through to 10:");
        System.out.println(decimalToBinary.decimalToBinary(0));
        System.out.println(decimalToBinary.decimalToBinary(1));
        System.out.println(decimalToBinary.decimalToBinary(2));
        System.out.println(decimalToBinary.decimalToBinary(3));
        System.out.println(decimalToBinary.decimalToBinary(4));
        System.out.println(decimalToBinary.decimalToBinary(5));
        System.out.println(decimalToBinary.decimalToBinary(6));
        System.out.println(decimalToBinary.decimalToBinary(7));
        System.out.println(decimalToBinary.decimalToBinary(8));
        System.out.println(decimalToBinary.decimalToBinary(9));
        System.out.println(decimalToBinary.decimalToBinary(10));


        SumOfPositiveInt sumOfPositiveInt = new SumOfPositiveInt();

        // Test sumOfPositiveInt
        System.out.println();
        System.out.println("Sum of positive integers from 1 to 10:");
        System.out.println(sumOfPositiveInt.sumOfPositiveInt(1));
        System.out.println(sumOfPositiveInt.sumOfPositiveInt(2));
        System.out.println(sumOfPositiveInt.sumOfPositiveInt(3));
        System.out.println(sumOfPositiveInt.sumOfPositiveInt(4));
        System.out.println(sumOfPositiveInt.sumOfPositiveInt(5));
        System.out.println(sumOfPositiveInt.sumOfPositiveInt(6));
        System.out.println(sumOfPositiveInt.sumOfPositiveInt(7));
        System.out.println(sumOfPositiveInt.sumOfPositiveInt(8));
        System.out.println(sumOfPositiveInt.sumOfPositiveInt(9));
        System.out.println(sumOfPositiveInt.sumOfPositiveInt(10));
    }
}
