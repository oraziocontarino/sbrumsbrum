package org.sbrumsbrum.services;

import java.util.ArrayList;
import java.util.List;
import org.sbrumsbrum.dto.IntegerDTO;
import org.sbrumsbrum.enums.EvenOddEnum;

public class DynamicArrayService {

	public void Esercizio1Array(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		for (IntegerDTO dto : list) {

			System.out.print(dto.getValue() + " ");

		}
	}

	public void Esercizio2Array(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		for (IntegerDTO dto : list) {
			if (dto.getValue() % 2 == 0) {
				System.out.print(dto.getValue() + " ");
			}
		}

	}

	public void Esercizio3Array(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		for (IntegerDTO dto : list) {
			if (dto.getValue() % 2 == 1) {
				System.out.print(dto.getValue() + " ");
			}

		}
	}

	public void Esercizio4Array(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, EvenOddEnum evenOdd) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		for (IntegerDTO dto : list) {
			int temp = dto.getValue();
			if (evenOdd == EvenOddEnum.EVEN && temp % 2 == 0) {
				System.out.println(temp + ": è un numero pari");
			} else if (evenOdd == EvenOddEnum.ODD && temp % 2 != 0) {
				System.out.println(temp + ": è un numero dispari");
			}
		}
	}

	public void Esercizio5Array(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		List<IntegerDTO> evenList = new ArrayList<>();
		List<IntegerDTO> oddList = new ArrayList<>();

		for (IntegerDTO dto : list) {
			if (dto.getValue() % 2 == 0) {
				evenList.add(dto);
			} else {
				oddList.add(dto);
			}
		}
		System.out.println("Array iniziale: ");
		for (IntegerDTO dto : list) {
			System.out.println(dto.getValue());
		}
		System.out.println("Array pari: ");
		for (IntegerDTO dto : evenList) {
			System.out.println(dto.getValue());
		}
		System.out.println("Array dispari: ");
		for (IntegerDTO dto : oddList) {
			System.out.println(dto.getValue());
		}
	}

	public void Esercizio6ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		double sum = 0;
		for (IntegerDTO dto : list) {
			sum = sum + dto.getValue();
		}
		System.out.println("La somma è: " + sum);
	}

	public void Esercizio7ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		double sum = 0;
		for (IntegerDTO dto : list) {
			sum = sum + dto.getValue();
		}
		double avg = sum / list.size();
		System.out.println("La media è: " + avg);
	}

	public void Esercizio8ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		double sommaDeiNumeri = 0;
		int totaleDeiPesi = 0;

		for (IntegerDTO dto : list) {
			int valore = (int) dto.getValue();
			int peso = (valore % 2 == 0) ? 10 : 5;
			sommaDeiNumeri += valore * peso;
			totaleDeiPesi += peso;
		}
		double mediaPesata = sommaDeiNumeri / totaleDeiPesi;

		System.out.println("La media pesata è: " + mediaPesata);
	}

	public void Esercizio9ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		Integer maxDto = (Integer) list.get(0).getValue();
		for (IntegerDTO dto : list) {
			if ((int) dto.getValue() > maxDto) {
				maxDto = (Integer) dto.getValue();
			}
		}
		System.out.println("Il valore massimo è: " + maxDto);
	}

	public void Esercizio10ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		int firstMax = Integer.MAX_VALUE;
		int secondMax = Integer.MAX_VALUE;

		for (IntegerDTO dto : list) {
			int value = (int) dto.getValue();
			if (value < firstMax) {
				secondMax = firstMax;
				firstMax = value;
			} else if (value < secondMax && value != firstMax) {
				secondMax = value;
			}
		}

		System.out.println("Secondo massimo è: " + secondMax);
	}

	public void Esercizio11ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		Integer minDto = (Integer) list.get(0).getValue();
		for (IntegerDTO dto : list) {
			if ((int) dto.getValue() < minDto) {
				minDto = (Integer) dto.getValue();
			}
		}
		System.out.println("Il valore minimo è: " + minDto);
	}

	public void Esercizio12ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for (IntegerDTO dto : list) {
			int value = (int) dto.getValue();
			if (value < firstMin) {
				secondMin = firstMin;
				firstMin = value;
			} else if (value < secondMin && value != firstMin) {
				secondMin = value;
			}
		}

		System.out.println("Secondo minimo è: " + secondMin);
	}

	public void Esercizio13ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, int numberToControl) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		int count = 0;
		for (IntegerDTO dto : list) {
			if (dto.getValue() == numberToControl) {
				count++;
			}
		}
		System.out.println("Il numero da controllare da te inserito è: " + numberToControl + " risulta " + count
				+ " volte all'interno dell'array.");

	}

	public void Esercizio14ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		List<IntegerDTO> listInverted = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			listInverted.add(list.get(i));
		}
		System.out.println("Lista originale: ");
		for (IntegerDTO dto : list) {
			System.out.print(dto.getValue() + " ");
		}
		System.out.println();
		System.out.println("Lista invertita: ");
		for (IntegerDTO dto : listInverted) {
			System.out.print(dto.getValue() + " ");
		}
	}

	public void Esercizio15ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		List<IntegerDTO> evenList = new ArrayList<>();
		List<IntegerDTO> oddList = new ArrayList<>();

		for (IntegerDTO dto : list) {
			if (dto.getValue() % 2 == 0) {
				evenList.add(dto);
			} else {
				oddList.add(dto);
			}
		}
		System.out.print("Lista pari: ");
		for (IntegerDTO dto : evenList) {
			System.out.print(dto.getValue() + " ");
		}
		System.out.println();

		System.out.print("Lista dispari: ");
		for (IntegerDTO dto : oddList) {
			System.out.print(dto.getValue() + " ");
		}
		System.out.println();

		List<IntegerDTO> unisciArray = new ArrayList<>();
		unisciArray.addAll(evenList);
		unisciArray.addAll(oddList);

		System.out.print("Lista unita: ");
		for (IntegerDTO dto : unisciArray) {
			System.out.print(dto.getValue() + " ");
		}
	}

	public void Esercizio16ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, IntegerDTO dto4,
			IntegerDTO dto5, IntegerDTO dto6) {
		List<IntegerDTO> list1 = new ArrayList<>();
		list1.add(dto1);
		list1.add(dto2);
		list1.add(dto3);

		List<IntegerDTO> list2 = new ArrayList<>();
		list2.add(dto4);
		list2.add(dto5);
		list2.add(dto6);

		List<IntegerDTO> commonElements = new ArrayList<>();

		for (IntegerDTO element1 : list1) {
			for (IntegerDTO element2 : list2) {
				if (element1.getValue() == element2.getValue()) {
					commonElements.add(element1);
				}
			}
		}

		System.out.print("Numeri in comune: ");
		for (IntegerDTO element : commonElements) {
			System.out.print(element + " ");
		}
	}

	public void Esercizio17ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, IntegerDTO dto4,
			IntegerDTO dto5, IntegerDTO dto6) {
		List<IntegerDTO> list1 = new ArrayList<>();
		list1.add(dto1);
		list1.add(dto2);
		list1.add(dto3);

		List<IntegerDTO> list2 = new ArrayList<>();
		list2.add(dto4);
		list2.add(dto5);
		list2.add(dto6);

		List<IntegerDTO> notCommonElements = new ArrayList<>();

		for (int i = 0; i < list1.size(); i++) {
			int count = 0;
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i).getValue() == list2.get(j).getValue()) {
					count++;
				}
			}
			if (count == 0) {
				notCommonElements.add(list1.get(i));
			}
		}

		for (int i = 0; i < list2.size(); i++) {
			int count = 0;
			for (int j = 0; j < list1.size(); j++) {
				if (list2.get(i).getValue() == list1.get(j).getValue()) {
					count++;
				}
			}
			if (count == 0) {
				notCommonElements.add(list2.get(i));
			}
		}

		System.out.print("Elementi non comuni: ");
		for (IntegerDTO element : notCommonElements) {
			System.out.print(element.getValue() + " ");
		}
	}

	public void Esercizio18ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, IntegerDTO dto4,
			IntegerDTO dto5, IntegerDTO dto6) {
		List<IntegerDTO> list1 = new ArrayList<>();
		list1.add(dto1);
		list1.add(dto2);
		list1.add(dto3);

		List<IntegerDTO> list2 = new ArrayList<>();
		list2.add(dto4);
		list2.add(dto5);
		list2.add(dto6);

		List<Integer> sumList = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			sumList.add(list1.get(i).getValue() + list2.get(i).getValue());
		}

		System.out.print("Somma della lista: ");
		for (int value : sumList) {
			System.out.print(value + " ");
		}
	}

	public void Esercizio19ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, IntegerDTO dto4,
			IntegerDTO dto5) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j).getValue() > list.get(j + 1).getValue()) {
					IntegerDTO temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		System.out.print("Array con bubble sort: ");
		for (IntegerDTO dto : list) {
			System.out.print(dto.getValue() + " ");
		}
	}

	public void Esercizio20ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, IntegerDTO dto4,
			IntegerDTO dto5) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j).getValue() > list.get(j + 1).getValue()) {
					IntegerDTO temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		System.out.println();
		System.out.println("ArrayList di input: ");
		for (IntegerDTO dto : list) {
			System.out.print(dto.getValue() + " ");
		}
		System.out.println();
		System.out.println("ArrayList ordinato con bubble sort: ");
		for (IntegerDTO dto : list) {
			System.out.print(dto.getValue() + " ");
		}
	}

	public void Esercizio21ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, IntegerDTO dto4) {
		List<List<IntegerDTO>> matrix = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			List<IntegerDTO> row = new ArrayList<>();
			for (int j = 0; j < 3; j++) {
				row.add(new IntegerDTO(-1));
			}
			matrix.add(row);
		}

		matrix.get(0).set(0, dto1);
		matrix.get(0).set(2, dto2);
		matrix.get(2).set(0, dto3);
		matrix.get(2).set(2, dto4);

		matrix.get(1).set(1, new IntegerDTO(0));

		System.out.println("Matrice: ");
		for (List<IntegerDTO> row : matrix) {
			for (IntegerDTO dto : row) {
				System.out.print(dto.getValue() + " | ");
			}
			System.out.println();
		}
	}
}
