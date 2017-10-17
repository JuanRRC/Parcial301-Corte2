package Grafica2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelArriba extends JPanel {
	
	public PanelArriba() {
		
		    setLayout( new BorderLayout( ) );
	        JLabel imagen = new JLabel( );
	       // JLabel imagen2 = new JLabel( );
	        ImageIcon icono = new ImageIcon( "Imagen/imagen.gif" );
	        //ImageIcon icono2 = new ImageIcon( "img/logo.JPG" );
	      
	        
	        imagen.setIcon( icono );
	      //  imagen2.setIcon( icono2 );
	        //Define el icono que mostrará este componente.
	        imagen.setVerticalAlignment( JLabel.NORTH );
	     //   imagen2.setHorizontalAlignment( JLabel.CENTER );
	        //Establece la alineación del contenido de la etiqueta a lo largo del eje X.
	        
	        add( imagen, BorderLayout.NORTH );
	      //  add( imagen2, BorderLayout.WEST );
	        //ubicacion de mi imagen dentro del panel
	        
	        setBackground( Color.WHITE );
	}
}

