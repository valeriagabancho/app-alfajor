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
		ImporteT=MenuPrincipal.importe0+MenuPrincipal.importe1+MenuPrincipal.importe2+MenuPrincipal.importe3+MenuPrincipal.importe4;
		VentasT=MenuPrincipal.venta0+MenuPrincipal.venta1+MenuPrincipal.venta2+MenuPrincipal.venta3+MenuPrincipal.venta4;
		txtS.setText("\n");
		txtS.append("Ventas por alfajor"+"\n\n");
		txtS.append("Nombre			: "+MenuPrincipal.marca0+"\n");
		txtS.append("Cantidad de Ventas		: "+MenuPrincipal.venta0+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+MenuPrincipal.cantidad0+"\n");
		txtS.append("Importe Total acumulado		: "+MenuPrincipal.importe0+"\n\n");
		
		txtS.append("Nombre			: "+MenuPrincipal.marca1+"\n");
		txtS.append("Cantidad de Ventas		: "+MenuPrincipal.venta1+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+MenuPrincipal.cantidad1+"\n");
		txtS.append("Importe Total acumulado		: "+MenuPrincipal.importe1+"\n\n");
		
		txtS.append("Nombre			: "+MenuPrincipal.marca2+"\n");
		txtS.append("Cantidad de Ventas		: "+MenuPrincipal.venta2+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+MenuPrincipal.cantidad2+"\n");
		txtS.append("Importe Total acumulado		: "+MenuPrincipal.importe2+"\n\n");
		
		txtS.append("Nombre			: "+MenuPrincipal.marca3+"\n");
		txtS.append("Cantidad de Ventas		: "+MenuPrincipal.venta3+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+MenuPrincipal.cantidad3+"\n");
		txtS.append("Importe Total acumulado		: "+MenuPrincipal.importe3+"\n\n");
		
		txtS.append("Nombre			: "+MenuPrincipal.marca4+"\n");
		txtS.append("Cantidad de Ventas		: "+MenuPrincipal.venta4+"\n");
		txtS.append("Cantidad total de Unidades vendidas	: "+MenuPrincipal.cantidad4+"\n");
		txtS.append("Importe Total acumulado		: "+MenuPrincipal.importe4+"\n\n\n");
		
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
		prom=(MenuPrincipal.precio0+MenuPrincipal.precio1+MenuPrincipal.precio2+MenuPrincipal.precio3+MenuPrincipal.precio4)/5;
		ImporteT=MenuPrincipal.importe0+MenuPrincipal.importe1+MenuPrincipal.importe2+MenuPrincipal.importe3+MenuPrincipal.importe4;
		VentasT=MenuPrincipal.venta0+MenuPrincipal.venta1+MenuPrincipal.venta2+MenuPrincipal.venta3+MenuPrincipal.venta4;
		if (rp==0){
			txtS.setText("");
			txtS.append("Ventas por alfajor"+"\n\n");
			txtS.append("Nombre			: "+MenuPrincipal.marca0+"\n");
			txtS.append("Cantidad de Ventas		: "+MenuPrincipal.venta0+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+MenuPrincipal.cantidad0+"\n");
			txtS.append("Importe Total acumulado		: S/ "+MenuPrincipal.importe0+"\n\n");
			
			txtS.append("Nombre			: "+MenuPrincipal.marca1+"\n");
			txtS.append("Cantidad de Ventas		: "+MenuPrincipal.venta1+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+MenuPrincipal.cantidad1+"\n");
			txtS.append("Importe Total acumulado		: S/ "+MenuPrincipal.importe1+"\n\n");
			
			txtS.append("Nombre			: "+MenuPrincipal.marca2+"\n");
			txtS.append("Cantidad de Ventas		: "+MenuPrincipal.venta2+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+MenuPrincipal.cantidad2+"\n");
			txtS.append("Importe Total acumulado		: S/ "+MenuPrincipal.importe2+"\n\n");
			
			txtS.append("Nombre			: "+MenuPrincipal.marca3+"\n");
			txtS.append("Cantidad de Ventas		: "+MenuPrincipal.venta3+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+MenuPrincipal.cantidad3+"\n");
			txtS.append("Importe Total acumulado		: S/ "+MenuPrincipal.importe3+"\n\n");
			
			txtS.append("Nombre			: "+MenuPrincipal.marca4+"\n");
			txtS.append("Cantidad de Ventas		: "+MenuPrincipal.venta4+"\n");
			txtS.append("Cantidad total de Unidades vendidas	: "+MenuPrincipal.cantidad4+"\n");
			txtS.append("Importe Total acumulado		: S/ "+MenuPrincipal.importe4+"\n\n\n");
			
			txtS.append("Importe total general acumulado	: S/ "+ImporteT+"\n");
			txtS.append("Cantidad total general de ventas	: "+VentasT+"\n");
		}
		else if (rp==1){
			int d0,d1,d2,d3,d4;
			d0=MenuPrincipal.cantidad0-MenuPrincipal.cantidadOptima;
			d1=MenuPrincipal.cantidad1-MenuPrincipal.cantidadOptima;
			d2=MenuPrincipal.cantidad2-MenuPrincipal.cantidadOptima;
			d3=MenuPrincipal.cantidad3-MenuPrincipal.cantidadOptima;
			d4=MenuPrincipal.cantidad4-MenuPrincipal.cantidadOptima;
			txtS.setText("\n");
			txtS.append("Alfajores con venta uptima"+"\n\n");
			if (MenuPrincipal.cantidad0>=MenuPrincipal.cantidadOptima){
				txtS.append("Marca			: "+MenuPrincipal.marca0+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+MenuPrincipal.cantidad0+"("+d0+" mus que la cantidad uptima)"+"\n\n");
			}
			if (MenuPrincipal.cantidad1>=MenuPrincipal.cantidadOptima){
				txtS.append("Marca			: "+MenuPrincipal.marca1+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+MenuPrincipal.cantidad1+"("+d1+" mus que la cantidad uptima)"+"\n\n");
			}
			if (MenuPrincipal.cantidad2>=MenuPrincipal.cantidadOptima){
				txtS.append("Marca			: "+MenuPrincipal.marca2+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+MenuPrincipal.cantidad2+"("+d2+" mus que la cantidad uptima)"+"\n\n");
			}
			if (MenuPrincipal.cantidad3>=MenuPrincipal.cantidadOptima){
				txtS.append("Marca			: "+MenuPrincipal.marca3+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+MenuPrincipal.cantidad3+"("+d3+" mus que la cantidad uptima)"+"\n\n");
			}
			if (MenuPrincipal.cantidad4>=MenuPrincipal.cantidadOptima){
				txtS.append("Marca			: "+MenuPrincipal.marca4+"\n");
				txtS.append("Cantidad total de cajas vendidas	: "+MenuPrincipal.cantidad4+"("+d4+" mus que la cantidad uptima)"+"\n\n");
			}
			if (MenuPrincipal.cantidad0<MenuPrincipal.cantidadOptima && MenuPrincipal.cantidad1<MenuPrincipal.cantidadOptima 
				&& MenuPrincipal.cantidad2<MenuPrincipal.cantidadOptima && MenuPrincipal.cantidad3<MenuPrincipal.cantidadOptima
				&& MenuPrincipal.cantidad4<MenuPrincipal.cantidadOptima)
				txtS.setText("No existen marcas con venta uptima");

		}
		else if (rp==2){
	
			txtS.setText("\n"+"Precios en relaciun al promedio"+"\n\n");
			txtS.append("Nombre	: "+MenuPrincipal.marca0+"\n");
			txtS.append("Precio	: "+MenuPrincipal.precio0);
			if (MenuPrincipal.precio0>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (MenuPrincipal.precio0==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Nombre	: "+MenuPrincipal.marca1+"\n");
			txtS.append("Precio	: "+MenuPrincipal.precio1);
			if (MenuPrincipal.precio1>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (MenuPrincipal.precio1==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Nombre	: "+MenuPrincipal.marca2+"\n");
			txtS.append("Precio	: "+MenuPrincipal.precio2);
			if (MenuPrincipal.precio2>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (MenuPrincipal.precio2==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Nombre	: "+MenuPrincipal.marca3+"\n");
			txtS.append("Precio	: "+MenuPrincipal.precio3);
			if (MenuPrincipal.precio3>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (MenuPrincipal.precio3==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Nombre	: "+MenuPrincipal.marca4+"\n");
			txtS.append("Precio	: "+MenuPrincipal.precio4);
			if (MenuPrincipal.precio4>prom)txtS.append(" (mayor al promedio)"+"\n\n");
			else if (MenuPrincipal.precio4==prom) txtS.append(" (igual al promedio)"+"\n\n");
			else txtS.append(" (menor al promedio)"+"\n\n");
			
			txtS.append("Precio promedio	: S/ "+prom);
		}
		else {
			
			double menor, mayor;
			menor=MenuPrincipal.precio0;
			mayor=MenuPrincipal.precio0;
			if (MenuPrincipal.precio1<menor)menor=MenuPrincipal.precio1;
			if (MenuPrincipal.precio2<menor)menor=MenuPrincipal.precio2;
			if (MenuPrincipal.precio3<menor)menor=MenuPrincipal.precio3;
			if (MenuPrincipal.precio4<menor)menor=MenuPrincipal.precio4;
			if (MenuPrincipal.precio1>mayor)mayor=MenuPrincipal.precio1;
			if (MenuPrincipal.precio2>mayor)mayor=MenuPrincipal.precio2;
			if (MenuPrincipal.precio3>mayor)mayor=MenuPrincipal.precio3;
			if (MenuPrincipal.precio4>mayor)mayor=MenuPrincipal.precio4;
			txtS.setText("Precio promedio, menor y mayor"+"\n\n");
			txtS.append("Precio promedio	: S/ "+prom+"\n");
			txtS.append("Precio menor		: S/ "+menor+"\n");
			txtS.append("Precio mayor		: S/ "+mayor);
		}
		
	}
}
