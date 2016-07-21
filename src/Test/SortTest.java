package Test;

import org.junit.Assert;
import org.junit.Test;

import Impl.SortImpl;
import Interface.SortInterface;

/**
 * @author Administrator
 *
 */
public class SortTest {
	
	SortInterface sort = new SortImpl();
	int[] expecteds = {1,2,3,4,5,6,7,8,9,10};
	int[] test = {5,8,10,1,4,2,3,7,6,9};

	/**
	 * Test method for {@link SortImpl#bubbleSort(int[])}.
	 */
	@Test
	public void testBubbleSort() {
		sort.bubbleSort(test);
		Assert.assertArrayEquals(expecteds,test);
	}

	/**
	 * Test method for {@link SortImpl#selectSort(int[])}.
	 */
	@Test
	public void testSelectSort() {
		sort.selectSort(test);
		Assert.assertArrayEquals(expecteds,test);
	}

	/**
	 * Test method for {@link SortImpl#insertSort(int[])}.
	 */
	@Test
	public void testInsertSort() {
		sort.insertSort(test);
		Assert.assertArrayEquals(expecteds,test);
	}

	/**
	 * Test method for {@link SortImpl#quikSort(int[], int, int)}.
	 */
	@Test
	public void testQuikSort() {
		sort.quikSort(test, 0, test.length-1);
		Assert.assertArrayEquals(expecteds,test);
	}

	/**
	 * Test method for {@link SortImpl#heapSort(int[])}.
	 */
	@Test
	public void testHeapSort() {
		sort.heapSort(test);
		Assert.assertArrayEquals(expecteds,test);
	}

	/**
	 * Test method for {@link SortImpl#mergeSort(int[], int, int)}.
	 */
	@Test
	public void testMergeSort() {
		sort.mergeSort(test, 0, test.length-1);
		Assert.assertArrayEquals(expecteds,test);
	}

}
