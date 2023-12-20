import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;

public class Senha extends JFrame implements ActionListener {

	JPasswordField Sx;
	JLabel L1;
	String password = "123";

	public Senha() {

		setTitle("Sistema de Controle Acadêmico");
		setResizable(false);
		setSize(300, 200);
		setLocation(525, 250);
		getContentPane().setBackground(new Color(200, 200, 200));
		setLayout(null);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.black, 0));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Sx = new JPasswordField();
		Sx.setEchoChar('*');
		Sx.setLocation(95, 70);
		Sx.setSize(100, 20);
		Sx.addActionListener(this);
		add(Sx);

		L1 = new JLabel("Senha:");
		L1.setLocation(50, 70);
		L1.setSize(110, 20);
		add(L1);

		L1 = new JLabel("Ps.: A senha para entrar é 123");
		L1.setLocation(5, 140);
		L1.setSize(200, 20);
		add(L1);

	}

	public static void main(String[] args) {

		new Senha().setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if (new String(Sx.getPassword()).equals(password)) {

			new Projeto().setVisible(true);
			dispose();

		} else {

			dispose();
			JOptionPane.showMessageDialog(null, "Senha Incorreta!", "Sistema de Controle Acadêmico", 3);
			System.exit(0);

		}

	}

}