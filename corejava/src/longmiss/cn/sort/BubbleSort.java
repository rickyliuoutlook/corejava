package longmiss.cn.sort;

import java.util.Arrays;

/**
 * 
 * @author Ricky Liu
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort();
	}

	/**
	 * 冒泡排序
	 * 比较相零的两个数，将较大的数放在左边，较小的数放在右边
	 * 依次N-1轮后，完成
	 * 
	 */
	static void sort(){
		int tmp = 0;
		
		int[] arr =  {2,5,9,8,4,5,1,7,6,3};
		int size = arr.length;
		System.out.println("---原始序列---");
		System.out.println(Arrays.toString(arr) +"\n");
		
		//外层循环为第i轮
		for(int i=0;i<size-1;i++){
			//内层循环为本轮比较次数，比较次数次数为 size-1-i
			//每轮排序后，都将本轮最大的数排在了本轮最右边的位置
			for(int j=0; j<size-1;j++){
				if(arr[j]> arr[j+1]){
					tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
			
			System.out.println("---第"+i+"排序后---");
			System.out.println(Arrays.toString(arr) +"\n");
		}
	}
}
