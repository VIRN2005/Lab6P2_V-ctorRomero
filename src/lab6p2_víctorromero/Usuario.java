package lab6p2_víctorromero;

public class Usuario {

    private String username;
    private String contraseña;
    private int edad;

    public Usuario() {
    }

    public Usuario(String username, String contraseña, int edad) {
        this.username = username;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return ">> USUARIO << \n"
                + "Username -> " + username + "\n"
                + "Contrase\u00f1a -> " + contraseña + "\n"
                + "Edad -> " + edad + '}';
    }

}
