package pattern;
// not for exam

class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        // outer loop (rows)
        for (int i = n; i >= 0; i--) {
            // inner loop (columns)
            for (int j = 0; j <= n; j++) {
                if ( j == n || i == j || i<=j) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// output will be:-

//   1 2 3 4 5 6
// 1 + + + + + * 
// 2 + + + + * * 
// 3 + + + * * * 
// 4 + + * * * * 
// 5 + * * * * * 
// 6 * * * * * * 
