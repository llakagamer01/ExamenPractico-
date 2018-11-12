/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa2_prac_3;

import java.util.Scanner;

/**
 *
 * @author loque
 */
public class EXA2_PRAC_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bienvenido a consulta medica.");
        System.out.println("Para continuar, deberá responder las siguientes preguntas utilizando true para sí y false para no.");
        System.out.println("Empezamos");
        System.out.println("¿Tiene fiebre?");
        boolean iFib;
        
        iFib = input.nextBoolean();
        if (iFib == true) {
            System.out.println("¿Usted tose con frecuencia?");
            boolean iTos;
            
            iTos = input.nextBoolean();
            if (iTos == true) {
                System.out.println("¿Le cuesta respirar?");
                boolean iRes;
                
                iRes = input.nextBoolean();
                if (iRes == true) {
                    System.out.println("POSIBLE DIAGNOSRICO: Neumonía o infección en las vias respiratorias.");
                } else {
                    System.out.println("¿Le duele la cabeza?");
                    boolean iCab;
                    
                    iCab = input.nextBoolean();
                    if (iCab == true) {
                        System.out.println("POSIBLE DIAGNOSTICO: Infección Vírica.");
                    } else {
                        System.out.println("¿Le duelen los huesos o las articulaciónes?");
                        boolean iArt;
                        
                        iArt = input.nextBoolean();
                        if (iArt == true) {
                            System.out.println("POSIBLE DIAGNOSTICO: Infección Viríca.");
                        } else {
                            System.out.println("¿Precenta erupciónes cutaneas?");
                            boolean iCut;
                            
                            iCut = input.nextBoolean();
                            if (iCut == true) {
                                System.out.println("POSIBLE DIAGNOSTICO: Erupciónes cutaneas.");
                            } else {
                                System.out.println("¿Le duele la garganta?");
                                boolean iGar;
                                
                                iGar = input.nextBoolean();
                                if (iGar == true) {
                                    System.out.println("POSIBLE DIAGNOSTICO: Infeccion de garganta.");
                                } else {
                                    System.out.println("¿Le duele la espalda por encima de las lumbares, con escalofrios y fiebre?");
                                    boolean iLuma;
                                    
                                    iLuma = input.nextBoolean();
                                    if (iLuma == true) {
                                        System.out.println("POSIBLE DIAGNOSTICO: Infección renal.");
                                    } else {
                                        System.out.println("¿Le duele al orinar o lo have con más frecuencia?");
                                        boolean iOri;
                                        
                                        iOri = input.nextBoolean();
                                        if (iOri == true) {
                                            System.out.println("POSIBLE DIAGNOSTICO: Infección de tracto urinario.");
                                        } else {
                                            System.out.println("¿Ha pasado el dia al sol o con mucho calor?");
                                            boolean iCal;
                                            
                                            iCal = input.nextBoolean();
                                            if (iCal == true) {
                                                System.out.println("POSIBLE DIAGNOSTICO: Golpe de calor o agotamiento por calor.");
                                            } else {
                                                System.out.println("No dispone de suficiente información para un diagnostico.");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("¿Le duele la cabeza?");
                boolean iCab;
                
                iCab = input.nextBoolean();
                if (iCab == true) {
                    System.out.println("¿Tiene alúno de los siguientes sintomas?: Dolor cuando inclina la cabeza hacia delante, nauseas, vómitos, fuerte molestia en los ojos ante una luz brillante, somnolencia o confución?");
                    boolean iConf;
                    
                    iConf = input.nextBoolean();
                    if (iConf == true) {
                        System.out.println("POSIBLE DIAGNOSTICO: Meningitis.");
                    } else {
                        System.out.println("¿Vomita o tiene diarrea?");
                        boolean iDiarr;
                        
                        iDiarr = input.nextBoolean();
                        if (iDiarr == true) {
                            System.out.println("POSIBLE DIAGNOSTICO: Infección en el tacto digestivo.");
                        } else {
                            System.out.println("¿Le duelen los huesos o las articulaciónes?");
                            boolean iArt;
                            
                            iArt = input.nextBoolean();
                            if (iArt == true) {
                                System.out.println("POSIBLE DIAGNOSTICO: Infección Viríca.");
                            } else {
                                System.out.println("¿Precenta erupciónes cutaneas?");
                                boolean iCut;
                                
                                iCut = input.nextBoolean();
                                if (iCut == true) {
                                    System.out.println("POSIBLE DIAGNOSTICO: Erupciónes cutaneas.");
                                } else {
                                    System.out.println("¿Le duele la garganta?");
                                    boolean iGar;
                                    
                                    iGar = input.nextBoolean();
                                    if (iGar == true) {
                                        System.out.println("POSIBLE DIAGNOSTICO: Infeccion de garganta.");
                                    } else {
                                        System.out.println("¿Le duele la espalda por encima de las lumbares, con escalofrios y fiebre?");
                                        
                                        
                                        iFib = input.nextBoolean();
                                        if (iFib == true) {
                                            System.out.println("POSIBLE DIAGNOSTICO: Infección renal.");
                                        } else {
                                            System.out.println("¿Le duele al orinar o lo have con más frecuencia?");
                                            boolean iOri;
                                            
                                            iOri = input.nextBoolean();
                                            if (iOri == true) {
                                                System.out.println("POSIBLE DIAGNOSTICO: Infección de tracto urinario.");
                                            } else {
                                                System.out.println("¿Ha pasado el dia al sol o con mucho calor?");
                                                boolean iCal;
                                                
                                                iCal = input.nextBoolean();
                                                if (iCal == true) {
                                                    System.out.println("POSIBLE DIAGNOSTICO: Golpe de calor o agotamiento por calor.");
                                                } else {
                                                    System.out.println("No dispone de suficiente información para un diagnostico.");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Le duelen los huesos y articulaciónes?");
                    boolean iArt;
                    
                    iArt = input.nextBoolean();
                    if (iArt == true) {
                        System.out.println("POSIBLE DIAGNOSTICO: Infección Viríca.");
                    } else {
                        System.out.println("¿Precenta erupciónes cutaneas?");
                        boolean iCut;
                        
                        iCut = input.nextBoolean();
                        if (iCut == true) {
                            System.out.println("POSIBLE DIAGNOSTICO: Erupciónes cutaneas.");
                        } else {
                            System.out.println("¿Le duele la garganta?");
                            boolean iGar;
                            
                            iGar = input.nextBoolean();
                            if (iGar == true) {
                                System.out.println("POSIBLE DIAGNOSTICO: Infeccion de garganta.");
                            } else {
                                System.out.println("¿Le duele la espalda por encima de las lumbares, con escalofrios y fiebre?");
                                boolean iLum;
                                
                                iLum = input.nextBoolean();
                                if (iLum == true) {
                                    System.out.println("POSIBLE DIAGNOSTICO: Infección renal.");
                                } else {
                                    System.out.println("¿Le duele al orinar o lo hace con más frecuencia?");
                                    boolean iOri;
                                    
                                    iOri = input.nextBoolean();
                                    if (iOri == true) {
                                        System.out.println("POSIBLE DIAGNOSTICO: Infección de tracto urinario.");
                                    } else {
                                        System.out.println("¿Ha pasado el dia al sol o con mucho calor?");
                                        boolean iCal;
                                        
                                        iCal = input.nextBoolean();
                                        if (iCal == true) {
                                            System.out.println("POSIBLE DIAGNOSTICO: Golpe de calor o agotamiento por calor.");
                                        } else {
                                            System.out.println("No dispone de suficiente información para un diagnostico.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("No es suficiente informacion");
        }
    }
}
    
    

