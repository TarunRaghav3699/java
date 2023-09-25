class Armstrong{
    public static void main(String[] args){
        int num = 15051,r,sum = 0;
        int num2 = num;
        while(num>0){
            r = num%10;
            sum = (sum*10)+r;
            num/=10;
        }
        if(sum==num2){
            System.out.println("This is an armstrong number "+sum+" = "+num2);
        }else {
            System.out.println("This is not an armstrong number "+sum + " != "+num2);
        }
    }
}