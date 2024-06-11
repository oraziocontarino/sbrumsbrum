package org.sbrumsbrum.services;

import java.util.Arrays;

import org.sbrumsbrum.dto.InputDTO;
import org.sbrumsbrum.enums.EvenOddEnum;

public class StaticArrayService<T> {

	public void esercizio1(InputDTO<String> dto1, InputDTO<String> dto2, InputDTO<String> dto3) {

		InputDTO<?>[] array = new InputDTO<?>[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (InputDTO<?> dto : array) {
			System.out.print(dto.getValue() + " ");
		}
	}

	public void esercizio2(InputDTO<Integer> dto1, InputDTO<Integer> dto2, InputDTO<Integer> dto3) {

		InputDTO<?>[] array = new InputDTO<?>[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (InputDTO<?> dto : array) {
			if (((Number) dto.getValue()).intValue() % 2 == 0) {

				System.out.print(dto.getValue() + " ");
			}
		}
	}

	public void esercizio3(InputDTO<Integer> dto1, InputDTO<Integer> dto2, InputDTO<Integer> dto3) {

		InputDTO<?>[] array = new InputDTO<?>[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (InputDTO<?> dto : array) {
			if (((Integer) dto.getValue()).intValue() % 2 == 1) {

				System.out.print(dto.getValue() + " ");
			}
		}
	}

	public void esercizio4(InputDTO<Integer> dto1, InputDTO<Integer> dto2, InputDTO<Integer> dto3,
			EvenOddEnum evenOdd) {

		InputDTO<?>[] array = new InputDTO<?>[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (InputDTO<?> dto : array) {
			int temp = ((Integer) dto.getValue()).intValue();
			if (evenOdd == EvenOddEnum.EVEN && temp % 2 == 0) {
				System.out.println(temp + ": è un numero pari");
			} else if (evenOdd == EvenOddEnum.ODD && temp % 2 != 0) {
				System.out.println(temp + ": è un numero dispari");
			}
		}
	}

	public void esercizio5(InputDTO<Integer> dto1, InputDTO<Integer> dto2, InputDTO<Integer> dto3) {

		InputDTO<?>[] array = new InputDTO<?>[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		InputDTO<?>[] arrayEven = new InputDTO<?>[3];
		InputDTO<?>[] arrayOdd = new InputDTO<?>[3];
		int evenIndex = 0;
		int oddIndex = 0;

		for (InputDTO<?> dto : array) {
			if (((Integer) dto.getValue()).intValue() % 2 == 0) {
				arrayEven[evenIndex++] = dto;
			} else {
				arrayOdd[oddIndex++] = dto;
			}
		}
		System.out.println("Array iniziale: ");
		for (InputDTO<?> dto : array) {
			System.out.println(dto.getValue());
		}
		System.out.println("Array pari: ");
		for (int i = 0; i < evenIndex; i++) {
			System.out.println(arrayEven[i]);
		}
		System.out.println("Array dispari: ");
		for (int i = 0; i < oddIndex; i++) {
			System.out.println(arrayOdd[i]);
		}
	}

	public void esercizio6(InputDTO<Integer> dto1, InputDTO<Integer> dto2, InputDTO<Integer> dto3) {

		InputDTO<?>[] array = new InputDTO<?>[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		double sum = 0;
		for (InputDTO<?> dto : array) {
			sum += ((Integer) dto.getValue()).doubleValue();
		}
		System.out.println("La somma è: " + sum);
	}

	public void esercizio7(InputDTO<Integer> dto1, InputDTO<Integer> dto2, InputDTO<Integer> dto3) {

		InputDTO<?>[] array = new InputDTO<?>[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		double sum = 0;
		for (InputDTO<?> dto : array) {
			sum += ((Integer) dto.getValue()).doubleValue();
		}
		double average = sum / array.length;
		System.out.println("La media è: " + average);
	}

	public void esercizio8(InputDTO<Integer> dto1, InputDTO<Integer> dto2, InputDTO<Integer> dto3) {
        InputDTO<?>[] array = new InputDTO<?>[3];
        array[0] = dto1;
        array[1] = dto2;
        array[2] = dto3;

        
        double sommaDeiNumeri = 0;
        int totaleDeiPesi = 0;

        for (InputDTO<?> dto : array) {
            int valore = (int) dto.getValue();
            int peso = (valore % 2 == 0) ? 10 : 5;
            sommaDeiNumeri += valore * peso;
            totaleDeiPesi += peso;
        }
        double mediaPesata = sommaDeiNumeri / totaleDeiPesi;

        System.out.println("La media pesata è: " + mediaPesata);
    }
	
	public void esercizio9 (InputDTO<Integer> dto1, InputDTO<Integer> dto2, InputDTO<Integer> dto3) {
		InputDTO<Integer>[] array = new InputDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		InputDTO<Integer> maxDto = array[0];
        for (InputDTO<Integer> dto : array) {
            if (dto.getValue()>maxDto.getValue()) {
                maxDto = dto;
            }
        }
        System.out.println("Il valore massimo è: " + maxDto.getValue());
    }
	public void esercizio10 (InputDTO<Integer> dto1, InputDTO<Integer> dto2, InputDTO<Integer> dto3) {
		InputDTO<Integer>[] array = new InputDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		InputDTO<Integer> minDto = array[0];
        for (InputDTO<Integer> dto : array) {
            if (dto.getValue()<minDto.getValue()) {
                minDto = dto;
            }
        }
        System.out.println("Il valore minimo è: " + minDto.getValue());
    }
	
	public void esercizio11 (InputDTO<Integer> dto1, InputDTO<Integer> dto2, InputDTO<Integer> dto3) {
		InputDTO<Integer>[] array = new InputDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;
		
		int small = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
		    if (array[i] < small) {
		        smallest = small;
		        smallest = array[i];
		    } else if (array[i] < smallest) {
		        smallest = array[i];
		    }
		    System.out.println("Il secondo numero più piccolo è: " + smallest);
		}
}
 
    
	
	
	


}
