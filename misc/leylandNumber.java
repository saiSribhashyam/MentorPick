//https://atcoder.jp/contests/abc320/tasks/abc320_a


import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();

        BigInteger result = (A.pow(B.intValue())).add(B.pow(A.intValue()));
        System.out.println(result);
    }
}


//Java Big Integer for Big numbers
