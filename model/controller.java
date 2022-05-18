package model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;


public class controller {

   private Region root;
   private HotelModelManager modelManager;
   private ViewHandler viewHandler;


   @FXML Button arrivals;
   @FXML Button bookings;
   @FXML Button checkIn;
   @FXML Button checkOut;
   @FXML Button exit;

   public Region getRoot()
   {
      return root;
   }

   public void handleActions(ActionEvent e)
   {
      if(e.getSource() == arrivals)
      {
         viewHandler.openView("Arrivals");
      }
      else if(e.getSource() == bookings)
      {
         viewHandler.openView("Bookings");
      }
      else if (e.getSource() == exit)
      {
         Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                 "Do you really want to exit the program?",
                 ButtonType.YES, ButtonType.NO);
         alert.setTitle("Exit");
         alert.setHeaderText(null);

         alert.showAndWait();

         if (alert.getResult() == ButtonType.YES)
         {
            System.exit(0);
         }
      }

}
