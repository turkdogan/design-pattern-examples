/**
   Author: Turkdogan Tasdelen
   Email: ttasdelen@gmail.com
*/
public class ProxyExample {

    public static void main(String[] args) {
        Buyer buyer = new BuyerAndShipper();
        buyer.purchase("Product");
    }
}

interface Buyer {
    public void purchase(String product);
}

class DefaultBuyer implements Buyer {

    public void purchase(final String product) {
        System.out.println("Buy product with default impl: " + product);
    }
}

class BuyerAndShipper implements Buyer {

    public void prepareCargo(final String product) {
        System.out.println("Prepare cargo for: " + product);
    }

    public void purchase(final String product) {
        new DefaultBuyer().purchase(product);
        prepareCargo(product);
        shipCargo(product);
    }

    public void shipCargo(final String product) {
        System.out.println("Ship product: " + product);
    }
}
