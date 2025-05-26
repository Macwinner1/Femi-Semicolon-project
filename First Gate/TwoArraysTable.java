import java.util.Arrays;
public class TwoArraysTable{
public static void main(String[] args){

int[][] students = {{3, 3, 4}, {9, 1, 3}};
double[] total = new double[2];
double[] average = new double[2];
int[] position = new int[2];


for(int index = 0; index < students.length; index++){
for(int item = 0; item < students[index].length; item++){
total[index] += students[index][item];
}
average[index] = total[index] / students[index].length;
if(average[0] > average[1]){
position[0] = 1;
position[1] = 2;
}
else if(average[1] > average[0]){
position[1] = 1;
position[0] = 2;
}

}

System.out.println(Arrays.toString(total));
System.out.println(Arrays.toString(average));
System.out.println(Arrays.toString(position));
}

}