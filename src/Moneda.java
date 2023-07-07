
public class Moneda extends Variables implements InterfaceConversionAPeso, InterfaceConversionPeso{

	@Override
	public double PesoADolar(double moneda) {
		return moneda*(1/4131.2);
	}

	@Override
	public double PesoAEuro(double moneda) {
		return moneda*(1/4484.4842);
	}

	@Override
	public double PesoALibras(double moneda) {
		return moneda*(1/5246.2023);
	}

	@Override
	public double PesoAYen(double moneda) {
		return moneda*(1/28.552745);
	}

	@Override
	public double PesoAWon(double moneda) {
		return moneda*(1/3.1643188);
	}

	@Override
	public double DolarAPeso(double moneda) {
		return moneda*4131.2;
	}

	@Override
	public double EuroAPeso(double moneda) {
		return moneda*4484.4842;
	}

	@Override
	public double LibrasAPeso(double moneda) {
		return moneda*5246.2023;
	}

	@Override
	public double YenAPeso(double moneda) {
		return moneda*28.552745;
	}

	@Override
	public double WonAPeso(double moneda) {
		return moneda*3.1643188;
	}
	
}
