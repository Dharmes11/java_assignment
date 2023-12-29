import java.io.*;
import java.util.*;
class student
{
    public static void main(String[] args) {
        value v=new value();
        v.getdata();
        v.calculate();
        v.display();
    }
}
class value
{
    int no,s_code,cnt,i;
    int ma,mf,mp,fa,fp,ff;
    int marks[];
    String name,cls;
	float tot,per;

    Scanner sc=new Scanner(System.in);

    void getdata()
    {
        System.out.print("Enter Student Name :");
        name=sc.nextLine();
        
        System.out.print("Enter Student No : ");
        no=sc.nextInt();

        System.out.print("Enter Gender (1.Male/2.Female)");
        s_code=sc.nextInt();

        for(i=0;i<5;i++)
        {
            System.out.println("Enter Marks "+(i+1)+" : ");
            marks[i]=sc.nextInt();
        }

        for(i=0;i<5;i++)
        {
            tot=0.0f;
            per=0.0f;
            if(marks[0]>=35 && marks[1]>=35 && marks[2]>=35 && marks[3]>=35 && marks[4]>=35)
            {
                tot=tot+marks[i];
                per=tot/5;
            }
        }

    }

    void calculate()
    {
        cnt=0;
        if(s_code==1)
        {
            for(i=0;i<5;i++)
            {
                if(marks[i]<35)
                {
                    cnt++;
                }
            }
            if(cnt>2)
            {
                cls="FAIL";
                mf++;
            }
            else if(cnt==1 || cnt==2)
            {
                cls="ATKT";
                ma++;
            }
            else if(cnt==0)
            {
                if(per<48)
                {
                    cls="PASS";
                    mp++;
                }
                if(per>=48 && per<60)
			    {
				    cls="SECOND";
				    mp++;
			    }
			    if(per>=60 && per<70)
			    {
				    cls="FIRST";
				    mp++;
			    }
			    if(per>=70 )
			    {
				    cls="DISTINCTION";
				    mp++;
			    }
            }
        }
        if(s_code==2)
        {
            for(i=0;i<5;i++)
            {
                if(marks[i]<35)
                {
                    cnt++;
                }
            }
            if(cnt>2)
            {
                cls="FAIL";
                ff++;
            }
            else if(cnt==1 || cnt==2)
            {
                cls="ATKT";
                fa++;
            }
            else if(cnt==0)
            {
                if(per<48)
                {
                    cls="PASS";
                    fp++;
                }
                if(per>=48 && per<60)
			    {
				    cls="SECOND";
				    fp++;
			    }
			    if(per>=60 && per<70)
			    {
				    cls="FIRST";
				    fp++;
			    }
			    if(per>=70 )
			    {
				    cls="DISTINCTION";
				    fp++;
			    }
            }
        }
    }

    void display()
    {
        System.out.println("Student no : " +no);
        System.out.println("Student name : " +name);
        for(i=0;i<5;i++)
        {
            System.out.println(" marks : "+(i+1)+marks[i]);
        }
        System.out.println("total : " +tot);
        System.out.println("percentage : " +per);
        System.out.println("Result : " +cls);
    }
}