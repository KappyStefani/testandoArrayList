import java.util.ArrayList;
import javax.swing.*;

public class Arraylist 
{
	public static void main (String arg []) 
	
	{
		int quant;
		int numeros;
		
		
		quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos números você deseja digitar ?"));
		
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		
		
		for(int i = 0; i < quant; i++)
		{
			numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número"));
			listaNumeros.add(numeros);
		}
		
		JOptionPane.showMessageDialog(null, "Números digitados: " + listaNumeros);
		
		int soma = 0;
		
		for(int numero : listaNumeros)
		{
			soma += numero; 
		}
		
		JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
		
	}
}
