/*************************************************************************
	> File Name: Mergesort.java
	> Author: Kai Xiong
	> Mail: xkeecs@gmail.com 
	> Created Time: Thu 27 Feb 2014 10:09:51 AM EST
 ************************************************************************/

public class Mergesort{
	private static int[] numbers;
	private static int[] helper;

	private static int number;

	public static void sort(int[] values){
		numbers = values;
		number = values.length;
		helper = new int[number];
		mergesort(0, number -1 );
	}

	private static void mergesort(int low, int high){
		if(low < high){
			int middle = (low + high)/2;
			mergesort(low, middle);
			mergesort(middle+1, high);
			merge(low, middle, high);
		}
	}

	private static void merge(int low, int middle, int high){
		for(int i = low; i<=high; i++){
			helper[i] = numbers[i];
		}

		int i = low;
		int j = middle+1;
		int k = low;

		while(i <= middle && j<= high){
			if(helper[i] <= helper[j]){
			   numbers[k] = helper[i];
		       i++;
			}
			else{
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			numbers[k] = helper[i];
			k++;
			i++;
		}
	    while(j<=high){
			numbers[k] = helper[j];
			k++;
			j++;
		}
	}
	public static void main(String args[]){
		int[] num = {5,2,1,4,10,0};
		int i = 0;
		sort(num);
		while(i<num.length){
		System.out.println(num[i]);
		i++;
		}
	}
}

