package modelo.strategy;

import java.util.ArrayList;

/**
 *
 * @author Dario Triviño
 */
public class Paypal implements FormaPago{
    
    private String usuario;
    private String contraseña;
    private String correo;
    private double pago;
    private ArrayList<Paypal> FacturasPaypal = new ArrayList<>();
    
    public Paypal(String usuario, String contraseña,String correo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.pago=0;
        this.correo=correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    @Override
    public boolean pago(double valorPagar) {
            if(valorPagar==0) return false;
            pago = valorPagar;
            Paypal cuenPaypal = new Paypal(usuario,contraseña,correo);
             FacturasPaypal.add(cuenPaypal);
            return true;   
    }
    
    
    public String enviarCorreo(){
        for(Paypal fp: FacturasPaypal){
             if(fp.getUsuario().equals(usuario)){
                 return "Correo enviado";
             }
             else{
                 return "EL cliente no ha pagado";
             }
        }return null;
    }
    
    
    }

 
