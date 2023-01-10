public class EmpleadoAsalariado extends Empleado{
    private double salsemanal;
    public EmpleadoAsalariado(String nombre, String cci, double salsemanal){
        super(nombre, cci);
        this.salsemanal=salsemanal;
    }
    public void setSalariosemanal(double salsemanal){
        if (salsemanal<0){
            System.out.println("El salario es incorrecto, debe ser mayor a cero");
        }
        else{
            this.salsemanal=salsemanal;
        }
    }
    public double getSalario(){
        return salsemanal;
    }
    @Override
    public double ingreso(){
        return getSalario();
    }
    @Override
    public void imprimirDatos(){
        System.out.println("Empleado asalariado");
        super.imprimirDatos();
        System.out.println("salario semanal: "+getSalario());
    }
}