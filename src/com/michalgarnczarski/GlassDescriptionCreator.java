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

    public GlassThicknessDefiner getThicknessDefiner() {
        return thicknessDefiner;
    }

    public GlassSurchargeDefiner getSurchargeDefiner() {
        return surchargeDefiner;
    }

    public String defineGeneralDescription() {
        return "Założone parametry szyby:" +
                "\n\t- wymiary: " + glass.getGlassWidth() + " mm x " + glass.getGlassHeight() + " mm," +
                "\n\t- powierzchnia szyby: " + glass.getArea() + " m2," +
                "\n\t- szerokość ramki dystansowej: " + glass.getSpacerThickness() + " mm.";
    }

    public String defineThicknessDescription() {
        int floatGlassThickness = 0;
        String vsgGlassThickness = "";

        switch (thicknessDefiner.getThickness()) {
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

    public String defineSurchargeDescription() {
        if (surchargeDefiner.getSurcharge() == 0) {
            return "\nDla zadanych parametrów nie ma dopłaty za nadgabaryt.";
        } else if (surchargeDefiner.getSurcharge() > 0) {
            return "\nDla zadanych parametrów dopłata za nadgabaryt wynosi " + surchargeDefiner.getSurcharge() + "%!";
        } else {
            return "\nDla zadanych parametrów wielkość dopłaty za nadgabaryt należy konsultować z dostawcą szkła!";
        }
    }

    public String defineRatioDescription() {
        if (glass.getDimensionsRatio() < 0.1) {
            return "\nDla zadanych parametrów stosunek długości boków jest mniejszy niż 1:10!";
        }
        return "";
    }

    public String defineLatterDescription() {
        return "\nPowyższe obliczenia mają zastosowanie przy następujących założeniach:" +
                "\n\t- szklenie jest pionowe," +
                "\n\t- wysokość szklenia to 0-8 m ponad powierzchnię gruntu," +
                "\n\t- szyba jest klinowana na czterech bokach," +
                "\n\t- nie dotyczy szklenia narożników budynków," +
                "\n\t- przyjęto średnie obciążenie wiatrem w Polsce.";
    }
}
