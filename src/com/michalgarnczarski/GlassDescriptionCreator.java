package com.michalgarnczarski;

public class GlassDescriptionCreator {
    private Glass glass;
    private GlassThicknessDefiner thicknessDefiner;
    private GlassSurchargeDefiner surchargeDefiner;

    public GlassDescriptionCreator(Glass glass) {
        this.glass = glass;
        this.thicknessDefiner = new GlassThicknessDefiner(glass);
        this.surchargeDefiner = new GlassSurchargeDefiner(glass);
    }
}
