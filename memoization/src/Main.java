import java.math.BigInteger;

public class Main {

    static BigInteger[] array = new BigInteger[10001];

    public static void main(String[] args) {
        int n = 100;
        BigInteger result = getFibonacci(n);
        System.out.println(result);
    }

    private static BigInteger getFibonacci(int n) {
        //base case!!!!
        if (n == 1 || n == 2) {
            return BigInteger.ONE;
        }
        if (array[n - 1] == null) {
            BigInteger beforeElement = getFibonacci(n - 1);
            array[n - 1] = beforeElement;
        }
        if (array[n - 2] == null) {
            BigInteger preBeforeElement = getFibonacci(n - 2);
            array[n - 2] = preBeforeElement;
        }
        return (array[n - 1].add(array[n - 2]));
    }
}