package pl.zimi.zadanka;

public class Zad3 {
    public boolean checkPowerOfTen(Integer inputNumber) {
        boolean answer = false;
        if (inputNumber.equals(1) || inputNumber.equals(10))
            answer = true;
        else {
            answer = false;
        }
        Integer tempNumber = inputNumber;

        while (tempNumber % 10 == 0) {
            tempNumber = tempNumber / 10;

            if (tempNumber == 10) {
                return true;
            }
        }


        return answer;
    }

    ;

}
