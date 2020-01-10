

//JAVA 3.2. PETLJE FOR, FOREACH, WHILE, DO-WHILE
/*package itacasovi;
    import java.util.Arrays;
public class ITAZadaci{
        public static void main(String[] args){        
            
        int[] numbers = {23, 34, 45, 56, 67, 13, 23, 21, 31, 3446};
        // naslijeđena for petlja iz C++
        for(int i = 0; i<numbers.length; i++){
            System.out.println("Element na indeksu '" + i +"' = " + numbers[i]);
        }
        //enhanced for loop
        for(int mutant : numbers){
            System.out.println(mutant);
        }
        }
}*/


//ZADATAK 3
         
            
         //ZADATAK 2
         /*String[][] users = {
             {"petar", "petrovic", "1111"}, 
             {"jovan", "jovanovic", "2222"}, 
             {"zoran", "zoranovic", "3333"}
         };
         String[] names = new String[users.length];
            for(int i = 0; i < users.length; i++)
                names[i] = users[0][i];
            System.out.println(java.util.Arrays.toString(names));
        }*/
}
                
        //ZADATAK 1
        /*int[] arr = {1, 2, -1, 4, 5, -1};
        int[] arr1 = new int[arr.length];
            for(int i = 0; i < arr.length; i++){
            if(arr[i] == -1)
                arr1[i] = 0;
                else
                arr1[i] = arr[i];   }
        System.out.println(java.util.Arrays.toString(arr1))}*/
        
        
        //CONTINUE VS BREAK - POPRAVITI KOD        
        /*for(member = 0; member < 1000000; member ++){
              if(member != "teacher")
                  continue;//Preskače samo tekuću iteraciju petlje
              System.out.println(member); }*/
        
        //KONTROLA PETLJE
   /*     for(int i = 0; i < 10; i++){
        System.out.print("\n" + i + ".");
            
        for(int u = 0; u < 10; u++){
                System.out.print(u);
                if(u == 6)
                    break;  }   
        }
        }
}*/
        
        //FOREACH PETLJA (ČITA VRIJEDNOSTI NIZA; NE ČITA NJIHOVE INDEKSE; PONAVLJA PETLJU ONOLIKO PUTA KOLIKO IMA ČLANOVA U NIZU)
        /*int[] numbers = {3, 5, 9, 7};
        System.out.println("Numbers in this array are: ");
        for(int number : numbers){ //Za jednu liniju koda vitičaste zagrade nisu neophodne
            System.out.println(number); }
        
            numbers[3] = 5;
        
       System.out.println(Arrays.toString(numbers));*/
        /*int i = 9;
        System.out.println(i);
       for(i = 5; i > 0; i--)//Brojač petlje koji smanjuje vrijednost
        {   System.out.println(i);  }
        }
        }*/
        
        //UGNIJEŽDENE PETLJE
        /*for(int i = 0; i < 5; i ++) //Izvršava petlju "u" <5 puta 
        {   for(int u = 0; u < 10; u++)//izvršava operaciju <10 puta (ispisuje brojeve od 0 do 9)
            {   System.out.println(u);  }   }*/
        
        /*String[] colors = {"red", "green", "blue", "yellow", "white"};
        for(int i = 0; i < colors.length; i ++) //Moguće je "i++" izostaviti i navesti ga u bloku
            //System.out.println("Color of element " + i + " is " + colors[i ++] + ".");
        {   System.out.println("Color of element " + i + " is " + colors[i] + "."); }
        
        /*for(int counter = 0; counter < 5; counter ++) //counter += 2
            { System.out.println(counter);
            //(counter_initialization; condition; increment_counter{conditional_code}
        }
}
}*/
    


//JAVA 3.2. SWITCH
/*package itacasovi;
     import java.util.Arrays;

    public class ITAZadaci{
        public static void main(String[] args){*/
            //ZADATAK 1______________________________________________________
            /*int x = 10; 
            int y = 4;
            int remainder = x % y;
            
            switch(remainder){
                case 0:
                    System.out.println("division without remainder");
                    break;
                    
                default:
                    if(remainder > 1000){
                    System.out.println("remainder over 1000");
                    }
                    else{
                    System.out.println("remainder below 1000");
                    break;}                    
            }
        }
    }*/
            //ZADATAK 2_____________________________________________________
            /*String carMake = "Mercedes";
            int doors = 3;
            
            switch(carMake){
                case "Ford":
                
                switch(doors){
                    case 3:
                        System.out.println("You drive a Ford with three doors.");
                        break;
                        
                    case 4:
                        System.out.println("You drive a Ford with four doors.");
                        break;
                        
                    case 5:
                        System.out.println("You drive a Ford with five doors.");
                        break;
                }
                break;
                
                default:                    
                        System.out.println("We are sorry. You do not drive a Ford car.");
                        break;
            }
        }
    }
//___________________________________________________________________*/ 
      /*      
            int x = 3;
        switch(x){
            case 1:
                System.out.println("x = 0");
                break;//Ukoliko se dio koda ne ograniči sa 'break', kod se u potpunosti izvršava
                
                case 2:
                System.out.println("x = 1");
                break;
                
                case 3:
                System.out.println("x = 2");
                break;
                
                case 4:
                System.out.println("x = 3");
                break;
                
                default:
                System.out.println("x != 1, x != 2, x != 3");
        String a = "myValue";
        switch(a){
           case "myValue":
            System.out.println("myValue text");
            //break;
            
            case "yourValue":
            System.out.println("hisValue text");
            //break;
            
           default: 
            System.out.println("otherValue text");
        }
        }
    }*/

