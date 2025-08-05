package arrayOfObjectJava;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {

        TestCar testCar = new TestCar();
        Car[] cars = testCar.setCarData();
        testCar.getCarsDetail(cars);
    }

    Car[] setCarData(){

        Car[] cars = new Car[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("------------enter car details for "+ cars.length+" cars--------------");

        for (int i=0; i<cars.length; i++){
            cars[i] = new Car();
            System.out.println("enter car id for car "+i);
            cars[i].setId(sc.nextInt());
            sc.nextLine();

            System.out.println("enter car name for car "+i);
            cars[i].setName(sc.nextLine());


            System.out.println("enter car price for car "+i);
            cars[i].setPrice(sc.nextDouble());
            sc.nextLine();



        }
        return cars;
    }

    void getCarsDetail(Car[] cars){
        for(Car car: cars){
            System.out.println("Id: "+car.getId());
            System.out.println("Name: "+car.getName());
            System.out.println("Price: "+car.getPrice());
            System.out.println("-----------------------------\n");
        }
    }
}
