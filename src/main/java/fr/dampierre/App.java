package fr.dampierre;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {

    // public static void main(String[] args) {
    // Scanner clavier = new Scanner(System.in);
    // System.out.print("entrez un premier mot");
    // String mot1 = clavier.nextLine();
    // System.out.print("entrez un nombre");
    // int nombre = clavier.nextInt();
    // System.out.print("entrez un deuxieme mot");
    // String mot2 = clavier.nextLine();
    // System.out.print("entrer un adjectif");
    // String adjectif = clavier.nextLine();

    // String phrase = "Il etait une fois un" + mot1 + " qui avait " + nombre + "" +
    // mot2 + " Cela le rendait très"
    // + adjectif + ".";
    // System.out.println(phrase);
    // }

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

    // EXO 1
    // public static void main(String[] args) {
    // Scanner clavier = new Scanner(System.in);
    // System.out.print("entrer nombre d'heures");
    // int heures = clavier.nextInt();
    // System.out.print("entrer nombre de minutes");
    // int minutes = clavier.nextInt();
    // System.out.print("entrer nombre de secondes");
    // int secondes = clavier.nextInt();
    // String adjectif = clavier.nextLine();

    // int seconesdepuisminut = heures * 60 * 60 + minutes * 60 + secondes;
    // System.out.println("Il s'est écoulé " + seconesdepuisminut + " secondes
    // depuis minuit.");
    // }}

    // public static void main(String[] args) { // EXERCICE 2
    // int salaire = 400;
    // int prime = 250;
    // int quota = 10;

    // Scanner clavier = new Scanner(System.in);
    // System.out.print("entrer votre nombres de ventes : ");
    // int nbventes = clavier.nextInt();
    // clavier.close();

    // if (nbventes >= quota) {
    // System.out.println("Féliciations ! Vous avez rempli votre quota");
    // salaire - salaire + prime
    // }else {
    // int nbventesmanquantes = quota -nbventes;
    // System.out.println("il vous manque ": nbventesmanquantes: "ventes");
    // }
    // System.out.println("Votre salaire est de : " salaire);
    // }
    // }

public class Couleurs {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez votre couleur (r,v,B)");
        String couleur = clavier.nextLine();
        clavier.close();
            if(couleur.equals("r")||couleur.equals("R")){
                System.out.println("Vous avez choisi le rouge.");
            }
            else if(couleur.equals("v")||couleur.equals("V")){
                System.out.println("Vous avez choisi le vert.");
            }
            else if(couleur.equals("b")||couleur.equals("B")){
                System.out.println("Vous avez choisi le bleu.");
            }
            else
                System.out.println("Connais pas.");

    }
}