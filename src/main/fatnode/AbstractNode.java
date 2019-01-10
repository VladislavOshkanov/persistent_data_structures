package main.fatnode;

public class AbstractNode {
    private AbstractNode next;
    private AbstractNode previous;

    public AbstractNode() {

    }

    public AbstractNode(AbstractNode previous, AbstractNode next) {
        this.next = next;
        this.previous = previous;
    }


    public AbstractNode getNext() {
        return next;
    }

    public void setNext(AbstractNode next) {
        this.next = next;
    }

    public AbstractNode getPrevious() {
        return previous;
    }

    public void setPrevious(AbstractNode previous) {
        this.previous = previous;
    }

    public <T> T getValue() {
        return null;
    }
    public int getVersion(){
        return -1;
    }
}
