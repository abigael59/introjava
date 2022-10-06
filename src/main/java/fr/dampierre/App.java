package fr.dampierre;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("entrez un premier mot");
        String mot1 = clavier.nextLine();
        System.out.print("entrez un nombre");
        int nombre = clavier.nextInt();
        System.out.print("entrez un deuxieme mot");
        String mot2 = clavier.nextLine();
        System.out.print("entrer un adjectif");
        String adjectif = clavier.nextLine();

        String phrase = "Il etait une fois un" + mot1 + " qui avait " + nombre + "" + mot2 + " Cela le rendait très"
                + adjectif + ".";
        System.out.println(phrase);
    }

    // System.out.println("Bonjour !");

    // recupérer le nombre d'heures travaillées
    // int heuredetravailles = 120;

    // Scanner clavier = new Scanner(System.in);
    // System.out.println("entrer votre nombres d'heures travaillées:");
    // int heuredetravailles = clavier.nextInt();

    // recupérer le taux horaire
    // System.out.println("entrer votre taux horaire:");
    // double tauxhoraires =clavier.nextDouble();

    // clavier.close();

    // multiplier le nombre d'heures par le taux horaire
    // double salairebrut = heuredetravailles * tauxhoraires;

    // afficher le résultat
    // System.out.println("Le salaire brut est de :");
    // System.out.println(salairebrut);

    // System.out.println("Le salaire brut est de : " + salairebrut);
}
