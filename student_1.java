import java.io.*;
import java.util.*;
class student_1 
{
    public static void main(String[] args) 
    {
        int no,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        no = sc.nextInt();   
        
        result[] r = new result[no];

        for(i=0;i<no;i++)
        {
            r[i]=new result();
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            r[i].getdata();
            r[i].calculate();
        }
        System.out.println("\n\n\t\t\t\tMARKSHEET");
        System.out.println("====================================================================================");
        System.out.println("ROLLNO"+"\t"+"NAME"+"\t"+ "M1"+"\t"+"M2"+"\t"+"M3"+"\t"+ "M4"+"\t"+ "M5"+"\t"+"TOTAL"+"\t"+"%"+"\t"+"RESULT");

        for(j=0;j<no;j++)
        {
            r[j].display();
        }
    }
}
class value
{
    int roll,i;
    String name;
    float tot,per;
    int[] marks = new int[5];

    Scanner sc=new Scanner(System.in);

    void getdata()
    {
        System.out.print("Enter Student Name : ");
        name=sc.nextLine();

        System.out.print("Enter Student Roll No : ");
        roll=sc.nextInt();

        for(i=0;i<5;i++)
        {
            System.out.print("Enter Marks "+(i+1)+" : ");
            marks[i]=sc.nextInt();


            if (marks[i] > 100) 
            {
                System.out.println("Marks cannot be more than 100. Exiting program.");
                System.exit(0);
            }
        }

        tot=0.0f;
        per=0.0f;

        for(i=0;i<5;i++)
        {
            tot=tot+marks[i];
        }

        per=tot/5;

    }

}

class result extends value
{
    char grade;
    void calculate()
    {
        if(per>=70 && per<=100)
        {
            grade='A';
        }
        else if(per>=50 && per<70)
        {
            grade='B';
        }
        else if(per>=33 && per<50)
        {
            grade='C';
        }
        else if(per>=1 && per<33)
        {
            grade='F';
        }
    }

    void display()
    {
        System.out.println(roll+"\t"+name+"\t"+marks[0]+"\t"+marks[1]+"\t"+marks[2]+"\t"+marks[3]+"\t"+marks[4]+"\t"+tot+"\t"+per+"\t"+grade);        
    }
}
