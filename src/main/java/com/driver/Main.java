package com.driver;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args){
        Product p = new Product();

        int ans = p.product(50,50);
        int ans1 = p.product(5,5,5);
        double ans2 = p.product(15,5);

        System.out.println(ans + " " + ans1 + " " + ans2);


    }
    public static class Product{
        public int product(int x, int y){
            return x*y;
        }

        public int product(int x, int y, int z){
            return x*y*z;
        }

        public double product(double x, double y){
            return x*y;
        }

    }

}