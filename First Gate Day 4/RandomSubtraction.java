import java.util.Scanner;
//import java.util.Random;
public class RandomSubtraction{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int count = 0;
int correctCount = 0;

for(; count < 10; count++){
int number1 = (int)(Math.random() * 100);
int number2 = (int)(Math.random() * 100);
if(number1 < number2){
	int temp = number1;
	number1 = number2;
	number2 = temp;
	}

	for(int attempt = 0; attempt < 2; attempt++){
	
	System.out.print("What is " + number1 + " - " + number2 + " ? ");
	int answer = input.nextInt();	

	if(number1 - number2 == answer) {
	System.out.print("You are correct!\n");
	correctCount++;
	break;
	}
	else{
	System.out.print("Your answer is wrong. try again!\n");
	}
	}

}

System.out.print("Correct count is " + correctCount);


}
}