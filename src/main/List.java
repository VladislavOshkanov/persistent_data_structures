package main;

import main.fatnode.*;

import java.util.LinkedList;
import java.util.ListIterator;

public class List<T> {
    LinkedList<FatNode<T>> list;
    FatNode<Integer> startIndex;
    FatNode<Integer> length;
    public List () {
        list = new LinkedList<>();
        startIndex = new FatNode<>();
        length = new FatNode<>();
        startIndex.add(0, 1);
        length.add(0, 1);
    }
    public void add (T value){
        if (list.size() > length.getValue() + startIndex.getValue()){
            list.get(length.getValue() + 1).add(value, list.get(length.getValue() + 1).getLastVersion());
            length.add(length.getValue()+ 1, length.getLastVersion() + 1);
        } else {
            FatNode<T> node = new FatNode<>();
            node.add(value, 1);
            list.add(node);
            length.add(length.getValue()+ 1, length.getLastVersion() + 1);
        }
    }

    public void add (int i, T value){
        int index = 0;
        if (list.size() == 0) {
            add(value);
        } else {
            if (list.get(0).lastNode() instanceof Node) index++;
                ListIterator<FatNode<T>> li = list.listIterator(0);

            while (li.hasNext() && index < i) {
                if (li.next().lastNode() instanceof Node) index++;
            }
            if (index < list.size()){
                FatNode<T> node = new FatNode<>();
                node.add(value, 1);
                li.add(node);
            } else {
                add(value);
            }

        }
        length.add(length.getValue()+ 1, length.getLastVersion() + 1);
    }

    public void remove (int i) {
        int index = 0;
        if (i == 0 && list.getFirst().lastNode() instanceof Node) {
            list.getFirst().remove(list.getFirst().getLastVersion() + 1);
            startIndex.add(startIndex.getValue() + 1, startIndex.getLastVersion() + 1);
        }
        ListIterator<FatNode<T>> li = list.listIterator(i);
        while (li.hasNext() && index < i){
            if (li.next().lastNode() instanceof Node) index++;
        }
        list.get(index).remove(list.get(index).getLastVersion() + 1);
        if (i == 1){
            startIndex.add(startIndex.getValue() + 1, startIndex.getLastVersion() + 1);
        }
        length.add(length.getValue() - 1, length.getLastVersion() + 1);
    }
    public T get(int i) {
        int index = 0;
        ListIterator<FatNode<T>> li = list.listIterator(startIndex.getValue());
        if (i == 0 && list.getFirst().lastNode() instanceof Node) return list.getFirst().getValue();
        while (li.hasNext() && index < i - 1){
            if (li.next().lastNode() instanceof Node) index++;
        }
        if (list.get(index + 1).getValue() instanceof  EmptyNode)
            return null;
        else
            return list.get(index + 1).getValue();
    }

}
