import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Mens mens = new Mens();//тут створились чоговіки

        Scanner question = new Scanner(System.in);

        String num = " ";

        do {// цикл

            System.out.println("1 - змінити розмір ноги?");
            System.out.println("2 - подивитись всіх");
            System.out.println("3 - вийти");


            num = question.next();


            if (num.equals("1")) {
                System.out.println("кого ви хочете поміняти? номер від 1 до 4");
                int menNo = question.nextInt();


                if (menNo == 1) {
                    System.out.print("введіть розмір першого: ");
                    String foot = question.next();
                    mens.setFootMen1(foot);
                } else if (menNo == 2) {
                    System.out.print("введіть розмір другого: ");
                    String foot = question.next();
                    mens.setFootMen2(foot);
                } else if (menNo == 3) {
                    System.out.print("введіть розмір третьго: ");
                    String foot = question.next();
                    mens.setFootMen3(foot);
                } else if (menNo == 4) {
                    System.out.print("введіть розмір четвертого: ");
                    String foot = question.next();
                    mens.setFootMen4(foot);
                }

            } else if (num.equals("2")) {
                Helpers.displayMen(mens.getMen1());// отримуємо чоговіка і виврдимо його дані на екран за допомогою хелпера
                Helpers.displayMen(mens.getMen2());
                Helpers.displayMen(mens.getMen3());
                Helpers.displayMen(mens.getMen4());
            }


            if (num.equals("1") | num.equals("2") | num.equals("3")) {
                //якщо попав один з цих варіантів то ми нічого не робимо
            } else {
                // якщо не мо виводимо помилку
                System.err.println("ви вели неправилене число");
            }


        } while (!num.equals("3"));// цикл працює поки в умові "true"
    }
}