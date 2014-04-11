
package modelo;

public class departamento {
 private String codigo_d;
 private String nombre_d;
 private String ciudad;

    public departamento(String codigo_d, String nombre_d, String ciudad) {
        this.codigo_d = codigo_d;
        this.nombre_d = nombre_d;
        this.ciudad = ciudad;
    }

    public String getcodigo_d() {
        return codigo_d;
    }

    public void setcodigo_d(String codigo_d) {
        this.codigo_d = codigo_d;
    }

    public String getciudad() {
        return ciudad;
    }

    public void setciudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getnombre_d() {
        return nombre_d;
    }

    public void setnombre_d(String nombre_d) {
        this.nombre_d = nombre_d;
    }
 public String toString(){
     return codigo_d + ", "+  nombre_d + ", " + ciudad + ".\n";
 }

}
