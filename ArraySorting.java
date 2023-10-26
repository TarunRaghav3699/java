class ArraySorting{
    public static void main(String[] args){
        String[] arr= {"mumbai","bombay", "delhi", "kolkata"};
        // Here I am using arr.length because this will count the number of item in the list and sort it out
        // one more thing the time complexity of this code is O(n x n) 
        int n = arr.length;
        String temp;
        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (arr[i].compareTo(arr[j])>0){
                    // swaping
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        for (int i= 0; i<arr.length; i++ ){
        System.out.println(arr[i]);
        }
    }
}
