public class PrimeNumber {
    public static void main(String[] args) {
        int i, j, r = 1;
        System.out.println("The Prime Numbers from 1 to 100 are ");
        for (i = 2; i < 100; i++) {
            for (j = 2; j < i; j++) {
                r = i % j;
                if (r == 0)
                    break;
            }
            if (r != 0)
            System.out.print(i + "    ");
        }
    }
}