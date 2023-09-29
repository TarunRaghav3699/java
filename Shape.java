abstract class Shape {
    public int length;
    public int breadth;
    public int height;
    public abstract int area();
    Shape(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
}
class Rectangle extends Shape {
    public int area(int length, int breadth){
        return length*breadth;
    }
}
class Cube extends Shape{
    public int area(int lenght, int breadth, int height){
        return (lenght*breadth)*height;
    }
}
