package Interface;

public interface SortInterface {
	/**
	 * ð������
	 * @param arr ��Ҫ�������������
	 */
	public void bubbleSort(int[] arr);
	/**
	 * ѡ������
	 * @param arr ��Ҫ�������������
	 */
	public void selectSort(int[] arr);
	/**
	 * ��������
	 * @param arr ��Ҫ�������������
	 */
	public void insertSort(int[] arr);
	/**
	 * ��������
	 * @param arr ��Ҫ�������������
	 * @param start �����һ��Ԫ�ص�����
	 * @param end �������һ��Ԫ�ص�����
	 */
	public void quikSort(int[] arr,int start,int end);
	/**
	 * ������
	 * @param arr ��Ҫ�������������
	 */
	public void heapSort(int[] arr);
	/**
	 * ���������е�i��Ԫ�����j��Ԫ��
	 * @param arr ��Ҫ����Ԫ�ؽ���������
	 * @param i ����ĵ�i��Ԫ��
	 * @param j ����ĵ�j��Ԫ��
	 */
	public void swap(int[] arr,int i,int j);
	/**
	 * �鲢���� 
	 * @param arr ����ĵ�i��Ԫ��
	 * @param left ����ĵ�һ��Ԫ�ص�����
	 * @param right �������һ��Ԫ�ص�����
	 */
	public void mergeSort(int[] arr,int left,int right);
}
