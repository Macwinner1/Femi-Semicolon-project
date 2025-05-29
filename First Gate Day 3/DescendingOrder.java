import java.util.Arrays;
public class DescendingOrder{
public static int[] factorOf(String number){

double change = Double.parseDouble(number);
int numberIndex = Integer.parseInt(number);

int[] newNumbers = new int[10];	
for(int count = 0; count < numberIndex.length; count++){
if(number % count == 0){
newNumbers = number;
}

}
return newNumbers;
}

}