import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestIndexTest{


	@Test
	public void testsmallestIndex(){

	SmallestIndex digit = new SmallestIndex();
	int[] numbers = {1, 5, 3, 4, 5, 5};
	int actual = digit.smallestIndexOfLargest(numbers);
	int expected = 1;
	assertEquals(actual, expected);
	}

}