package domain;

import java.text.SimpleDateFormat; // Esto es para formatear la fecha y que se vea mas prolija
import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;
    
    // Constructor
    public Cliente(String nombre, Date fechaRegistro, boolean vip){
        super(nombre);
        this.idCliente = ++Cliente.contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    
    // Metodos Getter and Setter
    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sb.append(", fechaRegistro=").append(sdf.format(fechaRegistro));
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
