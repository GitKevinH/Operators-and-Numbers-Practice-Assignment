
public class OperatorsNumbers {
	public static void main(String[] args) {
		
	}
	
	

	public static void question1() {
		/*
		 * Write the following integers in binary notation. Do not use any Java
		 * functions or online conversion applications to calculate the answer, as this
		 * will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods. 1 8 33 78 787 33,987
		 */

		// To convert an integer into binary, you divide the number by two until the
		// quotient reaches zero while keeping track of the remainders.
		// The remainders (in reverse) is the sequence of the binary.

		/*
		 * The decimal of 1 is 1 in binary notation. The decimal of 8 is 1000 in binary
		 * notation. The decimal of 33 is 100001 in binary notation. The decimal of 78
		 * is 1001110 in binary notation. The decimal of 787 is 1100010011 in binary
		 * notation. The decimal of 33,987 is 1000010011000011 in binary notation.
		 *
		 */

	}

	public static void question2() {
		/*
		 * Convert the following binary numbers to decimal notation. Do not use any Java
		 * functions or online conversion applications to calculate the answer, as this
		 * will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods.
		 *
		 * 0010 1001 0011 0100 0111 0010 0010 0001 1111 0010 1100 0110 0111
		 *
		 * To convert binary into decimal notation you take note of the length of the
		 * binary number and use the formula d = d*2^(index of d), where d is the binary
		 * number (1 or 0) found in each of the bit locations, and the index of d is
		 * where it can be found in the bit index. Sum all of the answers for each bit
		 * location and you'll get the decimal.
		 *
		 * For example for 0010 = 0*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 0 + 0 + 2 + 0 = 2
		 *
		 * Binary number: 0010 = 2 Binary number: 1001 = 9 Binary number: 00110100 = 52
		 * Binary number: 01110010 = 114 Binary number: 00100001111 = 271 Binary number:
		 * 0010110001100111 = 11367
		 *
		 */

	}

	public static void question3() {
		/*
		 * Write a program that declares an integer a variable x and assigns the value 2
		 * to it and prints out the binary string version of the number (
		 * Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift
		 * by 1 and assign the result to x. Before printing the results, write a comment
		 * with the predicted decimal value and binary string. Now, print out x in
		 * decimal form and in binary notation.
		 *
		 * Do the preceding exercise with the following values:
		 *
		 * 9 17 88
		 */

		int x = 2;
		System.out.println(Integer.toBinaryString(x));

		x <<= 1;
		System.out.println(Integer.toBinaryString(x)); // makes it from 0010 to 0100, hence the "shift" to the left

		System.out.println(x); // if 0010 went to 0100 then the decimal would be 8.

		int y = 9;
		System.out.println(Integer.toBinaryString(y));

		y <<= 1;
		System.out.println(Integer.toBinaryString(y)); // makes it from 1001 to 10010, hence the "shift" to the left

		System.out.println(y); // if 0010 went to 0100 then the decimal would be 08.

		int z = 17;
		System.out.println(Integer.toBinaryString(z));

		z <<= 1;
		System.out.println(Integer.toBinaryString(z)); // makes it from 10001 to 100010, hence the "shift" to the left

		System.out.println(z); // if 10001 went to 100010 then the decimal would be 34.

		int e = 88;
		System.out.println(Integer.toBinaryString(e));

		e <<= 1;
		System.out.println(Integer.toBinaryString(e)); // makes it from 1011000 to 10110000, hence the "shift" to the left

		System.out.println(e); // if 1011000 went to 10110000 then the decimal would be 176.
	}

	public static void question4() {
		/*
		 * Write a program that declares a variable x and assigns 150 to it, and prints
		 * out the binary string version of the number. Now use the right shift operator
		 * (>>) to shift by 2 and assign the result to x. Write a comment indicating
		 * what you anticipate the decimal and binary values to be. Now print the value
		 * of x and the binary string.
		 *
		 * Do the preceding exercise with the following values:
		 *
		 * 225
		 * 1555
		 * 32456
		 *
		 */

		/*int x = 150;
		System.out.println(Integer.toBinaryString(x));

		x >>= 2;
		System.out.println(Integer.toBinaryString(x)); // makes it from 10010110 to 100101

		System.out.println(x); // if it is 100101 then the decimal is 37
		*/
		int z = 225;
		System.out.println(Integer.toBinaryString(z));

		z >>= 2;
		System.out.println(Integer.toBinaryString(z)); // makes it from 1100001 to 11000

		System.out.println(z); // if it is 111000 then the decimal is 56

		int y = 1555;
		System.out.println(Integer.toBinaryString(y));

		y >>= 2;
		System.out.println(Integer.toBinaryString(y)); // makes it from 1100010011 to 110000100

		System.out.println(y); // if it is 110000100 then the decimal is 388

		int e = 32456;
		System.out.println(Integer.toBinaryString(e));

		e >>= 2;
		System.out.println(Integer.toBinaryString(e)); // makes it from 111111011001000 to 1111110110010

		System.out.println(e); // if it is 1111110110010 then the decimal is 8114



	}

	public static void question5() {
		/*
		 * Write a program that declares three int variables x, y, and z. Assign 7 to x
		 * and 17 to y. Write a comment that indicates what you predict will be the
		 * result of the bitwise & operation on x and y. Now use the bitwise & operator
		 * to derive the decimal and binary values and assign the result to z. Now, with
		 * the preceding values, use the bitwise | operator to calculate the “or” value
		 * between x and y. As before, write a comment that indicates what you predict
		 * the values to be before printing them out.
		 */

		int x,y,z;
		 x = 7;
		 y = 17;
		 // I
		 z = x & y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));

		 z = x | y;
		System.out.println(z);

		System.out.println(Integer.toBinaryString(z));




	}

	public static void question6() {
		// Write a program that declares an integer variable, assigns a number, and uses
		// a postfix increment operator to increase the value.
		// Print the value before and after the increment operator.

		int x = 12;
		System.out.println("This is the value of x before x++: "+x);
		x++;
		System.out.println("This is the value of x after x++: "+x);


	}

	public static void question7() {
		// Write a program that demonstrates at least 3 ways to increment a variable by
		// 1 and does this multiple times.
		// Assign a value to an integer variable, print it, increment by 1, print it
		// again, increment by 1, and then print it again.


		int example1 = 12;
		for (int i = 0; i < 3; i++)
		{
			System.out.println(example1);
			example1++;
		}
		
		
		int example2 = 1;
		while (example2 != 4){
			System.out.println(example2);
			example2++;
		}
		
		int example3 = 7;
		
		do{
			System.out.println(example3);
			example3++;
			} while (example3 < 10);
		
	}

	public static void question8() {
		/*
		 * Write a program that declares 2 integer variables, x, and y, and then assigns
		 * 5 to x and 8 to y. Create another variable sum and assign the value of ++x
		 * added to y, and print the result. Notice the value of the sum (should be 14).
		 * Now change the increment operator to postfix (x++) and re-run the program.
		 * Notice what the value of the sum is. The first configuration incremented x
		 * and then calculated the sum, while the second configuration calculated the
		 * sum and then incremented x.
		 */
		
		int x = 5;
		int y = 8;
		
		int sum = x++ + y;
		System.out.println(sum);
		
		
		
		

	}


	
}
