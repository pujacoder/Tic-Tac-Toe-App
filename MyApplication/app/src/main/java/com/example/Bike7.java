package com.example;

public class Bike7{
        int speed;

        Bike7(){System.out.println("speed is "+speed);}

        {
            System.out.println("in initializer block");
            speed=100;}

        public static void main(String args[]){
            Bike7 b1=new Bike7();
            Bike7 b2=new Bike7();
        }
    }
