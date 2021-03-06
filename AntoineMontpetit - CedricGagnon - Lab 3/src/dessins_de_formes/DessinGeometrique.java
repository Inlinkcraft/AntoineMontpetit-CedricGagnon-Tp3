package dessins_de_formes;

/**
 * Cette classe permet de créer plusieurs dessins géométriques. L'utilisateur
 * peut définir les dimensions (base et hauteur) du cadre qui contient la forme.
 *
 * @author Antoine Montpetit
 * @author Cédric Gagnon
 * @version Automne 2020
 */
public class DessinGeometrique
{
	// constantes pour valeurs limites acceptables
	public final static int BASE_MAX = 50;
	public final static int HAUTEUR_MAX = 20;

	// constantes pour valeurs par défaut
	public final static int BASE_DEFAUT = 5;
	public final static int HAUTEUR_DEFAUT = 5;

	// Propriétés du cadre qui délimite la forme géométrique.
	// La base correspond au nombre de colonnes nécessaires pour dessiner la
	// forme.
	// La hauteur correspond au nombre de lignes nécessaires pour dessiner la
	// forme.
	int base = 0;
	int hauteur = 0;

	/**
	 * Constructeur unique
	 */
	public DessinGeometrique(int pBase, int pHauteur)
	{
		if (validerCadre(pBase, pHauteur))
		{
			setCadre(pBase, pHauteur);
		}
		else
		{
			setCadre(BASE_DEFAUT, HAUTEUR_DEFAUT);

			// TODO - À faire - Étape 4
			// Donner des valeurs aléatoires.
		}
	}

	/**
	 * Permet de modifier la base et la hauteur du cadre
	 * 
	 * @param pBase, nouvelle valeur de la base
	 * @param pHauteur, nouvelle valeur de la hauteur
	 */
	private void setCadre(int pBase, int pHauteur)
	{
		if (validerCadre(pBase, pHauteur))
		{
			base = pBase;
			hauteur = pHauteur;
		}
	}

	/**
	 * La base de la forme.
	 *
	 * @return la base
	 */
	public int getBase()
	{
		return base;
	}

	/**
	 * La hauteur de la forme.
	 *
	 * @return la hauteur
	 */
	public int getHauteur()
	{
		return hauteur;
	}

	/**
	 * Retourne le plus petite valeur entre la base et la hauteur. Pensez à
	 * utiliser la classe Math.
	 *
	 * @return la longueur d'un côté.
	 */
	private int getPlusPetitCote()
	{
		// Étape 1
		return Math.min(base, hauteur);
	}

	/**
	 * Évalue si le cadre est valide. Pour que le cadre soit valide, il faut que
	 * sa hauteur et sa base soient supérieures à 0 et inférieures au bornes
	 * limites définies par les constantes BASE_MAX et HAUTEUR_MAX.
	 * 
	 * @param pBase, base de la forme à valider
	 * @param pHauteur, hauteur de la forme à valider
	 * @return vrai si le cadre est valide.
	 */
	public static boolean validerCadre(int pBase, int pHauteur)
	{
		// Étape 1
		return pHauteur > 0 && pBase > 0 && pHauteur < HAUTEUR_MAX
				&& pBase < BASE_MAX;
	}

	/**
	 * Créer une ligne horizontale.
	 *
	 * @return La chaîne de caractères contenant la forme.
	 */
	public String creerLigneHorizontale()
	{
		String ligneHorizontale = "";
		// Étape 2a)
		for (int i = 0; i < base; i++)
		{
			ligneHorizontale += "*";
		}

		return ligneHorizontale;
	}

	/**
	 * Créer une ligne verticale.
	 *
	 * @return La chaîne de caractères contenant la forme.
	 */
	public String creerLigneVerticale()
	{
		String ligneVerticale = "";
		// Étape 2a)

		for (int i = 0; i < hauteur; i++)
		{
			ligneVerticale += "*\n";
		}

		return ligneVerticale;
	}

	/**
	 * Gérer la création du contour d'un carré.
	 *
	 * @return La chaîne de caractères contenant la forme.
	 */
	public String gererContourCarre()
	{
		int cote = getPlusPetitCote();
		return creerContour(cote, cote);
	}

