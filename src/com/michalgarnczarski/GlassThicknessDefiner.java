package com.michalgarnczarski;

public class GlassThicknessDefiner {
    private Glass glass;

    public GlassThicknessDefiner(Glass glass) {
        this.glass = glass;
    }

    public int defineThickness() {
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
}
