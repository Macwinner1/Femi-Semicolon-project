import java.util.Arrays;
public class ExceptIndex{

public static void main(String[] args){

int[] numbers = {};
int[] sum = new int[6];
int[] max = new int[1];
int[] min = new int[1];
for(int item = 0; item < numbers.length; item++){
	for(int index = 0; index < numbers.length; index++){
		if(numbers[index] == numbers[item]){
		continue;
		}
		else{
		sum[item] = sum[item] + numbers[index];
		}
		
		if(sum[item] > max[0]){
		max[0] = sum[item];
		}
	}
min[0] = sum[item];
if(sum[item] < min[0]){
min[0] = sum[item];
}

}
System.out.print(Arrays.toString(sum));
System.out.print(Arrays.toString(max));
System.out.print(Arrays.toString(min));


}

}