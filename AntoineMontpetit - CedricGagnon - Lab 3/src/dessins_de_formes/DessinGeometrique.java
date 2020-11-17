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
	// La base correspond au nombre de colonnes nécessaires pour dessiner la forme.
	// La hauteur correspond au nombre de lignes nécessaires pour dessiner la forme.
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
		//Étape 1
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
		//Étape 1
		return pHauteur > 0 && pBase > 0 && pHauteur < HAUTEUR_MAX && pBase < BASE_MAX;
	}
	
	/**
	 * Créer une ligne horizontale.
	 *
	 * @return La chaîne de caractères contenant la forme.
	 */
	public String creerLigneHorizontale()
	{
		String ligneHorizontale = "";
		// TODO - À faire - Étape 2a)
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
		// TODO - À faire - Étape 2a)
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
	 *  @return La chaîne de caractères contenant la forme.
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
		// TODO - À faire - Étape 2b)
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
		// TODO - À faire - Étape 2c)
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
		// TODO - À faire - Étape 2c)
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
		// TODO - À faire Étape 2d)
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

		// TODO - À faire - Étape 5
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
     * @param args
     */
    public static void main(String[] args)
    {

        

    }
}
