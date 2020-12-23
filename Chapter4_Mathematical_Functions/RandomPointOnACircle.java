/**Random points on a circle */
public class RandomPointOnACircle {
    public static void main (String ... args) {
        //RADIUS
        final double RADIUS = 40;
        //RANDOM ANGLE ALFA
        double randomAngle1 = (int)(Math.random() * (2 * Math.PI));
        double randomAngle2 = (int)(Math.random() * (2 * Math.PI));
        double randomAngle3 = (int)(Math.random() * (2 * Math.PI));
        //MAKE THE FORMULA POINT 1
        double pointx1 = RADIUS * Math.cos(randomAngle1);
        double pointy1 = RADIUS * Math.sin(randomAngle1);
        //FORMULA POINT 2
        double pointx2 = RADIUS * Math.cos(randomAngle2);
        double pointy2 = RADIUS * Math.sin(randomAngle2);
        //FORMULA POINT 3
        double pointx3 = RADIUS * Math.cos(randomAngle3);
        double pointy3 = RADIUS * Math.sin(randomAngle3);
        //CONDITIONAL
        if (randomAngle1 != randomAngle2 && randomAngle1 != randomAngle3 &&
            randomAngle2 != randomAngle1 && randomAngle2 != randomAngle3 &&
            randomAngle3 != randomAngle1 && randomAngle3 != randomAngle2 ) {
            System.out.println("Point #1: ");
            System.out.println(randomAngle1);
            System.out.println(pointx1);
            System.out.println(pointy1);
            System.out.println("Point #2: ");
            System.out.println(randomAngle2);
            System.out.println(pointx2);
            System.out.println(pointy2);
            System.out.println("Point #3: ");
            System.out.println(randomAngle3);
            System.out.println(pointx3);
            System.out.println(pointy3);
        } else {
            System.out.print("Some angle is the same like other, otherwise try to run your program again.");
            System.exit(1);
        }
        
    }
}