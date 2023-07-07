import javax.swing.JOptionPane;

public class Menu{
	
	// https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html
	
	public static boolean menuContinuar() {
		Object continuar = JOptionPane.showConfirmDialog(null, "Desea continuar", "Select an Option", 1);
		
		if ((int) continuar == 0) {
			return true;
		} else if ((int) continuar == 1 || (int) continuar == 2) {
			JOptionPane.showInternalMessageDialog(null, "Programa finalizado");
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Object[] possibleValues = {"Conversor de Moneda", "Conversor de Temperatura"};
		
		Moneda moneda = new Moneda();
		ConversionDivisas opcion = new ConversionDivisas();
		
		boolean deseaCotinuar = true;
		while (deseaCotinuar) {
			
			Object selectValue = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
					"Menu", JOptionPane.INFORMATION_MESSAGE, null, possibleValues,
					possibleValues[0]);
			
			if (selectValue == null) {
				deseaCotinuar = false;
			}
			
			if (selectValue == possibleValues[0]) {
				boolean x = true;
				while (x) {
					String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
					
					if (cantidad == null) {
						deseaCotinuar = false;
						x = false;
					} else {
						try {
							moneda.setValor(Double.parseDouble(cantidad));
							x = false;
							
							if (!x) {
								opcion.menu(moneda.getValor());
								deseaCotinuar = menuContinuar();
							}
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Ingrese una valor correcto", "Input Error", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
				
			} else if (selectValue == possibleValues[1]) {
				MenuTemperatura menuTemperatura = new MenuTemperatura();				
				deseaCotinuar = menuTemperatura.menu();
				
				deseaCotinuar = menuContinuar();
			}
		}		
	}
}