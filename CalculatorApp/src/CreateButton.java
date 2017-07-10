import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CreateButton {
	JButton name;

	public CreateButton(String symbol, ActionListener listener, JPanel pane) {
		name = new JButton(symbol);
		name.setActionCommand(symbol);
		name.addActionListener(listener);
		pane.add(name);
	}
}
