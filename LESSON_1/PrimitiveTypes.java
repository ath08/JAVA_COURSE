public class PrimitiveTypes{
	public static void main(String[] args){
		//byte > 8 bit range[-128, 127], default value 0
		byte num1 = -15;
		byte num2 = 30;

		System.out.println(num1);			//-15
		System.out.println(num2 - 1);		//29

		//short > 16 bit range[-2^15, 2^15-1], default value 0
		short shortNum1 = 705;
		short shortNum2 = -10000;

		System.out.println(shortNum1);		//705
		System.out.println(shortNum2);		//-10000

		//int > 32 bit range[-2^31, 2^31-1], default value 0
		int intNum1 = 70500000;
		int intNum2 = intNum1 + 1;

		System.out.println(intNum1);		//70500000
		System.out.println(intNum2);		//70500001

		//long > 64 bit range[-2^63, 2^63-2], default value 0
		long longNum1 = 458L;				
		long longNum2 = 5550002500L; 		

		System.out.println(longNum1);		//458
		System.out.println(longNum2);		//5550002500

		//float > 32 bit, default value 0.0
		float floatNum1 = 22.058f;
		float floatNum2 = 325.222001f;

		System.out.println(floatNum1);		//22.058
		System.out.println(floatNum2);		//325.22202


		//double > 64 bit

		double doubleNum1 = 1958999.25;
		double doubleNum2 = -449955.33;

		System.out.println(doubleNum1);		//199999858999.25
		System.out.println(doubleNum2);		//-48485549955.33


	}
}