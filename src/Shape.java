abstract class Shape {
    public abstract void printResult();
    public abstract double getPerimeter();
    public abstract double getArea();
}

class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    /**
     * getters & setters
     **/
    public double getSideA(){ return sideA; }
    public double getSideB(){ return sideB; }
    public double getSideC(){ return sideC; }

    public void setSideA(double sideA){ this.sideA = sideA; }
    public void setSideB(double sideB){ this.sideB = sideB; }
    public void setSideC(double sideC){ this.sideC = sideC; }

    /**
     * constructors
     */
    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * public methods
     */
    public double getPerimeter(){
        return sideA + sideB + sideC;
    }

    public double getArea(){
        double halfPerimeter = this.getPerimeter()/2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    public void printResult(){
        System.out.println("-----Triangle-----");
        System.out.println("Side A:" + sideA);
        System.out.println("Side B:" + sideB);
        System.out.println("Side C:" + sideC);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public double getLength(){ return length; }
    public double getWidth(){ return width; }
    public void setLength(double length){ this.length = length; }
    public void setWidth(double width){ this.width = width; }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
        return (length + width) * 2;
    }

    public double getArea(){
        return length * width;
    }

    public void printResult(){
        System.out.println("-----Rectangle-----");
        System.out.println("Width: " + length);
        System.out.println("Height: " + width);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

class Circle extends Shape {
    private double radius;
    private final double pi = Math.PI;

    public double getRadius(){ return radius; }
    public void setRadius(double radius){ this.radius = radius; }

    public Circle(double radius) { this.radius = radius; }

    public double getPerimeter(){
        return 2 * pi * radius;
    }

    public double getArea(){
        return pi * radius * radius;
    }

    public void printResult(){
        System.out.println("-----Circle-----");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}