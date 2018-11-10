package Alfajores;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class DialogoModificar extends JDialog implements ActionListener, ItemListener, KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblMarca;
	private JLabel lblPrecio;
	private JLabel lblContenidoud;
	private JLabel lblPesog;
	private JLabel lblSabor;
	private JComboBox<String> cboMarca;
	private JTextField txtPrecio;
	private JTextField txtContenido;
	private JTextField txtPeso;
	private JTextField txtSabor;
	private JButton btnCerrar;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoModificar dialog = new DialogoModificar();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoModificar() {
		setForeground(Color.BLACK);
		getContentPane().setForeground(Color.BLACK);
		setTitle("Modificar Alfajor");
		setBounds(100, 100, 340, 170);
		getContentPane().setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setForeground(Color.BLACK);
		lblMarca.setBounds(10, 11, 90, 14);
		getContentPane().add(lblMarca);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setForeground(Color.BLACK);
		lblPrecio.setBounds(10, 36, 90, 14);
		getContentPane().add(lblPrecio);
		
		lblContenidoud = new JLabel("Contenido (ud)");
		lblContenidoud.setForeground(Color.BLACK);
		lblContenidoud.setBounds(10, 61, 90, 14);
		getContentPane().add(lblContenidoud);
		
		lblPesog = new JLabel("Peso (g)");
		lblPesog.setForeground(Color.BLACK);
		lblPesog.setBounds(10, 86, 77, 14);
		getContentPane().add(lblPesog);
		
		lblSabor = new JLabel("Sabor");
		lblSabor.setForeground(Color.BLACK);
		lblSabor.setBounds(10, 111, 46, 14);
		getContentPane().add(lblSabor);
		
		cboMarca = new JComboBox<String>();
		cboMarca.setForeground(Color.BLACK);
		cboMarca.addItemListener(this);
		cboMarca.setModel(new DefaultComboBoxModel<String>(new String[] {"Alfano", "Delicia", "Vimar", "Turok", "Havanna"}));
		cboMarca.setBounds(97, 8, 86, 20);
		getContentPane().add(cboMarca);
		
		txtPrecio = new JTextField();
		txtPrecio.addKeyListener(this);
		txtPrecio.setForeground(Color.BLACK);
		txtPrecio.setBounds(97, 36, 86, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtContenido = new JTextField();
		txtContenido.addKeyListener(this);
		txtContenido.setForeground(Color.BLACK);
		txtContenido.setBounds(97, 61, 86, 20);
		getContentPane().add(txtContenido);
		txtContenido.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.addKeyListener(this);
		txtPeso.setForeground(Color.BLACK);
		txtPeso.setBounds(97, 86, 86, 20);
		getContentPane().add(txtPeso);
		txtPeso.setColumns(10);
		
		txtSabor = new JTextField();
		txtSabor.addKeyListener(this);
		txtSabor.setForeground(Color.BLACK);
		txtSabor.setBounds(97, 108, 86, 20);
		getContentPane().add(txtSabor);
		txtSabor.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(225, 7, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(225, 32, 89, 23);
		getContentPane().add(btnGrabar);

		//inserta los datos del primer alfajor
		txtPrecio.setText(""+MenuPrincipal.precio0);
		txtContenido.setText(""+MenuPrincipal.contenido0);
		txtPeso.setText(""+MenuPrincipal.peso0);
		txtSabor.setText(MenuPrincipal.sabor0);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			btnGrabarActionPerformed(e);
		}
		if (e.getSource() == btnCerrar) {
			btnCerrarActionPerformed(e);
		}
	}
	protected void btnCerrarActionPerformed(ActionEvent e) {
		dispose();
	}
	protected void btnGrabarActionPerformed(ActionEvent e) {
		int op=cboMarca.getSelectedIndex();
		if (Double.parseDouble(txtPrecio.getText())<=0 || Integer.parseInt(txtContenido.getText())<=0
				|| Double.parseDouble(txtPeso.getText())<=0 || txtSabor.getText().equals("")||txtSabor.getText().equals(" "))
			JOptionPane.showMessageDialog(this,"Ingrese todos los datos requeridos");
		else {
			switch (op) {
			case 0: 
			MenuPrincipal.precio0=Double.parseDouble(txtPrecio.getText());
			MenuPrincipal.contenido0=Integer.parseInt(txtContenido.getText());
			MenuPrincipal.peso0=Double.parseDouble(txtPeso.getText());
			MenuPrincipal.sabor0=txtSabor.getText();
			break;
			case 1: 
			MenuPrincipal.precio1=Double.parseDouble(txtPrecio.getText());
			MenuPrincipal.contenido1=Integer.parseInt(txtContenido.getText());
			MenuPrincipal.peso1=Double.parseDouble(txtPeso.getText());
			MenuPrincipal.sabor1=txtSabor.getText();
			break;
			case 2: 
			MenuPrincipal.precio2=Double.parseDouble(txtPrecio.getText());
			MenuPrincipal.contenido2=Integer.parseInt(txtContenido.getText());
			MenuPrincipal.peso2=Double.parseDouble(txtPeso.getText());
			MenuPrincipal.sabor2=txtSabor.getText();
			break;
			case 3: 
			MenuPrincipal.precio3=Double.parseDouble(txtPrecio.getText());
			MenuPrincipal.contenido3=Integer.parseInt(txtContenido.getText());
			MenuPrincipal.peso3=Double.parseDouble(txtPeso.getText());
			MenuPrincipal.sabor3=txtSabor.getText();
			break;
			default: 
			MenuPrincipal.precio4=Double.parseDouble(txtPrecio.getText());
			MenuPrincipal.contenido4=Integer.parseInt(txtContenido.getText());
			MenuPrincipal.peso4=Double.parseDouble(txtPeso.getText());
			MenuPrincipal.sabor4=txtSabor.getText();
			}
		JOptionPane.showMessageDialog(this, "Datos grabados correctamente");
		dispose();
		}
	}
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == cboMarca) {
			cboMarcaItemStateChanged(arg0);
		}
	}
	protected void cboMarcaItemStateChanged(ItemEvent arg0) {
		int op=cboMarca.getSelectedIndex();
		if(op==0){
			txtPrecio.setText(""+MenuPrincipal.precio0);
			txtContenido.setText(""+MenuPrincipal.contenido0);
			txtPeso.setText(""+MenuPrincipal.peso0);
			txtSabor.setText(MenuPrincipal.sabor0);
		}
		else if(op==1){
			txtPrecio.setText(""+MenuPrincipal.precio1);
			txtContenido.setText(""+MenuPrincipal.contenido1);
			txtPeso.setText(""+MenuPrincipal.peso1);
			txtSabor.setText(MenuPrincipal.sabor1);
		}
		else if(op==2){
			txtPrecio.setText(""+MenuPrincipal.precio2);
			txtContenido.setText(""+MenuPrincipal.contenido2);
			txtPeso.setText(""+MenuPrincipal.peso2);
			txtSabor.setText(MenuPrincipal.sabor2);
		}
		else if(op==3){
			txtPrecio.setText(""+MenuPrincipal.precio3);
			txtContenido.setText(""+MenuPrincipal.contenido3);
			txtPeso.setText(""+MenuPrincipal.peso3);
			txtSabor.setText(MenuPrincipal.sabor3);
		}
		else {
			txtPrecio.setText(""+MenuPrincipal.precio4);
			txtContenido.setText(""+MenuPrincipal.contenido4);
			txtPeso.setText(""+MenuPrincipal.peso4);
			txtSabor.setText(MenuPrincipal.sabor4);
		}
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
	}
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getSource() == txtSabor) {
			txtSaborKeyTyped(arg0);
		}
		if (arg0.getSource() == txtPeso) {
			txtPesoKeyTyped(arg0);
		}
		if (arg0.getSource() == txtContenido) {
			txtContenidoKeyTyped(arg0);
		}
		if (arg0.getSource() == txtPrecio) {
			txtPrecioKeyTyped(arg0);
		}
	}
	protected void txtPrecioKeyTyped(KeyEvent arg0) {
		char c = arg0.getKeyChar();
		if ((c<'0'||c>'9')&&c!='.')arg0.consume();
	}
	protected void txtContenidoKeyTyped(KeyEvent arg0) {
		char c = arg0.getKeyChar();
		if (c<'0'||c>'9')arg0.consume();
	}
	protected void txtPesoKeyTyped(KeyEvent arg0) {
		char c = arg0.getKeyChar();
		if ((c<'0'||c>'9')&&c!='.')arg0.consume();
	}
	protected void txtSaborKeyTyped(KeyEvent arg0) {
		char c = arg0.getKeyChar();
		if ((c<'a'||c>'z')&& (c<'A'||c>'Z')&& c!='u'&&c!='u'&&c!='u'&&c!='u'&&c!='u'
				&&c!='u'&&c!='u'&&c!='u'&&c!='u'&&c!='u'&&c!='u'&&c!='u'&&(c!=(char)KeyEvent.VK_SPACE)) 
			arg0.consume();
	}
}
