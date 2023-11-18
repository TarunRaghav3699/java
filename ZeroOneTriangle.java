// not for exam

public class ZeroOneTriangle {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}

// output will be:-

//    0 1 2 3 4
// 1. 1 + + + +
// 2. 0 1 + + +
// 3. 1 0 1 + +
// 4. 0 1 0 1 +
// 5. 1 0 1 0 1