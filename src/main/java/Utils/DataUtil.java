package Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataUtil {
    public static List<Double> getDoubles(String stringArg) {
        catchNullArgument(stringArg);
        if (stringArg.equals("")) {
            return new ArrayList<>();
        }
        return getDoublesFromString(stringArg);
    }

    public static Double getNDouble(List<Double> doubles, int n) {
        catchNullOrEmptyList(doubles);
        catchNegativeValue(n);
        return getNDoubleFromDoubles(doubles, n);
    }

    private static Double getNDoubleFromDoubles(List<Double> doubles, int n) {
        Double result;
        try {
            result = doubles.get(n);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Can not read element " + n + " from List<Doubles>: " + doubles + ", where length = " + doubles.size() + " ", e);
        }
        return result;
    }

    private static void catchNegativeValue(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number of element can not be negative. But n = " + n);
        }
    }

    private static void catchNullOrEmptyList(List<Double> doubles) {
        if (doubles == null || doubles.isEmpty()) {
            throw new IllegalArgumentException("Can not get Double from empty List<Double> or null. List<Double> = " + doubles);
        }
    }

    private static List<Double> getDoublesFromString(String stringArg) {
        List<Double> result = new ArrayList<>();
        stringArg = stringArg.replaceAll(",", ".");
        Pattern p = Pattern.compile("-?\\d+([.]\\d+)?");
        Matcher m = p.matcher(stringArg);
        while (m.find()) {
            Double currentParsingDouble;
            try {
                currentParsingDouble = Double.valueOf(m.group());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Can not convert String \"" + stringArg + "\" to Double");
            }
            result.add(currentParsingDouble);
        }
        return result;
    }

    private static void catchNullArgument(String stringArg) {
        if (stringArg == null) {
            throw new IllegalArgumentException("Can not get Doubles from null");
        }
    }
}
