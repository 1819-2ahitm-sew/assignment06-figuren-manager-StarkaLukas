public class Square extends Figure {


    private double side = 0d;

    public Square(double side) {
        this.side = side;
    }



    @Override
    public double area() {
        double area = 0d;

        area = side * side;

        return area;
    }

    @Override
    public double circumference() {
        double circumference = 0d;

        circumference = 4 * side;

        return circumference;
    }

    @Override
    public String output() {
        String output = "";

        output = "Quadrat mit den Seitenlängen " + formatSolution(side)+ ": Fläche -> " + formatSolution(area())+ ", Umfang -> " + formatSolution(circumference());

        return output;
    }
}
