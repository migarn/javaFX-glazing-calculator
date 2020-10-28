package com.michalgarnczarski;

public class GlassThicknessDefiner {
    private Glass glass;
    private int thickness;

    public GlassThicknessDefiner(Glass glass) {
        this.glass = glass;
        this.thickness = defineThickness();
    }

    public int getThickness() {
        return thickness;
    }

    private int defineThickness() {
        if (glass.getSpacerThickness() >= 16) {
            return defineThicknessFor16();
        } else if (glass.getSpacerThickness() >= 12) {
            return defineThicknessFor12();
        } else if (glass.getSpacerThickness() >= 9) {
            return defineThicknessFor9();
        } else if (glass.getSpacerThickness() >= 6) {
            return defineThicknessFor6();
        } else {
            return -1;
        }
    }

    private int defineThicknessFor16() {
        if (glass.getArea() <= 1.5 && glass.getLongerDimension() <= 1500 && glass.getDimensionsRatio() > 1.0/6) {
            return 3;
        } else if (glass.getArea() <= 3.35 && glass.getLongerDimension() <= 2500 && glass.getDimensionsRatio() > 1.0/6) {
            return 4;
        } else if (glass.getArea() <= 5 && glass.getLongerDimension() <= 3300) {
            return 5;
        } else if (glass.getArea() <= 7 && glass.getLongerDimension() <= 3500) {
            return 6;
        } else if (glass.getArea() <= 10 && glass.getLongerDimension() <= 5000) {
            return 8;
        } else if (glass.getArea() <= 13.5 && glass.getLongerDimension() <= 5000) {
            return 10;
        } else if (glass.getArea() <= 13.5 && glass.getLongerDimension() <= 6000) {
            return 12;
        } else {
            return -1;
        }
    }

    private int defineThicknessFor12() {
        if (glass.getArea() <= 1.5 && glass.getLongerDimension() <= 1500 && glass.getDimensionsRatio() > 1.0/6) {
            return 3;
        } else if (glass.getArea() <= 3.35 && glass.getLongerDimension() <= 2500 && glass.getDimensionsRatio() > 1.0/6) {
            return 4;
        } else if (glass.getArea() <= 5 && glass.getLongerDimension() <= 3300) {
            return 5;
        } else if (glass.getArea() <= 7 && glass.getLongerDimension() <= 3500) {
            return 6;
        } else if (glass.getArea() <= 8.75 && glass.getLongerDimension() <= 3500) {
            return 8;
        } else {
            return -1;
        }
    }

    private int defineThicknessFor9() {
        if (glass.getArea() <= 1.5 && glass.getLongerDimension() <= 1500 && glass.getDimensionsRatio() > 1.0/6) {
            return 3;
        } else if (glass.getArea() <= 2.5 && glass.getLongerDimension() <= 2500 && glass.getDimensionsRatio() > 1.0/6) {
            return 4;
        } else if (glass.getArea() <= 3.5 && glass.getLongerDimension() <= 3000) {
            return 5;
        } else if (glass.getArea() <= 4.5 && glass.getLongerDimension() <= 3000) {
            return 6;
        } else if (glass.getArea() <= 6 && glass.getLongerDimension() <= 3000) {
            return 8;
        } else {
            return -1;
        }
    }

    private int defineThicknessFor6() {
        if (glass.getArea() <= 2 && glass.getLongerDimension() <= 2000 && glass.getDimensionsRatio() > 1.0/6) {
            return 4;
        } else if (glass.getArea() <= 2.5 && glass.getLongerDimension() <= 2500) {
            return 5;
        } else if (glass.getArea() <= 3 && glass.getLongerDimension() <= 3000) {
            return 6;
        } else if (glass.getArea() <= 4 && glass.getLongerDimension() <= 3000) {
            return 8;
        } else {
            return -1;
        }
    }
}
