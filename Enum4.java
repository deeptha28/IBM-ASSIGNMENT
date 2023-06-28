package project1;
public class Enum4 {
    public enum directions {
        NORTH,
        WEST,
        EAST,
        SOUTH;
        
    }
    public static void main(String[] args){
        directions d = directions.EAST;
        System.out.println("Directions: " +d);
    }
}