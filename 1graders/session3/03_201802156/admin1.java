package admin;

public class admin1 {
/* ���� �� ���� ���� �ٷ� ���� ���� �Ǵ� ���� */
	
	 public static void main(String args[]) {
	   int a = 0, b = 1, c = 0;
	  for (int i = 0; i < 10; i++) { // 10�� �ݺ�
	     a = b;
	     b = c;
      c = a + b;
	      System.out.print(" " + c);
	    }
    }
}