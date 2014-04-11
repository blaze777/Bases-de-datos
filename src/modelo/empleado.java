package modelo;

public class empleado {

    String codigo_e;
    String apellido;
    String nombre_e;
    String sexo;
    int salario;
    String codigo_d;

    public empleado(String codigo_e, String apellido, String nombre_e, String sexo, int salario, String codigo_d) {
        this.codigo_e = codigo_e;
        this.apellido = apellido;
        this.nombre_e = nombre_e;
        this.sexo = sexo;
        this.salario = salario;
        this.codigo_d = codigo_d;
    }

   
    public String getApellido() {
         System.out.println("getApellido "+apellido);
        return apellido;
    }

    public void setApellido(String apellido) {
        System.out.println("setApellido "+apellido);
        this.apellido = apellido;
    }

    public String getCodigo_d() {
           System.out.println("getCodigo_d "+codigo_d);
        return codigo_d;
    }

    public void setCodigo_d(String codigo_d) {
         System.out.println("setCodigo_d "+codigo_d);

        this.codigo_d = codigo_d;
    }

    public String getCodigo_e() {
          System.out.println("getCodigo_e "+codigo_e);
        return codigo_e;
    }

    public void setCodigo_e(String codigo_e) {
          System.out.println("setCodigo_e "+codigo_e);
        this.codigo_e = codigo_e;
    }

    public String getNombre_e() {
          System.out.println("getNombre "+nombre_e);
        return nombre_e;
    }

    public void setNombre_e(String nombre_e) {
          System.out.println("setNombre "+nombre_e);
        this.nombre_e = nombre_e;
    }

    public int getSalario() {
           System.out.println("getsalario "+salario);
        return salario;
    }

    public void setSalario(int salario) {
          System.out.println("setsalario "+salario);
        this.salario = salario;
    }

    public String getSexo() {
        System.out.println("getsexov: "+sexo);
        return sexo;
    }

    public void setSexo(String sexo) {

        System.out.println("setsexo: "+sexo);
        this.sexo = sexo;
    }

}
