package com.Bridgelabz.Day13FindMaxUsingGenerics;

public class Generics <T extends Comparable<T>> {
    T a;
    T b;
    T c;

    Generics(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public T maximum() {

        if ((a.compareTo(b) > 0) && (a.compareTo(c) > 0)){
            return a;
        } else if ((b.compareTo(c) > 0) && (b.compareTo(a) > 0)) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------------");

        //UC1=Given 3 Integers find the maximum**************
        Generics campareInterger = new Generics(50,200,500);
        System.out.println("Maximum Number Out of Three Integer is:- " + campareInterger.maximum());

        System.out.println("---------------------------------------------------------------------");


        //UC2 = Given 3 Float find the maximum***********
        Generics campareFloat = new Generics(-22.2f,5.2f,12.2f);
        System.out.println("Maximum Number Out of Three Float is:- " + campareFloat.maximum());
        System.out.println("---------------------------------------------------------------------");



        //UC3 = Given 3 String find the maximum********************
        Generics compareString = new Generics("Ashwini", "Tushar", "Yash");
        System.out.println("Maximum among Three String is: " +compareString.maximum());

        System.out.println("---------------------------------------------------------------------");



    }



}
