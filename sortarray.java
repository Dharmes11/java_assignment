import java.io.*;
import java.util.*;
class sortarray 
{
   public static void main(String[] args) 
   {
        Scanner sc=new Scanner(System.in);
        int ch;
        myarray m=new myarray();
        m.getdata();
        m.display();

        while (true) 
        {
            System.out.print("\n");
            System.out.println("1. Ascending Order ");
            System.out.println("2. Descending Order ");
            System.out.println("3.Exit");
            System.out.print("\n");

            System.out.print("Enter Your Choice : ");
            ch=sc.nextInt();

            switch (ch) 
            {
                case 1 :
                        m.sort_asc();
                        break;
                case 2:
                        m.sort_desc();
                        break;
                case 3 :
                        System.exit(0);
                default:
                        System.out.println("Invalid Choice");
                        break;
            }

        }
   } 
}

class myarray
{
    int i,n,temp,j;
    int[] a=new int[10];

    Scanner sc=new Scanner(System.in);

    void getdata()
    {
        System.out.print("Enter Number Of Array Values  : ");
        n=sc.nextInt();

        for(i=0;i<n;i++)
        {
            System.out.print("Enter Number "+(i+1)+" : ");
            a[i]=sc.nextInt();
        }
    }

    void display()
    {
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }

    void sort_asc()
    {
        System.out.println("Ascending Order ");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
            System.out.println(a[i]);
        }
        System.out.println("----------------------------------------------------------");
    }

    void sort_desc()
    {
        System.out.println("Descending Order ");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
            System.out.println(a[i]);
        }
        System.out.println("----------------------------------------------------------");
    }
}
