package by.yarohovich.FlowerShop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivinationTest {

	@Test
	public void testGenerateNumberLeaves() {
		Divination dv = new Divination();		
		int result = dv.generateNumberLeaves();
		int[] arr = initializationArray(10, 25);
		assertEquals(result, containsElement(arr, result)); //не всегда срабатывает
	}
	
	private int containsElement(int[] arg, int value) {
		int result = 0;
		for (int s : arg) {
			if (s == value) {
				return value;
			}
		}
		return result;
	}
	
	private static int[] initializationArray(int i1, int i2) {
		int[] array = new int[i2 - i1];
		for (int i = 0; i < array.length; i++) {
			array[i] = i1;
			i1++;
		}
		return array;
	}

	/*@Test
	public void testToTheCar() {
		fail("Not yet implemented");
	}

	@Test
	public void testToWork() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivinationByLove() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetGenerate() {
		String srting1 = "value1";
		String string2 = "value2";
		HashSet<String> set = new HashSet<>();
		set.add(srting1);
		set.add(string2);
		assertEquals()
	}

	@Test
	public void testSettingValuesLeaves() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSetValueToArr() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetArrValueByIndex() {
		fail("Not yet implemented");
	}*/
}
