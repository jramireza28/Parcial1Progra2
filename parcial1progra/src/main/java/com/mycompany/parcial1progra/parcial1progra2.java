package com.mycompany.parcial1progra;

import java.util.Scanner;

/**
 *
 * @author Jairo Fernando
 */

public class parcial1progra2 {

 static Scanner entrar =new Scanner(System.in);

public static void  main(String[]Args){
    int op;
do{ 
System.out.println("1. resultados");
          System.out.println("2. menor y mayor ");
          System.out.println("3. salir");
        System.out.println("Introcudir una opcion");
        op=entrar.nextInt();
    switch(op){
    
    
        case 1:
            CargarDatos ();
            operaciones ();
            totalcolumnas();
            decorado ();
            
         break;
         
          case 2:
            MenorComision();
comisionmayor();
         break;
         
          case 3:
            
         break;
         
          default:System.out.println("No es una opcion valida, Introdusca una opcion valida");
    
    }
            
    
}while(op!=3);

}

private static String[][] comision1 = new String [2][11];    
private static String[][] comision = new String [6][11]; 

private static final int NOMBRE=0;
private static final int ENERO=1;
private static final int FEBRERO=2;
private static final int MARZO=3;
private static final int ABRIL=4;
private static final int TOVENTAS=5;
private static final int PO20=6;
private static final int PO35=7;
private static final int TOVECO=0;
private static final int ISR=9;
private static final int LIQUIDORECI=10;


private static void CargarDatos (){

comision[0][NOMBRE]=("JAIRO");
comision[1][NOMBRE]=("JUAN");
comision[2][NOMBRE]=("PABLO");
comision[3][NOMBRE]=("DULCE");
comision[4][NOMBRE]=("MISHEL");
comision[5][NOMBRE]=("TOTAL");

comision[0][ENERO]=("200");
comision[1][ENERO]=("100");
comision[2][ENERO]=("800");
comision[3][ENERO]=("500");
comision[4][ENERO]=("500");

comision[0][FEBRERO]=("100");
comision[1][FEBRERO]=("2000");
comision[2][FEBRERO]=("800");
comision[3][FEBRERO]=("500");
comision[4][FEBRERO]=("200");

comision[0][MARZO]=("100");
comision[1][MARZO]=("600");
comision[2][MARZO]=("400");
comision[3][MARZO]=("100");
comision[4][MARZO]=("300");

comision[0][ABRIL]=("800");
comision[1][ABRIL]=("500");
comision[2][ABRIL]=("900");
comision[3][ABRIL]=("400");
comision[4][ABRIL]=("200");



}//fin de cargar datos

private static void decorado (){

for (int x=0; x < comision.length; x++) {
  System.out.print("|");
    for (int y=0; y < comision[x].length; y++) {
      System.out.print (comision[x][y]);
      if (y!=comision[x].length-1) System.out.print("\t");
    }
  System.out.println("|");
}
}//fin de decorado

private static void operaciones (){
    
    int toven, tovenpo,comi1,comi2;


    for (int i=0;i<5;i++){
toven=0;
    toven=Integer.valueOf(comision[i][1]);
    toven=toven+Integer.valueOf(comision [i][2]);
    toven=toven+Integer.valueOf(comision [i][3]);
    toven=toven+Integer.valueOf(comision [i][4]);
    comision[i][5]=toven+"";
    
if(toven<2000){
    tovenpo=toven*20/100;
    comision[i][6]=tovenpo+"";
    
    
        
    }else{
comision[i][6]="0";
    
    
    } 
    if(toven>=2001){
    tovenpo=toven*35/100;
    comision[i][7]=tovenpo+"";
    
    
        
    }else{
comision[i][7]="0";
    
    } 
    
comi1=Integer.valueOf(comision[i][6]);
int comi3=Integer.valueOf(comision[i][7]);
comi2=toven+comi1+comi3;
    comision[i][8]=comi2+"";
    tovenpo=comi2*5/100;
    comision[i][9]=tovenpo+"";
    comision[i][10]=comi2-tovenpo+"";
    }//fin for


}//fin operaciones    
public static void totalcolumnas(){//suma de las columnas
      
   for(int i=1;i<11;i++){
int columna=0;
columna=Integer.valueOf(comision[1][i]);
columna = columna+Integer.valueOf(comision[1][i]);
columna = columna+Integer.valueOf(comision[2][i]);
columna = columna+Integer.valueOf(comision[3][i]);
columna = columna+Integer.valueOf(comision[4][i]);
comision[5][i]=columna+"";
}        
       
}//fin columnas
    public static void MenorComision(){
        CargarDatos ();
        operaciones ();
       double menor=1000, monto=100;
        String y="DULCE";
        menor=Double.parseDouble(comision[0][LIQUIDORECI]);
        for (int i = 0; i < 5; i++) {
            monto=Double.parseDouble(comision[i][LIQUIDORECI]);

            if (monto<menor) {
                menor=monto;
                y=comision[i][LIQUIDORECI+10];
            }
            else{
                monto=menor;
            }

        }

        System.out.println("vendedor que menos recibe: " + y);
    }//fin menor comision

  public static void comisionmayor(){
        double mayor=0, monto=0;
        String y ="";
        for (int i = 0; i < 5; i++) {
            monto=Double.parseDouble(comision[i][LIQUIDORECI]);

            if (monto>mayor) {
                mayor=monto;
                y=comision[i][LIQUIDORECI-10];
            }
            else{
                monto=monto;

            }
        }

        System.out.println("Vendedor que recibe mas: " + y);
    }
}//fin estructura