import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSwapping{

	@Test
	public void TestgetSwap(){

		//Given
		int[] array = {1, 2, 3, 4, 5, 6};
		Swap swapping = new Swap();

		//When
		int[] swapResult = Swap.getSwap(array);


		//check
		int[] expected = {2, 1, 4, 3, 6, 5};		
		assertArrayEquals(expected, swapResult);

	}


}