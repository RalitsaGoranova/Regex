package izpit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String regex = "[@|#]+(?<color>[a-z]{3,})[@|#]+[^A-Za-z0-9]*[\\/]+(?<amount>[0-9]+)[\\/]+";
        Pattern pattern=Pattern.compile(regex);
        String input=scanner.nextLine();
        Matcher matcher=pattern.matcher(input);
        while (matcher.find())
        {
            System.out.println("You found "+matcher.group("amount")+" "+matcher.group("color")+" eggs!");
        }
    }
}
