/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task.fisica;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class WS13TaskFisica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            float timeSeconds;
            float mps, kph, mph;
            System.out.println(" --------------------------------");
            System.out.print("|Input distance in meters        |");
            float distance = scanner.nextFloat();
            System.out.print("|Input hour                      |");
            float hr = scanner.nextFloat();
            System.out.print("|Input minutes                   |");
            float min = scanner.nextFloat();
            System.out.print("|Input seconds                   |");
            float sec = scanner.nextFloat();
            System.out.println(" --------------------------------");
            timeSeconds = (hr * 3600) + (min * 60) + sec;
            mps = distance / timeSeconds;
            kph = (distance / 1000.0f) / (timeSeconds / 3600.0f);
            mph = kph / 1.609f;
            System.out.println(" --------------------------------");
            System.out.println("|Your speed in meters/second is  |" + mps);
            System.out.println("|Your speed in km/h is           |" + kph);
            System.out.println("|Your speed in miles/h is        |" + mph);
            System.out.println(" --------------------------------"
                    + "");
        }
    }

}
