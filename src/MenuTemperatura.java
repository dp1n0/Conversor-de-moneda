import javax.swing.JOptionPane;

public class MenuTemperatura {
	
	public boolean menu() {
		
		Temperatura temperatura = new Temperatura();
		ConversionTemperatura opcion = new ConversionTemperatura();
		
		boolean x = true;
		while (x) {
			String valor = JOptionPane.showInputDialog("Ingrese el valor de temperatura que desea convertir");
			
			if (valor == null) {
				x = false;
				return false;
			} 
			else {
				try {
					temperatura.setValor(Double.parseDouble(valor));
					x = false;
					
					if (!x) {
						opcion.menu(temperatura.getValor());
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Ingrese una valor correcto", "Input Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		return false;
	}
}
