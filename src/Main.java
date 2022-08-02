import com.sun.source.tree.WhileLoopTree;

import javax.swing.table.DefaultTableCellRenderer;

public class Main {
    public static void main(String[] args) {

        System.out.println("Usando un IF");
        System.out.println("=============");
        int numeroif=0;
        if(numeroif<0){
            System.out.println(numeroif+" Es Negativo");
        }else {
            if(numeroif>0){
                System.out.println(numeroif+" Es Positivo");
            }else {
                System.out.println(numeroif+" Es Cero");
            }
        }
        System.out.println("Usando un While");
        System.out.println("===============");
        int numeroWhile=0;
        while (numeroWhile<3){
            System.out.println(numeroWhile+" Es inferior a 3");
            numeroWhile++;
        }
        System.out.println("Usando un Do While");
        System.out.println("==================");
        int numerodoWhile=1;
        do{
            System.out.println(numerodoWhile);
            numerodoWhile=numerodoWhile+2;
        }while(numerodoWhile<3);
        System.out.println("Usando For");
        System.out.println("==================");
        for(int numeroFor=0;numeroFor<=3;numeroFor++)
        {
            System.out.println(numeroFor);
        }
        System.out.println("Usando Switch");
        System.out.println("==================");
        var estacion ="OTOÑO";
        switch (estacion){
            case "VERANO":
                System.out.println("ES VERANO");
                break;
            case "INVIERNO":
                System.out.println("ES INVIERNO");
                break;
            case "PRIMAVERA":
                System.out.println("ES PRIMAVERA");
                break;
            case "OTOÑO":
                System.out.println("ES OTOÑO");
                break;
            default:
                System.out.println("SIN ESTACIÓN");
        }
    }
}