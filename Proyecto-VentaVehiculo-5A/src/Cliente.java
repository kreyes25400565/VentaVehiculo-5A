/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kiberly
 */
public class Cliente {
    private String nombre;
    private String rfc;
    private String telefono;
    private String email;
    
    public Cliente(String nombre, String rfc,String telefono, String email){
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
        this.email = email;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    public String getRfc(){
        return rfc;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getEmail(){
        return email;
    }
    @Override
    public String toString(){
        return "RS = "+this.rs+"\n"+
                "RFC = "+this.rfc+"\n"+
                "EMAIL = "+this.email+"\n";

    }
    
}
