package org.example;

import org.example.javaDojoPart2.Bicycle;
import org.example.javaDojoPart2.Car;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main.javaDojoPart2();
    }

    public static void javaDojoPart1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("何人分の情報を入力しますか：");
        int count = scanner.nextInt();

        int maxAge = 0;
        int sumAge = 0;

        for (int i = 0; i < count; i++) {
            System.out.printf("%s人目%n", i + 1);
            System.out.print("名前：");
            String firstName = scanner.next();
            System.out.print("名字：");
            String lastName = scanner.next();
            System.out.print("年齢：");
            int age = scanner.nextInt();
            if (age > maxAge) {
                maxAge = age;
            }
            sumAge += age;
            System.out.print("身長(m)：");
            float height = scanner.nextFloat();
            System.out.print("体重(kg)：");
            float weight = scanner.nextFloat();

            System.out.printf("名前は%s %sです%n", firstName, lastName);
            System.out.printf("年齢は%s歳です%n", age);
            if (age >= 20) {
                System.out.println("成年者です");
            } else {
                System.out.println("未成年者です");
            }
            System.out.printf("身長は%smです%n", height);
            System.out.printf("体重は%skgです%n", weight);
            double bmi = weight / (Math.pow(height, 2));
            System.out.printf("BMIは%sです%n", Math.round(bmi));
            if (bmi >= 18.5 && bmi < 25.0) {
                System.out.println("健康です");
            } else {
                System.out.println("健康ではありません");
            }
        }

        System.out.println("最高年齢は" + maxAge + "歳です");
        System.out.println("平均年齢は" + sumAge / count + "歳です");
    }

    public static void javaDojoPart2() {
        Bicycle bicycle = new Bicycle("ビアンキ", "緑");
        System.out.println("【自転車の情報】");
        bicycle.printData();
        System.out.println("-----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("走る距離を入力してください：");
        int distance1 = scanner.nextInt();
        bicycle.run(distance1);
        System.out.println("=================");

        Car car = new Car("フェラーリ", "赤");
        System.out.println("【車の情報】");
        car.printData();
        System.out.println("-----------------");
        System.out.print("走る距離を入力してください：");
        int distance2 = scanner.nextInt();
        car.run(distance2);
        System.out.println("-----------------");
        System.out.print("給油する量を入力してください：");
        int chargeAmount = scanner.nextInt();
        car.charge(chargeAmount);
    }
}
