public class Tester {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(0, 0);
        System.out.println(p1.distanceTo(p2)); // 5.0
        System.out.println(p1.distanceTo(p3)); // 0.0
        System.out.println(p1.equals(p2)); // False
        System.out.println(p1.equals(p3)); // True

        Point p4 = new Point(3, 0);
        Triangle t1 = new Triangle(p1, p2, p4);
        Triangle t2 = new Triangle(-1, 0, 1, 0, 0, Math.sqrt(3));
        System.out.println(t1);
        System.out.println(t1.getArea()); // 6.0
        System.out.println(t1.getPerimeter()); // 12.0
        System.out.println(t2.classify()); // Equilateral
        t2.setVertex(2, new Point(0, 2));
        System.out.println(t2.classify()); // Isoceles
    }
}
