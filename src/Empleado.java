public abstract class Empleado {
    private String nombre;
    private String cci;
    public Empleado(String nombre, String cci){
        this.nombre=nombre;
        this.cci=cci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCci() {
        return cci;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("CCI: "+cci);
    }
    public abstract double ingreso();
}
