package Interface;

public interface SortInterface {
	/**
	 * 冒泡排序法
	 * @param arr 需要进行排序的数组
	 */
	public void bubbleSort(int[] arr);
	/**
	 * 选择排序法
	 * @param arr 需要进行排序的数组
	 */
	public void selectSort(int[] arr);
	/**
	 * 插入排序法
	 * @param arr 需要进行排序的数组
	 */
	public void insertSort(int[] arr);
	/**
	 * 快速排序法
	 * @param arr 需要进行排序的数组
	 * @param start 数组第一个元素的索引
	 * @param end 数组最后一个元素的索引
	 */
	public void quikSort(int[] arr,int start,int end);
	/**
	 * 堆排序法
	 * @param arr 需要进行排序的数组
	 */
	public void heapSort(int[] arr);
	/**
	 * 交换数组中第i个元素与第j个元素
	 * @param arr 需要进行元素交换的数组
	 * @param i 数组的第i个元素
	 * @param j 数组的第j个元素
	 */
	public void swap(int[] arr,int i,int j);
	/**
	 * 归并排序法 
	 * @param arr 数组的第i个元素
	 * @param left 数组的第一个元素的索引
	 * @param right 数组最后一个元素的索引
	 */
	public void mergeSort(int[] arr,int left,int right);
}
