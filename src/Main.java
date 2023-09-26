public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача №2");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача №3");
        int year = 2021;
        boolean leapYear = year > 1584 && year % 4 ==0 && year % 100 !=0;
        if (leapYear)
            System.out.println(year + " год является високосным");
        else System.out.println(year + " год не является високосным");

        System.out.println("Задача №4");
        int deliveryDistance = 95;
        if (deliveryDistance<=20) {
            System.out.println("Потребуется 1 день для доставки");
        } else if (deliveryDistance>20 && deliveryDistance<=60) {
            System.out.println("Потребуется 2 дня для доставки");
        } else if (deliveryDistance>60 && deliveryDistance<=100) {
            System.out.println("Потребуется 3 дня для доставки");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

        System.out.println("Задача №5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осени");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }




    }
    }










