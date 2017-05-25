/**
   Author: Turkdogan Tasdelen
   Email: ttasdelen@gmail.com
*/
public class FactoryExample {
    public static void main(String[] args) {
        LaptopFactory factory = new LaptopFactory();
        Laptop laptop = factory.getLaptop(Boolean.TRUE, Boolean.TRUE);
        System.out.println("Laptop for hipster and rich guy: " +
                           "$" + laptop.getAmount() + ", model: " + laptop.getModel());
        laptop = factory.getLaptop(Boolean.FALSE, Boolean.FALSE);
        System.out.println("Laptop for non-hipster and poor guy ($): " +
                           "$" + laptop.getAmount() + ", model: " + laptop.getModel());
    }
}

class LaptopFactory {

    public Laptop getLaptop(final String model) {
        switch(model) {
        case "MacbookPro":
            return new MacbookPro();
        case "MacbookAir":
            return new MacbookAir();
        case "SurfaceBook":
            return new SurfaceBook();
        case "Blah":
            return new BlahLaptop();
        default:
            throw new IllegalArgumentException();
        }
    }

    public Laptop getLaptop(boolean hipster, boolean rich) {
        if (hipster) {
            if (rich) {
                return getLaptop("MacbookPro");
            }
            return getLaptop("MacbookAir");
        } else {
            if (rich) {
                return getLaptop("SurfaceBook");
            }
            return getLaptop("Blah");
        }
    }
}

interface Laptop {
    public double getAmount();

    public String getModel();
}

class MacbookPro implements Laptop {

    public double getAmount() {
        return 2000.0;
    }

    public String getModel() {
        return "Macbook Pro";
    }
}

class MacbookAir implements Laptop {

    public double getAmount() {
        return 1000.0;
    }

    public String getModel() {
        return "Macbook Air";
    }
}

class SurfaceBook implements Laptop {

    public double getAmount() {
        return 1900.0;
    }

    public String getModel() {
        return "Surface Book";
    }
}

class BlahLaptop implements Laptop {

    public double getAmount() {
        return 500.0;
    }

    public String getModel() {
        return "Blah";
    }
}
