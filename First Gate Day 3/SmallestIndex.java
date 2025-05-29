import java.util.Arrays;
public class SmallestIndex{
public static int smallestIndexOfLargest(int[] numbers){

int largest = -200000;
int largestIndex = 0;

for(int index = 0; index < numbers.length; index++){
	if(numbers[index] > largest){
	largest = numbers[index];
	largestIndex = index;
	}	
 }
return largestIndex;
}

}