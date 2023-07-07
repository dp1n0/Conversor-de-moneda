import javax.swing.JOptionPane;

public class ConversionTemperatura {
	
	Temperatura temperatura = new Temperatura();
	
	private void mensaje(double x, String unidad) {
		JOptionPane.showMessageDialog(null, "Tienes " + String.format("%.2f", x) + " " + 
				unidad, "Message", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void menu(double valor) {
		Object[] opcion = {"Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius", "Fahrenheit a Kelvin", 
				"Kelvin a Celsius", "Kelvin a Fahrenheit"};
		
		Object select = JOptionPane.showInputDialog(null, "Elije la unidad a la que deseas convertir la temperatura",
				"Temperatura", JOptionPane.INFORMATION_MESSAGE, null, opcion, opcion[0]);
		
		double x;
		if (select == opcion[0]) {
			x = temperatura.CelsiusToFahrenheit(valor);
			mensaje(x, "°F");
		} else if (select == opcion[1]) {
			x = temperatura.CelsiusToKelvin(valor);
			mensaje(x, "°K");
		} else if (select == opcion[2]) {
			x = temperatura.FahrenheitToCelsius(valor);
			mensaje(x, "°C");
		} else if (select == opcion[3]) {
			x = temperatura.FahrenheitToKelvin(valor);
			mensaje(x, "°K");
		} else if (select == opcion[4]) {
			x = temperatura.KelvinToCelsius(valor);
			mensaje(x, "°C");
		} else if (select == opcion[5]) {
			x = temperatura.KelvinToFahrenheit(valor);
			mensaje(x, "°F");
		}
	}
}
