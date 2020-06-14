package Kohonen;

import java.util.Scanner;

public class Main {
	
	public static int min(double[] a) {
		double kq =  a[0];
		int vitri = 0;
		for(int i = 1; i < a.length; i++)
			if(kq > a[i]) {
				kq = a[i];
				vitri = i;
			}
		return vitri;
	}

	public static void main(String[] args) {
		double t = 0;
		int solanhoc, lanhoc = 0;
		double alpha;
		double[][] w = new double[][] {
			{19, 111, 21.5},
			{6.5, 88, 90.5},
			{8.5, 18, 65},
			{7.5, 16, 70}
		};
		
		double[][] x = new double[][] {
			{16, 124, 19},
			{6, 13, 70}, 
			{10, 22, 59},
			{5, 81, 92},
			{21, 97, 23},
			{7, 94, 88}
		};
		
		@SuppressWarnings("resource")
		Scanner n = new Scanner(System.in);
		
		System.out.print("Nhập số lần học: ");
		solanhoc = n.nextInt();
		System.out.print("Nhập alpha: ");
		alpha = n.nextDouble();
		
		int giamAlpha = 0;
		do {
			lanhoc++;
			if(giamAlpha % 2 == 0 && giamAlpha != 0) alpha = alpha / 2;
			System.out.println("Lần học thứ " + lanhoc + " Alpha = " + alpha);
			solanhoc--;
			double[] chienthang = new double[4];
			for(int item = 0; item < x.length; item++) {
				for(int i = 0; i < w.length; i++) {
					double ketqua = 0;
					for(int j = 0; j < w[i].length; j++) {
						ketqua += Math.pow(x[item][j] - w[i][j], 2); 
					}
					ketqua = Math.sqrt(ketqua);
					chienthang[i] = ketqua;
				}
				int noronchienthang = min(chienthang);
				System.out.println("Noron chiến thắng là: " + (noronchienthang + 1));
				for(int j = 0; j < w[noronchienthang].length; j++){
					w[noronchienthang][j] = w[noronchienthang][j] + (alpha * (x[item][j] - w[noronchienthang][j]));
				}
			}
			System.out.println("========================================================");
			for(int i = 0; i < w.length; i++) {
				for(int j = 0; j < w[i].length; j++) {
					System.out.print(w[i][j] + " ");
				}
				System.out.println();
			}
		System.out.println("========================================================");
		giamAlpha++;
		}while(solanhoc > 0);
		
	}	
}
