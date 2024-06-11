Premessa  
Crea un progetto contenente i package:  
- services  
- dto  
- enums  

Inserisci dove ritieni più opportuno le seguenti classi/enum  

class IntegerDto  
private int value;  

enum EvenOddEnum  
EVEN, ODD;  

class StaticArrayService  
...  

class DynamicArrayService  
...  

Ogni esercizio a seguire dovrà essere implementato creando un metodo apposito (uno per esercizio) dentro StaticArrayService e DynamicArrayService.  
L'esercizio dentro il metodo di StaticArrayService dovrà essere realizzato utilizzando gli array (new IntegerDto);  
L'esercizio dentro il metodo di DynamicArrayService dovrà essere realizzato utilizzando le liste (new ArrayList<IntegerDto>());  
NB: sono circa 18 esercizi quindi mi aspetto 18 metodi dentro i due rispettivi services, per un totale di 36 metodi.  
  
--------------------------  
--------------------------  
--------------------------  
  

Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Stampa tramite System.out.println il value.  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Stampa tramite System.out.println il value solo se è pari.  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Stampa tramite System.out.println il value solo se è dispari.  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere e l'enum EvenOddEnum.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Stampa tramite System.out.println il value solo se è pari o dispari, in funzione dell'enum che ti è stato fornito come secondo parametro (se EVEN stampi i pari, ODD i dispari).  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Adesso crea due nuovi [Array/ArrayList], [evenArray e oddArray/evenArrayList e oddArrayList].  
Scorri l'array e smista i pari in evenArray/evenArrayList e i dispari in oddArray/oddArrayList.  
Stampa tutti i numeri scorrendo l'array iniziale.  
Stampa prima tutti i pari scorrendo l'array even e poi tutti i dispari scorrendo l'array odd.  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Calcola la media degli elementi nell'array.  
Stampa tramite System.out.println la somma.  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Calcola la media degli elementi nell'array.  
Stampa tramite System.out.println la media.  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Calcola la media pesata degli elementi nell'array considerando come pesi 10 se il numero è pari, 5 se il numero è dispari.  
Stampa tramite System.out.println la media pesata.  
Ex: 7, 3, 2 => (7*5)+(3*5)+(2*10)/(5+5+10) = 70/20 = 3.5  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Calcola il massimo degli elementi nell'array.  
Stampa tramite System.out.println la massimo.  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Calcola il secondo massimo degli elementi nell'array.  
Stampa tramite System.out.println il secondo massimo.  
ex: 1, 7, 10 => 7  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Calcola il minimo degli elementi nell'array.  
Stampa tramite System.out.println il minimo.  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Calcola il secondo minimo degli elementi nell'array.  
Stampa tramite System.out.println il secondo minimo.  
ex: 1, 3, 14 => 3  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Conti quante volte un determinato elemento appare nell'array.  
Stampa il risultato.  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Crea un nuovo array popolato nell'ordine inverso dell'input iniziale.  
Stampa il risultato.  
Ex: 10, 3, 5 ==> 5, 3, 10  
  
Scrivi un metodo che prenda in ingresso 3 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 IntegerDto.  
Smista i pari pari un nuovo array e i dispari in un ulteriore nuovo array.  
Crea un nuovo array unendo l'array dei pari con l'array dei dispari.  
Stampa il risultato.  
Ex: 10, 3, 5 ==> [10], [3, 5] ==> [10, 3, 5]  
  
Scrivi un metodo che prenda in ingresso 6 IntegerDto a piacere.  
Quindi crea due [Array/ArrayList].  
Il primo array contiene i primi 3 IntegerDto il secondo array gli altri 3.  
Inserisci in un nuovo array gli elementi che sono in comune tra i due array precedenti (intersezione).  
Stampa il risultato.  
  
