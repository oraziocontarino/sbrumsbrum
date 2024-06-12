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
    public void Esercizio16ArrayList(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, IntegerDTO dto4, IntegerDTO dto5, IntegerDTO dto6) {
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
}
