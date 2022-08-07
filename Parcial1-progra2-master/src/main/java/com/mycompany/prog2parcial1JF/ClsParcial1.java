
package com.mycompany.prog2parcial;

import java.text.DecimalFormat;



public class ClsParcial1 {
    
    
        
    private static String[][]vendedores=new String [6][11];
    
     private static final int NOMBRE=0;
    private static final int ENERO=1;
    private static final int FEBRERO=2;
    private static final int MARZO=3;
    private static final int ABRIL=4;
    private static final int TOTAL_DE_VENTAS=5;
    private static final int PORCENTAJE_20=6;
    private static final int POR=7;
    private static final int TOTAL_VENTAS_Y_COMISIONES=8;
    private static final int QUITAR_ISR=9;
    private static final int LIQUIDO_A_RECIBIR=10;
    private static final int total=11;
     
     private static  DecimalFormat d = new DecimalFormat("###.##"); 
    
     private static void cargaMatriz(){
        for (int c=0; c<vendedores.length;c++){
          for (int f=0; f< vendedores.length;f++){
              vendedores[0][0]="Yesica Arroyo";
              vendedores[1][0]="Eddy Palacios";
              vendedores[2][0]="Rene Orellana";
              vendedores[3][0]="Mauda Sandoval";
              vendedores[4][0]="Andre Arroyo";
              vendedores[5][0]="total columnas";
              
              
              
              vendedores[0][1]="210";
              vendedores[1][1]="2250";
              vendedores[2][1]="1325";
              vendedores[3][1]="590";
              vendedores[4][1]="3500";
          
              
              
              vendedores[0][2]="280";
              vendedores[1][2]="2270";
              vendedores[2][2]="1000";
              vendedores[3][2]="550";
              vendedores[4][2]="250";
          
              
              
              vendedores[0][3]="150";
              vendedores[1][3]="250";
              vendedores[2][3]="1625";
              vendedores[3][3]="390";
              vendedores[4][3]="310";
              
          
              
              vendedores[0][4]="870";
              vendedores[1][4]="240";
              vendedores[2][4]="625";
              vendedores[3][4]="190";
              vendedores[4][4]="700";
              
              
          }
        }
    }
    
     public static void totalVentas(){
       int total = 0;
         for (int i = 0; i < 5; i++) {
             total = Integer.parseInt(vendedores[i][ENERO]);
             total = total + Integer.parseInt(vendedores[i][FEBRERO]);
             total = total + Integer.parseInt(vendedores[i][MARZO]);
             total = total + Integer.parseInt(vendedores[i][ABRIL]);
             
             vendedores[i][TOTAL_DE_VENTAS]=String.valueOf(total);
             
         }
        
    }
     
     public static void comisionesobreventas(){
         double comisiones=0, porcentaje=0;
          for (int i = 0; i < 5; i++){
         comisiones=Double.parseDouble(vendedores[i][TOTAL_DE_VENTAS]);
         
         if(comisiones<=2000){
              porcentaje=comisiones*0.20;
              vendedores[i][PORCENTAJE_20]=String.format(d.format(porcentaje));
          }
         
         else {
             
             porcentaje=comisiones*0;
             vendedores[i][PORCENTAJE_20]=String.format(d.format(porcentaje));
         }
             
          }
     }
     
       public static void comisionesobreventas30(){
         double comisiones=0, porcentaje=0;
          for (int i = 0; i < 5; i++){
         comisiones=Double.parseDouble(vendedores[i][TOTAL_DE_VENTAS]);
         
         if(comisiones>=2001){
              porcentaje=comisiones*0.35;
              vendedores[i][POR]=String.format(d.format(porcentaje));
          }
         
         else {
             
             porcentaje=comisiones*0;
             vendedores[i][POR]=String.format(d.format(porcentaje));
         }
             
          }
     }
     
     
     
     
            public static void ventascomisiones(){
         double ventas=0;
          for (int i = 0; i < 5; i++){
              
             ventas= Double.parseDouble(vendedores[i][TOTAL_DE_VENTAS]);
             ventas=ventas+Double.parseDouble(vendedores[i][PORCENTAJE_20]);
             ventas =ventas+Double.parseDouble(vendedores[i][POR]);
             

             vendedores[i][ TOTAL_VENTAS_Y_COMISIONES]=String.valueOf(d.format(ventas));
          
          } 

            }
            

