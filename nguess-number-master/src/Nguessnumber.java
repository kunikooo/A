import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Nguessnumber extends JFrame{
	private JTextField txtGuess;  
	private JLabel lblOutput;  
	private JButton btnPlayAgain;
	private int ra;
	
	public void getra() {
		this.ra =(int)(Math.random()*100)+1;
	}
	public void panduan() {
		int nowra =ra;
		String txt = txtGuess.getText();
		int txtint = Integer.parseInt(txt);
		if(nowra>txtint) {
			lblOutput.setText(txtint+"�ٴ��");
		}else if(nowra<txtint) {
			lblOutput.setText(txtint+"��С��");
		}else {lblOutput.setText("�¶��ˣ�����һ�Σ�");
		btnPlayAgain.setVisible(true);
		}
	}
}