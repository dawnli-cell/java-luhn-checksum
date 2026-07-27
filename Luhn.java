/** Luhn checksum validate/generate. Pure, dependency-free. */
public final class Luhn {
    private Luhn() {}

    public static boolean isValid(String number) {
        int sum = 0;
        boolean alt = false;
        for (int i = number.length() - 1; i >= 0; i--) {
            char c = number.charAt(i);
            if (c < '0' || c > '9') continue;
            int d = c - '0';
            if (alt) { d *= 2; if (d > 9) d -= 9; }
            sum += d;
            alt = !alt;
        }
        return sum % 10 == 0;
    }

    public static int checkDigit(String partial) {
        for (int d = 0; d < 10; d++) if (isValid(partial + d)) return d;
        throw new AssertionError("unreachable");
    }
}
