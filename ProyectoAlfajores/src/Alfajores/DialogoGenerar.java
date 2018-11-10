package Alfajores;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoGenerar extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTipoDeReporte;
	private JButton btnCerrar;
	private JComboBox<String> cboReporte;
	private JTextArea txtS;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoGenerar dialog = new DialogoGenerar();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoGenerar() {
		setTitle("Generar reportes");
		setBounds(100, 100, 635, 390);
		getContentPane().setLayout(null);
		
		lblTipoDeReporte = new JLabel("Tipo de reporte");
		lblTipoDeReporte.setBounds(10, 11, 95, 14);
		getContentPane().add(lblTipoDeReporte);
		
		cboReporte = new JComboBox<String>();
		cboReporte.addActionListener(this);
		cboReporte.setModel(new DefaultComboBoxModel<String>(new String[] {"Ventas por marca", "Marcas con venta \u00F3pitma", "Precios en relaci\u00F3n al promedio", "Precios promedios, menor y mayor"}));
		cboReporte.setBounds(104, 8, 332, 20);
		getContentPane().add(cboReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(520, 7, 89, 23);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 41, 599, 299);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		double ImporteT;
		int VentasT;
		ImporteT=Men�Principal.importe0+Men�Principal.importe1+Men�Principal.importe2+Men�Principal.importe3+Men�Principal.importe4;
		VentasT=Men�Principal.venta0+Men�Principal.venta1+Men�Principal.venta2+Men�Principal.venta3+Men�Principal.venta4;
		txtS.setText("\n");
		txtS.append("Ventas por alfajor"+"\n\n");
		txtS.append("Nombre			: "+Men�Principal.marca0+"\n");
		txtS.append("Cantidad de Ventas		: "+Men�Principal.venta0+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+Men�Principal.cantidad0+"\n");
		txtS.append("Importe Total acumulado		: "+Men�Principal.importe0+"\n\n");
		
		txtS.append("Nombre			: "+Men�Principal.marca1+"\n");
		txtS.append("Cantidad de Ventas		: "+Men�Principal.venta1+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+Men�Principal.cantidad1+"\n");
		txtS.append("Importe Total acumulado		: "+Men�Principal.importe1+"\n\n");
		
		txtS.append("Nombre			: "+Men�Principal.marca2+"\n");
		txtS.append("Cantidad de Ventas		: "+Men�Principal.venta2+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+Men�Principal.cantidad2+"\n");
		txtS.append("Importe Total acumulado		: "+Men�Principal.importe2+"\n\n");
		
		txtS.append("Nombre			: "+Men�Principal.marca3+"\n");
		txtS.append("Cantidad de Ventas		: "+Men�Principal.venta3+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+Men�Principal.cantidad3+"\n");
		txtS.append("Importe Total acumulado		: "+Men�Principal.importe3+"\n\n");
		
		txtS.append("Nombre			: "+Men�Principal.marca4+"\n");
		txtS.append("Cantidad de Ventas		: "+Men�Principal.venta4+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+Men�Principal.cantidad4+"\n");
		txtS.append("Importe Total acumulado		: "+Men�Principal.importe4+"\n\n\n");
		
		txtS.append("Importe total general acumulado	: "+ImporteT+"\n");
		txtS.append("Cantidad total general de ventas	: "+VentasT+"\n");
	}
		
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboReporte) {
			cboReporteActionPerformed(e);
		}
		if (e.getSource() == btnCerrar) {
			btnCerrarActionPerformed(e);
		}
	}
	protected void btnCerrarActionPerformed(ActionEvent e) {
		dispose();
	}
	protected void cboReporteActionPerformed(ActionEvent e) {
		int rp=cboReporte.getSelectedIndex();
		double ImporteT,prom;
		int VentasT;
		prom=(Men�Principal.precio0+Men�Principal.precio1+Men�Principal.precio2+Men�Principal.precio3+Men�Principal.precio4)/5;
		ImporteT=Men�Principal.importe0+Men�Principal.importe1+Men�Principal.importe2+Men�Principal.importe3+Men�Principal.importe4;
		VentasT=Men�Principal.venta0+Men�Principal.venta1+Men�Principal.venta2+Men�Principal.venta3+Men�Principal.venta4;
		if (rp==0){
			txtS.setText("");
			txtS.append("Ventas por alfajor"+"\n\n");
			txtS.append("Nombre			: "+Men�Principal.marca0+"\n");
			txtS.append("Cantidad de Ventas		: "+Men�Principal.venta0+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+Men�Principal.cantidad0+"\n");
			txtS.append("Importe Total acumulado		: S/ "+Men�Principal.importe0+"\n\n");
			
			txtS.append("Nombre			: "+Men�Principal.marca1+"\n");
			txtS.append("Cantidad de Ventas		: "+Men�Principal.venta1+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+Men�Principal.cantidad1+"\n");
			txtS.append("Importe Total acumulado		: S/ "+Men�Principal.importe1+"\n\n");
			
			txtS.append("Nombre			: "+Men�Principal.marca2+"\n");
			txtS.append("Cantidad de Ventas		: "+Men�Principal.venta2+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+Men�Principal.cantidad2+"\n");
			txtS.append("Importe Total acumulado		: S/ "+Men�Principal.importe2+"\n\n");
			
			txtS.append("Nombre			: "+Men�Principal.marca3+"\n");
			txtS.append("Cantidad de Ventas		: "+Men�Principal.venta3+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+Men�Principal.cantidad3+"\n");
			txtS.append("Importe Total acumulado		: S/ "+Men�Principal.importe3+"\n\n");
			
			txtS.append("Nombre			: "+Men�Principal.marca4+"\n");
			txtS.append("Cantidad de Ventas		: "+Men�Principal.venta4+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+Men�Principal.cantidad4+"\n");
			txtS.append("Importe Total acumulado		: S/ "+Men�Principal.importe4+"\n\n\n");
			
			txtS.append("Importe total general acumulado	: S/ "+ImporteT+"\n");
			txtS.append("Cantidad total general de ventas	: "+VentasT+"\n");
		}
		else if (rp==1){
			int d0,d1,d2,d3,d4;
			d0=Men�Principal.cantidad0-Men�Principal.cantidadOptima;
			d1=Men�Principal.cantidad1-Men�Principal.cantidadOptima;
			d2=Men�Principal.cantidad2-Men�Principal.cantidadOptima;
			d3=Men�Principal.cantidad3-Men�Principal.cantidadOptima;
			d4=Men�Principal.cantidad4-Men�Principal.cantidadOptima;
			txtS.setText("\n");
			txtS.append("Alfajores con venta �ptima"+"\n\n");
			if (Men�Principal.cantidad0>=Men�Principal.cantidadOptima){
				txtS.append("Marca			: "+Men�Principal.marca0+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+Men�Principal.cantidad0+"("+d0+" m�s que la cantidad �ptima)"+"\n\n");
			}
			if (Men�Principal.cantidad1>=Men�Principal.cantidadOptima){
				txtS.append("Marca			: "+Men�Principal.marca1+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+Men�Principal.cantidad1+"("+d1+" m�s que la cantidad �ptima)"+"\n\n");
			}
			if (Men�Principal.cantidad2>=Men�Principal.cantidadOptima){
				txtS.append("Marca			: "+Men�Principal.marca2+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+Men�Principal.cantidad2+"("+d2+" m�s que la cantidad �ptima)"+"\n\n");
			}
			if (Men�Principal.cantidad3>=Men�Principal.cantidadOptima){
				txtS.append("Marca			: "+Men�Principal.marca3+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+Men�Principal.cantidad3+"("+d3+" m�s que la cantidad �ptima)"+"\n\n");
			}
			if (Men�Principal.cantidad4>=Men�Principal.cantidadOptima){
				txtS.append("Marca			: "+Men�Principal.marca4+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+Men�Principal.cantidad4+"("+d4+" m�s que la cantidad �ptima)"+"\n\n");
			}
			if (Men�Principal.cantidad0<Men�Principal.cantidadOptima && Men�Principal.cantidad1<Men�Principal.cantidadOptima 
				&& Men�Principal.cantidad2<Men�Principal.cantidadOptima && Men�Principal.cantidad3<Men�Principal.cantidadOptima
				&& Men�Principal.cantidad4<Men�Principal.cantidadOptima)
				txtS.setText("No existen marcas con venta �ptima");

		}
		else if (rp==2){
	
			txtS.setText("\n"+"Precios en relaci�n al promedio"+"\n\n");
			txtS.append("Nombre	: "+Men�Principal.marca0+"\n");
			txtS.append("Precio	: "+Men�Principal.precio0);
			if (Men�Principal.precio0>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (Men�Principal.precio0==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Nombre	: "+Men�Principal.marca1+"\n");
			txtS.append("Precio	: "+Men�Principal.precio1);
			if (Men�Principal.precio1>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (Men�Principal.precio1==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Nombre	: "+Men�Principal.marca2+"\n");
			txtS.append("Precio	: "+Men�Principal.precio2);
			if (Men�Principal.precio2>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (Men�Principal.precio2==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Nombre	: "+Men�Principal.marca3+"\n");
			txtS.append("Precio	: "+Men�Principal.precio3);
			if (Men�Principal.precio3>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (Men�Principal.precio3==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Nombre	: "+Men�Principal.marca4+"\n");
			txtS.append("Precio	: "+Men�Principal.precio4);
			if (Men�Principal.precio4>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (Men�Principal.precio4==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Precio promedio	: S/ "+prom);
		}
		else {
			
			double menor, mayor;
			menor=Men�Principal.precio0;
			mayor=Men�Principal.precio0;
			if (Men�Principal.precio1<menor)menor=Men�Principal.precio1;
			if (Men�Principal.precio2<menor)menor=Men�Principal.precio2;
			if (Men�Principal.precio3<menor)menor=Men�Principal.precio3;
			if (Men�Principal.precio4<menor)menor=Men�Principal.precio4;
			if (Men�Principal.precio1>mayor)mayor=Men�Principal.precio1;
			if (Men�Principal.precio2>mayor)mayor=Men�Principal.precio2;
			if (Men�Principal.precio3>mayor)mayor=Men�Principal.precio3;
			if (Men�Principal.precio4>mayor)mayor=Men�Principal.precio4;
			txtS.setText("Precio promedio, menor y mayor"+"\n\n");
			txtS.append("Precio promedio	: S/ "+prom+"\n");
			txtS.append("Precio menor		: S/ "+menor+"\n");
			txtS.append("Precio mayor		: S/ "+mayor);
		}
		
	}
}
