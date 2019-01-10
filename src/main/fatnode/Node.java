package main.fatnode;

public class Node<T> extends VersionedNode {
    private T value;

    public Node(T value, int version) {
        super(version);
        this.value = value;
    }

    public Node(T value, int version, AbstractNode previous, AbstractNode next) {
        super(version, previous, next);
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
