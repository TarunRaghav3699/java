abstract class Student {
    public String name = "tarun";
    public int rollNumber = 106;
    public abstract void study();
}
class Test extends Student {
    public int marks = 99;
    public void study(){
        System.out.println("name is " + name + " and roll number is "+rollNumber+" and marks is "+ marks);
    }
}
class Marks{
    public static void main(String[] args){
        Test myObj = new Test();
        myObj.study();
    }
}