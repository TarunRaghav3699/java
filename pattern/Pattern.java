// not for exam 
package pattern;
public class Pattern {
    public static void main(String[] args){
        int i,j;
        i = 0;
        while (i<10){
            j = 0;
            while (j<i){
                System.out.print("*  ");
                j++;
            }
        System.out.println("");
        i++;
        }
    }
}