Scrivi un metodo che prenda in ingresso 6 IntegerDto a piacere.  
Quindi crea due [Array/ArrayList].  
Il primo array contiene i primi 3 IntegerDto il secondo array gli altri 3.  
Inserisci in un nuovo array tutti gli elementi che compaiono o nel primo o nel secondo array, mai in entrambi.  
Stampa il risultato.  
  
Scrivi un metodo che prenda in ingresso 6 IntegerDto a piacere.  
Quindi crea due [Array/ArrayList].  
Il primo array contiene i primi 3 IntegerDto il secondo array gli altri 3.  
Crea un nuovo array sum contenente le somme degli elementi dei 2 array di prima a parità di indice.  
Stampa il risultato.  
ex: [1,5,7] [3,6,9] => [4, 11, 16]  
  
--------------------------  
--------------------------  
--------------------------  
  
Scrivi un metodo che prenda in ingresso 5 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenente i 5 elementi di input.  
Ordina l'array secondo il meccanismo di scambio.  
Stampa l'array ordinato.  
Ex (scambio): temp=v[i], v[i]=v[i+1], v[i]=temp  

Scrivi un metodo che prenda in ingresso 5 IntegerDto a piacere.  
Quindi crea un [Array/ArrayList] contenente i 5 elementi di input.  
Crea un nuovo array grande quanto il precedente.  
Scorrendo il primo array popola il secondo inserendo in maniera ordinata i numeri, dal più piccolo al più grande.  
Stampa prima l'array di input e poi l'array ordinato.  

Scrivi un metodo che prenda in ingresso 4 IntegerDto a piacere (diverso da 0 e da -1).  
Crea una matrice usando gli [Array/ArrayList] con 3 righe e 3 colonne.  
Inserisci nei 4 angoli della matrice i 4 input ricevuti.  
Inserisci al centro il valore 0.  
Inserisci negli elementi restanti il valore -1.  
Stampa la matrice.  
Ex input: 3, 14, 7, 99
Ex output:  
 3, -1,  14  
-1,  0, -1  
 7, -1,  99  

Scrivi un metodo che prenda in ingresso 4 IntegerDto a piacere.  
Crea una matrice usando gli [Array/ArrayList] con 2 righe e 2 colonne.  
Popola la matrice con i 4 input.  
Crea una nuova matrice 4x4.  
Popola la nuova matrice mettendo al centro i valori della precedente e raddoppiando i bordi vicini.  
Gli angoli della nuova matrice mettili a 0.  
Calcola la somma per ogni riga.  
Calcola la somma per ogni colonna.  
Calcola la somma totale considerando tutte le righe e tutte le colonne.  
Calcola la media per ogni riga.  
Calcola la media per ogni colonna.  
Calcola la media totale considerando tutte le righe e tutte le colonne.
Stampa la matrice 2x2.  
Stampa la matrice 4x4.  
Stampa la somma per riga.  
Stampa la somma per colonna.  
Stampa la somma totale.  
Stampa la media per riga.  
Stampa la media per colonna.  
Stampa la media totale.  
Ordina ogni riga della tabella 2x2 decrescentemente.  
Stampa la tabella 2x2 con le righe ordinate decrescentemente.  
Ordina le colonne della tabella 2x2 decrescentemente.  
Stampa la tabella 2x2 con le colonne ordinate decrescentemente.  
  
Ex input: 1, 2, 3, 4  
Ex matrice 2x2:   
1, 2   
3, 4  
  
Ex matrice 4x4:
0, 2, 4, 0,  
2, 1, 2, 4,  
6, 3, 4, 8,  
0, 6, 8, 0,  
  
Ex: somma riga 2x2: 3  
Ex: somma riga 2x2: 7  
Ex: somma colonna 2x2: 4  
Ex: somma colonna 2x2: 6  
Ex: somma totale 2x2: 20  
Ex: media riga 2x2: 2  
Ex: media riga 2x2: 3.5  
Ex: media colonna 2x2: 2  
Ex: media colonna 2x2: 3  
Ex: media totale 2x2: 5  

stesso ragionamento per la 4x4  
