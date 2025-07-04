public class Square {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Square(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public String printAllCoordinates (){
        return "["+ this.p1.printCoordinates() + ";" + this.p2.printCoordinates() + ";" + this.p3.printCoordinates() + ";" + this.p4.printCoordinates()+ "]";
    }
    public double perimeter (){
        return this.p1.distanceBetweenPoints(this.p2)+this.p2.distanceBetweenPoints(this.p3)+this.p3.distanceBetweenPoints(this.p4)+this.p4.distanceBetweenPoints(this.p1);




    }
}
