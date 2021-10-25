class Room {
    protected double length;
    protected double breadth;
    protected double height;
    public Room(double length,double breadth,double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public double area(){
        return length*breadth;
    }
    public double volume(){
        return this.area()*height;
    }
}
class Bedroom extends Room{
    public boolean hasBalcony = false;
    public Bedroom(double length,double breadth,double height){
        super(length,breadth,height);
    }
}
class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class Main{
    public static void main(String[] args) {
//        Bedroom obj_bedroom = new Bedroom(10,20,30);
//        System.out.println("Area of the bedroom is "+obj_bedroom.area());
//        System.out.println("Volume of the bedroom is "+obj_bedroom.volume());

        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        System.out.println(point1.equals(point2));

    }
}
