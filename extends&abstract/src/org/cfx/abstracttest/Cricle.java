package org.cfx.abstracttest;

/**
 * @author RTX 9090
 */
public class Cricle extends AstraGraph {

    public double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Cricle(double r) {
        this.r = r;
    }

    public Cricle() {
    }

    @Override
    public double getAreas() {
        return r*r;
    }

}
