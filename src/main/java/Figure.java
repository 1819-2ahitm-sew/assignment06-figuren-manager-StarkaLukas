abstract class Figure {

    abstract public double area();
    abstract public double circumference();
    abstract public String output();

    public String formatSolution(double solution) {
        String formattedSolution = "";

        if (solution - (int) solution == 0) {
            formattedSolution += (int) solution;
        }else{
            solution = solution * 10000;
            solution = (int) solution;
            solution = solution / 10;
            solution = Math.round(solution);
            solution = solution / 1000;

            formattedSolution += solution;
        }

        return formattedSolution;
    }
}
