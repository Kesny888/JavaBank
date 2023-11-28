package bank;

/* Kesny Raingsey
 * 12/18/2022
 * Semester Project SDEV 200
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;



public class App extends Application { 
    private Label Kbank = new Label("KBANK");
    private Button btopenAccount = new Button("Open an Account");
    private Button btloginAccount = new Button("Login Account"); 
    private Button btdeposit = new Button("Deposit");
    private Button btwithdraw = new Button("Withdraw");
    private Button btcheckBalance = new Button("Check Balance");
    private Button btcontactus = new Button("Contact Us");
    private Button btexit = new Button("Exit");  
    private Pane contentArea = new Pane();
    private TextField firstname = new TextField();
    private TextField lastname = new TextField();  
    private TextField userName = new TextField();
    private PasswordField passWord = new PasswordField();
    private Button submit = new Button("Submit");  
    private Button loginAcc = new Button("Login");
    private TextField output = new TextField();
    private TextField getWithdraw = new TextField();
    private int getD;
    private int gett;
    private int getwithdraw;
    protected BorderPane getPane(){
    

    BorderPane parent = new BorderPane();
    Pane top = new Pane();
    top.getChildren().add(Kbank);
    top.setPadding(new Insets(0, 0, 30, 0));
    Kbank.setLayoutX(300);
    parent.setTop(top);   
    parent.setPadding(new Insets(50, 10, 10, 10));

    //create another pane for vbox
    Pane pane1 = new Pane();
    parent.setLeft(pane1);
    //create vbox for menu
    
    VBox menu = new VBox(20);   
    //Setting size for the pane1 
    menu.setMinSize(150, 350); 
    //Setting the padding
    menu.setPadding(new Insets(25, 25, 25, 25));
    pane1.getChildren().addAll(menu); //add menu in pane1

    menu.getChildren().add(btopenAccount);
    menu.getChildren().add(btloginAccount);
    menu.getChildren().add(btcontactus);
    menu.getChildren().addAll(btexit);

    //Create gridpane

    parent.setCenter(contentArea);
    Label welcome = new Label("Welcome to KBANK");
    contentArea.getChildren().add(welcome);
    welcome.setLayoutX(160);
    welcome.setLayoutY(100);
    
    
    
    //Styleing nodes
    parent.setStyle("-fx-background-color: #0E5E6F");
    contentArea.setStyle("-fx-background-color: white");
    Kbank.setStyle("-fx-font: normal bold 30px 'serif' ; -fx-text-fill: white; ");
    welcome.setStyle("-fx-font: normal bold 18px 'serif' ; ");
    btopenAccount.setStyle("-fx-font: normal bold 15px 'serif' ; ");
    btloginAccount.setStyle("-fx-font: normal bold 15px 'serif' ; ");
    btcontactus.setStyle("-fx-font: normal bold 15px 'serif' ; ");
    btexit.setStyle("-fx-font: normal bold 15px 'serif' ; ");

    return parent;
    
    }
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    
    //Create borderpane
   
    

  
    primaryStage.setTitle("KBANK");//set title
    primaryStage.setScene(new Scene(getPane(), 680, 550)); //Place the scene in the stage
    primaryStage.show(); //Display the stage
  
    btexit.setOnAction(e-> {
    System.exit(0);
     });
    // 
     //Double lName = Double.parseDouble(lastname.getText());

     //Action 
     Customers customer = new Customers();
    btopenAccount.setOnAction(e-> openAccount());    
    btloginAccount.setOnAction(e->loginAccount());  

    submit.setOnAction(e-> {
      firstname.setEditable(false);
      lastname.setEditable(false);
      userName.setEditable(false);
      passWord.setEditable(false);
      customer.registerAccount();
    });
    //loginAcc.setOnAction(e-> {
     /// if (userName)
    //  Login();
    //});
    btdeposit.setOnAction(e-> Deposit());
    btwithdraw.setOnAction(e-> Withdraw());
    btcheckBalance.setOnAction(e-> {
      //account.checkAccount(e);
      CheckBalance();});

    btcontactus.setOnAction(e->Contact());  
     
  }

  //Action open account
  private void  openAccount(){
    GridPane Gpane = new GridPane();
    contentArea.getChildren().setAll(Gpane);
    contentArea.getChildren().removeAll();
    //Setting the gap
    Gpane.setAlignment(Pos.CENTER);
    Gpane.setPadding(new Insets(10, 10, 0, 10));
    Gpane.setVgap(15);
    Gpane.setHgap(30);
    
    //create the register form
    Label register = new Label("Registration Form");
    
    Gpane.add(register, 3, 0);
    Gpane.add(new Label("Firstname:"), 1, 2);
    Gpane.add(firstname, 3, 2);
    Gpane.add(new Label("Lastname:"), 1, 3);
    Gpane.add(lastname, 3, 3);
    Gpane.add(new Label("Phone number:"), 1, 4);
    Gpane.add(new TextField(), 3, 4);
    Gpane.add(new Label("Email:"), 1, 5);
    Gpane.add(new TextField(), 3, 5);
    Gpane.add(new Label("Username:"), 1, 6);
    Gpane.add(userName, 3, 6);
    Gpane.add(new Label("Password:"), 1, 7);
    Gpane.add(passWord, 3, 7);
    Gpane.add(new Label("Address:"), 1, 8);
    Gpane.add(new TextField(), 3, 8);    
    Gpane.add(submit, 4, 9); 

    //Styling
    register.setStyle("-fx-font: normal bold 20px 'serif' ; -fx-text-fill: #3A8891; ");    
  
  }  /* */

  private void  loginAccount(){
    GridPane Gpane = new GridPane();
    contentArea.getChildren().setAll(Gpane);
    contentArea.getChildren().removeAll();
    //Setting the gap
    Gpane.setAlignment(Pos.CENTER);
    Gpane.setPadding(new Insets(10, 10, 10, 15));
    Gpane.setVgap(20);
    Gpane.setHgap(30);
    Label login = new Label("Login");
    
    Gpane.add(login, 3, 0);
    Gpane.add(new Label("Username:"), 1, 2);
    TextField Fname = new TextField();
    Gpane.add(Fname, 3, 2);
    Gpane.add(new Label("Password:"), 1, 3);
    PasswordField Pword = new PasswordField();
    Gpane.add(Pword, 3, 3);
    Gpane.add(loginAcc, 3, 5); 

    login.setStyle("-fx-font: normal bold 20px 'serif' ; -fx-text-fill: #3A8891; ");   
    
    loginAcc.setOnAction(e-> {
      //Double user = Double.parseDouble(userName.getText());
       if (Fname.getText() .equals( userName.getText()) && (Pword.getText().equals(passWord.getText()))) {
          Login();
       } else {
        System.out.println("Username or Password is invalid");
       }
       
    });
  }
 


  private void  Login(){

    GridPane Gpane = new GridPane();
    contentArea.getChildren().setAll(Gpane);
    contentArea.getChildren().removeAll();
    //Setting the gap
    Gpane.setAlignment(Pos.CENTER);
    Gpane.setPadding(new Insets(10, 10, 10, 10));
    Gpane.setVgap(70);
    Gpane.setHgap(30);
    
    Gpane.add(btdeposit, 3, 2);
    Gpane.add(btwithdraw, 4, 2);
    Gpane.add(btcheckBalance, 5, 2);
    
    btdeposit.setStyle("-fx-font: normal bold 15px 'serif' ; ");
    btwithdraw.setStyle("-fx-font: normal bold 15px 'serif' ; ");
    btcheckBalance.setStyle("-fx-font: normal bold 15px 'serif' ; ");
  }

 
  private void Deposit() {
    Pane Dpane = new Pane();
    contentArea.getChildren().setAll(Dpane);
    contentArea.getChildren().removeAll();
    Label amount = new Label("Enter your deposit amount: ");
    Button dsubmit = new Button("Submit");
    Button dback = new Button("Back");
    Dpane.getChildren().add(amount);
    Dpane.getChildren().add(output);
    Dpane.getChildren().add(dsubmit);
    Dpane.getChildren().add(dback);
    amount.setLayoutX(30);
    amount.setLayoutY(150);
    output.setLayoutX(190);
    output.setLayoutY(150);
    dsubmit.setLayoutX(370);
    dsubmit.setLayoutY(150);
    dback.setLayoutX(390);
    dback.setLayoutY(300);
    Account account = new Account();
    dsubmit.setOnAction(e-> {
      getD = Integer.parseInt(output.getText());
      Label outputT = new Label("Deposit is successful, new balance is " +getD );
      Dpane.getChildren().add(outputT);
      outputT.setLayoutX(70);
      outputT.setLayoutY(200);
      account.deposit(getD);
      System.out.println("$"+getD);
      });

    dback.setOnAction(e->Login());
  }



  private void Withdraw() {
    Pane Wpane = new Pane();
    
    contentArea.getChildren().setAll(Wpane);
    contentArea.getChildren().removeAll();
    Label wamount = new Label("Enter your withdraw amount: ");
    Button wsubmit = new Button("Submit");
    Button wback = new Button("Back");
    Wpane.getChildren().add(wamount);
    Wpane.getChildren().add(getWithdraw);
    Wpane.getChildren().add(wsubmit);  
    Wpane.getChildren().add(wback);
    wamount.setLayoutX(30);
    wamount.setLayoutY(150);
    getWithdraw.setLayoutX(190);
    getWithdraw.setLayoutY(150);
    wsubmit.setLayoutX(370);
    wsubmit.setLayoutY(150);
    wback.setLayoutX(390);
    wback.setLayoutY(300);
    
       
    
    wsubmit.setOnAction(e-> {     
      gett = Integer.parseInt(getWithdraw.getText());
      getD = Integer.parseInt(output.getText());  
      getwithdraw = getD - gett;
      
      if(getD - gett < 0) {
        Label outputW = new Label("Withdraw unsuccessful, your current balance is only $ " +getD);      
        Wpane.getChildren().add(outputW);
        outputW.setLayoutX(70);
        outputW.setLayoutY(200);
        System.out.println("Withdraw unsuccessful, your current balance is only $ "+getD);
      }  
      else {
        Label outputS = new Label("Withdraw successful, Current Balance is $" +getwithdraw);
        Wpane.getChildren().add(outputS);
        outputS.setLayoutX(70);
        outputS.setLayoutY(200);
        System.out.println("Withdraw successful, Current Balance is $ "+getwithdraw);
      }   
     
      });

      wback.setOnAction(e->Login());
  }

  private void CheckBalance() {
    Account account = new Account();
    Pane Cpane = new Pane();
    Button Cback = new Button("Back");
    contentArea.getChildren().setAll(Cpane);
    contentArea.getChildren().removeAll();
    Cpane.getChildren().add(Cback);
    Cback.setLayoutX(390);
    Cback.setLayoutY(300);

    Integer getcheck = getwithdraw;  
    account.checkAccount(getcheck);
    if(getD - gett < 0) {
      Label outputA = new Label("Your current balance: $"+getD);  
      Cpane.getChildren().add(outputA);
      outputA.setLayoutX(100);
      outputA.setLayoutY(200);  
      System.out.println("$"+getD); 
    }  
    else {
      Label outputA = new Label("Your current balance: $"+getcheck);
      Cpane.getChildren().add(outputA);
      outputA.setLayoutX(100);
      outputA.setLayoutY(200);
      System.out.println("$"+getcheck); 
    }   
    
   
    Cback.setOnAction(e->Login());
    
    
  }

  private void Contact() {
    Customers customers = new Customers();
    Pane Ccpane = new Pane();
    contentArea.getChildren().setAll(Ccpane);
    contentArea.getChildren().removeAll();
 
    
    Label outputA = new Label("Phone number: 317-222-9999");
    Label outputB = new Label("Email: Kesny@jave.com");
    Label outputC = new Label("Address: 346 Java St, Indinapolis, IN, 46134");
    Ccpane.getChildren().add(outputA);
    Ccpane.getChildren().add(outputB);
    Ccpane.getChildren().add(outputC);
    outputA.setLayoutX(100);
    outputA.setLayoutY(100);
    outputB.setLayoutX(100);
    outputB.setLayoutY(150);
    outputC.setLayoutX(100);
    outputC.setLayoutY(200);
    customers.Contact();
   
    
  }


    public static void main(String[] args) throws Exception{
      launch(args);
    }
  
}