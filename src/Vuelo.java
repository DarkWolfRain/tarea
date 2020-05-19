
public class Vuelo {
    
    private String nombre, destino, origen, salida, silla, cedula;

    
    public Vuelo()
    {   
     nombre ="";
     destino ="";
     origen ="";
     salida ="";
     silla ="";
     cedula ="";
     
   }
    
    public Vuelo(String a,String b,String c,String d,String e,String f)
            {   
                
    nombre = a;
     destino = b;
     origen = c;
     salida = d;
     silla = e;
     cedula = f ;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getsalida() {
        return salida;
    }

    public void setH_salida(String salida) {
        this.salida = salida;
    }

    public String getSilla() {
        return silla;
    }

    public void setSilla(String silla) {
        this.silla = silla;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

  
  
}
