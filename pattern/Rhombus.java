package pattern;
// not for exam
// before watching the code, try it on your own... 

public class Rhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j <= 9; j++) {
                if (i == j || i < j) {
                    System.out.print("* ");
                }
                if ((j - i) == 4) {
                    break;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
// 😫 Seems impossible but i did it. 