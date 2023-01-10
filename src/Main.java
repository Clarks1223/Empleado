import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List listaempleados = new ArrayList();

        listaempleados.add(new EmpleadoAsalariado("Pablo","111-111-111",1500));
        listaempleados.add(new EmpleadoPorComision("Gustavo", "2-2-22", 10000, .06));
        listaempleados.add(new EmpleadoBaseMasComision("Jorge", "3-3-33",5000, .04,300));
        imprimirLista((ArrayList) listaempleados);
    }
    static void imprimirLista(ArrayList lista){
        for (int i=0; i<lista.size();i++){
            Empleado v=(Empleado)lista.get(i);
            v.imprimirDatos();
            System.out.println("");
        }
    }
}