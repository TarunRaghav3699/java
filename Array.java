class Array{
    // this will print the desired output that you want 
    public void array1(){
        // String array;
        String[] array1={"tarun", "laxman", "om", "yash", "bharat"};
        System.out.println(array1[0]+" and "+array1[1]+ " are both friends");
    }
    // Code to print all the numbers of the array
    public void array2(){
        int[] array2 = {1,2,3,4,5};
        for (int i = 0; i < array2.length; i++){
            String art = (i +" = " +array2[i]);
            System.out.println(art);
        }
    }
    public static void main(String args[]){
        Array myObj = new Array();
        myObj.array1();
        myObj.array2();
    }
}
