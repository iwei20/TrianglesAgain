public class Tester {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(0, 0);
        System.out.println(p1.distanceTo(p2)); // 5.0
        System.out.println(p1.distanceTo(p3)); // 0.0
        System.out.println(p1.equals(p2)); // False
        System.out.println(p1.equals(p3)); // True
    }
}
