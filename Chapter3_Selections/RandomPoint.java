public class RandomPoint {
    /**
     * Write a program that displays a random coordinate in a rectangle.
     * the rectangle is centered at (0,0) with width 100 and height 200.
     */
    //GET RANDOM POINT TO 1000 LIMIT
    public static void main(String[] args) {
        double randomPoint = (int)(Math.random() * 1000);
    //TRACE COORDINATES
    double x = randomPoint;
    double y = randomPoint;
    //LET THE WIDTH AND HEIGHT
    final int WIDTH = 100;
    final int HEIGHT = 200;
    //MAKE THE COORDINATES
    //LOGIC
    if (x == 0 && y == 0) {
        System.out.println("The rectangle is centered at: " + x + "," + y + 
        " with width " + WIDTH + " and height " + HEIGHT);
    } else {
        System.out.println("The rectangle have coordinates in: " + x + "," + y + 
        " with width " + WIDTH + " and height " + HEIGHT);
    }
    }
    
}
