package waluty;

import java.math.BigDecimal;

public class ProgramTestujacyWaluty {

	public static void main(String[] args) {

		Waluta usd = new Waluta("USD", "dolar", new BigDecimal("3.5000"));
		
		BigDecimal kwota = new BigDecimal(100);
		
		BigDecimal wynik = usd.walutaNaZlote(kwota);
		
		System.out.println(wynik);

	}

}
