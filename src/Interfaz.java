import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.*;

class VentanaPrincipal extends JFrame {
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	public VentanaPrincipal() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Interfaz utilizando GridBagLayout");
		setVisible(true);

		// gbc.insets = new Insets(5,5,5,5);
		// TEXTO INTRODUCTORIO
		JLabel txtTexto1 = new JLabel("<html>The Classic Form includes all visible fields for this list.<html>");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		agregarComponente(txtTexto1, 0, 0, 2, 1);

		// ESPACIO BLANCO
		JLabel espacioB = new JLabel();
		gbc.insets = new Insets(10, 0, 10, 0);
		agregarComponente(espacioB, 0, 1, 1, 1);
		gbc.insets = new Insets(0, 0, 0, 0);

		// FORM OPTIONS
		JLabel txtTextF1 = new JLabel("Form options");
		agregarComponente(txtTextF1, 1, 2, 1, 1);
		JLabel txtTextF2 = new JLabel("Include the following:");
		agregarComponente(txtTextF2, 1, 3, 1, 1);
		// FORM CHECKBOX
		JCheckBox chForm = new JCheckBox();
		agregarComponente(chForm, 0, 4, 1, 1);
		// FORM CHECKBOX TEXT
		JLabel txtCheckForm = new JLabel("A tittle for your form");
		agregarComponente(txtCheckForm, 1, 4, 1, 1);
		// FORM CAJA TEXTO
		JTextField txtCheckFormText = new JTextField();
		// gbc.fill = GridBagConstraints.HORIZONTAL;
		agregarComponente(txtCheckFormText, 1, 5, 2, 1);

		// ESPACIO BLANCO
		JLabel espacioB1 = new JLabel();
		gbc.insets = new Insets(10, 0, 10, 0);
		agregarComponente(espacioB1, 0, 6, 1, 1);
		gbc.insets = new Insets(0, 0, 0, 0);

		// RADIO BUTTONS
		JRadioButton radioB1 = new JRadioButton();
		agregarComponente(radioB1, 0, 7, 1, 1);
		JLabel txtRadio1 = new JLabel("only required fields");
		agregarComponente(txtRadio1, 1, 7, 1, 1);

		JRadioButton radioB2 = new JRadioButton();
		agregarComponente(radioB2, 0, 8, 1, 1);
		JLabel txtRadio2 = new JLabel("all fields");
		agregarComponente(txtRadio2, 1, 8, 1, 1);

		JLabel txtRadioW = new JLabel("(edit required fields in the form builder)");
		agregarComponente(txtRadioW, 1, 9, 1, 1);

		// ESPACIO BLANCO
		JLabel espacioB2 = new JLabel();
		gbc.insets = new Insets(10, 0, 10, 0);
		agregarComponente(espacioB2, 0, 10, 1, 1);
		gbc.insets = new Insets(0, 0, 0, 0);

		// PRIMER COLUMNA CHECK BOXES
		JCheckBox chBox1 = new JCheckBox();
		agregarComponente(chBox1, 0, 11, 1, 1);
		JLabel txtCh1 = new JLabel("interest group fields");
		agregarComponente(txtCh1, 1, 11, 1, 1);

		JCheckBox chBox2 = new JCheckBox();
		agregarComponente(chBox2, 0, 12, 1, 1);
		JLabel txtCh2 = new JLabel("required field indicator");
		agregarComponente(txtCh2, 1, 12, 1, 1);

		// ESPACIO BLANCO
		JLabel espacioB3 = new JLabel();
		gbc.insets = new Insets(10, 0, 10, 0);
		agregarComponente(espacioB3, 0, 13, 1, 1);
		gbc.insets = new Insets(0, 0, 0, 0);

		// CAMPOTEXTO
		JLabel txtCampo = new JLabel("Set from width");
		agregarComponente(txtCampo, 1, 14, 1, 1);
		JTextField campoTxt1 = new JTextField();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		agregarComponente(campoTxt1, 1, 15, 2, 1);

		// ESPACIO BLANCO
		JLabel espacioB4 = new JLabel();
		gbc.insets = new Insets(10, 0, 10, 0);
		agregarComponente(espacioB4, 0, 16, 1, 1);
		gbc.insets = new Insets(0, 0, 0, 0);

