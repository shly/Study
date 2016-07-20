public class Exercise implements SortUilt {
    public static void main(String[] args){
    	Exercise exercise = new Exercise();
    	int[] a = {1,5,0,4,0,3,1,2,1,5,6,8};
//    	exercise.bubbleSort(a);
//    	exercise.selectSort(a);
//    	exercise.insertSort(a);
//    	exercise.heapSort(a);
//    	exercise.quikSort(a, 0, a.length-1);
    	exercise.mergeSort(a, 0, a.length-1);
    	for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
    }

	@Override
	public void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j] = temp;
	}

	@Override
	public void bubbleSort(int[] arr) {
		for (int i = arr.length; i > 1; i--) {
			for (int j = 0; j < i-1; j++) {
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
		
	}

	@Override
	public void selectSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min]){
					min = j;
				}
			}
			swap(arr,i,min);
		}
		
	}

	@Override
	public void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i,temp = arr[i];
			while(j>0&&arr[j-1]>temp){
				arr[j] = arr[--j];
			}
			arr[j] = temp;
		}
		
	}

	@Override
	public void quikSort(int[] arr, int start, int end) {
		if(start<end){
			int i = start,
				j = end+1;
			while(true){
				while(i<end&&arr[++i]<=arr[start]){}
				while(j>start&&arr[--j]>=arr[start]){}
				if(i<j){
					swap(arr,i,j);
				}else{
					break;
				}
			}
			swap(arr,start,j);
			quikSort(arr, start, j-1);
			quikSort(arr, j+1, end);
		}
		
	}

	@Override
	public void heapSort(int[] arr) {
		for (int i = arr.length-1; i > 0; i--) {
			buildMaxHeap(arr, i);
			swap(arr, 0, i);
		}
	}
	public void buildMaxHeap(int[] arr,int lastIndex){
		for (int i = (lastIndex-1)/2; i >= 0; i--) {
			int j = i;
			while(2*j+1<=lastIndex){
				int bigger = 2*j+1;
				if(bigger<lastIndex){
					if(arr[bigger]<arr[bigger+1]){
						bigger++;
					}
				}
				if(arr[bigger]>arr[j]){
					swap(arr,j,bigger);
					j = bigger;
				}else{
					break;
				}
			}
		}
	}

	@Override
	public void mergeSort(int[] arr, int left, int right) {
		if(left<right){
			int center = (left+right)/2;
			mergeSort(arr, left, center);
			mergeSort(arr, center+1, right);
			merge(arr, left, right, center);
		}
		
	}
	public void merge(int[] arr,int left,int right,int center) {
		int[] tempArr = new int[arr.length];
		int temp = left,
			rightCur = center+1,
			cur = left;
		while(left<=center&&rightCur<=right){
			if(arr[left]<=arr[rightCur]){
				tempArr[temp++] = arr[left++];
			}else{
				tempArr[temp++] = arr[rightCur++];
			}
		}
		while(left<=center){
			tempArr[temp++] = arr[left++];
		}
		while(rightCur<=right){
			tempArr[temp++] = arr[rightCur++];
		}
		while(cur<=right){
			arr[cur]= tempArr[cur++];
		}
	}


}
