package javaStudy;

public class forEachExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iarr = {10, 20, 30, 40, 50};
		
		for(int i = 0; i<iarr.length; i++) {
			int value = iarr[i];
			System.out.println(value);
		} //end of for
		
		for(int value:iarr) {
			System.out.println(value);
		} //end of for each
	} //end of main

} //end of class
