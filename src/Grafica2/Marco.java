package Grafica2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Marco extends JFrame{
	
	Registro formulario;
	private JTable tablaP;
	private String[] columnas = {" Identificaion ", "   Datos   "};
	private ArrayList<Object[]> personas = new ArrayList<Object[]>();
	private DefaultTableModel table_model;
	private Object[][] datos2;
	
	
	public Marco(){
		 super("Programa");
		 iniciar();
		 componente();
		 setVisible(true);
		 pack();
		
        setLocationRelativeTo( null );
	}
	
	public Marco iniciar(){
				
				Dimension dims = new Dimension(1000, 650);
				this.setSize(dims);
				this.setPreferredSize(dims);
				this.getContentPane( ).setLayout( new BorderLayout( ) );
				
				return this;
	}
	
public void componente() {
		

        datos2 = personas.toArray(new Object[personas.size()][]);
		table_model = new DefaultTableModel(datos2, columnas);
		tablaP = new JTable(table_model);
		
		
		formulario = new Registro(table_model, personas);
		this.add(formulario, BorderLayout.WEST);
		this.add(new JScrollPane(tablaP), BorderLayout.EAST);
        
}
	

}
