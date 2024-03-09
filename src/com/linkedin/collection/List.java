package com.linkedin.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {

        //hashMap();
        hashSet();

    }

    public static void list() {
        java.util.List<String> maList = new ArrayList<>();
        maList.add("bonjour");
        maList.add("test");

        for (String element : maList) {
            System.out.println(element);
        }
    }

    public static void hashMap() {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "map1");
        map.put(2, "map2");
        map.put(3, "map3");
        map.put(1, "map4");

        for (int key : map.keySet()) {
            System.out.println("Clé : " + key + ", Valeur : " + map.get(key));
        }
    }

    public static void linkedList() {
        // Création d'une LinkedList de chaînes de caractères
        LinkedList<String> liste = new LinkedList<>();

        // Ajout d'éléments à la LinkedList
        liste.add("Hello");
        liste.add("world");
        liste.add("!");
        liste.add("Hello");

        // Parcours et affichage des éléments de la LinkedList
        for (String element : liste) {
            System.out.println(element);
        }
    }

    public static void hashSet() {
        HashSet<String> set = new HashSet<>();

        set.add("map1");
        set.add("map2");
        set.add("map3");
        set.add("map2");
        set.add("map4");

        /*for (String value:  set) {
            System.out.println(set);
        }*/
        System.out.println(set);
    }

}
