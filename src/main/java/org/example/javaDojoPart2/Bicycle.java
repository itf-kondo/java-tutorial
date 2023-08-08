package org.example.javaDojoPart2;

public class Bicycle {
    private String name;
    private String color;
    private int distance = 0;

    public Bicycle(String name, String color) {
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

    public void printData() {
        System.out.println("名前：" + this.name);
        System.out.println("色：" + this.color);
        System.out.println("走行距離：" + this.distance + "km");
    }

    public void run(int distance) {
        System.out.printf("%skm走ります%n", distance);
        this.distance += distance;
        System.out.printf("走行距離：%skm%n", this.distance);
    }
}
