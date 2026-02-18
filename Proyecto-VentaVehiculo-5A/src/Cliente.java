/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kiberly
 */
public class Cliente {
    private String rs;
    private String rfc;
    private String email;
    
    public Cliente(String rs, String rfc, String email){
        this.rs = rs;
        this.rfc = rfc;
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "RS = "+this.rs+"\n"+
                "RFC = "+this.rfc+"\n"+
                "EMAIL = "+this.email+"\n";

    }
    
}
