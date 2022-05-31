package Exam_28_29March2020;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cake = 20 * rent / 100;
        double drinks = cake - 45 * cake / 100;
        double animator = rent / 3;

        System.out.println(rent + cake + drinks + animator);
    }
}
