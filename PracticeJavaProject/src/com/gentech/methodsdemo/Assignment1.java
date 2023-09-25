package com.gentech.methodsdemo;

class Bytarray {
	void byarr(byte x[]) {
		for (int i = x.length / 2; i <= x.length - 1; i++) {
			System.out.println(x[i]);
		}
		System.out.println("++++++++++++++++++++++++++");
	}

	void shortarr(short s[]) {
		for (int i = 0; i < s.length / 2; i++) {
			System.out.println(s[i]);
		}
		System.out.println("+++++++++++++++++++++");
	}

	void integarr(int a[]) {
		for (int i = (a.length / 2) - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		System.out.println("++++++++++++++++++++");
	}

	void concatchar(char a[], char b[]) {
		int size = a.length + b.length;
		char x[] = new char[size];
		for (int i = 0; i < a.length; i++) {
			x[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			x[a.length + j] = b[j];
		}
		System.out.println("concatinated array : ");
		for (char s : x)
			System.out.println(s + " ");
	}

	void strarray(String st[]) {
		for (int i = st.length - 1; i >= 0; i--) {
			System.out.println(st[i]);
		}
		System.out.println("++++++++++++++++++++");
	}

	void sumelements(int q[], int sum) {
		for (int i = 0; i < q.length; i++) {
			sum = sum + q[i];
		}
		System.out.println("the given numbers of sum is :" + sum);
		System.out.println("++++++++++++++++++++");
	}

	void chararray(char c[]) {
		for (int i = 0; i < c.length; i++) {
			switch (c[i]) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				System.out.println(c[i]);
				break;
			default:
				continue;
			}
		}
		System.out.println("++++++++++++++++++++");
	}

	void LastRow(int d[][]) {
		System.out.print("Last Row : ");
		for (int i = 0; i < d[2].length; i++) {
			System.out.print(d[2][i] + " ");
		}
		System.out.println();
	}

	void sumelements(int w[][]) {
		int sum = 0;
		for (int i = 0; i < w[0].length; i++) {
			sum = sum + w[0][i];
		}
		System.out.println("sum of first row is : " + sum);
		System.out.println("+++++++++++++++++++++");
	}

	void substractionmatrix(int x[][], int y[][]) {
		int sub[][] = new int[x.length][x[0].length];
		if ((x.length == y.length) && (x[0].length == y[0].length)) {
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					sub[i][j] = x[i][j] - y[i][j];

				}
			}
			for (int i = sub.length - 1; i >= 0; i--) {
				for (int j = sub[i].length - 1; j >= 0; j--) {
					System.out.print(sub[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("++++++++++++++++++++++");
		}
	}

	void onedimensionalintarray(int e[]) {
		int square[] = new int[e.length];
		int k = 0;
		for (int i = 0; i < e.length; i++) {
			square[k] = e[i] * e[i];
			k++;
		}
		int sum = 0;
		for (int j = 0; j < square.length; j++) {
			sum = sum + square[j];
		}
		System.out.println("square of sum of each elements is : " + sum);
		System.out.println("++++++++++++++++++++++++++");
	}

	void concatallelements(String str[][]) {
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]);
			}
		}
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		byte b[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
		Bytarray o1 = new Bytarray();
		o1.byarr(b);

		short c[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		o1.shortarr(c);

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		o1.integarr(a);

		char h[] = { 's', 'v', 'a' };
		char n[] = { 'k', 'a' };
		o1.concatchar(h, n);

		String m[] = { "balaji", "karthi", "velu" };
		o1.strarray(m);

		int r[] = { 1, 2, 3, 40 };
		o1.sumelements(r, 0);

		char d[] = { 'a', 'e', 'i', 'o', 'b' };
		o1.chararray(d);

		int x[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		o1.LastRow(x);
		int p[][] = { { 2, 4, 6 }, { 3, 5, 9 }, { 2, 3, 4 } };
		o1.sumelements(p);

		int k[][] = { { 5, 6 }, { 8, 7 } };
		int l[][] = { { 1, 2 }, { 4, 5 } };
		o1.substractionmatrix(k, l);

		int s[] = { 1, 2, 3, 4 };
		o1.onedimensionalintarray(s);

		String st[][] = { { "suriya", "ravi", "logesh" }, { "priya", "jaya", "ajith" },
				{ "thulasi", "ramya", "guna" } };
		o1.concatallelements(st);
	}
}
