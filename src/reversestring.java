import java.util.Scanner;
public class reversestring {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String M = s.nextLine();
        String reversed = reverseString(M);
        System.out.println("The reversed string is: " + reversed);

    }
    public static String reverseString(String M)
    {
        if (M.isEmpty())
            return M;
        return reverseString(M.substring(1)) + M.charAt(0);
    }
}
