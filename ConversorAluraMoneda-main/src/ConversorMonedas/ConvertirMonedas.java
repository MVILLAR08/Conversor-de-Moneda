package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirSolesPeruanosDolar(double valor) {
		double monedaDolar = valor / 3.77;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	public void ConvertirSolesPeruanoEuros(double valor) {
		double monedaEuro = valor / 4.08;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	public void ConvertirSolesPeruanoLibra(double valor) {
		double monedaLibra = valor / 4.64;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
	}
	public void ConvertirSolesPeruanoYen(double valor) {
		double monedaYen = valor / 0.028;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
	}
	public void ConvertirSolesPeruanoWon(double valor) {
		double monedaWon = valor / 0.0028;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won sub-coreano");
	}
	public void ConvertirDolaresSolesPeruano(double valor) {
		double monedaDolar = 3.77 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en soles");
	}
	public void ConvertirEurosSolesPeruano(double valor) {
		double monedaEuro = valor * 4.08;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en soles");
	}
	public void ConvertirLibraSolesPeruano(double valor) {
		double monedaLibra = valor * 0.21;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en soles");
	}
	public void ConvertirYenSolesPeruano(double valor) {
		double monedaYen = valor * 0.028;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en soles");
	}
	public void ConvertirWonSolesPeruano(double valor) {
		double monedaWon = valor * 0.0028;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Won sub-coreano " + monedaWon + " en soles");
	}

}
