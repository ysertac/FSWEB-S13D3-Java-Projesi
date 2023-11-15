package com.workintech.S1D3;

public class Wall {
    double width;
    double height;

    public void checkwidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void checkheight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Constructor
    public Wall(double width, double height) {
        checkwidth(width);
        checkheight(height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setwidth(double width) {
        checkwidth(width);
    }

    public void setHeight(double height) {
        checkheight(height);
    }

    public double area() {
        return width * height;
    }
}
