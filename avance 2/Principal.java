
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Ivan piñon peña
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        String sConsolas , sPopu , sArmas , sAnnio , sRol , sCovenant, sMolestias,sMapa,sApo,sMulti,sPelea,sZombi,sBatt,sEntregas,sDragones,sManiaco , sCons , sMatas , sOeste , sPortal , sCall , sAbierto ;
        String sPrin, sSusp,sDark,sWitc,sCarreras,sDeci,sBatman,sLego,sMine,sFut,sFifa,sPes ;
        System.out.println("Tratare de adivinar tu juego");
        System.out.println("Primero dime tu consola");
         
        sConsolas = input.nextLine();
        if ("xbox360".equals(sConsolas) || "xbox 360".equals(sConsolas) || "Xbox 360".equals(sConsolas) || "Xbox360".equals(sConsolas) ) {
            System.out.println("Tu juego es muy popular?");
            sPopu = input.nextLine(); 
            if (sPopu.equals("si") || sPopu.equals("Si")) {
                System.out.println("De que año es el juego?");
                sAnnio = input.nextLine();
                if (sAnnio.equals("1980")) {
                    System.out.println("Es: Pac-Man "); 
                } else  
                 if (sAnnio.equals("2004")) {
                     System.out.println("Es Grand Theft Auto:San Amdreas");
                 } else
                     if (sAnnio.equals("2005")) {
                         System.out.println("Es: Call of Duty 2");
                     } else
                         if (sAnnio.equals("2006")) { //Falta un juegos
                             System.out.println("Se utiliza una sierra en la arma?");
                             sArmas = input.nextLine();
                              if (sArmas.equals("si") || sArmas.equals("Si") ) {
                                  System.out.println("Es: Gears of war");
                              } else 
                                  System.out.println("Es un juego de Rol?");
                                  sRol = input.nextLine();
                                   if (sRol.equals("si") || sRol.equals("Si")) {
                                       System.out.println("Es: The Elder Scrolls lV:Oblivion");
                                   } else 
                                       System.out.println("Es un juego donde se molesta a otras personas?");
                                       sMolestias = input.nextLine();
                                        if (sMolestias.equals("si") || sMolestias.equals("Si")) {
                                            System.out.println("Es: Bully");
                                        } else 
                                             System.out.println("Tu juego se centra mas en zombies?");
                                             sZombi = input.nextLine();
                                              if (sZombi.equals("si") || sZombi.equals("Si"))
                                                  System.out.println("Dead Rising");
                                        
                         } else                      
                             if (sAnnio.equals("2007")) { // me falto Halo 3
                                 System.out.println("En tu juego aparecen los Covenant?");
                                 sCovenant = input.nextLine();
                                  if (sCovenant.equals("si") || (sCovenant.equals("Si")) ) {
                                      System.out.println("Es: Halo 3");
                                  } else 
                                      System.out.println("Es: Call of Duty 4:Modern Warfare");
                                                
                             } else 
                                if (sAnnio.equals("2008")) { 
                                                    System.out.println("Tu juego es de mapa abierto?");
                                                    sMapa = input.nextLine();
                                                     if (sMapa.equals("si") || sMapa.equals("Si")) {
                                                         System.out.println("Tu juego se centra mas en zombies?");
                                                             sZombi = input.nextLine();
                                                              if (sZombi.equals("si") || sZombi.equals("Si")) {
                                                                  System.out.println("Es: Left 4 Dead");
                                                              } else
                                                                  System.out.println("Tu juego es la segunda entrega de tu juego?");
                                                                   sEntregas = input.nextLine();
                                                                    if (sEntregas.equals("si") || sEntregas.equals("Si")) {
                                                                        System.out.println("Es: Fable 2");
                                                                    } else 
                                                         System.out.println("Tu juego es post apocalíptico?");
                                                         sApo = input.nextLine();
                                                          if (sApo.equals("si") || sApo.equals("Si")) {
                                                              System.out.println("Es: Fallout 3");
                                                          } else 
                                                              System.out.println("Se utiliza una sierra en la arma?");
                                                              sArmas = input.nextLine();
                                                               if (sArmas.equals("si") || sArmas.equals("Si") ) {
                                                                   System.out.println("Es: Gears of war");
                                                               } else 
                                                              System.out.println("Es: Grand Theft Auto lV");
                                                     } else 
                                                         System.out.println("Es: Call of Duty:World at War");
                                                } else
                                                    if (sAnnio.equals("2009")) {
                                                        System.out.println("Tu juego teine armas fuego?");
                                                        sArmas = input.nextLine();
                                                         if (sArmas.equals("si") || sArmas.equals("Si")) {
                                                             System.out.println("Tu juego se centra mas en zombies?");
                                                             sZombi = input.nextLine();
                                                              if (sZombi.equals("si") || sZombi.equals("Si")) {
                                                                  System.out.println("Es: Left 4 Dead 2");
                                                              } else
                                                                  System.out.println("Es: Call of Duty:Modern Warfare 2");
                                                         } else 
                                                             System.out.println("En tu juego se puede contruir cualquier cosa?");
                                                             sCons = input.nextLine();
                                                             if (sCons.equals("si") || sCons.equals("Si")) {
                                                                 System.out.println("Es: Minecraft");
                                                             } else 
                                                                 System.out.println("En tu juego se assesina?");
                                                                 sMatas = input.nextLine();
                                                                  if (sMatas.equals("si") || sMatas.equals("Si")) {
                                                                      System.out.println("Es: Assassin´s Creed 2");
                                                                  } else 
                                                                      System.out.println("Es: Los Sims 3");
                                                    } else 
                                                        if (sAnnio.equals("2010")) {
                                                            System.out.println("Tu juego de de suspenso o  thriller psicológico?");
                                                            sSusp= input.nextLine();
                                                             if (sSusp.equals("si") || sSusp.equals("Si")) {
                                                                 System.out.println("Es: Alan Wake");
                                                             } else
                                                            System.out.println("Tu juego teine armas fuego?");
                                                            sArmas = input.nextLine();
                                                             if (sArmas.equals("si") || sArmas.equals("Si")) {
                                                                  System.out.println("Tu juego tiene zombies?");
                                                                  sZombi = input.nextLine();
                                                                  if (sZombi.equals("si") || sZombi.equals("Si")) {
                                                                      System.out.println("Tu juego se desarrolla principal mente en el viejo oeste?");
                                                                      sOeste = input.nextLine();
                                                                       if (sOeste.equals("si") || sOeste.equals("Si")) {
                                                                           System.out.println("Es: Red Dead Redemption");
                                                                       } else 
                                                                           System.out.println("Es: Call of Duty:Black Ops");
                                                                  } else 
                                                                      System.out.println("Es: Fallout:New Vegas");
                                                             } else 
                                                                 System.out.println("Tu juego se desarrolla principal mente en el viejo oeste?");
                                                                      sOeste = input.nextLine();
                                                                       if (sOeste.equals("si") || sOeste.equals("Si")) {
                                                                           System.out.println("Es: Red Dead Redemption");
                                                                       } else
                                                                           System.out.println("Es: World of Thaks");
                                                        } else 
                                                            if (sAnnio.equals("2011")) {
                                                                System.out.println("En tu juego utilizas un arma de portales?");
                                                                sPortal = input.nextLine();
                                                                 if (sPortal.equals("si") || sPortal.equals("Si")) {
                                                                     System.out.println("Es: Portal 2");
                                                                 } else 
                                                                    System.out.println("Tu juego utilizas armas fuego?");
                                                                    sArmas = input.nextLine();
                                                                     if (sArmas.equals("si") || sArmas.equals("Si")) {
                                                                         System.out.println("Tu juego es un Call of Duty?");
                                                                         sCall = input.nextLine();
                                                                         if (sCall.equals("si") || sCall.equals("Si")) {
                                                                             System.out.println("Es: Call of Duty:Moder Warfare3");
                                                                         } else 
                                                                             System.out.println("Tu juego es un Battlefield?");
                                                                             sMapa = input.nextLine();
                                                                              if (sMapa.equals("si") || sMapa.equals("Si")) {
                                                                                  System.out.println("Es: Battlefield 3");
                                                                              } else 
                                                                                  System.out.println("Es: L.A. Noire");
                                                                     } else 
                                                                         System.out.println("Tu juego es de mundo abierto 3D?"); 
                                                                         sAbierto = input.nextLine();
                                                                          if (sAbierto.equals("si") || sAbierto.equals("Si")) {
                                                                              System.out.println("En tu juego ahí dragones?");
                                                                              sDragones = input.nextLine();
                                                                               if (sDragones.equals("si") || sDragones.equals("Si")) {
                                                                                   System.out.println("Tu juego es un Dark Souls?");
                                                                                   sDark = input.nextLine();
                                                                                    if (sDark.equals("Si") || (sDark.equals("si"))) {
                                                                                        System.out.println("Es: Dark Souls");
                                                                                    } else 
                                                                                        System.out.println("Tu juego de carreras?");
                                                                                        sCarreras = input.nextLine();
                                                                                         if (sCarreras.equals("si") || sCarreras.equals("Si")) {
                                                                                              System.out.println("Es: Forza Motorsport 4");
                                                                                         } else
                                                                                           System.out.println("Es: The Elder Scrolls V:Skyrim");
                                                                               } else 
                                                                                   System.out.println("Es: Batman:Arkham City"); 
                                                                         } else 
                                                                              System.out.println("Tu juego de carreras?");
                                                                              sCarreras = input.nextLine();
                                                                               if (sCarreras.equals("si") || sCarreras.equals("Si")) {
                                                                                   System.out.println("Es: Forza Motorsport 4");
                                                                               } else 
                                                                          System.out.println("Es: Terraria");
                                                            } else 
                                                              if (sAnnio.equals("2012")) {
                                                                  System.out.println("Tu juego teine armas fuego?");
                                                                    sArmas = input.nextLine();
                                                                     if (sArmas.equals("si") || sArmas.equals("Si")) {
                                                                         System.out.println("Tu juego es un Call of Duty?");
                                                                         sCall = input.nextLine();
                                                                         if (sCall.equals("si") || sCall.equals("Si")) {
                                                                             System.out.println("Es: Call of Duty:Black Ops 2");
                                                                         } else 
                                                                             System.out.println("Tu juego tiene a un maniaco como enemigo principal en el juego?");
                                                                             sManiaco = input.nextLine();
                                                                              if (sManiaco.equals("Si") || sManiaco.equals("si")) {
                                                                                  System.out.println("Tu juego es la tercera entrega de tu juego?");
                                                                                  sEntregas = input.nextLine();
                                                                                   if (sEntregas.equals("si") || sEntregas.equals("Si")) {
                                                                                       System.out.println("Es: Far Cry 3");
                                                                                   } else 
                                                                                       System.out.println("Es: Borderlands 2");
                                                                              } else 
                                                                                  System.out.println("Tu juego es un Witcher?");
                                                                                  sWitc = input.nextLine();
                                                                                   if (sWitc.equals("si") || sWitc.equals("Si")) {
                                                                                       System.out.println("Es: The Witcher 2 Assassins of Kings");
                                                                                   } else 
                                                                                       System.out.println("Tu juego es de toma de deciciones?");
                                                                                       sDeci = input.nextLine();
                                                                                        if (sDeci.equals("si") || sDeci.equals("Si")) {
                                                                                            System.out.println("Es: Mass Effect Trilogy");
                                                                                        } else 
                                                                                         System.out.println("Es: Counter-Strike:Global Offensive");
                                                                     } else 
                                                                         System.out.println("Es: Forza Horizon");
                                                              } else 
                                                                  if (sAnnio.equals("2013")) {
                                                                      System.out.println("Tu juego utilizas armas fuego?");
                                                                    sArmas = input.nextLine();
                                                                     if (sArmas.equals("si") || sArmas.equals("Si"))
                                                                         System.out.println("Tu juego se centra mas en el multijuador?");
                                                                         sMulti = input.nextLine();
                                                                          if (sMulti.equals("si") || sMulti.equals("Si")) {
                                                                               System.out.println("Tu juego es un Call of Duty?");
                                                                               sCall = input.nextLine();
                                                                                if (sCall.equals("si") || sCall.equals("Si"))  {
                                                                                    System.out.println("Es: Call of Duty:Ghosts");
                                                                                } else 
                                                                                    System.out.println("Tu juego es un Battlefield?");
                                                                                    sBatt = input.nextLine();
                                                                                     if (sBatt.equals("si") || sBatt.equals("si")) {
                                                                                         System.out.println("Es: Battlefield 4");
                                                                                     } else 
                                                                                         System.out.println("Tu juego se centra en peleas?");
                                                                                         sPelea = input.nextLine();
                                                                                          if (sPelea.equals("si") || sPelea.equals("Si")) {
                                                                                              System.out.println("Es: Injustice:Dioses entre nosotros");
                                                                                          } else 
                                                                                              System.out.println("En tu juego tu juego tiene un salto de fe?");
                                                                                              sMatas = input.nextLine();
                                                                                              if (sMatas.equals("si") || sMatas.equals("Si")) {
                                                                                                  System.out.println("Es: Assassin´s Creed lV:Black Flag");
                                                                                              } else
                                                                                             System.out.println("Es: Grand Theft Auto V"); 
                                                                          } else 
                                                                              System.out.println("Tu juego tiene tres personajes principales?");
                                                                              sPrin = input.nextLine();
                                                                               if (sPrin.equals("si") || sPrin.equals("Si")) {
                                                                                   System.out.println("Es: Grand Theft Auto V");
                                                                               } else 
                                                                                    System.out.println("Tu juego se centra en peleas?");
                                                                                         sPelea = input.nextLine();
                                                                                          if (sPelea.equals("si") || sPelea.equals("Si")) {
                                                                                              System.out.println("Es: Injustice:Dioses entre nosotros");
                                                                                          } else 
                                                                                              System.out.println("En tu juego tu juego tiene un salto de fe?");
                                                                                              sMatas = input.nextLine();
                                                                                              if (sMatas.equals("si") || sMatas.equals("Si")) {
                                                                                                  System.out.println("Es: Assassin´s Creed lV:Black Flag");
                                                                                              } else
                                                                                                  System.out.println("Tu juego es de mundo abierto 3D?"); 
                                                                                                  sAbierto = input.nextLine();
                                                                                                   if (sAbierto.equals("si") || sAbierto.equals("Si")) {
                                                                                                       System.out.println("En tu juego aparece batman?");
                                                                                                       sBatman = input.nextLine();
                                                                                                        if (sBatman.equals("si") || sBatman.equals("Si")) {
                                                                                                            System.out.println("Es: Batman:Arkham Origins");
                                                                                                        } else 
                                                                                                            System.out.println("Es: Saints Row lV");
                                                                                                   }else 
                                                                                                       System.out.println("Es: Bioshock Infinite");
                                                                  } else 
                                                                      if (sAnnio.equals("2014")) {
                                                                          System.out.println("Tu juego es un Call of Duty?");
                                                                         sCall = input.nextLine();
                                                                         if (sCall.equals("si") || sCall.equals("Si")) {
                                                                             System.out.println("Es: Call of Duty:Advanced Warfare");
                                                                         } else 
                                                                             System.out.println("Tu juego es de carreras?");
                                                                             sCarreras = input.nextLine();
                                                                              if (sCarreras.equals("si") || sCarreras.equals("Si")) {
                                                                                  System.out.println("Es: Forza horizon 2");
                                                                              } else 
                                                                                  System.out.println("Es: Destiny");
                                                                      } else 
                                                                            if (sAnnio.equals("2015"))  {
                                                                                 System.out.println("Tu juego es un lego?"); 
                                                                             sLego = input.nextLine();
                                                                              if (sLego.equals("si") || sLego.equals("Si")) {
                                                                                  System.out.println("En tu juego aparece batman?");
                                                                                  sBatman = input.nextLine();
                                                                                   if (sBatman.equals("si") || sBatman.equals("Si")) {
                                                                                       System.out.println("Es: Lego Dimensions");
                                                                                   } else 
                                                                                       System.out.println("Es: Lego Jurassic World");
                                                                              } else 
                                                                                  System.out.println("Tu juego es un minecraft?"); 
                                                                                  sMine = input.nextLine();
                                                                                   if (sMine.equals("si") || sMine.equals("Si")) {
                                                                                       System.out.println("Es: Minecraft:Story Mode");
                                                                                   }else 
                                                                                       System.out.println("Tu juego es un Call of Duty?");
                                                                                       sCall = input.nextLine();
                                                                                        if (sCall.equals("si") || sCall.equals("Si")) 
                                                                                            System.out.println("Es: Call of Duty:Black Ops 3");
                                                                            } else 
                                                                                if (sAnnio.equals("2016")) {
                                                                                    System.out.println("Tu juego es de futboll?");
                                                                                    sFut = input.nextLine();
                                                                                     if (sFut.equals("si") || sFut.equals("Si"))
                                                                                         System.out.println("Es: Fifa 17");
                                                                                } else 
                                                                                    if (sAnnio.equals("2017")) {
                                                                                        System.out.println("Tu juego es de futboll?");
                                                                                    sFut = input.nextLine();
                                                                                     if (sFut.equals("si") || sFut.equals("Si"))
                                                                                         System.out.println("Es un Fifa?");
                                                                                         sFifa = input.nextLine();
                                                                                          if (sFifa.equals("si") || sFifa.equals("Si")) {
                                                                                              System.out.println("Es: Fifa 18");
                                                                                          } else 
                                                                                              System.out.println("Tu juego es un PES?");
                                                                                              sPes = input.nextLine();
                                                                                               if (sPes.equals("si") || sPes.equals("Si"))
                                                                                                   System.out.println("Es:Pro Evolution Soccer 2018");
                                                                                    } else 
                                                                                        if(sAnnio.equals("2018"))
                                                                                            System.out.println("Es un Fifa?");
                                                                                         sFifa = input.nextLine();
                                                                                          if (sFifa.equals("si") || sFifa.equals("Si")) 
                                                                                              System.out.println("Es: Fifa 19");
                                                                         
                                                                                                                                                            
           } else                                                            
                System.out.println("Pues eligue otro juego xD");
        } else 
         if (sConsolas.equals("Playstation4") || sConsolas.equals("Playstation 4") || sConsolas.equals("playstation4") || sConsolas.equals("playstation 4") || sConsolas.equals("playsteichon 4")) {
             System.out.println("Es popular?");
             sPopu = input.nextLine();
             if (sPopu.equals("si") || sPopu.equals("Si")) {    
                System.out.println("De que año es el juego?");
                sAnnio = input.nextLine();
                 if (sAnnio.equals("2009")) {
                      System.out.println("En tu juego se puede contruir cualquier cosa?");
                      sCons = input.nextLine();
                       if (sCons.equals("si") || sCons.equals("Si")) 
                       System.out.println("Es: Minecraft");
                        
                 } else   
                     if (sAnnio.equals("2010")) {
                     System.out.println("Tu juego de de suspenso o  thriller psicológico?");
                     sSusp= input.nextLine();
                      if (sSusp.equals("si") || sSusp.equals("Si")) 
                          System.out.println("Es: Heavy Rain");
                     } else 
                          if (sAnnio.equals("2011")) {
                               System.out.println("En tu juego ahí dragones?");
                               sDragones = input.nextLine();
                                if (sDragones.equals("si") || sDragones.equals("Si"))
                                    System.out.println("Es: The Elder Scrolls V:Skyrim");
                          } else 
                              if (sAnnio.equals("2013"))
                                  System.out.println("");
             } else 
                 System.out.println("Elige otro videojuego xD");
         } else 
             if ("xbox one".equals(sConsolas) || sConsolas.equals("Xbox one") || sConsolas.equals("Xboxone") || sConsolas.equals("xboxone")) {
                 System.out.println("Tu juego utiliza armas de fuego?");
                 sPopu = input.nextLine();
                 if (sPopu.equals("si") || sPopu.equals("Si")) {
                     System.out.println("Tu juego utiliza armas de fuego?");
                sArmas = input.nextLine();
                if (sArmas.equals("si"))
                         System.out.println("");
                 }else
                     System.out.println("Elige otro juego xD");
    
             } else 
              if (sConsolas.equals("Playstation3") || sConsolas.equals("Playstation 3") || sConsolas.equals("playstation3") || sConsolas.equals("playstation 3") || sConsolas.equals("playsteichon 3")) {
               System.out.println("Tu juego utiliza armas de fuego?");
               sPopu = input.nextLine();
                if (sPopu.equals("si") || sPopu.equals("Si")) {
                System.out.println("Tu juego utiliza armas de fuego?");
                sArmas = input.nextLine();
                 if (sArmas.equals("si"))
                 System.out.println("");
                     
                } else 
                 System.out.println("Elige otro videojuego xD");
              } else 
                 System.out.println("La consola esta mal o el año escrita o no esta en los registros o eligue en otra consola en el que este.");
                 
             
    }
    
}
