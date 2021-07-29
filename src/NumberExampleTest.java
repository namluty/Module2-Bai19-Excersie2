public class NumberExampleTest {
    private static NumberExample numberExample;
    public static final String[] validNumber = new String[]{"(84)-(0978489648)","(88)-(0978489649)","(81)-(0898489648)"};
    public static final String[] invalidNumber = new String[]{" (a8)-(22222222)","(b1)-(9823919372)","(3a)-(0000090909)"};

    public static void main(String[] args) {
        numberExample = new NumberExample();
        for (String number : validNumber) {
            boolean isvalid = numberExample.validate(number);
            System.out.println("Number is " + number + " is valid: " + isvalid);
        }
        for (String numbers : invalidNumber) {
            boolean isvalid = numberExample.validate(numbers);
            System.out.println("Number is " + numbers + " is valid: " + isvalid);
        }
    }
}
