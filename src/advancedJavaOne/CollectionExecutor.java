package advancedJavaOne;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionExecutor {

    public static void main(String[] args) {
        String[] imena = new String[3];
        imena[0] = "Almir";
        imena[1] = "Zekerijah";
        imena[2] = "Moamer";

        ArrayList<String> names = new ArrayList<>(1); //Linked i Array liste se ponašaju identično; kako su ubačeni, članovi se tako i ispisuju
        names.add("Samer"); // Objektna funkcija
        names.add("Moamer");
        names.add("Almir");
        names.add("Almir");
        //printArrayList(names);
        printCollection(names);

        System.out.println("            ");
        System.out.println("LINKED LIST");
        LinkedList<String> names1 = new LinkedList<>();
        names1.add("Damir");
        names1.add("Adnan");
        names1.add("Admir");
        names1.add("Admir");
        names1.add("Admir");
        //printLinkedList(names1);
        printCollection(names1);

        System.out.println("            ");
        System.out.println("HASH SET"); // Hash Set ne prima duplikate, a članove reda proizvoljno
        HashSet<String> names2 = new HashSet<>();
        names2.add("John"); // Objektna funkcija
        names2.add("Mark");
        names2.add("Tony");
        names2.add("Tony");
        //
        printCollection(names2);

        System.out.println(" ");
        System.out.println("LINKED HASH SET");
        LinkedHashSet<String> names3 = new LinkedHashSet<>();
        names3.add("Minel"); // Objektna funkcija
        names3.add("Samir");
        names3.add("Emir");
        names3.add("Emir");
        names3.add("Emir");
        // printLinkedHashSet(names3);
        printCollection(names3);

    }
    //System.out.println(names);
    //System.out.println(imena[0] + imena[1]);

    static void printCollection(Collection<String> names) {
        for (String name : names) {
            System.out.println("Name = " + name);
        }
    }

    /*static void printArrayList(ArrayList<String> names){
        for (String name : names){
            System.out.println("Name = " + name);}}
        
    static void printLinkedList(LinkedList<String> names1){
        for (String name : names1){
            System.out.println("Name = " + name);
        }}
        
    static void printHashSet(HashSet<String> names2){
        for (String name : names2){
            System.out.println("Name = " + name);}}
    
    private static void printLinkedHashSet(LinkedHashSet<String> names3) {
        for (String name : names3){
            System.out.println("Name = " + name);}}*/
}
