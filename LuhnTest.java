/** Run: javac *.java && java LuhnTest */
public class LuhnTest {
    public static void main(String[] args) {
        if (!Luhn.isValid("79927398713")) throw new AssertionError("valid failed");
        if (Luhn.isValid("79927398710")) throw new AssertionError("invalid failed");
        if (Luhn.checkDigit("7992739871") != 3) throw new AssertionError("checkDigit failed");
        System.out.println("ok");
    }
}
