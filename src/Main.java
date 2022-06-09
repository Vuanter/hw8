import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void printSeparator(int yearCurrent) {
        if ((yearCurrent % 4 == 0 && yearCurrent % 100 != 0) || (yearCurrent % 400 == 0)) {
            System.out.println("Год високосный");
        }else{
            System.out.println("Год не високосный");
        }
    }


    public static void printClient (int currentOs, int currentYear) {
        if (currentOs == 0 && currentYear < LocalDate.now().getYear()) {
            System.out.println("Установите lite-версию ios");
        }else if (currentOs == 0 && currentYear == LocalDate.now().getYear()){
            System.out.println("Установите версию ios");
        }else if (currentOs == 1 && currentYear < LocalDate.now().getYear()) {
            System.out.println("Установите Lite-веосию android");
        } else if (currentOs == 1 && currentYear == LocalDate.now().getYear()) {
            System.out.println("Установите версию android");
        }
    }

    public static void printDistance (int deliveryDistance, int days) {
        if (deliveryDistance <= 20)
            days = 1;
        if (deliveryDistance >= 20 && deliveryDistance <= 60)
            days = 2;
        if (deliveryDistance >= 60 && deliveryDistance <= 100)
            days = 3;
        System.out.println("Потребуется дней " + days);
    }

    public static void main(String[] args) {

// Задание 1.

//Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным, и выводит результат в консоль.
//*Эту проверку вы уже реализовывали взадании по условным операторам.*
//Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
//Результат программы выведите в консоль. Если год високосный, то должно быть выведено “*номер года —* високосный год”.
//Если год не високосный, то, соответственно: “*номер года —* не **високосный год”.

        int year = 2022;
        printSeparator(year);


// Задание 2.
//Вспомним задание 2 по условным операторам, где нам необходимо было предложить пользователю облегченную версию приложения.
//Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android) и год выпуска устройства.
//Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).

        int currentYear = LocalDate.now().getYear();
        int clientOs = 1;
        printClient(clientOs, currentYear);


// Задание 3
// Чтобы известить клиента о том, когда будет доставлена его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
// Правила доставки такие:
// Доставка в пределах 20 км занимает сутки.
// Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
// Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
// То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
// Напишите программу, которая выдает сообщение в консоль:
// "Потребуется дней: " + срок доставки
// Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
// Наша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.

        int deliveryDistance = 95;
        int days = 0;
        printDistance(deliveryDistance, days);
    }
}