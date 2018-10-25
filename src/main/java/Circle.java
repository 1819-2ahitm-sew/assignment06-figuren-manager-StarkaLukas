public class Circle extends Figure{

    private double radius = 0d;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = 0d;

        area = Math.PI * radius * radius;

        return area;
    }

    @Override
    public double circumference() {
        double circumference = 0d;

        circumference = 2 * Math.PI * radius;

        return circumference;
    }

    @Override
    public String output() {
        String output = "";

        output = "Kreis mit Radius " + formatSolution(radius) + ": Fläche -> " + formatSolution(area())+ ", Umfang -> " + formatSolution(circumference());

        return output;
    }
}
