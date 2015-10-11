package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;



/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik_if extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor (Foor. YLEMINE, primaryStage);
        Foor foor2 = new Foor (Foor. ALUMINE, primaryStage);
        Foor foor3 = new Foor (Foor. VASAK, primaryStage);
        Foor foor4 = new Foor (Foor. PAREM, primaryStage);
        tsykkel(foor1, 0);
        tsykkel(foor2, 0);
        tsykkel(foor3, 1);
        tsykkel(foor4, 1);

    }

    public void tsykkel (Foor foor, int suund){

        int count=0;
        if ( suund == 0) {

            while(count<10) {
                foor.vahetaRohelist();
                foor.paus(0.5);
                foor.vahetaRohelist();
                foor.paus(0.5);
                foor.vahetaRohelist();
                foor.paus(0.5);
                foor.vahetaRohelist();
                foor.paus(0.5);


                foor.vahetaKollast();
                foor.paus(0.5);
                foor.vahetaKollast();
                foor.vahetaPunast();
                foor.paus(2);

                foor.paus(2);
                foor.vahetaPunast();
                foor.vahetaKollast();
                foor.paus(0.5);
                foor.vahetaKollast();
                foor.vahetaRohelist();
                count = count + 1;
            }
        }
        else {

            while(count<10) {

                foor.vahetaPunast();
                foor.paus(2);
                foor.vahetaKollast();
                foor.paus(0.5);
                foor.vahetaPunast();
                foor.vahetaKollast();
                foor.vahetaRohelist();
                foor.paus(2);

                foor.vahetaRohelist();
                foor.paus(0.5);
                foor.vahetaRohelist();
                foor.paus(0.5);
                foor.vahetaRohelist();
                foor.paus(0.5);
                foor.vahetaRohelist();
                foor.paus(0.5);
                foor.vahetaRohelist();
                foor.vahetaKollast();
                foor.paus(0.5);
                foor.vahetaKollast();
                foor.vahetaPunast();
                count = count + 1;
        }
        }
    }
}
