package ru.itsjava.mytests;

import java.util.*;

public class Main {
//    public static void main(String[] args) {
//        List<Integer> elements = new ArrayList<>();
//        elements.add(10);
//        int firstElmnt = elements.get(1);
//        System.out.println(firstElmnt);

    // Result - Ошибка IndexOutOfBoundsException в рантайме
//    }

//    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        int i = 0;
//        do {
//            numbers.add(i++);
//        } while (numbers.size() != 0);
//        System.out.println(numbers.get(0));
//
//        // Result - Ошибка OutOfMemoryException в рантайме
//    }

//    public static void main(String[] args) {
//        int[] numbers = {11, 22, 33, 44, 100, 11, 4, 5, 10, 11, 3, 7};
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(getUnique(numbers));
//    }
//
//    public static int getUnique(int[] numbers) {
//        List<Integer> myList = new ArrayList<>();
//
//        for (int x : numbers) {
//            if (!myList.contains(x))
//                myList.add(x);
//        }
//        System.out.println(myList);
//        return myList.size();
//    }

//    public static void main(String[] args) {
//        Map<A, Integer> aMap = new HashMap<>();
//        aMap.put(new A(), 1);
//        aMap.put(new A(), 2);
//
//        System.out.println(aMap.get(new A()));
//    }

//    public int i;
//    public static void main(String[] args) {
//        Main sc = new Main();
//        System.out.println(sc.i);
//    }

//    public static void main(String[] args) {
//        int x = 125_121_148;
//        System.out.println(++x);
//        System.out.println(x++);
////        System.out.println(int x);
//        System.out.println(x=125121148);
//    }

//    public static void main(String[] args) {
//        int arr1[] = {1, 2, 3, 4, 5};
//        int arr2[] = {1, 2, 3, 4, 5};
//        if (arr1 == arr2){
//            System.out.println("Equal");
//        }else {
//            System.out.println("Not equal");
//        }
//    }

    public static void main(String[] args) {
        Sth sth = new Sth();
        sth.setNum(13);
        int num = sth.getSth().getNum();
        System.out.println(++num);
    }

}
