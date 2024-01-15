// Importation de la classe Scanner du package java.util
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
            Scanner scanner = new Scanner(System.in);
           // Demande à l'utilisateur d'entrer le premier numéro
            System.out.println("Entrez le premier numéro:");
            double num1 = scanner.nextDouble();
            // Demande à l'utilisateur d'entrer le deuxième numéro

            System.out.println("Entrez le deuxième numéro:");
            double num2 = scanner.nextDouble();
        // Demande à l'utilisateur de choisir une opération arithmétique
            System.out.println("Choisissez une opération (+, -, *, /):");
            char operation = scanner.next().charAt(0);

            double result;
            switch  (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println(" \n" + "Erreur : Division par zéro ");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Erreur : opération invalide");
                    return;
            }
        // Affichage du résultat de l'opération
            System.out.println("Le résultat est: " + result);
        }
    }
