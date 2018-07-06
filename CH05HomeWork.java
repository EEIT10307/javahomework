package ch05;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class CH05HomeWork {

	public static void main(String[] args) {

		// ---------------------CH05 作業一------------------------------------+
		//
		// double avg = 0 ;
		// double [] ar = {84.0 , 94 , 79.9 , 90.5 , 82.4 , 65.7 , 72.8 , 99.0 , 85.2 ,
		// 100} ;
		// for (double n : ar) {
		// avg += n ;
		// }
		// avg = avg / ar.length ;
		// System.out.println("此陣列平均為"+avg);
		// for (double n : ar ) {
		// if (n > avg) {
		// System.out.println("大於平均數"+avg+"的陣列元素為"+n);
		// }
		//
		// }
		//
		// ---------------------CH05 作業二------------------------------------+
		// int x;
		// int q;
		// int sum = 0;
		// int[] ran = new int[6];
		//
		// for (int y = 0; y <= (ran.length - 1); y++) {
		// int t = 0;
		// q = ((int) (Math.random() * 42) + 1);
		//
		// for (int r = 0; r <= (ran.length - 1); r++) {
		// if (ran[r] == q) {
		// t++;
		// }
		// }
		// if (t == 0) {
		// ran[y] = q;
		// } else {
		// y--;
		// System.out.println("重複被挑出來的數字" + q);
		// }
		//
		//
		// }
		//
		// for (x = 0; x < ran.length; x++) {
		// sum += ran[x];
		// System.out.println("陣列ran["+x+"]為"+ran[x]);
		//
		// }
		//
		// System.out.println("陣列加總"+sum);
		// ---------------------CH05 作業三------------------------------------+

//		int yea[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		int sum = 0;
//		int ye = 0;
//		int mo = 0;
//		int da = 0;
//		int p = 0;
//		String s;
//
//		for (int x = 0; x <= 0; x++) {
//
//			Scanner scan = new Scanner(System.in);
//
//			System.out.println("請輸入年");
//
//			if (scan.hasNextInt()) {
//				ye = scan.nextInt();
//			} else {
//				System.out.println("輸入錯誤請重新輸入");
//				x--;
//			}
//
//			if (ye <= 0) {
//				System.out.println("輸入錯誤請重新輸入");
//				x--;
//				;
//			}
//
//		}
//		for (int y = 0; y <= 0; y++) {
//
//			Scanner scan = new Scanner(System.in);
//
//			System.out.println("請輸入月");
//
//			if (scan.hasNextInt()) {
//				mo = scan.nextInt();
//			} else {
//				System.out.println("輸入錯誤請重新輸入");
//				y--;
//				continue ; 
//			}
//
//			if (mo <= 0 || mo > 12) {
//				System.out.println("輸入錯誤請重新輸入");
//				y--;
//			}
//
//		}
//		for (int z = 0; z <= 0; z++) {
//
//			Scanner scan = new Scanner(System.in);
//
//			System.out.println("請輸入日");
//
//			if (scan.hasNextInt()) {
//				da = scan.nextInt();
//			} else {
//				System.out.println("輸入錯誤請重新輸入");
//				z--;
//				continue ; 
//			}
//
//			if (da <= 0 | da > yea[mo - 1]) {
//				System.out.println("輸入錯誤請重新輸入");
//				z--;
//
//			}
//
//		}
//
//		GregorianCalendar gc = new GregorianCalendar();
//		if (gc.isLeapYear(ye)) {
//			yea[1] = 29;
//			s = "當年為閏年";
//		} else {
//			s = "";
//		}
//		;
//
//		for (p = 0; p < mo - 1; p++) {
//			sum += yea[p];
//		}
//		sum += da;
//
//		System.out.println(ye + "年" + mo + "月" + da + "日為當年第" + sum + "天" + s);
		
		// ---------------------CH05 作業四------------------------------------+
		
//		String[] ca = { "snoopy", "micky", "lucky", "kitty", "derby" };
//		String Str = "";
//		int a = 0;
//
//		for (int x = 0; x < ca.length; x++) {
//			Str += ca[x];
//		}
//
//		for (int y = 0; y < Str.length(); y++) {
//			if (Str.charAt(y) == 'a' | Str.charAt(y) == 'e' | Str.charAt(y) == 'i' | Str.charAt(y) == 'o'
//					| Str.charAt(y) == 'u') {
//				a++;
//				System.out.println("母音" + Str.charAt(y));
//			}
//
//		}
//
//		System.out.println("此陣列內母音字母有" + a + "個");
		
		// ---------------------CH05 作業五------------------------------------+		
	
		
//		int sum = 0 ; 
//	       int [][] test =  {
//	    	   {10,35,40,100,90,85,75,70} , 
//	    	   {37,75,77,89,64,75,70,95} , 
//	    	   {100,70,79,90,75,70,79,90} ,
//	    	   {77,95,70,89,60,75,85,89} ,
//	    	   {98,70,89,90,75,90,89,90} , 
//	    	   {90,80,100,75,50,20,99,75}
//	       }  ;
//	    
//	       int x=0 , y=0 ; 
//	      
//	       
//	       for (x=0;x < test.length; x++) {
//	    	   
//	    	for (y= 0;y < test[x].length; y++ ) {
//	    		  
//	    		 sum += test[x][y] ;   		
//	    		 
//	    	}    
//	    	   System.out.println("第"+x+" Row 的總和"+sum);
//	    	   sum = 0 ; 
//	    	   
//	       }
//	               
//	       for (x=0;x < test[0].length; x++) {
//	    	   
//	       	for (y= 0;y < test.length; y++ ) {
//	       		  
//	       		 sum += test[y][x] ;   		
//	       		 
//	       	}    
//	       	   System.out.println("第"+x+" cloum 的總和"+sum);
//	       	     sum = 0 ;    	   
//	     }
//		
//		
//		
//		
		
		
		

	}
}
