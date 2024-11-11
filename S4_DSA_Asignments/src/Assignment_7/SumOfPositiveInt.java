package Assignment_7;

public class SumOfPositiveInt {
    public int sumOfPositiveInt(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumOfPositiveInt(n - 1);
    }
}
