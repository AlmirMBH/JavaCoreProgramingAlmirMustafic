package predavanje5;

public class Byte {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 7; // 0111 - ukoliko je jedna vrijednost "1", zbir je 1
        int res = a|b;
        System.out.println("a | b = " + res);
        
        int res1 = a&b; // - ukoliko je jedna vrijednost "0", zbir je 0
        System.out.println("a & b = " + res1);
        
        int res2 = a^b; // - samo ukoliko su vrijednosti različite, zbir je 1
        System.out.println("a ^ b = " + res2);
        
        res = ~a; // broj se predstavlja binarno, a onda invertuje u negativne (jedinice postaju nule i obrnuto). Nakon toga se dodaje 1, a binarno sabiranje je npr. 1 + 1 = 0, a prenosi se 1; početna 1 predstavlja minus
        System.out.println("~a = " + res);
        
        int k = 10;
        res = k>>1; //Shift udesno je dijeljenje sa 2, a rezultat se prikazuje bez ostatka
        System.out.println("k >> = " + res);
        
        int l = 7;
        res = l<<2; //Shift ulijevo je množenje sa 2
        System.out.println("k << = " + res);
    }
}
