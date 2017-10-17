package Objeto;

public class Persona {

	
	private String nombre;
	private String apellido;
	private String Tipo;
	private String genero;
	private String numero;
	private int Edad;
	private int peso;
	private int altura;
	private int celular;
	private String direccion;
	
	public Persona(String nombre, String apellido, String tipo, String genero,String numero, int edad, int peso, int altura,
			int celular, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		Tipo = tipo;
		this.genero = genero;
		this.numero=numero;
		Edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.celular = celular;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Object[] getDetalles() {
		Object[] data = {this.numero,this.nombre};
		System.out.println(data);
		return data;
	}
	
	public static Persona build(String nombre, String apellido, String tipo, String genero,String numero, int edad, int peso, int altura,
			int celular, String direccion){
		return new Persona(nombre, apellido,tipo,genero,numero,edad,peso,altura,celular,direccion);
	}
	
}
