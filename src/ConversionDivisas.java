import javax.swing.JOptionPane;

public class ConversionDivisas {
	
	Moneda moneda = new Moneda();
	
	private void mensaje(double x, String divisa) {
		JOptionPane.showMessageDialog(null, "Tienes $" + String.format("%.2f", x) + " " + 
				divisa, "Message", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void mensajePesos(double x) {
		JOptionPane.showMessageDialog(null, "Tienes $" + String.format("%.2f", x) +  
				" Pesos", "Message", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void menu(double valor) {
		Object[] opcionMoneda = {"Pesos a Dólar", "Pesos a Euro", "Pesos a Libras", "Pesos a Yen", "Pesos a Won Coreano",
				"Dólar a Pesos", "Euro a Pesos", "Libras a Pesos", "Yen a Pesos", "Won Coreano a Pesos"};
		
		Object selectMoneda = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero",
				"Monedas", JOptionPane.INFORMATION_MESSAGE, null, opcionMoneda, opcionMoneda[0]);
		
		double x;
		// Conversiones Peso a X
		if (selectMoneda == opcionMoneda[0]) {
			x = moneda.PesoADolar(valor);
			mensaje(x, "Dólares");
		} else if (selectMoneda == opcionMoneda[1]) {
			x = moneda.PesoAEuro(valor);
			mensaje(x, "Euro");
		} else if (selectMoneda == opcionMoneda[2]) {
			x = moneda.PesoALibras(valor);
			mensaje(x, "Libras");
		} else if (selectMoneda == opcionMoneda[3]) {
			x = moneda.PesoAYen(valor);
			mensaje(x, "Libras");
		} else if (selectMoneda == opcionMoneda[4]) {
			x = moneda.PesoAWon(valor);
			mensaje(x, "Libras");
		}
		
		//Conversiones X a peso
		else if (selectMoneda == opcionMoneda[5]) {
			x = moneda.DolarAPeso(valor);
			mensajePesos(x);
		} else if (selectMoneda == opcionMoneda[6]) {
			x = moneda.EuroAPeso(valor);
			mensajePesos(x);
		} else if (selectMoneda == opcionMoneda[7]) {
			x = moneda.LibrasAPeso(valor);
			mensajePesos(x);
		} else if (selectMoneda == opcionMoneda[8]) {
			x = moneda.YenAPeso(valor);
			mensajePesos(x);
		} else if (selectMoneda == opcionMoneda[9]) {
			x = moneda.WonAPeso(valor);
			mensajePesos(x);
		}		
	}
}
