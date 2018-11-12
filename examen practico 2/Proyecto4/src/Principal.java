
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Ivan
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //int iEmpieza = (int)(Math.random() * 2) +1;
int iSeguir=1,iA1=0,iA2=0,iA3=0,iB1=0,iB2=0,iB3=0,iC1=0,iC2=0,iC3=0,iTap,iX,iEror=1;
String sSi;
String sR1="|1|2|3|"+(char)10+"|4|5|6|"+(char)10+"|7|8|9|";
        //tu 1
        //la maquina 4
int iNum;


//String nuevotexto = SR1.substring(0,n1-1)+'1'+texto.substring(n1 +1,n2-1)+'1'+texto.substring(n2+1);

System.out.println(sR1);
int iEmpieza = (int)(Math.random() * 2) +1;
while(iSeguir==1) {
    while (!(iA1+iA2+iA3==3)&& 
        !(iA1+iB1+iC1==3) &&
        !(iA1+iB2+iC3==3) && 
        !(iB1+iB2+iB3==3) && 
        !(iC1+iB2+iA3==3) && 
        !(iC1+iC2+iC3==3) &&
        !(iA2+iB2+iC2==3) &&
        !(iA3+iB3+iC3==3) && 
        !(iA1+iA2+iA3==12) &&
        !(iA1+iB1+iC1==12) &&
        !(iA1+iB2+iC3==12) &&
        !(iB1+iB2+iB3==12) &&
        !(iC1+iB2+iA3==12) &&
        !(iA2+iB2+iC2==12) &&
        !(iA3+iB3+iC3==12) &&
        !(iA1+iA2+iA3+iB1+iB2+iB3+iC1+iC2+iC3==21) && 
        !(iA1+iA2+iA3+iB1+iB2+iB3+iC1+iC2+iC3==24) &&
        !(iEror==0)
        ){
        if (iEmpieza==1) {
            System.out.println("Dime la posicion que escojes");
            iTap=input.nextInt();
            switch (iTap) {
            case 1:  sR1=sR1.replace("1","O");
                    iA1=1;
                     break;
            case 2:  sR1=sR1.replace("2","O");
                    iB1=1;
                     break;
            case 3:  sR1=sR1.replace("3","O");
                    iC1=1;
                     break;
            case 4:  sR1=sR1.replace("4","O");
                    iA2=1;
                     break;
            case 5:  sR1=sR1.replace("5","O");
                    iB2=1;
                     break;
            case 6:  sR1=sR1.replace("6","O");
                    iC2=1;
                     break;
            case 7:  sR1=sR1.replace("7","O");
                    iA3=1;
                     break;
            case 8:  sR1=sR1.replace("8","O");
                    iB3=1;
                     break;
            case 9:  sR1=sR1.replace("9","O");
                    iC3=1;
                     break;
            default: System.out.println("La posicion que escribiste no existe, como te equivocas es eso :v(if (es el profe) no hay ningun problema, else ve a que te revisen la vista)");
                    iEror=0;
                     break;
        }
            System.out.println(sR1);
            iEmpieza=0;
        } else {
            System.out.println("Escoge maquina");
            iX=1;
            while (iX==1){
                iNum = (int)(Math.random() * 9) +1; 
                 //iNum=2;
                switch(iNum){
                    case 1: if (iA1==0){
                            sR1=sR1.replace("1","X");
                            iA1=4;
                            iX=0;
                            } else {
                            iX=1;
                            }
                            break;
                    case 2: if (iB1==0){
                            sR1=sR1.replace("2","X");
                            iB1=4;
                            iX=0;
                            } else {
                            iX=1;
                            }
                            break;
                    case 3: if (iC1==0){
                            sR1=sR1.replace("3","X");
                            iC1=4;
                            iX=0;
                            } else {
                            iX=1;
                            }
                            break;
                    case 4: if (iA2==0){
                            sR1=sR1.replace("4","X");
                            iA2=4;
                            iX=0;
                            } else {
                            iX=1;
                            }
                            break;
                    case 5: if (iB2==0){
                            sR1=sR1.replace("5","X");
                            iB2=4;
                            iX=0;
                            } else {
                            iX=1;
                            }
                            break;
                    case 6: if (iC2==0){
                            sR1=sR1.replace("6","X");
                            iC2=4;
                            iX=0;
                            } else {
                            iX=1;
                            }
                            break;
                    case 7: if (iA3==0){
                            sR1=sR1.replace("7","X");
                            iA3=4;
                            iX=0;
                            } else {
                            iX=1;
                            }
                            break;
                    case 8: if (iB3==0){
                            sR1=sR1.replace("8","X");
                            iB3=4;
                            iX=0;
                            } else {
                            iX=1;
                            }
                            break;
                    case 9: if (iC3==0){
                            sR1=sR1.replace("9","X");
                            iC3=4;
                            iX=0;
                            } else {
                            iX=1;
                            }
                            break;
                }
                System.out.println(sR1);
            }
            
            iEmpieza=1;
        }
                
                
                
            
            
            
            
            
            
            
            
            
    }
    switch (iA1+iA2+iA3) {
        case 3: System.out.println("Ganaste felicicdades :D");
            break;
        case 12: System.out.println("Perdiste,lo bueno es que hay salud");
            break;
    }
     switch (iA1+iB1+iC1) {
        case 3: System.out.println("Ganaste felicicdades :D");
            break;
        case 12: System.out.println("Perdiste,lo bueno es que hay salud");
            break;
     }
     switch (iA1+iB2+iC3) {
        case 3: System.out.println("Ganaste felicicdades :D");
            break;
        case 12: System.out.println("Perdiste,lo bueno es que hay salud");
            break;
     }
     switch (iB1+iB2+iB3) {
        case 3: System.out.println("Ganaste felicicdades :D");
            break;
        case 12: System.out.println("Perdiste,lo bueno es que hay salud");
            break;
     }
     switch (iC1+iB2+iA3) {
        case 3: System.out.println("Ganaste felicicdades :D");
            break;
        case 12: System.out.println("Perdiste,lo bueno es que hay salud");
            break;
     }
     switch (iA2+iB2+iC2) {
        case 3: System.out.println("Ganaste felicicdades :D");
            break;
        case 12: System.out.println("Perdiste,lo bueno es que hay salud");
            break;
     }
     switch (iA3+iB3+iC3) {
        case 3: System.out.println("Ganaste felicicdades :D");
            break;
        case 12: System.out.println("Perdiste,lo bueno es que hay salud");
            break;
     }
     switch (iC1+iC2+iC3) {
        case 3: System.out.println("Ganaste felicicdades :D");
            break;
        case 12: System.out.println("Perdiste,lo bueno es que hay salud");
            break;
     }
     switch (iA1+iA2+iA3+iB1+iB2+iB3+iC1+iC2+iC3) {
        case 21: System.out.println("Empataste");
            break;
        case 24: System.out.println("Empataste");
            break;
    }
    System.out.println("Deseas seguir jugando?");
      sSi=input.next();
     if (sSi.equals("si")) {
        iSeguir=1;
        iA1=0;
        iA2=0;iA3=0;iB1=0;iB2=0;iB3=0;iC1=0;iC2=0;iC3=0;
        sR1="1|2|3"+(char)10+"4|5|6"+(char)10+"7|8|9";
        
     } else {
         iSeguir=0;
     }
}
}
    
}
