import java.io.*;
import java.util.*;

public class stringprog {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int ch;

        string s=new string();
        
        while (true) 
        {
            System.out.println("1. Upper Case ");
            System.out.println("2. Lower Case ");
            System.out.println("3. Length Case ");
            System.out.println("4.Exit");

            System.out.print("Enter Your Choice : ");
            ch=sc.nextInt();

            switch (ch) 
            {
                case 1:
                        s.upper();
                        break;
                case 2:
                        s.lower();
                        break;
                case 3:
                        s.length();
                        break;
                case 4:
                        System.exit(0);
                default:
                        System.out.println("Invalid Number");
                        break;
            }
        }
    }
}
class string
{
    Scanner sc=new Scanner(System.in);
    String s1;

    void upper()
    {
        System.out.print("Enter String : ");
        s1=sc.nextLine();
        System.out.print("\n================================================\n");
        System.out.print("\nUpper case : "+s1.toUpperCase()+"\n");
        System.out.print("\n================================================\n");

    }

    void lower()
    {
        System.out.print("Enter String : ");
        s1=sc.nextLine();
        System.out.print("\n================================================\n");
        System.out.print("\nLower case : "+s1.toLowerCase()+"\n");
        System.out.print("\n================================================\n");

    }

    void length()
    {
        System.out.print("Enter String : ");
        s1=sc.nextLine();
        System.out.print("\n================================================\n");
        System.out.print("\nLength : "+s1.length()+"\n");
        System.out.print("\n================================================\n");

    }
}
