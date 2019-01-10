package main.fatnode;

public class BottomNode extends AbstractNode {
    public BottomNode() { super(); }

    public  BottomNode(AbstractNode next) {
        super(null, next);
    }

}
