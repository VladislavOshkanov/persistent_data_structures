package main;

import main.fatnode.EmptyNode;
import main.fatnode.FatNode;

import java.util.ArrayList;

public class Array<T> {

//    main.fatnode.FatNode<T>[] array;
    ArrayList<FatNode<T>> array = new ArrayList<>();
    public Array(){}

    public void set(int index, T value){
        if (this.array.size() < index + 1) {
            this.array.add(new FatNode<>());
            this.array.get(index).add(value, 1);
        } else {
            this.array.get(index).add(value, this.array.get(index).getLastVersion());
        }
    }


    public  T get(int index) {
        if (this.array.get(index).lastNode() instanceof EmptyNode){
            return null;
        } else {
            return this.array.get(index).getValue();
        }
    }

}
