package Assignment_7;

public class DecimalToBinary {

    public String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return decimalToBinary(n / 2) + (n % 2);
    }
}
