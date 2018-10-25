public class Figuren_Manager {

    public static void main(String[] args) {


        Figure[] figures = new Figure[]{new Triangle(5, 3, 60), new Rectangle(10, 5), new Square(3), new Ellipse(10, 6), new Circle(5)};


        for (int i = 0; i < figures.length; i++) {
            if (figures[i] instanceof Triangle) {
                Triangle t = (Triangle) figures[i];
                System.out.println(t.output());
            }
            else if(figures[i] instanceof Rectangle){
                Rectangle r = (Rectangle) figures[i];
                System.out.println(r.output());
            } else if (figures[i] instanceof Square) {
                Square s = (Square) figures[i];
                System.out.println(s.output());
            } else if (figures[i] instanceof Ellipse) {
                Ellipse e = (Ellipse) figures[i];
                System.out.println(e.output());
            } else if (figures[i] instanceof Circle) {
                Circle c = (Circle) figures[i];
                System.out.println(c.output());
            }
        }

    }
}

