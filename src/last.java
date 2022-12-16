import java.util.Scanner;

public class last {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  s = in.next();
        String digits="";
        String text ="";
        for (int i = 0; i < s.length(); i++) {
            char chrs = s.charAt(i);
            if (Character.isDigit(chrs))
                digits = digits+chrs; else text=text+chrs;
        }

        int num = Integer.valueOf(digits);
        num++;
        System.out.println(text+num);
    }
}
