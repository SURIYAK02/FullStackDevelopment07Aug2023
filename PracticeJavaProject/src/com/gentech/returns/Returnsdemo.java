package com.gentech.returns;

public class Returnsdemo {

	public static void main(String[] args) {
		

				Demo1 d= new Demo1();
				System.out.println("Logical AND operator result: ");
				System.out.println(d.AndOp(false, true));
				System.out.println("++++++++++++++++++");
				int a[] = {4, 5, 6, 7, 8,3, 9};
				System.out.println("No. of elements in given array: ");
				System.out.println(d.elements(a));
				System.out.println("++++++++++++++++++");
				System.out.println("Average of 2 no.s: ");
				System.out.println(d.avg(15, 20));
				System.out.println("++++++++++++++++++");
				System.out.println("sum of first 10 no.s: ");
				System.out.println(d.sum());
				System.out.println("++++++++++++++++++");
				System.out.println("factorial of a given no. :");
				System.out.println(d.fact(6));
				System.out.println("++++++++++++++++++");
				System.out.println("count: ");
				System.out.println(d.divby10(1, 100));
				System.out.println("++++++++++++++++++");
				System.out.println("first half of the elements are: ");
				byte b[] = {1, 2, 3, 4};
				d.firsthalf(b);
				System.out.println("++++++++++++++++++");
				short c[] = {10, 20, 30, 40};
				System.out.println("sum of all elements: ");
				System.out.println(d.sum1(c));
				System.out.println("++++++++++++++++++");
				System.out.println("largest no. is: ");
				System.out.println(d.largest(344, 144));
				System.out.println("++++++++++++++++++");
				System.out.println("smallest no. is: ");
				System.out.println(d.smallest(19, 55, 85));
				System.out.println("++++++++++++++++++");
				System.out.println("given inputs are alphabets or not: ");
				System.out.println(d.isAlphabet('b'));
				System.out.println(d.isAlphabet('2'));
				System.out.println("++++++++++++++++++");
				String e[][] = {{"a", "e", "i"},{"i", "u", "o"},{"o", "a", "e"}};
				System.out.println("transpose: ");
				d.transpose(e);
				System.out.println("++++++++++++++++++");
				int f[] = {6, 5, 4, 3, 2, 1};
				System.out.println("square of all values: ");
				d.square(f);
				System.out.println("++++++++++++++++++");
				System.out.println("numbers divisible by 6 are: ");
				d.Div6();
				
			}
		}

		class Demo1 {
			//returns the result of logical operator AND
			boolean AndOp(boolean x, boolean y) {
				return x && y;
			}

			//returns no. of elements in a given 1D array
			int elements(int x[]) {
				return x.length;
			}

			//returns average of 2 no.s
			int avg(int x, int y) {
				return (x + y) / 2;
			}

			//returns sum of 1st 10 no.s
			int sum() {
				int s = 0;
				for (int i = 1; i <= 10; i++) {
					s = s + i;
				}
				return s;
			}

			//returns factorial of given no    
			int fact(int z) {
				int f = 1;
				for (int i = 1; i <= z; i++) {
					f = f * i;
				}
				return f;
			}

			//returns factorial of given num div by 10
			int divby10(int start, int end) {
				int count = 0;
				if (start > end) {
					int temp = start;
					start = end;
					end = temp;
				}
				for (int i = start; i <= end; i++) {
					if (i % 10 == 0) {
						count++;
					}
				}
				return count;
			}

			//returns first half of element from 1D byte array

			byte[] firsthalf(byte x[]) {
				for (int i = 0; i < x.length / 2; i++) {
					System.out.print(x[i] + " ");
				}
				System.out.println();
				return x;
			}

			//returns sum of all elements from 1D short array

			short sum1(short x[]) {
				short sum = 0;
				for (short ele : x) {
					sum += ele;
				}
				return sum;
			}
			//returns largest no. from given 2 no.s

			int largest(int x, int y) {
				if (x > y)
					return x;
				else
					return y;
			}

			//returns smallest no. from given 3 no.s

			int smallest(int x, int y, int z) {
				if ((x < y) && (x < z)) {
					return x;
				} else if ((y < x) && (y < z)) {
					return y;
				} else {
					return z;
				}
			}

			//returns the given input is alphabet or not

			boolean isAlphabet(char c) {
				return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
			}

			//returns transpose of a given 2D 3x3 string array

			String[][] transpose(String x[][]) {
				for (int i = 0; i < x.length; i++) {
					for (int j = 0; j < x[i].length; j++) {
						System.out.print(x[j][i] + " ");
					}
					System.out.println();
				}
				return x;
			}

			//returns square of each elements from 1D integer array

			int square(int x[]) {
				int result = 0;
				for (int i = 0; i < x.length; i++) {
					result = x[i] * x[i];
					
				}
				System.out.println();
				return result;
			}

			//returns no. between 1 to 100 divisible by 6

			int Div6() {
				int i;
				for (i = 1; i <= 100; i++) {
					if (i % 6 == 0) {
											
					}
				}
				return i;
				
			}
		}
		

