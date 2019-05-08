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
	 * ��һ�������У�ȡ������λΪ��׼��
	 * ͨ�������ƶ�����ͷ���׼���Ƚϣ�ʹ��������бȻ�׼��С���Ҳ����бȻ�׼����
	 */
	public static int getMiddle(int[] arry,int low ,int high){
		
		int temp=arry[low];//�ڿ�
		while(low < high){
			
			//��β����ʼ��ǰ�ұȻ�׼��С��
			while( arry[high]>temp && low< high){
				high--;
			}
			//������
			arry[low]=arry[high];
			System.out.println("--"+Arrays.toString(arry));
			
			//��ͷ����ʼ��ǰ�ұȻ�׼�����
			while( arry[low]<temp && low< high){
				low++;
			}
			//���Ҳ��
			arry[high]=arry[low];
			System.out.println("++"+Arrays.toString(arry));
			
		}
		
		
		arry[low]=temp;//���ջ�ʣ���Ŀ�Ϊ�����¼
		return low;//������λ��
	}

	/**
	 *����
	 */
	public static void quickSort(int[] arry,int low,int high){
		if(low<high){
			int middle = getMiddle( arry,low,high);
			quickSort(arry,low, middle-1);
			quickSort(arry, middle+1, high);
			
		}
	}
}
