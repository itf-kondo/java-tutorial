package org.example.javaDojoPart2;

public class Car {
    private String name;
    private String color;
    private int distance = 0;
    private int fuel = 100;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void printData() {
        System.out.println("名前：" + this.name);
        System.out.println("色：" + this.color);
        System.out.println("走行距離：" + this.distance + "km");
        System.out.println("ガソリン量：" + this.fuel + "L");
    }

    public void run(int distance) {
        System.out.printf("%skm走ります%n", distance);
        if (distance <= this.fuel) {
            this.distance += distance;
            this.fuel -= distance;
            System.out.printf("走行距離：%skm%n", this.distance);
        } else {
            System.out.println("ガソリンが足りません");
            System.out.printf("走行距離：%skm%n", 0);
        }
        System.out.printf("ガソリン量：%sL%n", this.fuel);
    }

    public void charge(int amount) {
        System.out.printf("%sL給油します%n", amount);
        if (amount <= 0) {
            System.out.println("給油できません");
        } else if (amount + this.fuel > 100) {
            System.out.println("満タンまで給油します");
            this.fuel = 100;
        } else {
            this.fuel += amount;
        }
        System.out.printf("ガソリン量：%sL%n", this.fuel);
    }
}
