import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Line(Color.RED, 50, 50, 100, 100));
        shapes.add(new Circle(Color.GREEN, 150, 150, 50));
        shapes.add(new Text(Color.BLUE, 200, 200, "Hello"));

        JFrame frame = new JFrame("Drawing Animation");
        DrawingPanel panel = new DrawingPanel(shapes);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

        // Animation loop
        while (true) {
            for (Shape shape : shapes) {
                if (shape instanceof MovableShape) {
                    ((MovableShape) shape).move();
                }
            }
            panel.repaint();

            try {
                Thread.sleep(50); // 50 milliseconds delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
