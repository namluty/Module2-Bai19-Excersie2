import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExample {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String NUMBER_REGEX = "^[0-9+\\(\\)#\\.\\s\\/ext-]+$";

    public NumberExample() {
        pattern = Pattern.compile(NUMBER_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
