public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;
    public EmpleadoBaseMasComision(String nombre, String cci, double ventasBrutas, double tarifaComicion, double salarioBase){
        super(nombre, cci, ventasBrutas, tarifaComicion);
        this.salarioBase=salarioBase;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase=salarioBase;
    }
    public double getSalarioBase(){
        return salarioBase;
    }

    public double ingreso(){
        return getSalarioBase()+super.ingreso();
    }

    public void imprimirDatos(){
        System.out.println("Empleado por comision");
        System.out.println("Nombre: "+getNombre());
        System.out.println("CCI: "+getCci());
        System.out.println("Ventas brutas: "+getVentasBrutras());
        System.out.println("Comision: "+getTarifaComision());
        System.out.println("Salario base: "+getSalarioBase());
        System.out.println("Ingresos: "+ingreso());
    }
}
