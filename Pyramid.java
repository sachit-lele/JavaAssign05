public class Pyramid extends Shape implements Volume {
    private double base;
    private double height;

    public Pyramid(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
    @Override
    public double calculatePeri() {
        return 0;
    }
    @Override
    public double calculateVolume() {
        return 1.0/3.0 * base * height;
    }
}