	/**
	 * Gérer la création du contour d'un rectangle.
	 *
	 * @return La chaîne de caractères contenant la forme.
	 */
	public String gererContourRectangle()
	{
		return creerContour(base, hauteur);
	}

	/**
	 * Créer le contour d'un rectangle (dont le carré).
	 *
	 * @return La chaîne de caractères contenant la forme.
	 */
	private static String creerContour(int pBase, int pHauteur)
	{
		String contour = "";
		for (int i = 0; i < pHauteur; i++)
		{
			for (int j = 0; j < pBase; j++)
			{
				if (j == 0 || j == pBase - 1 || i == 0 || i == pHauteur - 1)
				{
					contour += "*";
				}
				else
				{
					contour += " ";
				}

			}
			contour += "\n";
		}
		return contour;
	}

	/**
	 * Créer le triangle appuyé à droite
	 *
	 * @return La chaîne de caractères contenant la forme.
	 */
	public String creerTriangleDroit()
	{
		String triangleDroit = "";

		double slope = ((double) hauteur - 1) / base;
		int i = hauteur;
		while (i > 0)
		{
			int j = 0;
			while (j < base)
			{
				if ((j + 1) * slope < i - 1)
					triangleDroit += " ";
				else
					triangleDroit += "*";
				j++;
			}

			triangleDroit += "\n";

			i--;
		}
		return triangleDroit;
	}

	/**
	 * Créer le triangle appuyé à gauche
	 *
	 * @return La chaîne de caractères contenant la forme.
	 */
	public String creerTriangleGauche()
	{
		String triangleGauche = "";

		double slope = ((double) hauteur - 1) / base;
		int i = hauteur;
		while (i > 0)
		{
			int j = 0;
			while (j < base)
			{
				if (j * -slope + hauteur < i)
					triangleGauche += " ";
				else
					triangleGauche += "*";
				j++;
			}

			triangleGauche += "\n";

			i--;
		}
		return triangleGauche;
	}

	/**
	 * Créer le losange à partir du plus petit côté
	 *
	 * @return La chaîne de caractères contenant la forme.
	 */
	public String creerLosange()
	{
		String losange = "";
		int entre = 0;
		int distCentre = 0;
		int cote = getPlusPetitCote() + (Math.abs(1 - getPlusPetitCote() % 2));
		for (int i = 0; i < cote; i++)
		{
			if (i == 0 || i == cote - 1)
			{
				// Top - Bottom
				for (int j = 0; j < cote / 2; j++)
				{
					losange += " ";
				}

				losange += "*";

				for (int j = 0; j < cote / 2; j++)
				{
					losange += " ";
				}
			}
			else
			{
				// Center
				distCentre = Math.abs(i - (cote / 2));
				entre = cote - 2 - (2 * distCentre);

				for (int j = 0; j < distCentre; j++)
				{
					losange += " ";
				}

				losange += "*";

				for (int j = 0; j < entre; j++)
				{
					losange += " ";
				}

				losange += "*";

				for (int j = 0; j < distCentre; j++)
				{
					losange += " ";
				}
			}

			losange += "\n";

		}
		return losange;
	}

	/**
	 * Créer le cercle à partir du plus petit côté.
	 *
	 * @return La chaîne de caractères contenant la forme.
	 */
	public String creerCercle()
	{
		String cercle = "";
		int rayon = getPlusPetitCote() / 2;

		for (int i = 0; i < 2 * rayon; i++)
		{
			for (int j = 0; j < 2 * rayon; j++)
			{
				if (Math.pow(j - rayon, 2) + Math.pow(i - rayon, 2) < Math
						.pow(rayon, 2))
					cercle += "*";
				else
					cercle += " ";
			}
			cercle += "\n";
		}
		return cercle;
	}

	/**
	 * Retourne une chaîne qui représente le cadre de la forme.
	 * 
	 * @return une chaîne qui représente le cadre de la forme.
	 */
	@Override
	public String toString()
	{
		return getHauteur() + " ligne(s) X " + getBase() + " colonne(s).";
	}

	/**
	 * Méthode pour faire les tests sur vos méthodes
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{

	}
}
