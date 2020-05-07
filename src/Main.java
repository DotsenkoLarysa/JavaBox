import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Ball ball = new Ball(5);
	Cylinder cylinder = new Cylinder(3.5,2.8);
	Box box = new Box(820);

	System.out.printf("Ball volume: %.2f \n", ball.getVolume());
	System.out.printf("Cylinder volume: %.2f \n", cylinder.getVolume());
	System.out.printf("Box volume: %.2f \n", box.getVolume());

	box.add(ball);
	box.add(cylinder);
	box.add(ball);
    }
}