		// CHECKBOX
		JCheckBox chBoxC1 = new JCheckBox();
		agregarComponente(chBoxC1, 0, 17, 1, 1);
		JLabel txtChC1 = new JLabel("enable evil popup mode");
		agregarComponente(txtChC1, 1, 17, 1, 1);

		JCheckBox chBoxC2 = new JCheckBox();
		agregarComponente(chBoxC2, 0, 18, 1, 1);
		JLabel txtChC2 = new JLabel("disable all JavaScript");
		agregarComponente(txtChC2, 1, 18, 1, 1);

		JCheckBox chBoxC3 = new JCheckBox();
		agregarComponente(chBoxC3, 0, 19, 1, 1);
		JLabel txtChC3 = new JLabel("include archive link");
		agregarComponente(txtChC3, 1, 19, 1, 1);

		JCheckBox chBoxC4 = new JCheckBox();
		agregarComponente(chBoxC4, 0, 20, 1, 1);
		JLabel txtChC4 = new JLabel("include MonkeyRewards link");
		agregarComponente(txtChC4, 1, 20, 1, 1);

		// ESPACIO BLANCO
		JLabel espacioB5 = new JLabel();
		gbc.insets = new Insets(0, 20, 0, 20);
		agregarComponente(espacioB5, 3, 0, 1, 1);
		gbc.insets = new Insets(0, 0, 0, 0);

		// 2COLUMNA(PREVIEW)
		JLabel txtTexto2 = new JLabel("Preview");
		agregarComponente(txtTexto2, 4, 0, 1, 1);
		// EMAIL
		JLabel espacio = new JLabel("                                                           ");
		agregarComponente(espacio, 6, 0, 1, 1);
		JLabel txtEmailt = new JLabel("Email Adress");
		agregarComponente(txtEmailt, 5, 1, 1, 1);
		JFormattedTextField txtEmail = new JFormattedTextField();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		agregarComponente(txtEmail, 5, 2, 2, 1);
		// PRIMER NOMBRE
		JLabel txtNombret = new JLabel("First name");
		agregarComponente(txtNombret, 5, 3, 1, 1);
		JTextField txtNombre = new JFormattedTextField();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		agregarComponente(txtNombre, 5, 4, 2, 1);
		// APELLIDOS
		JLabel txtApellidost = new JLabel("Last name");
		agregarComponente(txtApellidost, 5, 5, 1, 1);
		JTextField txtApellidos = new JFormattedTextField();
		agregarComponente(txtApellidos, 5, 6, 2, 1);

		// ESPACIO BLANCO
		JLabel espacioB6 = new JLabel();
		gbc.insets = new Insets(10, 0, 10, 0);
		agregarComponente(espacioB6, 5, 7, 1, 1);
		gbc.insets = new Insets(0, 0, 0, 0);

		// BOTONSUB
		ImageIcon icon = new ImageIcon("src/imagenes/icono.png");
		Image image = icon.getImage();
		image = image.getScaledInstance(20, 20, 5);
		icon = new ImageIcon(image);
		JButton bttSub = new JButton("Suscribe");
		bttSub.setIcon(icon);
		bttSub.setIconTextGap(1);
		agregarComponente(bttSub, 5, 8, 1, 1);

		// ESPACIO BLANCO
		JLabel espacioB7 = new JLabel();
		gbc.insets = new Insets(20, 0, 20, 0);
		agregarComponente(espacioB7, 5, 9, 1, 1);
		gbc.insets = new Insets(0, 0, 0, 0);

		// CAJATEXTO
		JLabel txtFtexto = new JLabel("Copy/paste into your site");
		agregarComponente(txtFtexto, 5, 10, 1, 1);
		JTextField txtTextoG = new JTextField();
		gbc.fill = GridBagConstraints.BOTH;
		agregarComponente(txtTextoG, 5, 11, 5, 7);

		pack();
		setLocationRelativeTo(null);
	}

	public void agregarComponente(JComponent c, int x, int y, int anchura, int altura) {
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
