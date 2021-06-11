class Circle{
    double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Cylinder extends Circle{
    double height;
    @Override
    public double area(){
        return 2*Math.PI*radius*height;
    }
    public double volume(){
        return super.area()*height;
    }
}

class RecTangle{
    double lenght;
    double breadth;
    public double area(){
        return lenght*breadth;
    }
    public double perimeter(){
        return 2*(lenght+breadth);
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
class Cuboid extends RecTangle{
    double height;
    @Override
    public double area(){
        return 6*lenght*breadth;
    }
    public double volume(){
        return super.area()*height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

public class ch_10_pr {
    public static void main(String[] args) {

    }
}
