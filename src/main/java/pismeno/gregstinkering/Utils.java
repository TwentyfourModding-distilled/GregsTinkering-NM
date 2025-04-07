package pismeno.gregstinkering;

public class Utils {

    private Utils() {}

    public static String toPascalCase(String input) {
        StringBuilder result = new StringBuilder();
        for (String part : input.split("_")) {
            if (!part.isEmpty()) {
                result.append(Character.toUpperCase(part.charAt(0)));
                if (part.length() > 1) {
                    result.append(part.substring(1));
                }
            }
        }
        return result.toString();
    }
}
