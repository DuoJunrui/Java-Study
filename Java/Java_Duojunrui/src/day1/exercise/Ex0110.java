package day1.exercise;

//ʹ����ٷ����ֱ���for��while��do��whileѭ��������1~100֮���������
public class Ex0110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j;
	    for(i = 2; i < 100; i ++)
	    {
	        for(j = 2; j < i; j ++)
	        {
	            if(i%j==0) break; //���������� �˳�ѭ����������������
	        }
	        if(j == i)//û����ǰ�˳�ѭ������������������ӡ��
	            System.out.print(i+" "); //��ӡiֵ��
	    }
	     
//	    while(i<100) {
//	    	while (j<i) {
//	    		
//	    	}
//	    }
	}

}
