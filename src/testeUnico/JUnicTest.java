package testeUnico;

import geraScript.GeraScript;
import geraScript.Tipos;
import junit.framework.TestCase;

public class JUnicTest extends TestCase{
	public void testaScript1() {
		assertEquals("'codigo' INT NOT NULL AUTO_INCREMENT,",GeraScript.geraOScript("codigo", Tipos.INT, true, true));
	}
	public void testaScript2() {
		assertEquals("'codigo' INT AUTO_INCREMENT,",GeraScript.geraOScript("codigo", Tipos.INT, true, false));
	}
	public void testaScript3() {
		assertEquals("'codigo' INT NOT NULL,",GeraScript.geraOScript("codigo", Tipos.INT, false, true));
	}
	public void testaScript4() {
		assertEquals("'codigo' INT,",GeraScript.geraOScript("codigo", Tipos.INT, false,false));
	}	
	public void testaScript5() {
		assertEquals("'nome' VARCHAR NOT NULL AUTO_INCREMENT,",GeraScript.geraOScript("codigo", Tipos.INT, true, true));
	}
}
