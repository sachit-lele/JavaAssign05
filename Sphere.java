public class Sphere extends Shape implements Volume{
    public double radius;

    public Sphere(double side){
        this.radius = radius;
    }
    @Override
    public double calculatePeri(){
        return 0;
    }
    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double calculateVolume(){
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }
}

