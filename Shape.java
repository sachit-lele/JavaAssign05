public abstract class Shape {
    public String name;
    public void printShape(String name){
        this.name=name;
        System.out.println("Shape selected is"+ name);
    }
    public abstract double calculateArea();
    public abstract double calculatePeri();
}
