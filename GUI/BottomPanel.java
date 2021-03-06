package GUI;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author zy
 * @function build the bottom part of GUI (the status Label)
 */
public class BottomPanel extends JPanel{
	private static final long serialVersionUID = 3L;
	private JLabel status=new JLabel();

	public BottomPanel(){
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(status);
	}
	
	public void setStatus(String s){
		status.setText(s);
	}
}
