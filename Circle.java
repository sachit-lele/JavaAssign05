public class Circle extends Shape{
    public double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculatePeri(){
        return 2* Math.PI * radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }


}
