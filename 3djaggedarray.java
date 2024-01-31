/* Create an array to store the ages of students from two schools? School 1 consists of three classrooms: Classroom 1 has 2 students, while Classrooms 2 and 3 
each have 3 students. Meanwhile, School 2 comprises two classrooms: Classroom 1 has 2 students, and Classroom 2 has 3 students. */

package java1;

import java.util.*;
public class basic1 
{
	public static void main(String[] args)
	{	
		int a[][][] = new int[2][][];
		
		a[0] = new int[3][];
		a[1] = new int[2][];
		
		a[0][0] = new int[2];
		a[0][1] = new int[3];
		a[0][2] = new int[3];
		
		a[1][0] = new int[2];
		a[1][1] = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=0; j<=a[i].length-1; j++)
			{
				for(int k=0; k<=a[i][j].length-1; k++)
				{
					System.out.println("Enter the age of school" +i+ "class" +j+ "student" +k+ ": ");
					a[i][j][k] = scan.nextInt();
				}
			}
		}
		
		System.out.println("The ages are: ");
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=0; j<=a[i].length-1; j++)
			{
				for(int k=0; k<=a[i][j].length-1; k++)
				{
					System.out.println(a[i][j][k]);
				}
			}
		}
	}

}
