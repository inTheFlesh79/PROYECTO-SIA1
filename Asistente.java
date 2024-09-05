package Proyecto;

public class Asistente {
	private String idAsistente;
	private String nombre;
	private int edad;
	private String email;
	private boolean confirmacionAsistencia;;
	
	public Asistente(String idAsistente, String nombre, int edad, String email) {
		//Inserte validaciones pertinentes
		this.idAsistente = idAsistente;
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}
	
	public String getnombre() {
        return nombre;
    } 

	public String getidAsistente() {
        return idAsistente;
    }

	public String getemail() {
        return email;
    }  

	public int getedad() {
        return edad;
    }

	public boolean getConfirmacionAsistencia() {
        return confirmacionAsistencia;
    } 

	public void setnombre(String nombre) {
        this.nombre = nombre;
    }

	public void setidAsistente(String idAsistente) {
        this.idAsistente = idAsistente;
    }   

	public void setemail(String email) {
        this.email = email;
    }  


	public void setedad(int edad) {
        this.edad = edad;
    }

	public void setconfirmacionAsistencia(boolean confirmacionAsistencia) {
        this.confirmacionAsistencia = confirmacionAsistencia;
    }
}
