import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CreateButton {
	JButton name;

	public CreateButton(String symbol, ActionListener listener, JPanel pane) {
		name = new JButton(symbol);
		name.addActionListener(listener);
		name.setActionCommand(symbol);
		pane.add(name);
	}
}
