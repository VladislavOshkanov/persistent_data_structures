package main;

import main.fatnode.EmptyNode;
import main.fatnode.FatNode;

import java.util.HashMap;

public class Map<Key, Value> {
    private java.util.Map<Key, FatNode<Value>> map;
    public Map(){
        map = new HashMap<Key, FatNode<Value>>();
    }


    public void set(Key key, Value value){
        if (map.get(key) == null){
            FatNode<Value> node = new FatNode<>();
            node.add(value, 1);
            map.put(key, node);
        } else {
            map.get(key).add(value, map.get(key).getLastVersion());
        }
    }
    public void remove(Key key){
        map.get(key).remove(map.get(key).getLastVersion());
    }

    public Value get(Key key){
        if (map.get(key).lastNode() instanceof EmptyNode){
            return null;
        } else {
            return map.get(key).getValue();
        }
    }


}
