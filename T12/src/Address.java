import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Address {
    String x = "+79152783016";
    Pattern code = Pattern.compile("([+]\\d)|(\\d)");
    Pattern numbers = Pattern.compile("\\d{3}");
    Pattern last = Pattern.compile("\\d{4}");
    public void output() {
        Matcher matcher = code.matcher(x);
        matcher.find();
        System.out.println(matcher.group());
        x = x.replace(matcher.group(), "");
        matcher = numbers.matcher(x);
        matcher.find();
        System.out.println(matcher.group());
        x = x.replace(matcher.group(), "");
        matcher.find();
        System.out.println(matcher.group());
        x = x.replace(matcher.group(0), "");
        matcher = last.matcher(x);
        matcher.find();
        System.out.println(matcher.group());
    }


    public static void main(String[] args) {
        Address address = new Address();
        address.output();
    }
}