//JAVA 3.1. IF/ELSE KONSTRUKCIJA, TERNARNI OPERATOR
/*
package itacasovi;
    
    public class ITAZadaci{
        public static void main(String[] args){
           int x = 1;
            if(x == 0){
               System.out.println("x is 0");
           } 
            else 
                if(x < 0){
               System.out.println("x is < 0");
           }                       
           else
                if(x > 0 && x < 10){ //X veće od nula i manje od 10
               System.out.println("x is > 0");
           }
            boolean Happy = true;
            String mood = "";//Prazan string
            if(Happy == true){
                mood = "I'm happy!";
            }
            else {
                mood = "I'm sad!";
            }
            System.out.println(mood);
            
            boolean Happy1 = true;//TERNARNI OPERATOR
            String mood1 = (Happy1 == false) ? "I'm happy!" : "I'm sad!";
            System.out.println(mood1);
            
            int z = 1;
            if (z > 0){
                z = 3;
            System.out.println(z);
            }
            
            int y = 15;
            if((y > 1 && y < 25 && y != 10) || (y == 35)) // || - ili
            {
                System.out.println("Condition is fullfilled!");
        }
            else {
                System.out.println("Condition is not fullfilled!");
                    }
        }
        }
*/

//JAVA 2.4. ZADATAK 2 SORTIRANJE I SABIRANJE NIZOVA
/*package itacasovi;
import java.util.Arrays;

public class ITAZadaci{
    public static void main(String[] args){        
        int[] array = {1, 5, 33, 563, 0, 2, 23, 9, 9, 11, 987, 23, 934, 999, 43};
        System.out.println("This is the original array " + Arrays.toString(array));
        Arrays.sort(array);        
        System.out.println("This is the sorted array " + Arrays.toString(array));
    }
}*/

//VIŠEDIMENZIONALNI NIZOVI - MATRIČNI ILI TABELARNI RAD SA PODACIMA
/*package itacasovi;
    import java.util.Arrays;
    
public class ITAZadaci{  
        public static void main(String[] args){
                    
       int[][][] matrix =
        {
            {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}                    
                },
            {
                {17, 18, 19, 20},
                {21, 22, 23, 24},
                {25, 26, 27, 28},
                {29, 30, 31, 32}
            },
            {
                {33, 34, 35, 36},
                {37, 38, 39, 40},
                {41, 42, 43, 44},
                {45, 46, 47, 48}
            },
            {
                {49, 50, 51, 52},
                {53, 54, 55, 56},
                {57, 58, 59, 60},
                {61, 62, 63, 64}
            },
        };             
              
        System.out.println(matrix[3][1][1]);//Prvi broj označava niz (grupu nizova),       
        System.out.println(matrix[3][1][2]);//drugi vodoravni niz elemenata; treći elemente po vertikali
}
}*/


//DVODIMENZIONALNI NIZOVI - MATRIČNI ILI TABELARNI RAD SA PODACIMA
/*package itacasovi; 
    import java.util.Arrays;
    
public class ITAZadaci{  
        public static void main(String[] args){
        int[] [] matrix
                = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12, 44}
                };              
        System.out.println(matrix[0][0]);//Pristupanje prvom elementu prvog podniza; 1      
        System.out.println(matrix[2][4]);//Pristupanje trećem elementu drugog podniza; indexi iznad elemenata niza počinju od nule; 7      
       
        int[][] arr = new int[2][2];{
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        
        System.out.println(arr[1][1]);
        
}
}*/

//POPUNJAVANJE NIZOVA - FILL METODA
/*package itacasovi; //Niz mora biti sortiran da bi pretraga radila
    import java.util.Arrays;
    
public class ITAZadaci{  
        public static void main(String[] args){
        int[] array = new int[6];
        //Arrays.fill(array, 7);//Postavljanje vrijednosti svih elemenata niza
        Arrays.fill(array, 0, 4, 7);//Postavljanje vrijednosti samo nekih elemenata niza; početni indeks je 0, a krajnji 4, ne uključujući krajnji index (4)
        System.out.println(Arrays.toString(array));//[7, 7, 7, 7, 7, 7]      
}
}*/

