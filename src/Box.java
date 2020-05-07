import java.util.ArrayList;

class Box extends Shape{
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double available;
    private double volume;

    public Box(double available){
        this.available = available;
        this.volume = available;
    }

    public boolean add(Shape shape){
        if(available>=shape.getVolume()){
            shapes.add(shape);
            available -=shape.getVolume();
           System.out.printf("The figure is placed. It remains empty: %.2f \n", available);
           return true;
        }
        else{ System.out.printf("The figure is not placed. It remains empty: %.2f \n", available);
            return false;}
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Box{" +
                "shapes=" + shapes +
                ", available=" + available +
                ", volume=" + volume +
                '}';
    }
}
