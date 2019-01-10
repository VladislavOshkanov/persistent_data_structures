package main.fatnode;

public class VersionedNode extends AbstractNode {
    private final int version;
    VersionedNode(int version){
        super();
        this.version = version;
    }
    VersionedNode(int version, AbstractNode previous, AbstractNode next){
        super(previous, next);
        this.version = version;
    }
    public int getVersion(){
        return this.version;
    }
}
