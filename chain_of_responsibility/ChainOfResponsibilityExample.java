/**
   Author: Turkdogan Tasdelen
   Email: ttasdelen@gmail.com
*/
import java.util.Optional;

public class ChainOfResponsibilityExample {

    public static void main(String[] args) {
        Analysis commonAnalysis = new CommonAnalysis();
        Analysis fooAnalysis = new FooAnalysis();
        commonAnalysis.prepareNextAnalysis(fooAnalysis);
        Analysis xAnalysis = new XAnalysis();
        fooAnalysis.prepareNextAnalysis(xAnalysis);
        Analysis yAnalysis = new YAnalysis();
        xAnalysis.prepareNextAnalysis(yAnalysis);

        commonAnalysis.analyze();
    }
}

abstract class Analysis {

    protected Analysis next;

    void prepareNextAnalysis(final Analysis analysis) {
        this.next = analysis;
    }

    abstract void analyze();
}

class CommonAnalysis extends Analysis {

    public void analyze() {
        System.out.println("Common Analysis");
        if (next != null) {
            next.analyze();
        }
    }
}

class FooAnalysis extends Analysis {

    public void analyze() {
        System.out.println("Foo Analysis");
        if (next != null) {
            next.analyze();
        }
    }
}

class XAnalysis extends Analysis {

    public void analyze() {
        System.out.println("X Analysis");
        if (next != null) {
            next.analyze();
        }
    }
}

class YAnalysis extends Analysis {

    public void analyze() {
        System.out.println("Y Analysis");
        if (next != null) {
            next.analyze();
        }
    }
}
