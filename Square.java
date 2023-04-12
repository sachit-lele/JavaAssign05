public class Square extends Shape {
    public double side;

    public Square(double side){
        this.side = side;
    }
    @Override
    public double calculatePeri(){
        return 4*side;
    }
    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
