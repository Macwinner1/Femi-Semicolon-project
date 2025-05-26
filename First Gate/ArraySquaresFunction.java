public class ArraySquaresFunction{

public static int[] squaresAscending(int[] numbers){

int[] result = new int[5]; 

for(int index = 0; index < numbers.length; index++){
for(int item = index; item < numbers.length; item++){
if(numbers[index] > numbers[item]){
result[index] = numbers[item];
else if(numbers[item] > numbers[index]){
result[index] = numbers[index];
}
}

}

}

return result;
}

}