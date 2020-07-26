package _utils;

import java.util.ArrayList;
import java.util.List;

import static _utils.ModuleOperations.isDivisible;

public class NumberFactors {

    public static List<Integer> getPrimeFactors(int value) {

        List<Integer> factors = new ArrayList<>();

        if (value == 1) {
            factors.add(1);
            return factors;
        }

        for (int i = 2; i <= value; i++) {
            int aux = value;
            while (isDivisible(aux, i)) {
                aux = aux / i;
                factors.add(i);
                value = aux;
            }
        }

        return factors;
    }

    public static List<Long> getPrimeFactors(long value) {

        List<Long> factors = new ArrayList<>();

        for (long i = 2; i <= value; i++) {
            if (isDivisible(value, i)) {
                factors.add(i);
            }
        }

        return factors;
    }
}
