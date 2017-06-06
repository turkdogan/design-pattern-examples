/**
   Author: Turkdogan Tasdelen
   Email: ttasdelen@gmail.com
*/

import java.util.List;
import java.util.ArrayList;

public class PrototypeExample {

    public static void main(String[] args) throws Exception {
        Apple apple = new Apple();
        apple.setWeight(100.0f);
        List<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 10; i++) {
            Apple clone = (Apple)apple.clone();
            clone.setWeight((i + 1) * 50.0f);
            apples.add(clone);
        }
        System.out.println("I have " + apples.size() + " apple clone from 1 apple");
    }
}

class Apple implements Cloneable {

    private float weight;

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
