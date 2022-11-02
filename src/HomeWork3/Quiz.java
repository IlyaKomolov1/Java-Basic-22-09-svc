package HomeWork3;

public class Quiz {
   private TestElement[] elements;
    private int correctCount = 0;
    private int wrongCount = 0;

    public void run(){
        for (TestElement element:elements) {
            boolean result = element.test();
            if (result){
                correctCount++;
            }else {
                wrongCount++;
            }
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }

    public Quiz(TestElement[] elements) {
        this.elements = elements;
    }
}
