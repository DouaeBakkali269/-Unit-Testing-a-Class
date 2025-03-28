package org.example;

public class Point {
    private double x;

    private double y ;

    public Point(double x , double y){
        super();
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point translater(double dx , double dy) {
        return new Point(this.getX() + dx, this.getY() + dy);
    }

    // Overriding the equals() method to compare the content of two Point objects after the first test failed.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

}
