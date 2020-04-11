package com.michalgarnczarski;

public class Glass {
    private int glassWidth;
    private int glassHeight;
    private int spacerThickness;
    private int longerDimension;
    private int shorterDimension;
    private double area;
    private double dimensionsRatio;

    public Glass(int glassWidth, int glassHeight, int spacerThickness) {
        this.glassWidth = glassWidth;
        this.glassHeight = glassHeight;
        this.spacerThickness = spacerThickness;

        if (glassWidth > glassHeight) {
            this.longerDimension = glassWidth;
            this.shorterDimension = glassHeight;
        } else {
            this.longerDimension = glassHeight;
            this.shorterDimension = glassWidth;
        }

        this.area =  Math.round(100.0 * longerDimension * shorterDimension / 1000000) / 100.0;
        this.dimensionsRatio = (double) shorterDimension / longerDimension;
    }

    public int getGlassWidth() {
        return glassWidth;
    }

    public int getGlassHeight() {
        return glassHeight;
    }

    public int getSpacerThickness() {
        return spacerThickness;
    }

    public int getLongerDimension() {
        return longerDimension;
    }

    public int getShorterDimension() {
        return shorterDimension;
    }

    public double getArea() {
        return area;
    }

    public double getDimensionsRatio() {
        return dimensionsRatio;
    }
}
