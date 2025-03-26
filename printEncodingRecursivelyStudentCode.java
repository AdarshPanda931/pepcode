import java.util.Scanner;

public class printEncodingRecursivelyStudentCode {
    public static void main(String[] args) throws Exception
    {
        Scanner scn = new Scanner(System.in);
        String ques = scn.next();
        printEncodings(ques, "");

    }

    public static void printEncodings(String ques, String ans)
    {

        if (ques.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        // 1st option  // first 1 digit from 123 [1]
        char ch = ques.charAt(0);
        String roq1 = ques.substring(1);

        if (ch == '0')
        {
            return;
        } else
        {
            int chv = ch - '0';
            char letter = (char) ('a' + chv - 1);

            printEncodings(roq1, ans + letter);

        }

        // 2nd option - first 2 digits from 123 [12]

        if (ques.length() >= 2)
        {
            String ch2 = ques.substring(0, 2);
            String roq2 = ques.substring(2);
            if (ch2.charAt(0) == '0')
            {
                return;
            } else
            {
                int chv = Integer.parseInt(ch2);
                if (chv <= 26)
                {
                    char letter = (char) ('a' + chv - 1);
                    printEncodings(roq2, ans + letter);
                }
            }
        }



    }
}
