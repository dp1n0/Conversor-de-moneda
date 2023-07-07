
public class Temperatura extends Variables implements InterfaceConversionTemperatura {

	@Override
	public double CelsiusToFahrenheit(double valor) {
		return (valor * 1.8) + 32;
	}

	@Override
	public double CelsiusToKelvin(double valor) {
		return valor + 273.15;
	}

	@Override
	public double FahrenheitToCelsius(double valor) {
		return (valor - 32) / 1.8;
	}

	@Override
	public double FahrenheitToKelvin(double valor) {
		return (valor - 32) * 5/9 + 273.15;
	}

	@Override
	public double KelvinToCelsius(double valor) {
		return valor - 273.15;
	}

	@Override
	public double KelvinToFahrenheit(double valor) {
		return (valor - 273.15) * 9/5 + 32;
	}

}
