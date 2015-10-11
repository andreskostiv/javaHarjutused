package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;



/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor (Foor. YLEMINE, primaryStage);
        Foor foor2 = new Foor (Foor. ALUMINE, primaryStage);
        Foor foor3 = new Foor (Foor. VASAK, primaryStage);
        Foor foor4 = new Foor (Foor. PAREM, primaryStage);
        vertikaalne(foor1);
        vertikaalne(foor2);
        horisontaalne(foor3);
        horisontaalne(foor4);

    }

    public void vertikaalne (Foor foor){

        int count=0;
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

    public void horisontaalne (Foor foor){
        int count=0;
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



}
