package com.mycompany.stringtroca;
import java.util.Scanner;

public class StringTroca {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("digitem uma palavra: ");
    String ent = scan.next();
    String sai = "";
    
    for(int i = ent.length() - 1; i>=0; i--){
     sai = sai + ent.charAt(i);}
    System.out.print(sai);
    }
}
