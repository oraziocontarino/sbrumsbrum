Premessa  
Crea un progetto contenente i package:  
- services  
- dto  
- enums  

Inserisci dove ritieni più opportuno le seguenti classi/enum  

class InputDto<T>  
private T value;  

enum EvenOddEnum  
EVEN, ODD;  

class StaticArrayService  
...  

class DynamicArrayService  
...  

Ogni esercizio a seguire dovrà essere implementato creando un metodo apposito (uno per esercizio) dentro StaticArrayService e DynamicArrayService.  
L'esercizio dentro il metodo di StaticArrayService dovrà essere realizzato utilizzando gli array (new InputDto[xx]);  
L'esercizio dentro il metodo di DynamicArrayService dovrà essere realizzato utilizzando le liste (new ArrayList<InputDto>());  
NB: sono circa 18 esercizi quindi mi aspetto 18 metodi dentro i due rispettivi services, per un totale di 36 metodi.  
  
--------------------------  
--------------------------  
--------------------------  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Stampa tramite System.out.println il value.  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Stampa tramite System.out.println il value solo se è pari.  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Stampa tramite System.out.println il value solo se è dispari.  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere e l'enum EvenOddEnum.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Stampa tramite System.out.println il value solo se è pari o dispari, in funzione dell'enum che ti è stato fornito come secondo parametro (se EVEN stampi i pari, ODD i dispari).  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Adesso crea due nuovi [Array/ArrayList], [evenArray e oddArray/evenArrayList e oddArrayList].  
Scorri l'array e smista i pari in evenArray/evenArrayList e i dispari in oddArray/oddArrayList.  
Stampa tutti i numeri scorrendo l'array iniziale.  
Stampa prima tutti i pari scorrendo l'array even e poi tutti i dispari scorrendo l'array odd.  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Calcola la media degli elementi nell'array.  
Stampa tramite System.out.println la somma.  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Calcola la media degli elementi nell'array.  
Stampa tramite System.out.println la media.  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Calcola la media pesata degli elementi nell'array considerando come pesi 10 se il numero è pari, 5 se il numero è dispari.  
Stampa tramite System.out.println la media pesata.  
Ex: 7, 3, 2 => (7*5)+(3*5)+(2*10)/(5+5+10) = 70/20 = 3.5  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Calcola il massimo degli elementi nell'array.  
Stampa tramite System.out.println la massimo.  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Calcola il secondo massimo degli elementi nell'array.  
Stampa tramite System.out.println il secondo massimo.  
ex: 1, 7, 10 => 7  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Calcola il minimo degli elementi nell'array.  
Stampa tramite System.out.println il minimo.  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Calcola il secondo minimo degli elementi nell'array.  
Stampa tramite System.out.println il secondo minimo.  
ex: 1, 3, 14 => 3  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Conti quante volte un determinato elemento appare nell'array.  
Stampa il risultato.  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Crea un nuovo array popolato nell'ordine inverso dell'input iniziale.  
Stampa il risultato.  
Ex: 10, 3, 5 ==> 5, 3, 10  
  
Scrivi un metodo che prenda in ingresso 3 InputDto<Integer> a piacere.  
Quindi crea un [Array/ArrayList] contenete questi 3 InputDto<Integer>.  
Smista i pari pari un nuovo array e i dispari in un ulteriore nuovo array.  
Crea un nuovo array unendo l'array dei pari con l'array dei dispari.  
Stampa il risultato.  
Ex: 10, 3, 5 ==> [10], [3, 5] ==> [10, 3, 5]  
  
Scrivi un metodo che prenda in ingresso 6 InputDto<Integer> a piacere.  
Quindi crea due [Array/ArrayList].  
Il primo array contiene i primi 3 InputDto<Integer> il secondo array gli altri 3.  
Inserisci in un nuovo array gli elementi che sono in comune tra i due array precedenti (intersezione).  
Stampa il risultato.  
  
Scrivi un metodo che prenda in ingresso 6 InputDto<Integer> a piacere.  
Quindi crea due [Array/ArrayList].  
Il primo array contiene i primi 3 InputDto<Integer> il secondo array gli altri 3.  
Inserisci in un nuovo array tutti gli elementi che compaiono o nel primo o nel secondo array, mai in entrambi.  
Stampa il risultato.  
  
Scrivi un metodo che prenda in ingresso 6 InputDto<Integer> a piacere.  
Quindi crea due [Array/ArrayList].  
Il primo array contiene i primi 3 InputDto<Integer> il secondo array gli altri 3.  
Crea un nuovo array sum contenente le somme degli elementi dei 2 array di prima a parità di indice.  
Stampa il risultato.  
ex: [1,5,7] [3,6,9] => [4, 11, 16]  
  