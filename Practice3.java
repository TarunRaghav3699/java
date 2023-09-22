// Making constructor overloading
class Student{
    // construdtor with one integer type and one string type and one with both 
    int length;
    int breadth;
    int heigth;
    public int rectangle(){
        return length*breadth;
    }
    Student(int h){
        heigth = h;
        System.out.println("height is "+ h);
    }
    
    Student(int l, int b){
        length = l;
        breadth = b;
    }
        
}
public class Practice3 {
    // calling the constructors by making an object
    public static void main(String[] args){
        Student myObj = new Student(15);
        if (myObj.length != myObj.breadth){
            System.out.println("This is a rectangle");
            System.out.println(myObj.rectangle());
        }else {
            System.out.println("This is a square");
            System.out.println(myObj.rectangle());
        }
        
    } 
    
}
