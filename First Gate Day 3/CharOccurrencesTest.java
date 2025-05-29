import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharOccurrencesTest{


	@Test
	public void testcharOccurrences(){

	CharOccurrences digit = new CharOccurrences();
	int actual = digit.characterCount("Hello world", 'o');
	int expected = 2;
	assertEquals(actual, expected);
	}

}