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
	 * ð������
	 * �Ƚ�����������������ϴ����������ߣ���С���������ұ�
	 * ����N-1�ֺ����
	 * 
	 */
	static void sort(){
		int tmp = 0;
		
		int[] arr =  {2,5,9,8,4,5,1,7,6,3};
		int size = arr.length;
		System.out.println("---ԭʼ����---");
		System.out.println(Arrays.toString(arr) +"\n");
		
		//���ѭ��Ϊ��i��
		for(int i=0;i<size-1;i++){
			//�ڲ�ѭ��Ϊ���ֱȽϴ������Ƚϴ�������Ϊ size-1-i
			//ÿ������󣬶������������������˱������ұߵ�λ��
			for(int j=0; j<size-1;j++){
				if(arr[j]> arr[j+1]){
					tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
			
			System.out.println("---��"+i+"�����---");
			System.out.println(Arrays.toString(arr) +"\n");
		}
	}
}