            public static void quitar_isr(){
        double ventatotal=0, isr=0;
        for (int i = 0; i < 5; i++) {
            
            ventatotal=Double.parseDouble(vendedores[i][TOTAL_VENTAS_Y_COMISIONES]);
            isr=ventatotal*0.05;
            vendedores[i][QUITAR_ISR]=String.valueOf(d.format(isr));
        }
        
    }
  public static void liquido(){
        double L=0, t=0, C=0;
        for (int i = 0; i < 5; i++) {
            t=Double.parseDouble(vendedores[i][TOTAL_VENTAS_Y_COMISIONES]);
            L=Double.parseDouble(vendedores[i][QUITAR_ISR]);
            C=t-L;
            vendedores[i][LIQUIDO_A_RECIBIR]=String.valueOf(d.format(C));
        }
    }
  
  public static void totalcolumnas(){
        int en=0, fe=0, mar=0, ab=0,tv=0;
        double isr=0,porc=0, lq=0 ,  tvt=0, por=0;
        
        for (int i = 0; i < 5; i++) {
           
             en =en+Integer.parseInt(vendedores[i][ENERO]);
             fe =fe+Integer.parseInt(vendedores[i][FEBRERO]);
              mar =mar+Integer.parseInt(vendedores[i][MARZO]);
             ab =ab+Integer.parseInt(vendedores[i][ABRIL]);
             tv =tv+Integer.parseInt(vendedores[i][TOTAL_DE_VENTAS]);
             por =por+Double.parseDouble(vendedores[i][PORCENTAJE_20]);
             porc =porc+Double.parseDouble(vendedores[i][POR]);
             tvt =tvt+Double.parseDouble(vendedores[i][TOTAL_VENTAS_Y_COMISIONES]);
             isr =isr+Double.parseDouble(vendedores[i][QUITAR_ISR]);
            lq =lq+Double.parseDouble(vendedores[i][LIQUIDO_A_RECIBIR]);
              
        

           vendedores[5][1]=String.valueOf((en));
           vendedores[5][2]=String.valueOf((fe));
           vendedores[5][3]=String.valueOf((mar));
           vendedores[5][4]=String.valueOf((ab));
           vendedores[5][5]=String.valueOf((tv));
           vendedores[5][6]=String.valueOf(d.format(por));
          vendedores[5][7]=String.valueOf(d.format(porc));
          vendedores[5][8]=String.valueOf(d.format(tvt));
          vendedores[5][9]=String.valueOf(d.format(isr));
        vendedores[5][10]=String.valueOf(d.format(lq));
           
          } 
  }
         public static void vendedormayor(){
        double mayor=0, monto=0;
        String y="";
        for (int i = 0; i < 5; i++) {
            monto=Double.parseDouble(vendedores[i][LIQUIDO_A_RECIBIR]);

            if (monto>mayor) {
                mayor=monto;
                y=vendedores[i][LIQUIDO_A_RECIBIR-10];
            }
            else{
                monto=monto;

            }
        }

        System.out.println("Vendedor que recibe mas: " + y);
    }

    public static void vendedorMenor(){
        double mayor=100, monto=0;
        String y="";
        mayor=Double.parseDouble(vendedores[5][LIQUIDO_A_RECIBIR]);
        for (int i = 0; i < 5; i++) {
            monto=Double.parseDouble(vendedores[i][LIQUIDO_A_RECIBIR]);

            if (monto<mayor) {
                mayor=monto;
                y=vendedores[i][LIQUIDO_A_RECIBIR-10];
            }
            else{
                monto=mayor;
            }
        }

        System.out.println("vendedor que menos recibe: " + y);
    }
  

public static void imprimirDecorado(){
        for (int x=0; x< vendedores.length;x++){
            System.out.print("|");
             for(int y=0;y < vendedores[x].length;y++){
                 System.out.print(vendedores[x][y]);
                 if (y != vendedores[x].length -1){
                     System.out.print("\t"+"\t");
                 }
             }
             System.out.println("|");
        }
    }


    public static void main(String[] args) {
      
       cargaMatriz();
       totalVentas();
       comisionesobreventas();
       comisionesobreventas30();
       ventascomisiones();
       quitar_isr();
       liquido();
       totalcolumnas();
       vendedormayor();
       vendedorMenor();
       imprimirDecorado();
       
       
    
}}

