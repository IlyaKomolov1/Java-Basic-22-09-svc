package ProjectWork;

import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    private final UserOutput userOutput = new ConsoleUserOutput();

    @Override
    public Money read(Validator[] validators) {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        String cur = "";
        while (scanner.hasNext()) {
            //считывает с консоли ввод пользователя
            String input = scanner.nextLine();
            //делит строку по пробелу
            //проходит по validators если условие выполнено переходит в другой цикл, если нет, то возвращается в цикл for
            String[] strings = input.split(" "); // ["10", "Rub"]
            boolean validationResult = true;
            for (Validator validator : validators) {
                if (!validator.validate(strings)) {
                    validationResult = false;
                    break;
                }
            }
            //выход из цикла если условие выполнено
            if (!validationResult) {
                continue;
            }
            //переводит строку в число и вызывает нулевой элемент массива
            //проходит по validators если условие выполнено переходит в другой цикл, если нет, то возвращается в цикл for
            amount = Integer.parseInt(strings[0]);
            for (Validator validator : validators) {
                if (!validator.validate(amount)) {
                    validationResult = false;
                    userOutput.print(validator.messing());
                    break;
                }
            }
            //выход из цикла если условие выполнено
            if (!validationResult) {
                continue;
            }
            //вызывает первый элемент массива
            //проходит по validators если условие выполнено переходит в другой цикл, если нет, то возвращается в цикл for
            cur = strings[1];
            for (Validator validator : validators) {
                if (!validator.validate(cur)) {
                    validationResult = false;
                    userOutput.print(validator.messing());
                    break;
                }
            }
            //выход из цикла если условие выполнено
            if (!validationResult) {
                continue;
            }
            //когда все условия выполнены возвращает значение amount и cur
            return new Money(amount, cur);
        }
        return null;

    }
}

