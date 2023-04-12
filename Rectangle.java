public class Rectangle extends Shape{
    public double lenthRectangle;
    public double breadthRectangle;

    public Rectangle(double lenthRectangle, double breadthRectangle){
        this.lenthRectangle = lenthRectangle;
        this.breadthRectangle = breadthRectangle;
    }


    @Override
    public double calculatePeri(){
        return 2*lenthRectangle + 2*breadthRectangle;
    }

    @Override
    public double calculateArea(){
        return 2*lenthRectangle*breadthRectangle;
    }
}