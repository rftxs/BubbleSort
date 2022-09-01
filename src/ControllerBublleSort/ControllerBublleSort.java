package ControllerBublleSort;

public class ControllerBublleSort {
	
	public ControllerBublleSort () {
		super();
				
			
		}
		
	public void bubbleSort (int[] vetor) {
		
		
	for (int i = 0; i<vetor.length; i++) {
		for (int j = 0; j < (vetor.length - 1); j++) {
			if (vetor [j] > vetor[j + 1]) {
				int aux;
				aux = vetor [j];
				vetor [j] = vetor[j+1];
				vetor [j + 1] = aux;
									
			}
			
		}
				
		
		
	}
	
			
	
	}

}
