public class Rectangle extends Figure {


    private double length = 0d;
    private double width = 0d;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        double area = 0d;

        area = length * width;


        return area;
    }

    @Override
    public double circumference() {
        double circumference = 0d;

        circumference = 2 * length + 2 * width;
        return circumference;
    }

    @Override
    public String output() {
        String output = "";


        output = "Rechteck mit der Länge " + formatSolution(length) + " und der Breite " + formatSolution(width)+ ": Fläche -> " + formatSolution(area())+ ", Umfang -> " + formatSolution(circumference());

        return output;
    }
}
