package longmiss.cn.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int arry[] = {2,5,8,3,6,9,1,4,7,0};
		
		if(arry.length>0){
			System.out.println(Arrays.toString(arry));
			quickSort(arry,0,arry.length -1);
			System.out.println(Arrays.toString(arry));
		}
	}
	
	/**
	 * 第一轮排序列，取序列首位为基准数
	 * 通过相向移动、两头与基准数比较，使得左侧序列比基准数小，右侧序列比基准数大
	 */
	public static int getMiddle(int[] arry,int low ,int high){
		
		int temp=arry[low];//挖坑
		while(low < high){
			
			//从尾部开始向前找比基准数小的
			while( arry[high]>temp && low< high){
				high--;
			}
			//填左侧坑
			arry[low]=arry[high];
			System.out.println("--"+Arrays.toString(arry));
			
			//从头部开始向前找比基准数大的
			while( arry[low]<temp && low< high){
				low++;
			}
			//填右侧坑
			arry[high]=arry[low];
			System.out.println("++"+Arrays.toString(arry));
			
		}
		
		
		arry[low]=temp;//最终还剩左侧的坑为中轴记录
		return low;//返回中位置
	}

	/**
	 *分治
	 */
	public static void quickSort(int[] arry,int low,int high){
		if(low<high){
			int middle = getMiddle( arry,low,high);
			quickSort(arry,low, middle-1);
			quickSort(arry, middle+1, high);
			
		}
	}
}
