import java.util.*;

public class Main {
    public static void cAPS_lOCK(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ans = true;

        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                ans = false;
                break;
            }
        }

        if (ans) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char x = s.charAt(i);
                if (Character.isLowerCase(x)) {
                    x = Character.toUpperCase(x);
                } else {
                    x = Character.toLowerCase(x);
                }
                sb.append(x);
            }
            System.out.println(sb.toString());
        } else {
            System.out.println(s);
        }
    }
}
