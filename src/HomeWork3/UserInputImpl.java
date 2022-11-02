package HomeWork3;

public class UserInputImpl implements UserInput{
    public void ask(String question,String[] answerOptions){
        System.out.println(question);
        for (int j = 0; j < answerOptions.length; j++) {
            System.out.println(j+1 + "." + answerOptions[j]);
        }
        System.out.println("Введите число");
    }
}
