package ch04;

public class Ch04HomeWork {


	public static void main(String[] args) {
//
//--------CH04 �@�~1------------------------------------------		
//		int x;
//		int sum = 0;
//
//		for (x = 0; x < 10; x++) {
//			sum += ((int) (Math.random() * 99) + 1);
//
//		}
//		System.out.println(sum);
//		
//--------CH04 �@�~2------------------------------------------		
//		
//		int x = 0  ;  
//		int sum = 0 ; 
//		
//		for (x = 1 ;x<=1000;x++) {
//			if (x % 2 ==0) {
//				sum += x ;  
//			}
//			
//		}System.out.println(sum);
//		
//--------CH04 �@�~3------------------------------------------			
//		int x = 1  ;
//		int sum = 1  ; 
//		
//		for (x=1 ; x<=10  ; x++) {
//			sum *= x ; 
//		} System.out.println(sum);
//		
//--------CH04 �@�~3A------------------------------------------		
//		int x = 1 ; 
//		int sum = 1 ; 
//		
//		while (x<=10) {
//			sum *= x ; 
//			x++ ; 
//		} System.out.println(sum);
//--------CH04 �@�~4------------------------------------------		
		
//		int x = 1 ;  
//		int sum = 0 ; 
//		for(x=1;x<=19;x++){
//			
//			if(x % 2 == 1 ) {
//				sum += x ; 
//				System.out.print(sum + "   ");
//			}   
//			
//			
//		}
//		
//--------CH04 �@�~5------------------------------------------		
//		
//		int x = 0  ; 
//		int y = 1   ;   
//		for (x =0; x < 10 ; x++ ) {
//
//			for (y=1;y <= 10-x; y++) {
//				System.out.print(y+ " ");
//				if (y == 10-x) {
//					System.out.println();
//				}
//			} 
//			
//			
//		}
//	
//--------CH04 �@�~5------------------------------------------		
//		
//		int x  , y  ; 
//		
//		for (x = 0 ;x<10; x++) {
//			
//			for ( y = 1 ; y <= 10; y ++ ) {
//								
//				System.out.print((y+x*y)<=9?"  "+ (y+x*y) :(( (y+x*y)%10==0 & y==10) ? ((y+x*y)==100?" " :"  " ):" ")+ (y+x*y) );	
//				    if (y == 10) {
//					System.out.println();
//				} 
//					
//			} 
//				
//		} 
//--------CH04 �@�~6------------------------------------------		
//		String str = "Hello, World, �j�a�n" ; 
//		int x ; 	
//		
//		for (x=0 ; x<str.length(); x++ ) {
//			
//			System.out.println(str.charAt(x) + " "+ (int)str.charAt(x));
//			
//		}
		
//--------CH04 �@�~1(�B�~�է@) �H������1~10�����ƪ�5�Ӷüƥ[�`------------------------------------------		
				
		int x;
		int q;
	
		int[] ran = new int[5];

		for (int y = 0; y <= (ran.length - 1); y++) {
			int t = 0;
			q = ((int) (Math.random() * 9) + 1);

			for (int r = 0; r <= (ran.length - 1); r++) {
				if (ran[r] == q) {
					t++;
				} 

			}

			if (t == 0) {
				ran[y] = q;
				
			} else {
				y--;
			
				System.out.println("���ƳQ�D�X�Ӫ��Ʀr" + q);
			}

		}
		
		for (x = 0; x < 5; x++) {
			
			System.out.println("�}�Cran["+x+"]��"+ran[x]);

		}


	
      }
		
}


