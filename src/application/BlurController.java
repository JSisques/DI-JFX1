package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.Pane;

public class BlurController {
	
	@FXML
	private Pane pane;
	
	@FXML
    public void setblur() {           
             pane.setEffect(new GaussianBlur(5));
//             mypane.setEffect(new GaussianBlur(10));
    }
	
	@FXML
    public void setFocus() {           
             pane.setEffect(new GaussianBlur(0));
//             mypane.setEffect(new GaussianBlur(10));
    }
	
	@FXML
	private void handleClose() {
	
	        System.exit(0);
	}
	
}
