package Questão01;

public class Asterisco {

	public static void main(String[] args) {
//
		for (int l = 1; l <= 10; l++) {
			for (int c = 1; c <= l; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int l = 10; l >= 1; l--) {
			for (int c = 1; c <= l; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		for (int l = 10; l >= 1; l--) {
			for (int c = 1; c <= 10 - l; c++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= l; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		for (int l = 1; l <= 10; l++) {
			for (int c = 1; c <= 10 - l; c++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= l; c++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}