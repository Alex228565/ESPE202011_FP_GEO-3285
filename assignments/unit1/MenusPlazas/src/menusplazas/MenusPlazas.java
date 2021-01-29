/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menusplazas;
 
/**
 *
 * @author Alex
 */
public class MenusPlazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int optionViewpoint;
                do{
            String name;
                    System.out.println("Hey " + name + 
                            " The viewpoints in Quito are: ");
                    System.out.println("1.Plaza Grande");
                    System.out.println("2.Plaza del Teatro");
                    System.out.println("3.Plaza las Americas");
                    System.out.println("4. Exit");
                    optionViewpoint = input.nextInt();
                    switch(optionViewpoint){
                        case 1:
                           
                            System.out.println("Let's go to Plaza Grande");
                            System.out.println("The Ubication"
                                    + " Of The Plaza Grande Is:");
                            System.out.println("Sector: Quito's Historic center");
                            System.out.println("Av. and Chile St Venezuela "
                                    + "you can enter by "
                                    + "av. García Moreno Quito 170401");
                        {
                            int PlazaGrande;
                            do{                               
                                System.out.println(name +
                                        " you know how to get "
                                        + "there?");
                                System.out.println("1. Yes");
                                System.out.println("2. No");
                                PlazaGrande  = input.nextInt();
                                switch(PlazaGrande){
                                    case 1:
                                        System.out.println(name + 
                                                " have a good trip");
                                        System.exit(0);
                                        break;
                                    case 2:
                                        System.out.println("");
                                        break;
                                }
                            }while( PlazaGrande != 2);
                        }
                            
                           
                            
                            break;

                        case 2:
                            System.out.println("Let's go to Viewpoint "
                                    + "The Plaza del Teatro");
                            break;
                        case 3:
                            System.out.println("Let's go to Viewpoint "
                                    + "The Plaza las Americas");
                            break;
                        case 4:
                            System.out.println("Good bye " + name + 
                                    " come back soon!");
                    System.exit(0);
                            break;
                    }
                }while (optionViewpoint !=4);
                break;              
            }
}   
