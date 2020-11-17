package tests;

import dessins_de_formes.DessinGeometrique;

/*
 * Say Hello
 * Hallo
 */

public class Tests
{
	public static void main(String[] args) {
		/*
		 * Test Line
		 */
		DessinGeometrique dessinGeo = new DessinGeometrique(8, 4);
		
		
		System.out.println(dessinGeo.creerLigneHorizontale());
		System.out.println();
		System.out.println(dessinGeo.creerLigneVerticale());
		
		System.out.println(dessinGeo.gererContourCarre());
		System.out.println(dessinGeo.gererContourRectangle());
	}
}
