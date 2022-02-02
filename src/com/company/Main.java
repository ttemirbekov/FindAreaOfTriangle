
package com.company;

import java.awt.geom.Area;

public class Main {

    public static void main(String[] args){
        int a, b, c;

        Area uchburchtuk = new Area();

        a = 15;
        b = 18;
        c = 11;
         double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of triangle is: " + area);

    }




}
