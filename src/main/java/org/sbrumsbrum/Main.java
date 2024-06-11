package org.sbrumsbrum;

import org.sbrumsbrum.dto.IntegerDTO;
import org.sbrumsbrum.enums.EvenOddEnum;
import org.sbrumsbrum.services.DynamicArrayService;
import org.sbrumsbrum.services.StaticArrayService;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Esercizio 1 Array");

		IntegerDTO dto1 = new IntegerDTO(1);
		IntegerDTO dto2 = new IntegerDTO(2);
		IntegerDTO dto3 = new IntegerDTO(5);

		StaticArrayService prova1 = new StaticArrayService();
		prova1.esercizio1(dto1, dto2, dto3);
		

		System.out.println();
		System.out.println("Esercizio 1 ArrayList");

		IntegerDTO dto4 = new IntegerDTO(1);
		IntegerDTO dto5 = new IntegerDTO(2);
		IntegerDTO dto6 = new IntegerDTO(5);

		DynamicArrayService prova2 = new DynamicArrayService();
		prova2.esercizio1Array(dto1, dto2, dto3);

		System.out.println();
		System.out.println("Esercizio 2 Array");

		IntegerDTO dto7 = new IntegerDTO (8);
		IntegerDTO dto8 = new IntegerDTO(7);
		IntegerDTO dto9 = new IntegerDTO(24);

		StaticArrayService prova3 = new StaticArrayService();
		prova3.esercizio2(dto7, dto8, dto9);

		System.out.println();
		System.out.println("Esercizio 2 ArrayList");

		IntegerDTO dto10 = new IntegerDTO (8);
		IntegerDTO dto11 = new IntegerDTO (12);
		IntegerDTO dto12 = new IntegerDTO (15);

		DynamicArrayService prova4 = new DynamicArrayService();
		prova4.esercizio2Array(dto10, dto11, dto12);

		System.out.println();
		System.out.println("Esercizio 3 Array");

		IntegerDTO dto13 = new IntegerDTO (5);
		IntegerDTO dto14 = new IntegerDTO (7);
		IntegerDTO dto15 = new IntegerDTO (24);

		StaticArrayService prova5 = new StaticArrayService();
		prova5.esercizio3(dto13, dto14, dto15);
		;

		System.out.println();
		System.out.println("Esercizio 3 ArrayList");

		IntegerDTO dto16 = new IntegerDTO (3);
		IntegerDTO dto17 = new IntegerDTO (8);
		IntegerDTO dto18 = new IntegerDTO (9);

		DynamicArrayService prova6 = new DynamicArrayService();
		prova6.esercizio3Array(dto16, dto17, dto18);

		System.out.println();
		System.out.println("Esercizio 4 Array");

		IntegerDTO dto19 = new IntegerDTO (5);
		IntegerDTO dto20 = new IntegerDTO (7);
		IntegerDTO dto21 = new IntegerDTO (24);

		StaticArrayService prova7 = new StaticArrayService ();
		prova7.esercizio4(dto19, dto20, dto21, EvenOddEnum.EVEN);

		System.out.println();
		System.out.println("Esercizio 4 ArrayList");

		IntegerDTO dto22 = new IntegerDTO(3);
		IntegerDTO dto23 = new IntegerDTO(8);
		IntegerDTO dto24 = new IntegerDTO(9);

		DynamicArrayService prova8 = new DynamicArrayService();
		prova8.esercizio4Array(dto22, dto23, dto24, EvenOddEnum.ODD);

		System.out.println();
		System.out.println("Esercizio 5 Array");

		IntegerDTO dto25 = new IntegerDTO(5);
		IntegerDTO dto26 = new IntegerDTO(7);
		IntegerDTO dto27 = new IntegerDTO(24);

		StaticArrayService prova9 = new StaticArrayService();
		prova9.esercizio5(dto25, dto26, dto27);

		System.out.println();
		System.out.println("Esercizio 5 ArrayList");

		IntegerDTO dto28 = new IntegerDTO(3);
		IntegerDTO dto29 = new IntegerDTO(8);
		IntegerDTO dto30 = new IntegerDTO(9);

		DynamicArrayService prova10 = new DynamicArrayService();
		prova10.esercizio5Array(dto28, dto29, dto30);

		System.out.println();
		System.out.println("Esercizio 6 Array");

		IntegerDTO dto31 = new IntegerDTO(5);
		IntegerDTO dto32 = new IntegerDTO(5);
		IntegerDTO dto33 = new IntegerDTO(6);

		StaticArrayService prova11 = new StaticArrayService();
		prova11.esercizio6(dto31, dto32, dto33);

		System.out.println();
		System.out.println("Esercizio 6 ArrayList");

		IntegerDTO dto34 = new IntegerDTO(5);
		IntegerDTO dto35 = new IntegerDTO(5);
		IntegerDTO dto36 = new IntegerDTO(6);

		DynamicArrayService prova12 = new DynamicArrayService();
		prova12.esercizio6(dto34, dto35, dto36);

		System.out.println();
		System.out.println("Esercizio 7 Array");

		IntegerDTO dto37 = new IntegerDTO(5);
		IntegerDTO dto38 = new IntegerDTO(5);
		IntegerDTO dto39 = new IntegerDTO(6);

		StaticArrayService prova13 = new StaticArrayService ();
		prova13.esercizio7(dto37, dto38, dto39);

		System.out.println();
		System.out.println("Esercizio 7 ArrayList");

		IntegerDTO dto40 = new IntegerDTO(5);
		IntegerDTO dto41 = new IntegerDTO(5);
		IntegerDTO dto42 = new IntegerDTO(6);

		DynamicArrayService prova14 = new DynamicArrayService();
		prova14.esercizio7(dto40, dto41, dto42);

		System.out.println();
		System.out.println("Esercizio 8 Array");

		IntegerDTO dto43 = new IntegerDTO(7);
		IntegerDTO dto44 = new IntegerDTO(3);
		IntegerDTO dto45 = new IntegerDTO(2);
		StaticArrayService prova15 = new StaticArrayService();
		prova15.esercizio8(dto43, dto44, dto45);

		System.out.println();
		System.out.println("Esercizio 8 ArrayList");

		IntegerDTO dto46 = new IntegerDTO(7);
		IntegerDTO dto47 = new IntegerDTO(3);
		IntegerDTO dto48 = new IntegerDTO(2);
		StaticArrayService prova16 = new StaticArrayService();
		prova16.esercizio8(dto46, dto47, dto48);

		System.out.println();
		System.out.println("Esercizio 9 Array");

		IntegerDTO dto49 = new IntegerDTO(7);
		IntegerDTO dto50 = new IntegerDTO(3);
		IntegerDTO dto51 = new IntegerDTO(2);
		StaticArrayService prova17 = new StaticArrayService();
		prova17.esercizio9(dto49, dto50, dto51);

		System.out.println();
		System.out.println("Esercizio 9 ArrayList");

		IntegerDTO dto52 = new IntegerDTO(7);
		IntegerDTO dto53 = new IntegerDTO(3);
		IntegerDTO dto54 = new IntegerDTO(2);
		StaticArrayService prova18 = new StaticArrayService();
		prova18.esercizio9(dto52, dto53, dto54);
		
		System.out.println();
		System.out.println("Esercizio 10 Array");

		IntegerDTO dto55 = new IntegerDTO(7);
		IntegerDTO dto56 = new IntegerDTO(3);
		IntegerDTO dto57 = new IntegerDTO(2);
		StaticArrayService prova19 = new StaticArrayService();
		prova19.esercizio10(dto55, dto56, dto57);

		System.out.println();
		System.out.println("Esercizio 10 ArrayList");

		IntegerDTO dto58 = new IntegerDTO(7);
		IntegerDTO dto59 = new IntegerDTO(3);
		IntegerDTO dto60 = new IntegerDTO(2);
		StaticArrayService prova20 = new StaticArrayService();
		prova20.esercizio10(dto58, dto59, dto60);
		
		System.out.println();
		System.out.println("Esercizio 11 Array");

		IntegerDTO dto61 = new IntegerDTO(7);
		IntegerDTO dto62 = new IntegerDTO(3);
		IntegerDTO dto63 = new IntegerDTO(2);
		StaticArrayService prova21 = new StaticArrayService();
		prova21.esercizio11(dto61, dto62, dto63);
		
		System.out.println();
		System.out.println("Esercizio 11 ArrayList");

		IntegerDTO dto64 = new IntegerDTO(7);
		IntegerDTO dto65 = new IntegerDTO(3);
		IntegerDTO dto66 = new IntegerDTO(2);
		StaticArrayService prova22 = new StaticArrayService();
		prova22.esercizio11(dto64, dto65, dto66);
	}

}
