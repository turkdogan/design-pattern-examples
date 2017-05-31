/**
   Author: Turkdogan Tasdelen
   Email: ttasdelen@gmail.com
*/

import java.util.List;
import java.util.ArrayList;

public class CompositeExample {

    public static void main(String []args) {
        Node tree = new Node("Root");
        Node child1 = new Node("Child1");
        child1.add(new LeafNode("Leaf1"));
        child1.add(new LeafNode("Leaf2"));
        tree.add(child1);

        Node child2 = new Node("Child2");
        child2.add(new LeafNode("Leaf3"));
        child2.add(new LeafNode("Leaf4"));
        tree.add(child2);

        tree.print();
    }
}

class Node {

    private String name;

    protected List<Node> children = new ArrayList<Node>();

    public Node(final String name) {
        this.name = name;
    }

    public void add(final Node tree) {
        children.add(tree);
    }

    void print() {
        System.out.println(name);
        for (Node child : children) {
            child.print();
        }
    }
}

class LeafNode extends Node {

    // other business roles

    public LeafNode(final String name) {
        super(name);
    }
}
