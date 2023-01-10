public class EmpleadoPorComision extends Empleado{
    private double ventasBrutras;
    private double tarifaComision;
    public EmpleadoPorComision(String nombre, String cci, double ventasBrutras, double tarifaComision){
        super(nombre,cci);
        this.ventasBrutras=ventasBrutras;
        this.tarifaComision=tarifaComision;
    }
    public void setVentasBrutras(double ventasBrutras){
        this.ventasBrutras=ventasBrutras;
    }
    public double getVentasBrutras(){
        return ventasBrutras;
    }

    public void setTarifaComision(double tarifaComision){
        this.tarifaComision=tarifaComision;
    }
    public double getTarifaComision(){
        return tarifaComision;
    }

    @Override
    public double ingreso(){
        return getTarifaComision()*getVentasBrutras();
    }
    @Override
    public void imprimirDatos(){
        System.out.println("Empleado por comision");
        super.imprimirDatos();
        System.out.println("Ventas brutas: "+getVentasBrutras());
        System.out.println("Comision: "+getTarifaComision());
        System.out.println("Ingreso total: "+ingreso());
    }
}