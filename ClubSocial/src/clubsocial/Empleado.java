package clubsocial;

import java.util.Scanner;

public class Empleado extends Persona{
    Empleado(){
    }
    Scanner sc=new Scanner(System.in);
    private Double NumEmpleado;
    private String Puesto,D="20",M="05",A="2005";
    private Persona a=new Persona();

    public Empleado(String Dia, String Mes, String Año, String Nombre, int Genero, Double NumEmpleado, String Puesto) {
        super(Dia, Mes, Año, Nombre, Genero);
        this.NumEmpleado = NumEmpleado;
        this.Puesto = Puesto;
    }
    public void FechaIngreso(){
        System.out.println("Fecha en que el empleado ingreso\nEl programa espera un año de cuatro digitos");
        while(9!=0){
            System.out.print("Ingrese el día: ");D=sc.next();System.out.print("Ingrese el mes: ");M=sc.next();
            System.out.print("Ingrese el año: ");A=sc.next();
            a.setFecha(D, M, A);
            if(!"Usted ingreso una fecha erronea".equals(a.getEdad()))break;
            else System.out.println(a.getEdad());
        }
    }
    @Override
    public String toString(){
        return Persona()+", Fecha de ingreso= "+a.Fecha()+", Puesto= "+Puesto+", Numero del empleado= "+NumEmpleado;
    }
}
