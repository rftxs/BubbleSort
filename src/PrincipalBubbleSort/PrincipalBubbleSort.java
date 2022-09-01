package PrincipalBubbleSort;

import java.util.Arrays;

import ControllerBublleSort.ControllerBublleSort;

public class PrincipalBubbleSort {

	public static void main(String[] args) {
		ControllerBublleSort criarVetor = new ControllerBublleSort();
		
		int vetor [] = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		criarVetor.bubbleSort(vetor);
		System.out.println(Arrays.toString(vetor));
		

	}

}
