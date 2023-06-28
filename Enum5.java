package project1;
public class Enum5 {
    public enum shapes {
        RECTANGLE,
        TRIANGLE,
        SQUARE,
        PENTAGON,
        HEXAGON;
        
    }
    public static void main(String[] args){
        shapes s = shapes.RECTANGLE;
        shapes h = shapes.TRIANGLE;
        shapes a = shapes.SQUARE;
        shapes p = shapes.PENTAGON;
        shapes e = shapes.HEXAGON;
        System.out.println("Shape1: "+s);
        System.out.println("Shape2: "+h);
        System.out.println("Shape3: "+a);
        System.out.println("Shape4: "+p);
        System.out.println("Shape5: "+e);
    }
}