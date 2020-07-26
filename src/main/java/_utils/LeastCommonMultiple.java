package _utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LeastCommonMultiple {

    private static final Map<Integer, Integer> leastCommonMultipleMap = new HashMap<>();

    public static double getLeastCommonMultiple(int v1, int v2) {

        double leastCommonMultiple = 1;
        final List<Integer> primeFactorsV1 = NumberFactors.getPrimeFactors(v1);
        final List<Integer> primeFactorsV2 = NumberFactors.getPrimeFactors(v2);

        addLeastCommonMultiples(primeFactorsV1);
        addLeastCommonMultiples(primeFactorsV2);

        for (Map.Entry<Integer, Integer> entry : leastCommonMultipleMap.entrySet()) {
            double base = Double.parseDouble(Integer.toString(entry.getKey()));
            double exponent = Double.parseDouble(Integer.toString(entry.getValue()));
            leastCommonMultiple = leastCommonMultiple * Math.pow(base, exponent);
        }

        return leastCommonMultiple;
    }

    private static void addLeastCommonMultiples(List<Integer> primeFactorsV1) {
        for (int primeFactor : primeFactorsV1) {

            int repetitions = Collections.frequency(primeFactorsV1, primeFactor);

            if (leastCommonMultipleMap.containsKey(primeFactor)) {
                int value = leastCommonMultipleMap.get(primeFactor);
                if (value < repetitions) {
                    leastCommonMultipleMap.put(primeFactor, repetitions);
                }
            } else {
                leastCommonMultipleMap.put(primeFactor, repetitions);
            }
        }
    }
}
