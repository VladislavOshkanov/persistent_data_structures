package main.fatnode;

public class FatNode<T> {
    private AbstractNode node;

    public FatNode() {
        this.node = new BottomNode();
    }

    public T getValue(){
        T value = null;
        value = node.getValue();
        return value;
    }

    public int getVersion() {
       return node.getVersion();
    }

    public boolean hasVersion() {
        return getVersion() >= 0;
    }

    public int getNextVersion(){
        return this.node.getNext().getVersion();
    }

    public boolean hasNextVersion(){
        return getNextVersion() > 0;
    }

    public int getPreviousVersion(){
        return this.node.getPrevious().getVersion();
    }

    public boolean hasPreviousVersion(){
        return getPreviousVersion() > 0;
    }



    public int getLastVersion(){
        AbstractNode temp = this.node;

        while (temp.getNext() != null){
            temp = temp.getNext();
        }
        return temp.getVersion();
    }


    public void add(T value, int version) {
        node.setNext(new Node<T>(value, version, node, null));
        node = node.getNext();
    }

    public void modify(T value, int version) {
        add(value, version);
    }

    public void remove(int version) {
        node.setNext(new EmptyNode(version, node, null));
        node = node.getNext();
    }


    public AbstractNode lastNode() {
        AbstractNode lastNode = node;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        return lastNode;
    }

}
