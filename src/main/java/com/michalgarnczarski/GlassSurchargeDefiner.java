package com.michalgarnczarski;

public class GlassSurchargeDefiner {
    private Glass glass;
    private int surcharge;

    public GlassSurchargeDefiner(Glass glass) {
        this.glass = glass;
        this.surcharge = defineSurcharge();
    }

    public int getSurcharge() {
        return surcharge;
    }

    private int defineSurcharge() {
        if (glass.getLongerDimension() <= 3000 && glass.getShorterDimension() <= 2400) {
            return 0;
        } else if ((glass.getLongerDimension() > 2400 && glass.getLongerDimension() <= 3000
                && glass.getShorterDimension() > 2400 && glass.getShorterDimension() <= 2700)
                || (glass.getLongerDimension() > 3000 && glass.getLongerDimension() <= 4000
                && glass.getShorterDimension() < 2000)) {
            return 50;
        } else if ((glass.getLongerDimension() > 3000 && glass.getLongerDimension() <= 4000
                && glass.getShorterDimension() > 2000 && glass.getShorterDimension() <= 2400)
                || (glass.getLongerDimension() > 4000 && glass.getLongerDimension() <= 5000
                && glass.getShorterDimension() < 2000)) {
            return 75;
        } else if ((glass.getLongerDimension() > 3000 && glass.getLongerDimension() <= 4000
                && glass.getShorterDimension() > 2400 && glass.getShorterDimension() <= 2700)
                || (glass.getLongerDimension() > 4000 && glass.getLongerDimension() <= 5000
                && glass.getShorterDimension() > 2000 && glass.getShorterDimension() <= 2400)
                || (glass.getLongerDimension() > 5000 && glass.getLongerDimension() <= 6000
                && glass.getShorterDimension() < 2000)) {
            return 100;
        } else if ((glass.getLongerDimension() > 4000 && glass.getLongerDimension() <= 5000
                && glass.getShorterDimension() > 2400 && glass.getShorterDimension() <= 2700)
                || (glass.getLongerDimension() > 5000 && glass.getLongerDimension() <= 6000
                && glass.getShorterDimension() > 2000 && glass.getShorterDimension() <= 2400)) {
            return 125;
        } else if (glass.getLongerDimension() > 5000 && glass.getLongerDimension() <= 6000
                && glass.getShorterDimension() > 2400 && glass.getShorterDimension() <= 2700) {
            return 150;
        } else {
            return -1;
        }
    }
}
