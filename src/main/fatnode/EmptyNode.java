package main.fatnode;

public class EmptyNode extends VersionedNode {
    public EmptyNode(int version) {
        super(version);
    }

    public EmptyNode(int version, AbstractNode previous, AbstractNode next) {
        super(version, previous, next);
    }
}
