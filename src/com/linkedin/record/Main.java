package com.linkedin.record;

public class Main {
    public static void main(String[] args) {


        Record record = new Record(2,3);
        System.out.println(record);
        System.out.println(record.x() + " " + record.y());
    }
}
