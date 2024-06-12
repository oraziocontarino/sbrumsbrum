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
		prova1.Esercizio1(dto1, dto2, dto3);
		

		System.out.println();
		System.out.println("Esercizio 1 ArrayList");

		IntegerDTO dto4 = new IntegerDTO(1);
		IntegerDTO dto5 = new IntegerDTO(2);
		IntegerDTO dto6 = new IntegerDTO(5);

		DynamicArrayService prova2 = new DynamicArrayService();
		prova2.Esercizio1Array(dto4, dto5, dto6);

		System.out.println();
		System.out.println("Esercizio 2 Array");

		IntegerDTO dto7 = new IntegerDTO (8);
		IntegerDTO dto8 = new IntegerDTO(7);
		IntegerDTO dto9 = new IntegerDTO(24);

		StaticArrayService prova3 = new StaticArrayService();
		prova3.Esercizio2(dto7, dto8, dto9);

		System.out.println();
		System.out.println("Esercizio 2 ArrayList");

		IntegerDTO dto10 = new IntegerDTO (8);
		IntegerDTO dto11 = new IntegerDTO (12);
		IntegerDTO dto12 = new IntegerDTO (15);

		DynamicArrayService prova4 = new DynamicArrayService();
		prova4.Esercizio2Array(dto10, dto11, dto12);

		System.out.println();
		System.out.println("Esercizio 3 Array");

		IntegerDTO dto13 = new IntegerDTO (5);
		IntegerDTO dto14 = new IntegerDTO (7);
		IntegerDTO dto15 = new IntegerDTO (24);

		StaticArrayService prova5 = new StaticArrayService();
		prova5.Esercizio3(dto13, dto14, dto15);

		System.out.println();
		System.out.println("Esercizio 3 ArrayList");

		IntegerDTO dto16 = new IntegerDTO (3);
		IntegerDTO dto17 = new IntegerDTO (8);
		IntegerDTO dto18 = new IntegerDTO (9);

		DynamicArrayService prova6 = new DynamicArrayService();
		prova6.Esercizio3Array(dto16, dto17, dto18);

		System.out.println();
		System.out.println("Esercizio 4 Array");

		IntegerDTO dto19 = new IntegerDTO (5);
		IntegerDTO dto20 = new IntegerDTO (7);
		IntegerDTO dto21 = new IntegerDTO (24);

		StaticArrayService prova7 = new StaticArrayService ();
		prova7.Esercizio4(dto19, dto20, dto21, EvenOddEnum.EVEN);

		System.out.println();
		System.out.println("Esercizio 4 ArrayList");

		IntegerDTO dto22 = new IntegerDTO(3);
		IntegerDTO dto23 = new IntegerDTO(8);
		IntegerDTO dto24 = new IntegerDTO(9);

		DynamicArrayService prova8 = new DynamicArrayService();
		prova8.Esercizio4Array(dto22, dto23, dto24, EvenOddEnum.ODD);

		System.out.println();
		System.out.println("Esercizio 5 Array");

		IntegerDTO dto25 = new IntegerDTO(5);
		IntegerDTO dto26 = new IntegerDTO(7);
		IntegerDTO dto27 = new IntegerDTO(24);

		StaticArrayService prova9 = new StaticArrayService();
		prova9.Esercizio5(dto25, dto26, dto27);

		System.out.println();
		System.out.println("Esercizio 5 ArrayList");

		IntegerDTO dto28 = new IntegerDTO(3);
		IntegerDTO dto29 = new IntegerDTO(8);
		IntegerDTO dto30 = new IntegerDTO(9);

		DynamicArrayService prova10 = new DynamicArrayService();
		prova10.Esercizio5Array(dto28, dto29, dto30);

		System.out.println();
		System.out.println("Esercizio 6 Array");

		IntegerDTO dto31 = new IntegerDTO(5);
		IntegerDTO dto32 = new IntegerDTO(5);
		IntegerDTO dto33 = new IntegerDTO(6);

		StaticArrayService prova11 = new StaticArrayService();
		prova11.Esercizio6(dto31, dto32, dto33);

		System.out.println();
		System.out.println("Esercizio 6 ArrayList");

		IntegerDTO dto34 = new IntegerDTO(5);
		IntegerDTO dto35 = new IntegerDTO(5);
		IntegerDTO dto36 = new IntegerDTO(6);

		DynamicArrayService prova12 = new DynamicArrayService();
		prova12.Esercizio6ArrayList(dto34, dto35, dto36);

		System.out.println();
		System.out.println("Esercizio 7 Array");

		IntegerDTO dto37 = new IntegerDTO(5);
		IntegerDTO dto38 = new IntegerDTO(5);
		IntegerDTO dto39 = new IntegerDTO(6);

		StaticArrayService prova13 = new StaticArrayService ();
		prova13.Esercizio7(dto37, dto38, dto39);

		System.out.println();
		System.out.println("Esercizio 7 ArrayList");

		IntegerDTO dto40 = new IntegerDTO(5);
		IntegerDTO dto41 = new IntegerDTO(5);
		IntegerDTO dto42 = new IntegerDTO(6);

		DynamicArrayService prova14 = new DynamicArrayService();
		prova14.Esercizio7ArrayList(dto40, dto41, dto42);

		System.out.println();
		System.out.println("Esercizio 8 Array");

		IntegerDTO dto43 = new IntegerDTO(7);
		IntegerDTO dto44 = new IntegerDTO(3);
		IntegerDTO dto45 = new IntegerDTO(2);
		
		StaticArrayService prova15 = new StaticArrayService();
		prova15.Esercizio8(dto43, dto44, dto45);

		System.out.println();
		System.out.println("Esercizio 8 ArrayList");

		IntegerDTO dto46 = new IntegerDTO(7);
		IntegerDTO dto47 = new IntegerDTO(3);
		IntegerDTO dto48 = new IntegerDTO(2);
		DynamicArrayService prova16 = new DynamicArrayService();
		prova16.Esercizio8ArrayList(dto46, dto47, dto48);

		System.out.println();
		System.out.println("Esercizio 9 Array");

		IntegerDTO dto49 = new IntegerDTO(7);
		IntegerDTO dto50 = new IntegerDTO(3);
		IntegerDTO dto51 = new IntegerDTO(2);
		
		StaticArrayService prova17 = new StaticArrayService();
		prova17.Esercizio9(dto49, dto50, dto51);

		System.out.println();
		System.out.println("Esercizio 9 ArrayList");

		IntegerDTO dto52 = new IntegerDTO(7);
		IntegerDTO dto53 = new IntegerDTO(3);
		IntegerDTO dto54 = new IntegerDTO(2);
		DynamicArrayService prova18 = new DynamicArrayService();
		prova18.Esercizio9ArrayList(dto52, dto53, dto54);
		
		System.out.println();
		System.out.println("Esercizio 10 Array");

		IntegerDTO dto55 = new IntegerDTO(7);
		IntegerDTO dto56 = new IntegerDTO(3);
		IntegerDTO dto57 = new IntegerDTO(2);
		StaticArrayService prova19 = new StaticArrayService();
		prova19.Esercizio10(dto55, dto56, dto57);

		System.out.println();
		System.out.println("Esercizio 10 ArrayList");

		IntegerDTO dto58 = new IntegerDTO(7);
		IntegerDTO dto59 = new IntegerDTO(3);
		IntegerDTO dto60 = new IntegerDTO(2);
		
		DynamicArrayService prova20 = new DynamicArrayService();
		prova20.Esercizio10ArrayList(dto58, dto59, dto60);
		
		System.out.println();
		System.out.println("Esercizio 11 Array");

		IntegerDTO dto61 = new IntegerDTO(7);
		IntegerDTO dto62 = new IntegerDTO(3);
		IntegerDTO dto63 = new IntegerDTO(2);
		
		StaticArrayService prova21 = new StaticArrayService();
		prova21.Esercizio11(dto61, dto62, dto63);
		
		System.out.println();
		System.out.println("Esercizio 11 ArrayList");

		IntegerDTO dto64 = new IntegerDTO(7);
		IntegerDTO dto65 = new IntegerDTO(3);
		IntegerDTO dto66 = new IntegerDTO(2);
		
		DynamicArrayService prova22 = new DynamicArrayService();
		prova22.Esercizio11ArrayList(dto64, dto65, dto66);
		
		System.out.println();
		System.out.println("Esercizio 12 Array");

		IntegerDTO dto67 = new IntegerDTO(7);
		IntegerDTO dto68 = new IntegerDTO(3);
		IntegerDTO dto69 = new IntegerDTO(2);
		
		StaticArrayService prova23 = new StaticArrayService();
		prova23.Esercizio12(dto67, dto68, dto69);
		
		System.out.println();
		System.out.println("Esercizio 12 ArrayList");

		IntegerDTO dto70 = new IntegerDTO(7);
		IntegerDTO dto71 = new IntegerDTO(3);
		IntegerDTO dto72 = new IntegerDTO(2);
		
		DynamicArrayService prova24 = new DynamicArrayService();
		prova24.Esercizio12ArrayList(dto70, dto71, dto72);
		
		System.out.println();
		System.out.println("Esercizio 13 Array");

		IntegerDTO dto73 = new IntegerDTO(3);
		IntegerDTO dto74 = new IntegerDTO(3);
		IntegerDTO dto75 = new IntegerDTO(2);
		
		StaticArrayService prova25 = new StaticArrayService();
		prova25.Esercizio13(dto73, dto74, dto75, 3);
		
		System.out.println();
		System.out.println("Esercizio 13 ArrayList");

		IntegerDTO dto76 = new IntegerDTO(3);
		IntegerDTO dto77 = new IntegerDTO(3);
		IntegerDTO dto78 = new IntegerDTO(2);
		
		DynamicArrayService prova26 = new DynamicArrayService();
		prova26.Esercizio13ArrayList(dto76, dto77, dto78, 3);
		
		System.out.println();
		System.out.println("Esercizio 14 Array");

		IntegerDTO dto79 = new IntegerDTO(10);
		IntegerDTO dto80 = new IntegerDTO(5);
		IntegerDTO dto81 = new IntegerDTO(2);
		
		StaticArrayService prova27 = new StaticArrayService();
		prova27.Esercizio14(dto79, dto80, dto81);

		System.out.println();
		System.out.println("Esercizio 14 ArrayList");

		IntegerDTO dto82 = new IntegerDTO(10);
		IntegerDTO dto83 = new IntegerDTO(5);
		IntegerDTO dto84 = new IntegerDTO(2);
		
		DynamicArrayService prova28 = new DynamicArrayService();
		prova28.Esercizio14ArrayList(dto82, dto83, dto84);
		
		System.out.println();
		System.out.println("Esercizio 15 Array");

		IntegerDTO dto85 = new IntegerDTO(10);
		IntegerDTO dto86 = new IntegerDTO(5);
		IntegerDTO dto87 = new IntegerDTO(2);
		
		StaticArrayService prova29 = new StaticArrayService();
		prova29.Esercizio15(dto85, dto86, dto87);
		
		System.out.println();
		System.out.println("Esercizio 15 ArrayList");

		IntegerDTO dto88 = new IntegerDTO(10);
		IntegerDTO dto89 = new IntegerDTO(5);
		IntegerDTO dto90 = new IntegerDTO(2);
		
		DynamicArrayService prova30 = new DynamicArrayService();
		prova30.Esercizio15ArrayList(dto88, dto89, dto90);
		
		System.out.println();
		System.out.println("Esercizio 16 Array");

		IntegerDTO dto91 = new IntegerDTO(10);
		IntegerDTO dto92 = new IntegerDTO(5);
		IntegerDTO dto93 = new IntegerDTO(2);
		IntegerDTO dto94 = new IntegerDTO(10);
		IntegerDTO dto95 = new IntegerDTO(5);
		IntegerDTO dto96 = new IntegerDTO(3);
		
		StaticArrayService prova31 = new StaticArrayService();
		prova31.Esercizio16(dto91, dto92, dto93, dto94, dto95, dto96);
		
		System.out.println();
		System.out.println("Esercizio 16 ArrayList");

		IntegerDTO dto97 = new IntegerDTO(10);
		IntegerDTO dto98 = new IntegerDTO(5);
		IntegerDTO dto99 = new IntegerDTO(2);
		IntegerDTO dto100 = new IntegerDTO(10);
		IntegerDTO dto101= new IntegerDTO(5);
		IntegerDTO dto102= new IntegerDTO(3);
		
		DynamicArrayService prova32 = new DynamicArrayService();
		prova32.Esercizio16ArrayList(dto97, dto98, dto99, dto100, dto101, dto102);
		
	}
}
