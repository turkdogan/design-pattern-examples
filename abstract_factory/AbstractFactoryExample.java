
public class AbstractFactoryExample {

    public static void main(String[] args) {
        producePlatformComputers("Apple");
        producePlatformComputers("Microsoft");
    }

    private static void producePlatformComputers(final String platform) {
        ComputerFactory factory = null;
        if (platform.equals("Apple")) {
            factory = new AppleFactory();
        } else {
            factory = new MicrosoftFactory();
        }
        Laptop laptop = factory.produceLaptop();
        System.out.println(platform + " laptop: " + laptop.getName());
        Desktop desktop = factory.produceDesktop();
        System.out.println(platform + " desktop: " + desktop.getName());
        Tablet tablet = factory.produceTablet();
        System.out.println(platform + " tablet: " + tablet.getName());
    }
}

interface Laptop {
    String getName();
}

interface Desktop {
    String getName();
}

interface Tablet {
    String getName();
}

class Macbook implements Laptop {

    public String getName() {
        return "Macbook";
    }
}

class IMac implements Desktop {

    public String getName() {
        return "iMac";
    }
}

class IPad implements Tablet {

    public String getName() {
        return "iPad";
    }
}

class SurfaceBook implements Laptop {

    public String getName() {
        return "Surface Book";
    }
}

class SurfaceStudio implements Desktop {

    public String getName() {
        return "Surface Studio";
    }
}

class Surface implements Tablet {

    public String getName() {
        return "Surface";
    }
}

/*
  Computer Factory is the abstract factory here
*/
interface ComputerFactory {

    Laptop produceLaptop();

    Desktop produceDesktop();

    Tablet produceTablet();
}

class AppleFactory implements ComputerFactory {

    @Override
    public Laptop produceLaptop() {
        return new Macbook();
    }

    @Override
    public Desktop produceDesktop() {
        return new IMac();
    }

    @Override
    public Tablet produceTablet() {
        return new IPad();
    }
}

class MicrosoftFactory implements ComputerFactory {

    @Override
    public Laptop produceLaptop() {
        return new SurfaceBook();
    }

    @Override
    public Desktop produceDesktop() {
        return new SurfaceStudio();
    }

    @Override
    public Tablet produceTablet() {
        return new Surface();
    }
}
