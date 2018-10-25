
public class Triangle extends Figure {

    private double side1 = 0d;
    private double side2 = 0d;
    private double angle = 0d;

    public Triangle(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
    }

    @Override
    public double area() {
        double area = 0d;
        double heightB = 0d;

        heightB = side1 * Math.sin(angle);
        area = (heightB * side2) / 2;

        return area;
    }

    @Override
    public double circumference() {
        double circumference = 0d;
        double side3 = 0d;

        side3 = Math.sqrt((side1 * side1) - 2 * side1 * side2 * Math.cos(angle) + (side2 * side2));

        circumference = side1 + side2 + side3;
        return circumference;
    }

    @Override
    public String output() {
        String output = "";

        output = "Dreieck mit der Seite 1: " + formatSolution(side1) + " und Seite 2: " + formatSolution(side2) + " und dem eingeschlossenen Winkel " + formatSolution(angle) + ": Fläche -> " + formatSolution(area()) + ", Umfang -> " + formatSolution(circumference());

        return output;
    }

}
