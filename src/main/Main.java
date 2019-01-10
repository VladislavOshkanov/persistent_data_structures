package main;

public class Main {

    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();
        arr.set(0, 0);
        arr.set(0, 1);
        arr.set(0, 2);
        arr.set(1, 0);
        arr.set(1, 1);
        arr.set(1, 2);
        arr.set(0,1);
        int n = arr.get(1);
        System.out.println(n);


        Map<Integer, Integer> map = new Map<>();
        map.set(1,1);
        map.remove(1);
        System.out.println(map.get(1));


        List<Integer> list = new List<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0);
        System.out.println("Hello World!");
    }
}
