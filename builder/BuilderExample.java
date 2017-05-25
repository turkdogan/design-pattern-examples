/**
   Author: Turkdogan Tasdelen
   Email: ttasdelen@gmail.com
*/

public class BuilderExample {

    public static void main(String []args) {
        LentilSoupBuilder builder = new LentilSoupBuilder(100.0);
        LentilSoap soap = builder.withWater(120).
            withOnion(1.2).
            withMint(0.4).
            withSalt(0.2).
            withPepper(0.5).
            build();

        System.out.println("Delicious lentil soap ingredients (amount): " + soap);
    }
}

class LentilSoupBuilder {

    private double lentil;
    private double water;
    private double onion;
    private double mint;
    private double salt;
    private double pepper;

    public LentilSoupBuilder(final double lentil) {
        this.lentil = lentil;
    }

    public LentilSoupBuilder withWater(final double water) {
        this.water = water;
        return this;
    }

    public LentilSoupBuilder withOnion(final double onion) {
        this.onion = onion;
        return this;
    }


    public LentilSoupBuilder withMint(final double mint) {
        this.mint = mint;
        return this;
    }

    public LentilSoupBuilder withSalt(final double salt) {
        this.salt = salt;
        return this;
    }

    public LentilSoupBuilder withPepper(final double pepper) {
        this.pepper = pepper;
        return this;
    }


    public LentilSoap build() {
        LentilSoap lentilSoap = new LentilSoap();
        lentilSoap.setLentil(lentil);
        lentilSoap.setWater(water);
        lentilSoap.setOnion(onion);
        lentilSoap.setMint(mint);
        lentilSoap.setSalt(salt);
        lentilSoap.setPepper(pepper);
        return lentilSoap;
    }

}

class LentilSoap {

    private double lentil;
    private double water;
    private double onion;
    private double mint;
    private double salt;
    private double pepper;

    public void setLentil(final double lentil) {
        this.lentil = lentil;
    }

    public void setWater(final double water) {
        this.water = water;
    }

    public void setOnion(final double onion) {
        this.onion = onion;
    }

    public void setMint(final double mint) {
        this.mint = mint;
    }

    public void setSalt(final double salt) {
        this.salt = salt;
    }

    public void setPepper(final double pepper) {
        this.pepper = pepper;
    }

    @Override
    public String toString() {
        return "Lentil: " + lentil + ", " +
            "water: " + water + ", " +
            "onion: " + onion + ", " +
            "mint: " + mint + ", " +
            "salt: " + salt + ", " +
            "pepper: " + pepper;
    }
}
