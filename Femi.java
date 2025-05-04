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


public static String displayAge(int ageYears){
String result = " ";
if(ageYears < 0)
{
 System.out.print("invalid Age");
}
else{
 int monthValue = ageYears * 12;
 int dayValue = monthValue * 365;
 long minutes = dayValue * 1440;
 long seconds = 60 *minutes;

 result = "Age:" + ageYears + " year(s)," + monthValue + " months," +       dayValue + " days," + minutes + " minutes," + seconds + " seconds";
}
return result;
}


public static void displayDogAge(String name, int humanYears){
if(humanYears <= 0){
System.out.print("invalid number");
}
int dogYears = 7 * humanYears;
System.out.print(name + dogYears);
}



}