package org.cfx.abstracttest;

/**
 * @author RTX 9090
 */
public class Rectangle extends AstraGraph {
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getAreas() {
        return width * height;
    }
}
