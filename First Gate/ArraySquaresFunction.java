public class ArraySquaresFunction{

public static int[] squaresAscending(int[] numbers){

int[] result = new int[5];
result[0] = 100000;
int[] temp = new int[1];

for(int index = 0; index < numbers.length; index++){
	for(int item = index; item < numbers.length; item++){
	if(result[index] > numbers[item]){
		result[index] = numbers[item];
	}
	else if(numbers[item] > result[index]){
	result[index] = numbers[item];
	}
	

	}
return result;

}

}