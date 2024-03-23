import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter String");
        String str = sc.nextLine();

        StringLower sobj = new StringLower();
        int iret = sobj.countSmall(str);

        System.out.println("Lowercase letter are " + iret);

        iret = sobj.countCapital(str);
        System.out.println("Capital letter are" + iret);

        sc.close();
    }

}

class StringLower {

    public int countSmall(String str) {
        int iCount = 0;

        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')) {
                iCount++;
            }

        }
        return iCount;
    }

    public int countCapital(String str) {
        int iCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) {
                iCount++;
            }
        }
        return iCount;
    }
}