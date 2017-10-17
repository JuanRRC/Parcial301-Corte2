package Grafica2;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import Objeto.*;

public class Registro extends JPanel implements ActionListener{

	
	public static final String AGREGAR = "AGREGAR";
	
	Visualizador pantalla;
	private JButton agregar;
    private JTextField nombre,apellido,numero,celular,direccion;
    private JComboBox tipo,genero;
    private JSpinner peso,edad,altura;
    private String[] columnas = {" Identificacion ", " Datos "};
    private ArrayList<Object[]> lista1 = new ArrayList<Object[]>();
    private DefaultTableModel referencia_tabla_model;
	private ArrayList<Object[]> referencia_almacen;
    
    //DefaultTableModel referencia_tabla_model, ArrayList<Object[]> referencia_almacen
    public Registro(DefaultTableModel referencia_tabla_model, ArrayList<Object[]> referencia_almacen) {
		super();
		this.referencia_tabla_model = referencia_tabla_model;
		this.referencia_almacen = referencia_almacen;
		
	    this.iniciar();  

	}
    
    
    public void iniciar() {

		
    	
        setLayout( new GridBagLayout( ) );

        Border borde = BorderFactory.createTitledBorder( "Datos" );
        setBorder( borde );
        
       
        GridBagConstraints constraint = new GridBagConstraints( );

        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH;

        Insets insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        
        
        
        JLabel imagen = new JLabel( );
        ImageIcon icono = new ImageIcon( "Imagen/imagen.gif" );
        imagen.setIcon( icono );
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(imagen,constraint);
        
        
        agregar = new JButton( "Agregar" );
        agregar.addActionListener( this );
        agregar.setActionCommand( AGREGAR );	       
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 14;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;	        
        add( agregar, constraint );

        
        JLabel nom = new JLabel("Nombre :");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 4;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(nom,constraint);
        
        nombre = new JTextField(5);
        nombre.addActionListener(this);
        constraint = new GridBagConstraints( );
        constraint.gridx = 1;
        constraint.gridy = 4;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(nombre,constraint);
       
        
        JLabel ape = new JLabel("Apellido :");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 5;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(ape,constraint);
        
        apellido = new JTextField(5);
        apellido.addActionListener(this);
        constraint = new GridBagConstraints( );
        constraint.gridx = 1;
        constraint.gridy = 5;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(apellido,constraint);
        
        
        JLabel cc = new JLabel("Tipo :");			
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 6;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(cc,constraint);
        
        
        tipo = new JComboBox();
		tipo.setModel(new DefaultComboBoxModel(new String[] {"CC","TI","Pasaporte","Registro Civil"}));    
        tipo.addActionListener(this);
        constraint = new GridBagConstraints( );
        constraint.gridx = 1;
        constraint.gridy = 6;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(tipo,constraint);
       
        JLabel ge = new JLabel("Genero :");			
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 7;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(ge,constraint);
        
        
        genero = new JComboBox();
        genero.setModel(new DefaultComboBoxModel(new String[] {"Masculino","Femenino",}));    
        genero.addActionListener(this);
        constraint = new GridBagConstraints( );
        constraint.gridx = 1;
        constraint.gridy = 7;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(genero,constraint);
        
        JLabel num = new JLabel("Numero :");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 8;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(num,constraint);
        
        numero = new JTextField(5);
        numero.addActionListener(this);
        constraint = new GridBagConstraints( );
        constraint.gridx = 1;
        constraint.gridy = 8;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(numero,constraint);
        
        JLabel ed = new JLabel("Edad :");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 9;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(ed,constraint);
        
        
        SpinnerNumberModel sModel = new SpinnerNumberModel(0, 0, 150, 1);
        edad = new JSpinner(sModel);
        constraint = new GridBagConstraints( );
        constraint.gridx = 1;
        constraint.gridy = 9;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(edad,constraint);
        
        
        JLabel pes = new JLabel("Peso :");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 10;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(pes,constraint);
        
        
        SpinnerNumberModel sModel2 = new SpinnerNumberModel(0, 0, 500, 1);
        peso = new JSpinner(sModel2);
        constraint = new GridBagConstraints( );
        constraint.gridx = 1;
        constraint.gridy = 10;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(peso,constraint);

        
        JLabel altu = new JLabel("Altura :");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 11;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(altu,constraint);
        
        
        SpinnerNumberModel sModel3 = new SpinnerNumberModel(0, 0, 300, 1);
        altura = new JSpinner(sModel3);
        constraint = new GridBagConstraints( );
        constraint.gridx = 1;
        constraint.gridy = 11;
        constraint.fill = GridBagConstraints.BOTH;
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(altura,constraint);

        
        JLabel cel = new JLabel("Celular :");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 12;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(cel,constraint);
        
        celular = new JTextField(5);
        celular.addActionListener(this);
        constraint = new GridBagConstraints( );
        constraint.gridx = 1;
        constraint.gridy = 12;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(celular,constraint);
        
        
        JLabel dir = new JLabel("Direccion :");
        constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 13;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(dir,constraint);
        
        direccion = new JTextField(5);
        direccion.addActionListener(this);
        constraint = new GridBagConstraints( );
        constraint.gridx = 1;
        constraint.gridy = 13;
        constraint.fill = GridBagConstraints.BOTH; 
        insets = new Insets( 5, 10, 5, 10 );
        constraint.insets = insets;
        add(direccion,constraint);
        
        
        
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String accion = e.getActionCommand( );
        if( accion.equals( AGREGAR ) ) {
        	
        	String nom = nombre.getText();
        	String ape = apellido.getText();
        	String t = (String) tipo.getSelectedItem();
        	String gen = (String) genero.getSelectedItem();
        	String num = numero.getText();
        	int ed = (int) edad.getValue();
        	int p = (int) peso.getValue();
        	int a = (int) altura.getValue();
        	String ce = celular.getText();
        	int cel = Integer.parseInt(ce);
        	String dir = direccion.getText();
        	//nombre, apellido,tipo,genero,numero,edad,peso,altura,celular,direccion
        	referencia_almacen.add(Persona.build(nom,ape,t,gen,num,ed,p,a,cel,dir).getDetalles());
    		Object[][] datos = referencia_almacen.toArray(new Object[referencia_almacen.size()][]);
    		referencia_tabla_model.setDataVector(datos, columnas);
    		JOptionPane.showMessageDialog(this, "Persona Ingresada ");
        }
		
		
		
	}    
}
