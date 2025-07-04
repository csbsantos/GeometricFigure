
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String printCoordinates(){
        return "{" + this.x + "," +this.y + "}";
    }
    public double distanceBetweenPoints (Point temp){
        int distanceX= this.x - temp.x;
        int distanceY= this.y - temp.y;
        return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY,2));
    }
}
