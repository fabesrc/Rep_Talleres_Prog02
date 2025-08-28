package defaultPackage;

import javax.swing.JOptionPane; 
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        AreaCalculator calculator = new AreaCalculator();

        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "--- Menú ---\n" +
                "1. Agregar Rectángulo\n" +
                "2. Agregar Círculo\n" +
                "3. Agregar Triángulo\n" +
                "4. Calcular suma de áreas\n" +
                "0. Salir\n" +
                "Elige una opción:"
            );

            if (opcion == null) break; // usuario canceló
            switch (opcion) {
                case "1":
                    double width = Double.parseDouble(JOptionPane.showInputDialog("Ingresa ancho:"));
                    double height = Double.parseDouble(JOptionPane.showInputDialog("Ingresa alto:"));
                    Rectangle rect = new Rectangle(width, height);
                    shapes.add(rect);
                    JOptionPane.showMessageDialog(null, 
                        "Rectángulo agregado.\nÁrea = " + rect.getArea());
                    break;

                case "2":
                    double radius = Double.parseDouble(JOptionPane.showInputDialog("Ingresa radio:"));
                    Circle circ = new Circle(radius);
                    shapes.add(circ);
                    JOptionPane.showMessageDialog(null, 
                        "Círculo agregado.\nÁrea = " + circ.getArea());
                    break;

                case "3":
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa base:"));
                    double h = Double.parseDouble(JOptionPane.showInputDialog("Ingresa altura:"));
                    Triangle tri = new Triangle(base, h);
                    shapes.add(tri);
                    JOptionPane.showMessageDialog(null, 
                        "Triángulo agregado.\nÁrea = " + tri.getArea());
                    break;

                case "4":
                    double total = calculator.sum(shapes);
                    JOptionPane.showMessageDialog(null, "Área total de todas las figuras = " + total);
                    break;

                case "0":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}
