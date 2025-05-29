public class CharOccurrences{
public static int characterCount(String Firstwords, char letter){
String words = Firstwords.toLowerCase();
int count = 0;

for(int index = 0; index < 1; index++){

for(int value = 0; value < words.length(); value++){
	if(letter == words.charAt(value)){
	count++;
	}	
 }

}
return count;
}

}



