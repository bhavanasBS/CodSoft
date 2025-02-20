package codsoft;
import java.util.*;

public class StudentGrade {
	public static void main(String args[]) {
	
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of subjects: ");
double total=0.0;
int number= s.nextInt();
for(int i=1;i<=number;i++) {
	System.out.println("Enter the subject "+ i +" : ");
double sub=s.nextDouble();

 total+=sub;

}
System.out.println("Total of " + number + "Subjects is " +total);
double average = total/number;
System.out.println(average);
if(average>90.0 && average<=100.0) {
	System.out.println("A grade");
}
else if (average>80.0 && average<=90.0) {
	System.out.println("B grade");
}
else if (average>70.0 && average<=80.0) {
	System.out.println("C grade");
}
else if (average>60.0 && average<=70.0) {
	System.out.println("D grade");
}
else if (number>50.0 && number<=60.0) {
	System.out.println("E grade");
}


else {
	System.out.println("Fail");
}
s.close();



}
}
