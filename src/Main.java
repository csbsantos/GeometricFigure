public class Main {
    public static void main(String[] args) {
        Point p1= new Point(1,2);
        Point p2= new Point(7,2);
        Point p3= new Point(5,9);
        Point p4= new Point(4,5);

        System.out.println(p1.distanceBetweenPoints(p2));
        System.out.println(p1.distanceBetweenPoints(p3));

        System.out.println(p1.printCoordinates());
        System.out.println(p2.printCoordinates());
        System.out.println(p3.printCoordinates());

        Square sq1= new Square(p1, p2, p3, p4);
        System.out.println(sq1.printAllCoordinates());
        System.out.println(sq1.perimeter());
    }
}
