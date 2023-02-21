package ProjectWork;

import ProjectWork.Validator;

public class MinValueValidator implements Validator {


    private final int minValue;

    public MinValueValidator(int minValue) {

        this.minValue = minValue;
    }

    @Override
    public boolean validate(int value) {
        return (value >= minValue);
    }


    @Override
    public String messing() {
        return "Ведено отрицательное число";
    }

}
