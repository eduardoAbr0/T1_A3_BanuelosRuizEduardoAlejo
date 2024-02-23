import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

class VentanaPrincipal extends JFrame{
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public VentanaPrincipal() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setLocationRelativeTo(null);
		setTitle("Interfaz");
		setVisible(true);
		
		//gbc.insets = new Insets(5,5,5,5);
		//TEXTO INTRODUCTORIO
		JLabel txtTexto1 = new JLabel("<html>The Classic Form includes all visible fields for this list.<html>");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		agregarComponente(txtTexto1,0,0,2,1);
		
		//FORM OPTIONS
		JLabel txtTextF1 = new JLabel("Form options");
		agregarComponente(txtTextF1, 1, 1, 1, 1);
		JLabel txtTextF2 = new JLabel("Include the following:");
		agregarComponente(txtTextF2, 1, 2, 1, 1);
		//FORM CHECKBOX
		JCheckBox chForm = new JCheckBox();
		agregarComponente(chForm,0,3,1,1);
		//FORM CHECKBOX TEXT
		JLabel txtCheckForm = new JLabel("A tittle for your form");
		agregarComponente(txtCheckForm,1,3,1,1);
		//FORM CAJA TEXTO
		JTextField txtCheckFormText = new JTextField();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		agregarComponente(txtCheckFormText,0,4,2,1);
		
		//ESPACIO BLANCO
		JLabel espacioB = new JLabel();
		gbc.insets = new Insets(10,0,10,0);
		agregarComponente(espacioB, 0, 5, 1, 1);
		gbc.insets = new Insets(0,0,0,0);
		
		//RADIO BUTTONS
		JRadioButton radioB1 = new JRadioButton();
		agregarComponente(radioB1,0,6,1,1);
		JLabel txtRadio1 = new JLabel("only required fields");
		agregarComponente(txtRadio1,1,6,1,1);
		
		JRadioButton radioB2 = new JRadioButton();
		agregarComponente(radioB2,0,7,1,1);
		JLabel txtRadio2 = new JLabel("all fields");
		agregarComponente(txtRadio2,1,7,1,1);
		
		JLabel txtRadioW = new JLabel("(edit required fields in the form builder)");
		agregarComponente(txtRadioW,1,8,1,1);
		
		//ESPACIO BLANCO
				JLabel espacioB2 = new JLabel();
				gbc.insets = new Insets(10,0,10,0);
				agregarComponente(espacioB2, 0, 5, 1, 1);
				gbc.insets = new Insets(0,0,0,0);
		
		
				
		pack();
	}
	
	public void agregarComponente(JComponent c,int x,int y,int anchura,int altura) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = anchura;
		gbc.gridheight = altura;
		gbl.setConstraints(c, gbc);
		
		add(c);
	}
	
}
public class Interfaz {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaPrincipal();
			}
		});

	}

}
