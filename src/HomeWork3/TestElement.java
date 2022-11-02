package HomeWork3;

public class TestElement {
    private  String question;
    private String[]  answerOptions;
    private int correctAnswers;


    public TestElement(String question, String[] answerOptions, int correctAnswers) {
        this.question = question;
        this.answerOptions = answerOptions;
        this.correctAnswers = correctAnswers;
    }
    public boolean test(){
        UserInput userInput = new UserInputImpl();
        userInput.ask(question,answerOptions);

        UserOutput userOutput = new UserOutputImpl();
        int userAnswer = userOutput.answer(answerOptions,correctAnswers);
        return userAnswer == correctAnswers;

    }
}
