package pl.zimi.zadanka;

//https://leetcode.com/problems/reverse-integer/
public class Zad32 {
    public int reverseLeetCode(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }

    public int reverse(int inputNumber) {
        int result = rev(inputNumber);
        if ((rev(result) == inputNumber) || (/*inputNumber % 10 == 0 &&*/ (inputNumber / rev(result)) % 10 == 0)) {
            return result;
        } else return 0;
    }

    public int rev(int inputNumber) {
        int sign = 0;
        if (inputNumber == 0) return 0;
        if (inputNumber > 0) {
            sign = 1;
        } else {
            sign = -1;
        }
//        if (sign == -1) {
//            inputNumber = -inputNumber;
//        }
        inputNumber = Math.abs(inputNumber);
        int[] digits = new int[String.valueOf(inputNumber).length()];
        digits = (partitioning(inputNumber, digits, String.valueOf(inputNumber).length() - 1));
        int result = sign * revertFromParts(digits);
        return result;
    }

    int[] partitioning(int inputNumber, int[] digits, int numberOfDigits) {
        if (inputNumber == 0) {
            return null;
        } else {
            digits[numberOfDigits] = inputNumber % 10;
            partitioning((inputNumber - digits[numberOfDigits]) / 10, digits, --numberOfDigits);
        }
        return digits;
    }

    int revertFromParts(int[] array) {
        int revertedNumber = 0;
        int power = 1;
        for (int i = 0; i < array.length; i++) {
            revertedNumber += array[i] * power;
            power *= 10;
        }
        return revertedNumber;
    }


}
