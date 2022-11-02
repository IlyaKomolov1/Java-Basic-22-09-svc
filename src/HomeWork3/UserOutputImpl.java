package HomeWork3;

import java.util.Scanner;

public class UserOutputImpl implements UserOutput {
    public int answer (String[] answerOptions,int correctAnswers) {
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                if (b <= answerOptions.length) {
                    break;
                } else {
                    System.out.println("такого числа нет");
                }
            } else {
                System.out.println("Введено не число");
                scanner.next();
            }
        }
        return correctAnswers;
    }
}