public class TwoArraysTableFunction{


public static void total2Arrays(int[][]){

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

return position;
}
else if(average[1] > average[0]){
position[1] = 1;
position[0] = 2;

return position;
}

}
return total;
}

}