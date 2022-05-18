package model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import java.io.IOException;


public class ViewHandler {
    private Scene scene;
    private Stage window;
    private controller mainController;
    private ArrivalController arrivalController;
    private CheckInController checkInController;
    private CheckOutController checkOutController;
    private BookingController bookingController;
    private HotelModelManager modelManager;

    public ViewHandler(HotelModelManager modelManager) throws IOException
    {
        this.modelManager = modelManager;
        scene = new Scene(new Region());
    }

    public void start(Stage window)
    {
        this.window=window;
        openView("Overlook2");
    }

    public void openView(String id) {
        Region root = null;
        switch (id)
        {
            case "Overlook2":
                root = loadMainPage();
                break;
            case "Arrivals":
                root = loadArrivals();
                break;
            case "Bookings":
                root = loadBookings();
            case "CheckIn":
                root = loadCheckIn();
                break;
            case "CheckOut":
                root = loadCheckOut();
                break;
        }
    }
    private Region loadMainPage()
    {
        if(controller == null)
        {
            try
            {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Arrivals.fxml"));
                Region root = loader.load();
                controller = loader.getController();
                controller.init(this, modelManager, root);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            controller.reset();
        }

        return controller.getRoot();
    }


    private Region loadArrivals()
    {
        if(ArrivalController == null)
        {
            try
            {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Arrivals.fxml"));
                Region root = loader.load();
               ArrivalController = loader.getController();
               ArrivalController.init(this, modelManager, root);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            ArrivalController.reset();
        }

        return ArrivalController.getRoot();
    }

    private Region loadBookings()
    {
        if(BookingController == null)
        {
            try
            {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Bookings.fxml"));
                Region root = loader.load();
                BookingController = loader.getController();
                BookingController.init(this, modelManager, root);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            BookingController.reset();
        }

        return BookingController.getRoot();
    }
    private Region loadCheckIn()
    {
        if(CheckInController == null)
        {
            try
            {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("CheckIn.fxml"));
                Region root = loader.load();
                CheckInController = loader.getController();
               CheckInController.init(this, modelManager, root);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            CheckInController.reset();
        }

        return CheckInController.getRoot();
    }
    private Region loadCheckOut()
    {
        if(CheckOutController == null)
        {
            try
            {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("CheckOut.fxml"));
                Region root = loader.load();
                CheckOutController = loader.getController();
                CheckOutController.init(this, modelManager, root);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            CheckOutController.reset();
        }

        return CheckOutController.getRoot();
    }

    }
}
