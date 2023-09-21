// To calculate factorial of any number
class Practice{
    static int factorial(int num){
        if (num == 1) {
            return 1;
        }else{
            return num * factorial(num-1);
        }
    }
    public static void main(String[] args){
        int value = factorial(5);
        System.out.println(value);
    }
}