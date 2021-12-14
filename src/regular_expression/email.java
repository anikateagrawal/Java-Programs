package regular_expression;

//Regular Expression
// program to check valid email address

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email {
    public static void main(String[] args) {
        String target = "neeraj@rediff.com";
        Pattern p = Pattern.compile("[a-zA-Z0-9_.]+[@](gmail|yahoo|rediff)[.]com");
        Matcher m = p.matcher(target);
        int ctr = 0;
        while(m.find())
        {
            System.out.println(m.start()+ "--"+m.end()+ "--"+m.group());
            ctr++;
        }
        System.out.println(ctr);

    }

}
