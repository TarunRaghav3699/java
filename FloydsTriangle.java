// not for exam

public class FloydsTriangle {
    public static void main(String[] args){
        int n = 6;
        int m = 1;
        for (int i = 0; i < n; i++ ){
            for (int j = 1; j <= i; j++ ){
                int sum = m++;
                System.out.print(sum + " ");
            }
            System.out.println();
            
        }
    }
}

// output will be:-

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 