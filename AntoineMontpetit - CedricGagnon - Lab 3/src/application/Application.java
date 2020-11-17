package application;

import java.util.Scanner;
import dessins_de_formes.DessinGeometrique;

/**
 * Cette classe permet d'afficher plusieurs dessins géométriques en utilisant la
 * classe DessinGeometrique.
 *
 * @author Antoine Montpetit
 * @author Cédric Gagnon
 * 
 * @version Automne 2020
 */
public class Application
{
	/**
	 * Demande à l'utilisateur d'entrer dans la console les dimensions du cadre.
	 * La méthode demande à l'utilisateur (dans la console) s'il veut saisir les
	 * dimensions d'un nouveau cadre. Si l'utilisateur répond 'o' pour oui, tant
	 * que les dimensions ne sont pas valides, la méthode redemande une nouvelle
	 * saisie du cadre. Lorsque le cadre est saisi correctement, cette méthode
	 * retourne un nouvel objet DessinGeometrique créé à partir des dimensions
	 * saisies. Si l'utilisateur répond 'n' pour non, la méthode retourne la
	 * valeur "null", à ce moment le programme se termine.
	 * 
	 * @return un nouvel objet DessinGeometrique si les valeurs ont été saisies
	 *         sinon la valeur "null".
	 */
	public static DessinGeometrique demanderCadre()
	{
		DessinGeometrique retForme = null;
		int baseSaisie = 0;
		int hauteurSaisie = 0;
		Scanner entree = new Scanner(System.in);

		// Veut-on changer le cadre
		System.out.println("Voulez-vous saisir un autre cadre? o/n");

		// Si l'on change le cadre...
		if (entree.next().toUpperCase().compareTo("O") == 0)
		{
			System.out.println("Entrez la base de la forme");
			baseSaisie = entree.nextInt();
			System.out.println("Entrez la hauteur de la forme");
			hauteurSaisie = entree.nextInt();
			retForme = new DessinGeometrique(baseSaisie,hauteurSaisie);
			// TODO - À faire - Étape 3
			//System.out.println(
			//		"Aucune saisie pour le moment!!! Complétez le code...");
			//retForme = null;
		}

		return retForme;
	}

	/**
	 * Méthode principale pour afficher les dessins
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		DessinGeometrique forme1 = new DessinGeometrique(14, 5);
		DessinGeometrique forme2 = new DessinGeometrique(16, 5);
		DessinGeometrique forme3 = new DessinGeometrique(25, 8);
		DessinGeometrique forme4 = new DessinGeometrique(4, 10);

		// Avec valeurs prédéterminées
		System.out
				.println("On affiche les formes avec les valeurs initiales\n");
		System.out.println("Ligne horizontale, " + forme1 + "\n");
		System.out.println(forme1.creerLigneHorizontale() + "\n");

		System.out.println("Ligne verticale, " + forme1 + "\n");
		System.out.println(forme1.creerLigneVerticale() + "\n");

		System.out.println("Contour carré, " + forme2 + "\n");
		System.out.println(forme2.gererContourCarre() + "\n");

		System.out.println("Contour rectangle, " + forme2 + "\n");
		System.out.println(forme2.gererContourRectangle() + "\n");

		System.out.println("Triangle droit, " + forme4 + "\n");
		System.out.println(forme4.creerTriangleDroit() + "\n");

		System.out.println("Triangle gauche, " + forme3 + "\n");
		System.out.println(forme3.creerTriangleGauche() + "\n");

		// Difficile
		System.out.println("Losange, " + forme3 + "\n");
		System.out.println(forme3.creerLosange() + "\n");

		// BONUS : Difficile à faire, faire à la fin,     // hautement plus facile que le reste i'll have you know
		System.out.println("Cercle, " + forme3 + "\n");
		System.out.println(forme3.creerCercle() + "\n");

		// Avec valeur demandée et validée
		System.out.println(
				"On affiche les formes dans les cadres fournis par l'utilisateur\n");

		while ((forme1 = demanderCadre()) != null)
		{
			System.out.println("\n" + forme1 + "\n");

			System.out.println(forme1.creerLigneHorizontale() + "\n");

			System.out.println(forme1.creerLigneVerticale() + "\n");

			System.out.println(forme1.gererContourCarre() + "\n");

			System.out.println(forme1.gererContourRectangle() + "\n");

			System.out.println(forme1.creerTriangleDroit() + "\n");

			System.out.println(forme1.creerTriangleGauche() + "\n");

			System.out.println(forme1.creerLosange() + "\n");

			System.out.println(forme1.creerCercle() + "\n");// Mettre ici l'affichage du cercle, si vous l'avez fait...
		}
		
		System.out.println("\nMerci d'avoir utilisé ce programme !");
	}
}
