import java.util.Arrays;
public class Clockwise2D{
public static int[][] arrayClockwise2D(int[][] numbers){

int[][] newNumbers = new int[numbers.length][numbers[0].length];

for(int index = 0; index < numbers.length; index++){
int count = numbers.length - 1;
 for(int value = 0; value < numbers[index].length; value++){
 newNumbers[index][value] = numbers[count][index];
 count--;	
 }
}

return newNumbers;
}

}