//PRETRAGA NIZOVA
/*package itacasovi; //Niz mora biti sortiran da bi pretraga radila
    import java.util.Arrays;
        class Seha{
        int[] niz;
        };

public class ITAZadaci{  
        public static void main(String[] args){
            Seha Almir = new Seha();
            Almir.niz = new int[22];
        int[] a = {5, 1, 3, 4, 44, 88, 99};//Niz brojeva ne dozovljava decimalne brojeve (numerički/indeksirani niz)
        Object kafa[] = {4.5, 22, "pas"};
        
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Almir.niz));
        System.out.println(Arrays.binarySearch(a, 4)); //Povratna vrijednost (index) će biti >=0, ako je traženi element (broj u nizu) pronađen; 2
        System.out.println(Arrays.binarySearch(a, 89)); //Povratna vrijednost (mjesto u nizu prema vrijednosti, a ne prema indeksu)će biti <0, ukoliko traženi element nije pronađen; npr. -7 na 7. mjestu u nizu (nije prema indexu)
       System.out.println(Arrays.toString(kafa));
        }
}*/

//SORTIRANJE NIZOVA
/*package itacasovi;
    import java.util.Arrays;
    
public class ITAZadaci{  
        public static void main(String[] args){
        int arr[] = {3, 5, 2, 6, 1, 6};//Niz brojeva ne dozovljava decimalne brojeve (numerički/indeksirani niz)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
}
}*/

//KONKATENACIJA I KOPIRANJE NIZOVA
/*package itacasovi;
    import java.util.Arrays;
    
public class ITAZadaci{  
        public static void main(String[] args){
        int array[] = {3, 5, 2, 6, 1, 6};//Niz brojeva ne dozovljava decimalne brojeve (numerički/indeksirani niz)
        int array1[] = {12, 13, 14};
        int array2[] = {45, 83, 66};
        array[5] = 33;
        int destArray[] = new int[array.length + array1.length + array2.length];
        
        System.out.println("Array length is: " + destArray.length);// 9

        System.arraycopy(array, 0, destArray, 0, array.length); //Kopiranje 1. niza u 3.
        System.arraycopy(array1, 0, destArray, array.length, array1.length); //Kopiranje 2. niza u 3.
        System.arraycopy(array2, 0, destArray, array.length + array1.length, array2.length);
        
        System.out.println("Elements are: "); //Elements are
        System.out.println(Arrays.toString(destArray));//[3, 5, 2, 6, 1, 6, 12, 13, 14]
}
}*/

//NIZOVI - ZA ČUVANJE VIŠE VRIJEDNOSTI U OKVIRU JEDNE PROMJENJIVE
/*package itacasovi;
import java.util.Arrays; //Implementiranje klase neophodno za prikaz nizova!!!
    
public class ITAZadaci{  
        public static void main(String[] args){
        int array[] = {3, 5, 2, 6, 1, 6};//Niz brojeva ne dozovljava decimalne brojeve (numerički/indeksirani niz)
        array[1] = 17; //Smještanje vrijednosti u niz po broju indexa
        int x = array[4]; //Čitanje elementa niza po broju indexa
        
        Object objectarray[] = {2, 7.3, 4, 8, 9, 6, "cat"};//Niz objekata dozvoljava decimalne brojeve
        System.out.println(Arrays.toString(array));
         System.out.println(array.length);
         System.out.println(objectarray.length);
         System.out.println(x);
         System.out.println(objectarray[6]);
         System.out.println(Arrays.toString(objectarray));
}
}*/

//PROGRAM ZA IZRAČUNAVANJE OBIMA KRUGA
/*package itacasovi;
public class ITAZadaci{
    static final double PI = 3.14;
    public static void main(String[] args){
        int r = 5;
        double p = 2 * PI * r;
        System.out.println(p);
        System.out.printf("%.4f ", p);
    }
}*/

//PROGRAM ZA SABIRANJE DVA BROJA
/*package itacasovi;
    
    public class ITAZadaci{
        public static void main(String[] args){
            int x = 1;
            int y = 2;
            int z = x + y;
            System.out.println(z);
            System.out.println(z - 2);
        }
    }*/

//INSTANCNA PROMJENJIVA
/*package itacasovi; 
    class Moamer{
    public int age = 10;
}
public class ITAZadaci {
    public static void main(String[] args){ //dio (String[] args) zove se PARAMETARSKA PROMJENJIVA
            Moamer osnovniPodaci = new Moamer();
            int firstOperand = osnovniPodaci.age;
            System.out.println(osnovniPodaci.age);
            
            double a = 3.5;
            int b = 5;
            double c = b / a;
            System.out.printf("Three plus 5 = %.8f ", c);
            System.out.println(Integer.toBinaryString(~b));            
            }
}
}*/

//KLASNA (STATIČKA) PROMJENJIVA
/*package itacasovi; 
    class MyClass{
    public static int myVariable;
}
public class ITAZadaci {
public static void main(String[] args){
    MyClass.myVariable = 10;
    System.out.println(MyClass.myVariable);
}
}*/

