package pl.zimi.zadanka;

public class Zad3 {
    public boolean checkPowerOfTen(Integer inputNumber) {
        if (inputNumber.equals(0)) {
            return false;
        }
        if (inputNumber.equals(1)) {
            return true;
        }

        Integer tempNumber = inputNumber;

        while (tempNumber % 10 == 0) {
            tempNumber = tempNumber / 10;

            if (tempNumber == 1) {
                return true;
            }
        }
        return false;
    }

    ;

}
