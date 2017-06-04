/**
   Author: Turkdogan Tasdelen
   Email: ttasdelen@gmail.com
*/
public class TemplateMethodExample {

    public static void main(String[] args) {
        String from = "Bus Stop1";
        String to = "Bus Stop2";
        String cargo = "Cargo";
        Transportation transportation = new BusTransportation(from, to);
        transportation.transport(cargo);

        String fromCity = "Ankara";
        String toCity = "Istanbul";
        transportation = new AirTransportation(fromCity, toCity);
        transportation.transport(cargo);

        String fromCountry = "Turkey";
        String toCountry = "USA";
        transportation = new ShipTransportation(fromCountry, toCountry);
        transportation.transport(cargo);
    }
}

abstract class Transportation {

    protected String from;
    protected String to;

    protected String cargo;

    public Transportation(final String from, final String to) {
        this.from = from;
        this.to = to;
    }

    public void transport(final String cargo) {
        this.cargo = cargo;

        prepareCargo();
        moveCargo();
        deliverCargo();
    }

    public abstract void prepareCargo();
    public abstract void moveCargo();
    public abstract void deliverCargo();
}

class BusTransportation extends Transportation {

    public BusTransportation(final String from, final String to) {
        super(from, to);
    }

    public void prepareCargo() {
        System.out.println("Load cargo to bus");
    }

    public void moveCargo() {
        System.out.println("Drive bus from: " + from + " to: " + to);
    }

    public void deliverCargo() {
        System.out.println("Deliver cargo in the bus");
    }
}

class AirTransportation extends Transportation {

    public AirTransportation(final String from, final String to) {
        super(from, to);
    }

    public void prepareCargo() {
        System.out.println("Load cargo to plane");
    }

    public void moveCargo() {
        System.out.println("Flight from: " + from + " to: " + to);
    }

    public void deliverCargo() {
        System.out.println("Deliver cargo in the plane");
    }
}


class ShipTransportation extends Transportation {

    public ShipTransportation(final String from, final String to) {
        super(from, to);
    }

    public void prepareCargo() {
        System.out.println("Load cargo to ship");
    }

    public void moveCargo() {
        System.out.println("(Ship) Move from: " + from + " to: " + to);
    }

    public void deliverCargo() {
        System.out.println("Deliver cargo in the ship");
    }
}

