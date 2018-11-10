package Alfajores;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;

public class DialogoListar extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoListar dialog = new DialogoListar();
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
	public DialogoListar() {
		setForeground(Color.BLACK);
		getContentPane().setForeground(Color.BLACK);
		setTitle("Listar");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 424, 212);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		txtS.setForeground(Color.BLACK);
		txtS.setEditable(false);
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtS);

		panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBounds(128, 238, 188, 23);
		getContentPane().add(panel);
		panel.setLayout(null);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(99, 0, 89, 23);
		panel.add(btnListar);
		
				btnCerrar = new JButton("Cerrar");
				btnCerrar.setBounds(0, 0, 89, 23);
				panel.add(btnCerrar);
		btnCerrar.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedBtnListar(ActionEvent e) {
		
		txtS.setText("Listado de Alfajores"+"\n\n");
		txtS.append("Marca     : "+MenuPrincipal.marca0+"\n");
		txtS.append("Precio    : S/ "+MenuPrincipal.precio0+"\n");
		txtS.append("Contenido : "+MenuPrincipal.contenido0+" ud"+"\n");
		txtS.append("Peso      : "+MenuPrincipal.peso0+"\n");
		txtS.append("Sabor     : "+MenuPrincipal.sabor0+"\n\n");
		
		txtS.append("Marca     : "+MenuPrincipal.marca1+"\n");
		txtS.append("Precio    : S/ "+MenuPrincipal.precio1+"\n");
		txtS.append("Contenido : "+MenuPrincipal.contenido1+" ud"+"\n");
		txtS.append("Peso      : "+MenuPrincipal.peso1+"\n");
		txtS.append("Sabor     : "+MenuPrincipal.sabor1+"\n\n");
		
		txtS.append("Marca     : "+MenuPrincipal.marca2+"\n");
		txtS.append("Precio    : S/ "+MenuPrincipal.precio2+"\n");
		txtS.append("Contenido : "+MenuPrincipal.contenido2+" ud"+"\n");
		txtS.append("Peso      : "+MenuPrincipal.peso2+"\n");
		txtS.append("Sabor     : "+MenuPrincipal.sabor2+"\n\n");
		
		txtS.append("Marca     : "+MenuPrincipal.marca3+"\n");
		txtS.append("Precio    : S/ "+MenuPrincipal.precio3+"\n");
		txtS.append("Contenido : "+MenuPrincipal.contenido3+" ud"+"\n");
		txtS.append("Peso      : "+MenuPrincipal.peso3+"\n");
		txtS.append("Sabor     : "+MenuPrincipal.sabor3+"\n\n");
		
		txtS.append("Marca     : "+MenuPrincipal.marca4+"\n");
		txtS.append("Precio    : S/ "+MenuPrincipal.precio4+"\n");
		txtS.append("Contenido : "+MenuPrincipal.contenido4+" ud"+"\n");
		txtS.append("Peso      : "+MenuPrincipal.peso4+"\n");
		txtS.append("Sabor     : "+MenuPrincipal.sabor4+"\n\n");
	}
	
}
