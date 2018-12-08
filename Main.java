import java.awt.*;
import java.awt.event.*;

// creates a subclass of "java.awt.Frame" called "Main"
/*
	java.lang.Object
		java.awt.Component
			java.awt.Container
				java.awt.Window
					java.awt.Frame
*/
public class Main extends Frame {

	// private variables
	private int cookiesValue = 0;
	private Label cookiesTitle;
	private TextField cookiesDisplay;

	// defines a constructor for the class Main
	public Main() {
		//	calls the "setLayout" function of the "Container" superclass with a
		//	freshly-created, generic instance of the "FlowLayout" interface
		setLayout(new FlowLayout());

		cookiesTitle = new Label("Cookies");
		add(cookiesTitle);

		cookiesDisplay = new TextField(10);
		cookiesDisplay.setEditable(false);
		add(cookiesDisplay);

		setSize(1600, 900);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}
}
