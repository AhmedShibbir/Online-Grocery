package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import org.w3c.dom.ranges.Range;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class ShoppingPageController implements Initializable {

    @FXML
    private  AnchorPane rootPane;

    @FXML
    private Button logoutButton;

    @FXML
    private ComboBox<String> riceAmount;

    @FXML
    private ComboBox<String> oilAmount;

    @FXML
    private ComboBox<String> onionAmount;

    @FXML
    private ComboBox<String> garlicAmount;

    @FXML
    private ComboBox<String> saltAmount;

    @FXML
    private ComboBox<String> appleAmount;

    @FXML
    private ComboBox<String> bannaAmount;

    @FXML
    private ComboBox<String> mangoAmount;

    @FXML
    private ComboBox<String> grapeAmount;

    @FXML
    private ComboBox<String> avocadoAmount;

    @FXML
    private ComboBox<String> tomatoAmount;

    @FXML
    private ComboBox<String> brinjalAamount;

    @FXML
    private ComboBox<String> cucumberAmount;

    @FXML
    private ComboBox<String> carrotAmount;

    @FXML
    private ComboBox<String> calabashAmount;

    @FXML
    private ComboBox<String> pawnAmount;

    @FXML
    private ComboBox<String> beefAmount;

    @FXML
    private ComboBox<String> fishAmount;

    @FXML
    private ComboBox<String> chickenAmount;

    @FXML
    private ComboBox<String> lambAmount;

    @FXML
    private Button checkoutButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        riceAmount.getItems().setAll("1 KG","3 KG","5 KG");
        oilAmount.getItems().setAll("1 Litre","3 Litre","5 Litre");
        onionAmount.getItems().setAll("1 KG","3 KG","5 KG");
        garlicAmount.getItems().setAll("1 KG","3 KG","5 KG");
        saltAmount.getItems().setAll("1 KG","3 KG","5 KG");


        appleAmount.getItems().setAll("1 KG","3 KG","5 KG");
        mangoAmount.getItems().setAll("1 KG","3 KG","5 KG");
        grapeAmount.getItems().setAll("1 KG","3 KG","5 KG");
        avocadoAmount.getItems().setAll("1 KG","3 KG","5 KG");
        bannaAmount.getItems().setAll("4 PIECE","8 PIECE");



        tomatoAmount.getItems().setAll("1 KG","3 KG","5 KG");
        brinjalAamount.getItems().setAll("1 KG","3 KG","5 KG");
        cucumberAmount.getItems().setAll("1 KG","3 KG","5 KG");
        carrotAmount.getItems().setAll("1 KG","3 KG","5 KG");
        calabashAmount.getItems().setAll("1 KG","3 KG","5 KG");

        pawnAmount.getItems().setAll("1 KG","3 KG","5 KG");
        beefAmount.getItems().setAll("1 KG","3 KG","5 KG");
        fishAmount.getItems().setAll("1 KG","3 KG","5 KG");
        chickenAmount.getItems().setAll("1 KG","3 KG","5 KG");
        lambAmount.getItems().setAll("1 KG","3 KG","5 KG");

    }


    @FXML
    void checkoutButtonAction(ActionEvent event) throws IOException {

        int total = 0 ;

        int rice = 0 , oil  =0, onion = 0 , garlic = 0 , salt = 0;

        int apple = 0 , banana = 0 , mango =  0 , grape = 0 , avocado  = 0 ;

        int tomato = 0 , brinjal = 0 , cucumber = 0 , carrot = 0 , calabash  = 0 ;

        int pawn= 0 , beef = 0 , lamb =  0  , chicken = 0 , fish = 0 ;

        if(!riceAmount.getSelectionModel().isEmpty())
            rice  = (riceAmount.getValue().toString().charAt(0)-'0');
        if(!oilAmount.getSelectionModel().isEmpty())
             oil = oilAmount.getValue().toString().charAt(0) -'0';
        if(!onionAmount.getSelectionModel().isEmpty())
              onion= onionAmount.getValue().toString().charAt(0) -'0';
        if(!garlicAmount.getSelectionModel().isEmpty())
            garlic = garlicAmount.getValue().toString().charAt(0) -'0';
        if(!saltAmount.getSelectionModel().isEmpty())
            salt = saltAmount.getValue().toString().charAt(0) -'0';


        if(!appleAmount.getSelectionModel().isEmpty())
            apple = appleAmount.getValue().toString().charAt(0) -'0';
        if(!bannaAmount.getSelectionModel().isEmpty())
             banana = bannaAmount.getValue().toString().charAt(0) -'0';
        if(!grapeAmount.getSelectionModel().isEmpty())
            grape =  grapeAmount.getValue().toString().charAt(0) -'0';
        if(!avocadoAmount.getSelectionModel().isEmpty())
             avocado = avocadoAmount.getValue().toString().charAt(0) -'0';
        if(!mangoAmount.getSelectionModel().isEmpty())
             mango = mangoAmount.getValue().toString().charAt(0) -'0';

        if(!tomatoAmount.getSelectionModel().isEmpty())
             tomato = tomatoAmount.getValue().toString().charAt(0) -'0';
        if(!brinjalAamount.getSelectionModel().isEmpty())
             brinjal = brinjalAamount.getValue().toString().charAt(0) -'0';
        if(!cucumberAmount.getSelectionModel().isEmpty())
            cucumber = cucumberAmount.getValue().toString().charAt(0) -'0';
        if(!carrotAmount.getSelectionModel().isEmpty())
            carrot =  carrotAmount.getValue().toString().charAt(0) -'0';
        if(!calabashAmount.getSelectionModel().isEmpty())
            calabash = calabashAmount.getValue().toString().charAt(0) -'0';

        if(!pawnAmount.getSelectionModel().isEmpty())
             pawn = pawnAmount.getValue().toString().charAt(0) -'0';
        if(!beefAmount.getSelectionModel().isEmpty())
             beef =  beefAmount.getValue().toString().charAt(0) -'0';
        if(!fishAmount.getSelectionModel().isEmpty())
             fish = fishAmount.getValue().toString().charAt(0) -'0';
        if(!chickenAmount.getSelectionModel().isEmpty())
             chicken = chickenAmount.getValue().toString().charAt(0) -'0';
        if(!lambAmount.getSelectionModel().isEmpty())
             lamb = lambAmount.getValue().toString().charAt(0) -'0';





        int riceprice = 50 , oilprice = 100 , onionprice = 40, garlicprice = 124,
            saltprice = 50 , appleprice = 120 , bananaprice =8 ,
            mangoprice = 100, avocadoprice =300 ,grapeprice =100,
            tomatoprice = 80 ,brinjalprice =30 , cucumberprice =32 , carrotprice =60 ,
            calabashprice=60,
            pawnprice =600 ,fishprice =210 , beefprice =500, chickenprice=250 , lambprice =400;

        total += rice*riceprice + oil*oilprice + onion*onionprice + garlic*garlicprice + salt*saltprice +
                apple*appleprice + banana*bananaprice + avocado*avocadoprice + mango*mangoprice + grape*grapeprice +
                tomato*tomato +  brinjal*brinjal + cucumber*cucumber + carrot*carrotprice +  calabash*calabashprice +
                pawn*pawn + fish*fishprice + beef*beefprice +  chicken*chickenprice + lamb*lambprice ;


        String riceToString ="RICE   :  "+ Integer.toString(rice)+" KG x " + Integer.toString(riceprice)
                               +" TK PER KG = "+ (rice*riceprice)+" TK";
        String oilToString ="OIL   :  " +Integer.toString(oil)+" LITRE x " + Integer.toString(oilprice)
                +" TK PER LITRE = "+ (oil*oilprice)+" TK";
        String onionToString = "ONION   :  "+ Integer.toString(onion)+" KG x " + Integer.toString(onionprice)
                +" TK PER KG = "+ (onion*onionprice)+" TK";
        String garlicToString ="GARLIC  :  "+Integer.toString(garlic)+" KG x " + Integer.toString(garlicprice)
                +" TK PER KG = "+ (garlic*garlicprice)+" TK";
        String saltToString ="SALT   :  "+ Integer.toString(salt)+" KG x " + Integer.toString(saltprice)
                +" TK PER KG = "+ (salt*saltprice)+" TK";

        String appleToString = "APPLE   :  "+ Integer.toString(apple)+" KG x " + Integer.toString(appleprice)
                +" TK PER KG = "+ (apple*appleprice)+" TK";
        String bananaToString ="BANANA   :  "+ Integer.toString(banana)+" PIECE x " + Integer.toString(bananaprice)
                +" TK PER PIECE0  = "+ (banana*bananaprice)+" TK";
        String mangoToString ="MANGO   :  "+  Integer.toString(mango)+" KG x " + Integer.toString(mangoprice)
                +" TK PER KG = "+ (mango*mangoprice)+" TK";
        String grapeToString ="GRAPE   :  "+  Integer.toString(grape)+" KG x " + Integer.toString(grapeprice)
                +" TK PER KG = "+ (grape*grapeprice)+" TK";
        String avocadoToString ="AVOCADO   :  "+Integer.toString(avocado)+" KG x " + Integer.toString(avocadoprice)
                +" TK PER KG = "+ (grape*avocadoprice)+" TK";


        String tomatoToString = "TOMATO   :  "+ Integer.toString(tomato)+" KG x " + Integer.toString(tomatoprice)
                +" TK PER KG = "+ (tomato*tomatoprice)+" TK";
        String brinjalToString = "BRINJAL   :  "+ Integer.toString(brinjal)+" KG x " + Integer.toString(brinjalprice)
                +" TK PER KG = "+ (brinjal*brinjalprice)+" TK";
        String cucumberToString = "CUCUMBER   :  "+ Integer.toString(cucumber)+" KG x " + Integer.toString(cucumberprice)
                +" TK PER KG = "+ (cucumber*cucumberprice)+" TK";
        String carrotToString ="CARROT   :  "+Integer.toString(carrot)+" KG x " + Integer.toString(carrotprice)
                +" TK PER KG = "+ (carrot*carrotprice)+" TK";
        String calabashToString ="CALABASH   :  "+Integer.toString(calabash)+" KG x " + Integer.toString(calabashprice)
                +" TK PER KG = "+ (calabash*calabashprice)+" TK";

        String pawnToString ="PAWN   :  "+Integer.toString(pawn)+" KG x " + Integer.toString(pawnprice)
                +" TK PER KG = "+ (pawn*avocadoprice)+" TK";
        String fishToString ="FISH   :  "+Integer.toString(fish)+" KG x " + Integer.toString(fishprice)
                +" TK PER KG = "+ (avocado*avocadoprice)+" TK";
        String beefToString ="BEEF   :  "+Integer.toString(beef)+" KG x " + Integer.toString(beefprice)
                +" TK PER KG = "+ (beef*avocadoprice)+" TK";
        String chickenToString ="CHICKEN   :  "+Integer.toString(chicken)+" KG x " + Integer.toString(chickenprice)
                +" TK PER KG = "+ (chicken*avocadoprice)+" TK";
        String lambToString ="LAMB   :  "+Integer.toString(lamb)+" KG x " + Integer.toString(lambprice)
                +" TK PER KG = "+ (lamb*avocadoprice)+" TK";

        String khreer ="--------------------------------------------------------------------";

        String totalTOString= "TOTAL PRICE  >>>>>>>>>>>>>>>>>>>>>:    "+total+"  TK";


        ObservableList<String> buyinglist = FXCollections.observableArrayList();

        if(rice>0)
            buyinglist.add(riceToString);
        if(oil>0)
            buyinglist.add(oilToString);
        if(onion>0)
            buyinglist.add(onionToString);
        if(garlic>0)
            buyinglist.add(garlicToString);
        if(salt>0)
            buyinglist.add(saltToString);

        if(apple>0)
            buyinglist.add(appleToString);
        if(banana>0)
            buyinglist.add(bananaToString);
        if(grape>0)
            buyinglist.add(grapeToString);
        if(avocado>0)
            buyinglist.add(avocadoToString);
        if(mango>0)
            buyinglist.add(mangoToString);

        if(tomato>0)
            buyinglist.add(tomatoToString);
        if(cucumber>0)
            buyinglist.add(cucumberToString);
        if(calabash>0)
            buyinglist.add(calabashToString);
        if(carrot>0)
            buyinglist.add(carrotToString);
        if(brinjal>0)
            buyinglist.add(brinjalToString);

        if(pawn>0)
            buyinglist.add(pawnToString);
        if(beef>0)
            buyinglist.add(beefToString);
        if(chicken>0)
            buyinglist.add(chickenToString);
        if(fish>0)
            buyinglist.add(fishToString);
        if(lamb>0)
            buyinglist.add(lambToString);

        buyinglist.add(khreer);
        buyinglist.add(totalTOString);


        FXMLLoader loader = new FXMLLoader(getClass().getResource("checkout.fxml"));
        rootPane = loader.load();
        CheckoutController controller = loader.getController();
        controller.setUpTable(buyinglist);

        Random rand = new Random(45);

        int token = rand.nextInt(400000000);

        controller.setLabel(Integer.toString(token));

        checkoutButton.getScene().setRoot(rootPane);

        System.out.println(total);
    }

    @FXML
    void logoutButtonAction(ActionEvent event) throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource("main.fxml"));
        rootPane.getChildren().setAll(pane);

    }



}
