package clubsocial;

import java.util.Scanner;

public class Miembro extends Persona{
    Miembro(){
    }
    Scanner sc=new Scanner(System.in);
    private Double NumMembresia;
    private String aa,dd,mm;
    int A;

    public Miembro(Double NumMembresia, String Dia, String Mes, String Año, String Nombre, int Genero) {
        super(Dia, Mes, Año, Nombre, Genero);
        this.NumMembresia = NumMembresia;
    }
    
    public void Membresia(){
        System.out.println("Fecha de emision de la membresia\nEl programa espera un año de cuatro digitos");
        while(9!=0){
        System.out.print("Ingrese el día: ");dd=sc.next();System.out.print("Ingrese el mes: ");mm=sc.next();
        System.out.print("Ingrese el año: ");A=sc.nextInt();aa=String.valueOf(A);
        Persona b=new Persona();b.setFecha(dd, mm, aa);
        if("Usted ingreso una fecha erronea".equals(b.getEdad()))System.out.println(b.getEdad());
        else break;
        }
    }
    public String getEmision(){
        return "Fecha de emision de la membresia= "+aa+"-"+mm+"-"+dd;
    }
    public String getVencimiento(){
        A=A+2;aa=String.valueOf(A);
        return "Fecha de vencimiento de la membresia= "+aa+"-"+mm+"-"+dd;
    }
    @Override
    public String toString() {
        return Persona()+", Numero de la membresia= "+NumMembresia+", "+getEmision()+", "+getVencimiento();
    }
    
}
