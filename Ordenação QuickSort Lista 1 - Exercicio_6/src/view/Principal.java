package view;

import controller.QuickSort;
import packageOfOrdering.BubbleSort;
import packageOfOrdering.MergeSort;

public class Principal {

	public static void main(String[] args) {
		//Imports
		BubbleSort bubble = new BubbleSort();
		MergeSort merge = new MergeSort();
		QuickSort quick = new QuickSort();
		
		//Vetores
		int[] vetor_1 = new int[1500];
		int[] vetor_2 = new int[1500];
		int[] vetor_3 = new int[1500];
		
		int index = 0;
		for(int ctd = 1499; ctd >= 0; ctd--) {//Preenchendo Vetore {1499, 1498 ... 0}
			vetor_1[index] = ctd;
			vetor_2[index] = ctd;
			vetor_3[index] = ctd;
			
			index++;
		}

		long tempInicial_1 = System.nanoTime();
		bubble.bubbleSort(vetor_1);
		long tempFinal_1 = System.nanoTime();
		long tempTotal_Bubble = tempFinal_1 - tempInicial_1;
		
		long tempInicial_2 = System.nanoTime();
		merge.mergeSort(vetor_2, 0, vetor_2.length-1);
		long tempFinal_2 = System.nanoTime();
		long tempTotal_Merge = tempFinal_2 - tempInicial_2;
		
		long tempInicial_3 = System.nanoTime();
		quick.quickSort(vetor_3, 0, vetor_3.length -1);
		long tempFinal_3 = System.nanoTime();
		long tempTotal_Quick = tempFinal_3 - tempInicial_3;
		
		System.out.println("O Tempo Gasto utilizando o BubbleSort foi de: "+ tempTotal_Bubble);
		System.out.println("O Tempo Gasto utilizando o MergeSort foi de: "+ tempTotal_Merge);
		System.out.println("O Tempo Gasto utilizando o QuickSort foi de: "+ tempTotal_Quick);
	}

}
