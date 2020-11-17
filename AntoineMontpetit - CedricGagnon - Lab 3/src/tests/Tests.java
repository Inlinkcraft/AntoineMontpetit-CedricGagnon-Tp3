package tests;

import dessins_de_formes.DessinGeometrique;

/**
 * Cette classe nous permet de tester nos fonction
 *
 * @author Antoine Montpetit
 * @author Cédric Gagnon
 * @version Automne 2020
 */

public class Tests
{
	public static void main(String[] args)
	{
		/*
		 * Test Line
		 */
		DessinGeometrique dessinGeo = new DessinGeometrique(16, 16);

		System.out.println(dessinGeo.creerLigneHorizontale());
		System.out.println();
		System.out.println(dessinGeo.creerLigneVerticale());

		System.out.println(dessinGeo.gererContourCarre());
		System.out.println(dessinGeo.gererContourRectangle());

		System.out.println(dessinGeo.creerTriangleDroit());
		System.out.println(dessinGeo.creerTriangleGauche());

		System.out.println(dessinGeo.creerCercle());

	}
}
