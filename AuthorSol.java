import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

/*

- we can only move down or right
- goal: count the distinct sums of every path from (x1, y1) to (x2, y2)

------------------

GAZ-GIZ: 10x10

      1   2   3   4   5   6   7   8   9  10 
---------------------------------------------
 1 |  1   2   4   7  11  16  22  29  37  46 
 2 |  3   5   8  12  17  23  30  38  47  57 
 3 |  6   9  13  18  24  31  39  48  58  69 
 4 | 10  14  19  25  32  40  49  59  70  82 
 5 | 15  20  26  33  41  50  60  71  83  96 
 6 | 21  27  34  42  51  61  72  84  97 111 
 7 | 28  35  43  52  62  73  85  98 112 127 
 8 | 36  44  53  63  74  86  99 113 128 144 
 9 | 45  54  64  75  87 100 114 129 145 162 
10 | 55  65  76  88 101 115 130 146 163 181

------------------

(5, 5) to (8, 7)

ans: 7

------------------

(9, 6) to (10, 10)

ans: 5

------------------

 */

public class AuthorSol {
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			long a = fs.nextLong(), b = fs.nextLong(), c = fs.nextLong(), d = fs.nextLong();
			System.out.println((c - a) * (d - b) + 1);
		}
		out.close();
	}
	
	static final Random rnd = new Random();
	static void shuffleSort(int[] a) { //change this
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int newInd = rnd.nextInt(n);
			int temp = a[newInd]; //change this
			a[newInd] = a[i];
			a[i] = temp;
		}
		Arrays.sort(a);
	}
	
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		
		String next() {
			while (!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextInt();
			}
			return a;
		}
		
		long[] readLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextLong();
			}
			return a;
		}
		
		double[] readDoubleArray(int n) {
			double[] a = new double[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextDouble();
			}
			return a;
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
		String nextLine() {
			String str = "";
			try {
				if (st.hasMoreTokens()) {
					str = st.nextToken("\n");
				} else {
					str = br.readLine();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
