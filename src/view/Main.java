package view;

import controller.QuickSort;

/**
 * @author Lucas Batista 16 de mar. de 2024
 */
public class Main {

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();

		int[] vet1 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		int[] vet2 = { 44, 43, 42, 41, 40, 39, 38 };
		int[] vet3 = { 31, 32, 33, 34, 99, 98, 97, 96 };

		System.out.print("Vetor 1 = ");
		for (int i : vet1) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.print("Vetor 2 = ");
		for (int i : vet2) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.print("Vetor 3 = ");
		for (int i : vet3) {
			System.out.print(i + " ");
		}
		System.out.println();

		vet1 = quickSort.ordenaQuickSort(vet1, 0, vet1.length - 1);
		vet2 = quickSort.ordenaQuickSort(vet2, 0, vet2.length - 1);
		vet3 = quickSort.ordenaQuickSort(vet3, 0, vet3.length - 1);

		System.out.println();

		System.out.print("Vetor 1 ordenado = ");
		for (int i : vet1) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.print("Vetor 2 ordenado = ");
		for (int i : vet2) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.print("Vetor 3 ordenado = ");
		for (int i : vet3) {
			System.out.print(i + " ");
		}

	}

}
