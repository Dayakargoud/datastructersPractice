package com.dayakar.practice1.creatingInstances;

public class Example1 {
    public static void main(String[] args) {

        try{

//            Car c=new Car();
//            c.getDetails();

            Class myCar=Class.forName("Car");
           Car c=(Car) myCar.newInstance();

           c.getDetails();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class Car{

    void getDetails(){
        System.out.println("Model: Audio A590");
        System.out.println("Year: 2019");

    }
}
