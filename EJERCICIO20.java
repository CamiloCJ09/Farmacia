import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class EJERCICIO20{
    
    private final static int metodoT = 0;
    private final static int metodoE = 1;

    static double woDescuento(double valor,int metodo, double total) {
        
        if (metodo == metodoE) {
            total = valor-(valor*0.05);
            System.out.println("Usted obtuvo un descuento del 5%. El valor total de la compra es: " + total);
        }else if(metodo == metodoT){
            total = valor+(valor*0.03);
            System.out.println("El valor total de la compra es: " + total);
        }
        return total;
    }

    static String Recompensa(String dia, String documento, int fch){
        int parse = Integer.parseInt(documento);
        
        if(fch == 6 && ((parse%10)%2==0)){
            System.out.println("Usted ha ganado una botella de té de durazno");
        }else if(fch == 6 && ((parse%10)%3==0)){
            System.out.println("Usted ha ganado una coca cola 750ml");
        }else if(fch == 9){
            System.out.println("Usted ha ganado un descuento del 9% sobre el valor de la siguiente compra.");
        }else if(fch == 24 && ((parse%10)%2==0)){
            System.out.println("Usted ha ganado un gel antibacterial");
        }else if(fch == 24 && ((parse%10)%3==0)){
            System.out.println("Usted ha ganado un sobre de dolex");
        }
        
        return dia;
    }



    public static void main(String args[]){
        
        int  metodo, fch;
        String documento,dia;
        double total, valor;
        total = 0;
        

        Scanner sc = new Scanner(System.in);
        Date fecha = new Date();
        Calendar Cal = new GregorianCalendar();
        Cal.setTime(fecha);
        dia = Integer.toString(Cal.get(Calendar.DATE));
        fch = Integer.parseInt(dia);


        System.out.println("Bienvenid@");
        System.out.println("Ingrese su documento por favor:");
        documento = sc.nextLine();
        System.out.println("Ingrese el valor de la compra");
        valor = sc.nextInt();

        System.out.println("Con que metodo de pago desea pagar?");
        System.out.println("0 para tarjeta, 1 para efectivo");
        metodo = sc.nextInt();

        woDescuento(valor, metodo,total);
        Recompensa(dia, documento, fch);



        
    }





}