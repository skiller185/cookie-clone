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
public class Main extends Frame implements ActionListener {

	// private variables
	private int cookiesValue = 0;
	private Button bigCookie;
	private Label cookiesTitle;
	private TextField cookiesDisplay;

	// defines a constructor for the class Main
	public Main() {
		//	calls the "setLayout" function of the "Container" superclass with a
		//	freshly-created, generic instance of the "FlowLayout" interface
		setLayout(new FlowLayout());

		cookiesTitle = new Label("Cookies");
		add(cookiesTitle);

		cookiesDisplay = new TextField(cookiesValue + "", 10);
		cookiesDisplay.setEditable(false);
		add(cookiesDisplay);

		bigCookie = new Button("Get Cookie");
		add(bigCookie);

		bigCookie.addActionListener(this);

		setTitle("Cookie Clone");
		setSize(1600, 900);

		setVisible(true);
	}

	public static void main(String[] args) {
		Main program = new Main();
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		++cookiesValue;
		cookiesDisplay.setText(cookiesValue + "");
	}
}
