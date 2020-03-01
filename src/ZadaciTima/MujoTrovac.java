package ZadaciTima;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class MujoTrovac {
    public static void main(String[] args) throws IOException {
     String output="";
        try(Scanner sc1=new Scanner((new File("A.txt")));
        Scanner sc2=new Scanner((new File("B.txt")))){

        while(sc1.hasNext() || sc2.hasNext()){
            output+=sc1.next() +" "+ sc2.next();
            output+="\n";
        }
        }
        try(PrintWriter pw=new PrintWriter(new File("C.txt"))){
        pw.write(output);
        } 
    }
}
    

