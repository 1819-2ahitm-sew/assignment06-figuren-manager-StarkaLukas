public class Ellipse extends Figure {

    private double majorAxis = 0d;
    private double minorAxis = 0d;

    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double area() {
        double area = 0d;

        area = Math.PI * majorAxis * minorAxis;

        return area;
    }

    @Override
    public double circumference() {
        double circumference = 0d;
        double lambda = 0d;

        lambda = (majorAxis - minorAxis) / (majorAxis + minorAxis);

        circumference = (majorAxis + minorAxis) * Math.PI * (1 + ((3 * lambda * lambda) / (10 + Math.sqrt(4 - 3 * lambda * lambda))));

        return circumference;
    }

    @Override
    public String output() {
        String output = "";

        output = "Ellipse mit Hauptachse " + formatSolution(majorAxis) + " und Nebenachse " + formatSolution(minorAxis)+ ": Fläche -> " + formatSolution(area())+ ", Umfang " + formatSolution(circumference());

        return output;
    }
}
