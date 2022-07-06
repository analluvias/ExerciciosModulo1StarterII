public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double Area(){
        return this.width * this.height;
    }

    public double Perimeter(){
        return this.width * 2 + this.height * 2;
    }

    public double Diagonal(){
        double diagonal;

        diagonal = Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));

        return diagonal;
    }
}
