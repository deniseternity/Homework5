public class Main {
    public static void task1() {
 System.out.println("Задача 1");

 int iOS = 1;

 if (iOS == 0) {
     System.out.println("Установите версию приложения для iOS по ссылке");
 } else if (iOS == 1) {
     System.out.println("Установите версию приложения для Android по ссылке");
 } else {
     System.out.println("Некорректные данные");
 }

    public static void task2() {
  System.out.println("Задача 2");

  int iOS = 1;
  int clientDeviceYear = 2022;

  if (iOS == 0 && clientDeviceYear >= 2015) {
    System.out.println(("Установите версию приложения для iOS по ссылке");
  } else if (iOS == 0 && clientDeviceYear < 2015) {
    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
  } else if (iOS == 1 && clientDeviceYear >= 2015) {
      System.out.println("Установите версию приложения для Android по ссылке");
  } else if (iOS == 1 && clientDeviceYear < 2015) {
      System.out.println("Установите облегченную версию приложения для Android по ссылке");
  } else {
      System.out.println("Некорректные данные");
  }

    public static void task3() {
    System.out.println("Задача 3");

    int year = 2020;

    if (year % 4 == 0 && year % 100 != 0 !! year % 400 == 0) {
     System.out.println("год является високосным");
      } else {
       System.out.println("год является не является високосным");
                }

     public static void task4() {
      System.out.println("Задача 4");

      int deliveryDistance = 20;
      int day = 1;

      if (deliveryDistance <= 20) {
       System.out.println("Потребуется дней" + day +);
      } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
       System.out.println("Потребуется дней" + day + 1);
      } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
       System.out.println("Потребуется дней" + day + 2);
      } else {
       System.out.println("Доставка не осущестл");
      }

      public static void task5() {
      System.out.println("Задача 5");

      int monthNumber = 4;

      if (monthNumber >12) {
          System.out.println("Некорректный месяц");
      }

      switch (monthNumber) {
          case 1:
          case 2:
          case 12:
              System.out.println("Зима");
              break;
          case 3:
          case 4:
          case 5:
              System.out.println("Весна");
              break;
          case 6:
          case 7:
          case 8:
              System.out.println("Лето");
              break;
          case 9:
          case 10:
          case 11:
              System.out.println("Осень");
              break;
          default:
              System.out.println("Некорректный месяц");
      }






