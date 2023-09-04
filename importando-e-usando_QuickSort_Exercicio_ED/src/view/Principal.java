package view;

/*TODO: 5. Criar um projeto Java que receba a biblioteca criada no exercício 4 e apresente os resultados
dos exercícios 1, 2 e 3.
*/
import controller.QuickSort;

public class Principal {

	public static void main(String[] args) {
		QuickSort order = new QuickSort();

		int[] vetorExercicio_1 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		int[] vetorExercicio_2 = { 44, 43, 42, 41, 40, 39, 38 };
		int[] vetorExercicio_3 = { 31, 32, 33, 34, 99, 98, 97, 96 };
		
		System.out.println("1°Vetor:");
		order.quickSort(vetorExercicio_1, 0, vetorExercicio_1.length-1);
		
		for(int v: vetorExercicio_1) {//Exibindo vetor do 1° Exercício
			System.out.print(v+" ");
		}
		System.out.println("\n2°Vetor:");
		order.quickSort(vetorExercicio_2, 0, vetorExercicio_2.length-1);
		
		for(int v: vetorExercicio_2) {//Exibindo vetor do 2° Exercício
			System.out.print(v+" ");
		}
		System.out.println("\n3°Vetor:");
		order.quickSort(vetorExercicio_3, 0, vetorExercicio_3.length-1);
		
		for(int v: vetorExercicio_3) {//Exibindo vetor do 3° Exercício
			System.out.print(v+" ");
		}
		

	}

}
