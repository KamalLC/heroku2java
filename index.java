import javax.swing.JFrame;
import javax.swing.JLabel;

public class index{
	JFrame frame;
	JLabel label;
	public index(){
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(1000, 600);

		label = new JLabel("Hello World!");
		label.setBounds(0, 0, 1000, 600);
		frame.add(label);

	}

	public static void main(String[] args){
		new index();
	}
}