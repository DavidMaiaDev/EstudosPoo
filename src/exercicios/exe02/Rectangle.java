package exercicios.exe02;

public class Rectangle {
    public double width;
    public double height;


    public double area(double width, double height){
        return width * height;
    }

    public double perimeter(double height, double width){
        return 2 * (height + width);
    }

    public double diagonal(double width, double height){
        return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    }

    public String toString(){
        return "AREA = " + String.format("%.2f",area(width, height)) + "\n" +
        "PERIMETER = " + String.format("%.2f",perimeter(width, height)) + "\n" +
                "DIAGONAL = " + String.format("%.2f", diagonal(width, height));
    }
}
