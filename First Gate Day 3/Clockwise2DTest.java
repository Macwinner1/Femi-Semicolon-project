import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Clockwise2DTest{


	@Test
	public void testclockwise2D(){

	Clockwise2D digit = new Clockwise2D();
	int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	int[][] actual = digit.arrayClockwise2D(numbers);
	int[][] numbers2 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
	int[][] expected = numbers2;
	assertArrayEquals(actual, expected);
	}

}