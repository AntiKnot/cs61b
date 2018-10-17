public class DrawingTriangle {
    public static void main(String[] args) {
        drawTriangle(5);
    }
    public static void drawStar(int x) {
        for (int i=0; i<x; i++) {
            System.out.print('*');
        }
        System.out.println('*');
    }

    public static void drawTriangle(int y) {
       for (int i=0; i<y; i++) {
           drawStar(i);
       } 
    }
}