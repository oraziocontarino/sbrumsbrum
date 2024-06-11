package org.sbrumsbrum.services;

import java.util.ArrayList;
import java.util.List;
import org.sbrumsbrum.dto.IntegerDTO;
import org.sbrumsbrum.enums.EvenOddEnum;

public class DynamicArrayService  {

	public void esercizio1Array(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		for (IntegerDTO dto : list) {

			System.out.print(dto.getValue() + " ");

		}
	}

	public void esercizio2Array(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
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

	public void esercizio3Array(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
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

	public <T extends Number> void esercizio4Array(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3,
			EvenOddEnum evenOdd) {
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

	public <T extends Number> void esercizio5Array(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
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

	public void esercizio6(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
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

	public void esercizio7(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
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

	public void esercizio8(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
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

	public <T extends Number> void esercizio9(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		Integer maxDto = (Integer) list.get(0).getValue();
		for (IntegerDTO dto : list) {
			if ((int)dto.getValue() > maxDto) {
				maxDto = (Integer) dto.getValue();
			}
		}
		System.out.println("Il valore massimo è: " + maxDto);
	}
	public void esercizio10(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		List<IntegerDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		Integer minDto = (Integer) list.get(0).getValue();
		for (IntegerDTO dto : list) {
			if ((int)dto.getValue() < minDto) {
				minDto = (Integer) dto.getValue();
			}
		}
		System.out.println("Il valore minimo è: " + minDto);
	}
	public void esercizio11 (IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3)  {
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
}
	
