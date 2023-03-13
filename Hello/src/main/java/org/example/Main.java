package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] kanalbi = new String[7];
        kanalbi[1] = "Первый канал";
        kanalbi[2] = "Второй канал";
        kanalbi[3] = "Третий канал";
        kanalbi[4] = "Четвертый канал";
        kanalbi[5] = "Пятый канал";
        kanalbi[6] = "Шестой канал";
        kanalbi[0] = "0";

        System.out.println("Введите номер канала");

        int canals;
        do {
            Scanner scanner = new Scanner(System.in);
            canals = scanner.nextInt();
            if (canals == 1) {
                System.out.println(kanalbi[1]);
            }
            if (canals == 2) {
                System.out.println(kanalbi[2]);
            }
            if (canals == 3) {
                System.out.println(kanalbi[3]);
            }
            if (canals == 4) {
                System.out.println(kanalbi[4]);
            }
            if (canals == 5) {
                System.out.println(kanalbi[5]);
            }
            if (canals == 6) {
                System.out.println(kanalbi[6]);
            }
        } while (canals >= 1 && canals <= 6);
    }
}