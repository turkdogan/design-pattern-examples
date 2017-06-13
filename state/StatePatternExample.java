/**
   Author: Turkdogan Tasdelen
   Email: ttasdelen@gmail.com
*/
public class StatePatternExample {

    public static void main(String []args) {
        Sports running = new Running();
        running.setState(new WarmupState());
        running.action();
        running.setState(new PlayingState());
        running.action();
        running.action();
        running.setState(new CooldownState());
        running.action();
        running.setState(new RestingState());
        running.action();
        running.action();
    }
}

abstract class Sports {

    protected State state;

    public abstract void action();

    public void setState(final State state) {
        this.state = state;
    }
}

class Running extends Sports {

    @Override
    public void action() {
        state.perform(this);
    }
}

class Baseball extends Sports {

    public void action() {
        state.perform(this);
    }
}

interface State {
    void perform(Sports sports);
}

class WarmupState implements State {

    @Override
    public void perform(Sports sports) {
        System.out.println("Warming up...");
    }
}

class PlayingState implements State {

    @Override
    public void perform(Sports sports) {
        System.out.println("Playing...");
    }
}

class CooldownState implements State {

    @Override
    public void perform(Sports sports) {
        System.out.println("Cooling down...");
    }
}

class RestingState implements State {

    @Override
    public void perform(Sports sports) {
        System.out.println("Resting...");
    }
}
