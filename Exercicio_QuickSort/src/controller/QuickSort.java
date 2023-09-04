package controller;

public class QuickSort {

	public QuickSort() {
		super();
	}
	
	public int [] quickSort (int[] vetor, int inicio, int fim){
		
		if (fim > inicio) {
			
			int pivoFixo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, pivoFixo - 1);
			quickSort(vetor, pivoFixo +1, fim);
		}
		return vetor;
	}
	
	private int dividir(int[]vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int ponteiroEsquerdo = inicio + 1;
		int ponteiroDireito = fim;
		
		while(ponteiroEsquerdo <= ponteiroDireito) {
			
			while(ponteiroEsquerdo <= ponteiroDireito && vetor[ponteiroEsquerdo]<= pivo) {
				ponteiroEsquerdo++;
			}
			
			while(ponteiroDireito>= ponteiroEsquerdo && vetor[ponteiroDireito]>pivo) {
				ponteiroDireito--;
			}
			
			if(ponteiroEsquerdo < ponteiroDireito ) {
				trocar(vetor, ponteiroEsquerdo, ponteiroDireito);
				ponteiroEsquerdo++;
				ponteiroDireito--;
			}
		}
		
		trocar(vetor, inicio,ponteiroDireito);
		return ponteiroDireito;
	}
	
	private void trocar(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
}
