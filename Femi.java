public class Femi{


public static int findMultiple(int number){
return number * 5;
}

public static void displayPrimeNumbers(){
int counter = 0;
for(int index = 2; index != counter; index++){
	int count = 0;
for(int index2 = 1; index2 <= index; index2++){
	if(index % index2 == 0){
		count++;
	}
}
	if(count == 2){
		System.out.println(index + " ");
		counter++;
	}
	if(counter == 50){
	break;
	}
}

}




}