/**
   Author: Turkdogan Tasdelen
   Email: ttasdelen@gmail.com
*/

public class StrategyExample {

    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setDevelopmentStrategy(new EditorStrategy());
        developer.develope("Project");

        developer.setDevelopmentStrategy(new IdeStrategy());
        developer.develope("Project");
    }
}

class Developer {

    private DevelopmentStrategy strategy;

    public void setDevelopmentStrategy(final DevelopmentStrategy strategy) {
        this.strategy = strategy;
    }

    public void develope(final String project) {
        System.out.println("Developing project: " + project + " with " +
                           strategy.getName() + " strategy");
    }
}

interface DevelopmentStrategy {
    String getName();
}

class EditorStrategy implements DevelopmentStrategy {
    public String getName() {
        return "Editor";
    }
}

class IdeStrategy implements DevelopmentStrategy {
    public String getName() {
        return "Ide";
    }
}
