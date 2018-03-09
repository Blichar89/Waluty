package waluty;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class WalutaTest {

	@Test
	void testWalutaNaZlote() {
	
		Waluta usd = new Waluta("USD", "dolar", new BigDecimal("3.5000"));
		BigDecimal kwota = new BigDecimal("100.00");
		BigDecimal wynik = usd.walutaNaZlote(kwota);
		
		BigDecimal spodziewanyWynik = new BigDecimal("350.00");
		
		assertEquals(spodziewanyWynik, wynik);
		
	}

}
