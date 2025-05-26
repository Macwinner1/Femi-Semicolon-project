import java.util.Arrays;
public class ArraySquares{

public static void main(String[] args){

int[] numbers = {9, 7, 1, 5, 2};
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
System.out.print(Arrays.toString(result));
}

}

}