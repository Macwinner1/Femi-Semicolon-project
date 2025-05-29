import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescendingOrderTest{


	@Test
	public void testdescendingOrder(){

	DescendingOrder digit = new DescendingOrder();
	int numbers = 24;
	int actual = digit.factorOf(numbers);
	int[] expected = {1, 2, 3, 4, 6, 8, 12, 24};
	assertEquals(actual, expected);
	}

}