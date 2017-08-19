import java.util.Scanner;
public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int test = 0;

Scanner s = new Scanner(System.in);

while(test < 1){
	System.out.println("put in student test score");
	test = s.nextInt();
}
for(test = 0; test < 1; test++) {
	System.out.println("put in student test score");
	test = s.nextInt();
}
	
int average = test + test / 2;


if(average >= 70) {
	System.out.println("pass");
}
else{
	System.out.println("Fail");
}
	
	}

}
