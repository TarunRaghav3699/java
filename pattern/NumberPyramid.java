package pattern;

public class NumberPyramid {
    public static void main(String[] args) {
        for (int i = 5; i>=1; i--){
            for (int j = 1; j<=9; j++){
                if (i == j){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
