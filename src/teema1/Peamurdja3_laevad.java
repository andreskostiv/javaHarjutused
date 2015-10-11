package teema1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {
        int[] laud = {0, 0, 1, 0, 0, 1, 0, 0, 1};

        while (gameover(laud)) {
            Scanner kasutaja = new Scanner(System.in);
            System.out.println("Laual on 9 ruutu. Mitmendat ruutu sa ründad?");
            int sisestus = kasutaja.nextInt();

            if (laud[sisestus - 1] == 1) {

                System.out.println("Pihtas-põhjas!");
                laud[sisestus - 1] = 2;


            } else if (laud[sisestus - 1] == 2) {
                System.out.println("Seda juba pommitasid");

            } else {
                System.out.println("Möödas!");
                laud[sisestus - 1] = 2;
            }

        }
        System.out.println("Sa võitsid!");
    }
            public static boolean gameover( int[] laud){
            for (int i = 0; i < laud.length; i++) {
                if (laud[i] == 1) {
                    return true;
                }
            }
            return false;
        }

        }
