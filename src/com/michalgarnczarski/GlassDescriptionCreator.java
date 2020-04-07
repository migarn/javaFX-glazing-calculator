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

    public String defineThicknessDescription() {
        int floatGlassThickness = 0;
        String vsgGlassThickness = "";

        switch (thicknessDefiner.defineThickness()) {
            case 3:
                floatGlassThickness = 3;
                vsgGlassThickness = "33.1";
                break;
            case 4:
                floatGlassThickness = 4;
                vsgGlassThickness = "33.1";
                break;
            case 5:
                floatGlassThickness = 5;
                vsgGlassThickness = "44.1";
                break;
            case 6:
                floatGlassThickness = 6;
                vsgGlassThickness = "55.1";
                break;
            case 8:
                floatGlassThickness = 8;
                vsgGlassThickness = "66.1";
                break;
            case 10:
                floatGlassThickness = 10;
                vsgGlassThickness = "88.1";
                break;
            case 12:
                floatGlassThickness = 12;
                vsgGlassThickness = "10.10.1";
                break;
            case -1:
                return "Dla zadanych parametrów grubości szyb i wielkość dopłaty za nadgabaryt należy konsultować" +
                        " z dostawcą szkła!";
        }

        String thicknessDescription = "Dla zadanych parametrów minimalne grubości to:\n\t- " +
                floatGlassThickness + " mm - dla pojedynczej szyby,\n\t- " +
                vsgGlassThickness + " - dla szyby VSG.";

        return thicknessDescription;
    }
}
