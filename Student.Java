/**
 * This is a class to define the necessary attributes and methods to conceptualize a "Student"
 * The spepcific tasks are:
 * 1. Instiate
 *
 * @ (your name)
 * @12/10/16 (a version number or a date)
 */
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.io.*;


public class Student {

	Scanner input = new Scanner(System.in);
	// Declare the important attributes of a student. For example:
    //1.Id
    //2. Name
    //3. Department
    //4. University
    //5. GPAs in various terms (Multidimensional arrays)
    //6. subjects for Current terms
    //7. Credits and grades of Current Terms (Multidimmentional Array)

    int id;
    String name;
    String Department ;
    String University ;
    double[] GPA = new double[8];
    double[][][] updt = new double[8][5][5];
    double CGPA;

    /**
     * Define a constructor that initilize the default properties of the Student
     */
    public Student(int Id,String Name,String department,String university)
    {
        id = Id;
        name = Name;
        Department = department;
        University = university ;
    }

    /**
     * Define a method to print the students details.
     */
    public void studentDetailsById(int id)
    {
        //write your code here
    	System.out.println("ID          : " + id);
    	System.out.println("Name        : " +name);
    	System.out.println("Department  : " + Department);
    	System.out.println("University  : " + University);
    }


    /**
     * Define a method to update information of students by ID
     * Use as many arguments as required.
     */
    public void updateStudentById(int id)
    {
        //Write your code here
    	System.out.println("write 'true' for updating :");
    	boolean m = input.nextBoolean();
    	if(m == true )
    	{
	    	name = input.nextLine();
    		System.out.println("enter name : ")
	    	name = input.nextLine();
	    	System.out.println("enter department : ");
	    	Department = input.nextLine();
	    	System.out.println("enter university : ");
	    	University = input.nextLine();
	    	System.out.println("updated Name   :  " +name+ "\ndepartment   :     " +Department+ "\nuniversity   :     " +University);
    	}
    	else
    	{
    	}
    }

    /**
     * Define a method to compute the CGPA from the Given term GPA for a particular student.
     * se as many arguments as required.
     */
    public double computeCGPAByID()
    {

    }


    /**
     * Define a method to compute the GPA from the given Credits and Grades of all the subjects
     */
    public double computeGPAById()
    {
    	double gpa =0;
    	double total = 0;
    	for(int i=0;i<8;i++)
    	{
    		System.out.println("enter credit and grade per subject of semester: "+(i+1));
    		for(int j=0,k=0;j<5;j++,k++)
    		{
    			updt[i][j][0]=input.nextDouble();
    			updt[i][0][k]=input.nextDouble();
    		}
    	}

    	for(int i=0;i<8;i++)
    	{
    		gpa=0;
    		total=0;
    		for(int j=0,k=0;j<=4;j++,k++)
    		{
    			gpa=gpa+updt[i][j][0]*updt[i][0][k];
    			total =total+ updt[i][j][0];
    		}

    		gpa = gpa / total;
    		System.out.printf("result of term  :    %d    %.2f\n",(i+1),gpa);
    	}
    	return gpa;
    }


    /**
     * After performing required operations on each student, save the information to a file. Use File and PrintWriter Class.
     * use as many arguments as required.
     *
     */
    public void saveStudent()
    {

    }

    /**
     * Create a dummy files with infromations to describe the properties of a Student object and load the data files using Java File and Scanner class.
     * use as many arguments as required.
     */


    /**
     * The tasks to be carried out here:
     * 1. Create an Arrays of students using Student Class. Initlize them and perfom all the above defined operation to evualuate your code.
     * use as many arguments as required.
     */
    public static void main(String[] args)
    {

    }
}
