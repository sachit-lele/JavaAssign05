public class Cylinder extends Shape implements Volume{
    public double height;
    public double radius;
    public Cylinder(double radius, double height){
        this.radius=radius;
        this.height=height;

    }
    @Override
    public double calculatePeri() {
        return 0;
    }
    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double calculateVolume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
