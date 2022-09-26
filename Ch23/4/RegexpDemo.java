
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.StringJoiner;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class RegexpDemo {

    public static void main(String args[]) throws Exception {

        BufferedReader reader
            = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));

        StringJoiner sj = new StringJoiner("\n");

        reader.lines()
            .forEach(l -> sj.add(l));

        reader.close();

        Pattern pattern = Pattern.compile("(?<=img src=\")http.*jpg");
        Matcher matcher = pattern.matcher(sj.toString());

        // while (matcher.find())
        //     System.out.println(matcher.toString());

        matcher.results()
            .forEach(r -> System.out.println(r.group()));
    }
}

