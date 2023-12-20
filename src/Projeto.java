import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRootPane;

public class Projeto extends JFrame implements ActionListener {

	JMenuBar bMenu;
	JMenu menu1, menu2, menu3, menu4;
	JMenuItem m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20, m21;
	JLabel L1, L2, L3, L4, L5;
	JButton B3;
	String method = "";
	String table = "";
	String values = "";

	public Projeto() {

		setTitle("Sistema de Controle Acadêmico");
		setResizable(false);
		setSize(500, 500);
		setLocation(450, 100);
		getContentPane().setBackground(new Color(200, 200, 200));
		setLayout(null);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.black, 0));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		bMenu = new JMenuBar();
		bMenu.setBackground(new Color(200, 200, 200));
		bMenu.setForeground(new Color(0, 0, 0));
		bMenu.setBorder(BorderFactory.createLineBorder(new Color(224, 224, 224), 1));

		menu1 = new JMenu("Cadastrar");
		bMenu.add(menu1);

		menu2 = new JMenu("Mostrar");
		bMenu.add(menu2);

		menu3 = new JMenu("Manutenção");
		bMenu.add(menu3);

		menu4 = new JMenu("Sair");
		bMenu.add(menu4);

		m1 = new JMenuItem("Curso");
		m1.addActionListener(this);
		menu1.add(m1);

		m2 = new JMenuItem("Disciplina");
		m2.addActionListener(this);
		menu1.add(m2);

		m3 = new JMenuItem("Aluno");
		m3.addActionListener(this);
		menu1.add(m3);

		m4 = new JMenuItem("Professor");
		m4.addActionListener(this);
		menu1.add(m4);

		m5 = new JMenuItem("Curso");
		m5.addActionListener(this);
		menu2.add(m5);

		m6 = new JMenuItem("Disciplina");
		m6.addActionListener(this);
		menu2.add(m6);

		m7 = new JMenuItem("Aluno");
		m7.addActionListener(this);
		menu2.add(m7);

		m8 = new JMenuItem("Professor");
		m8.addActionListener(this);
		menu2.add(m8);

		menu2.addSeparator();

		m9 = new JMenuItem("Alterar Curso");
		m9.addActionListener(this);
		menu3.add(m9);

		m10 = new JMenuItem("Alterar Disciplina");
		m10.addActionListener(this);
		menu3.add(m10);

		m11 = new JMenuItem("Alterar Aluno");
		m11.addActionListener(this);
		menu3.add(m11);

		m12 = new JMenuItem("Alterar Professor");
		m12.addActionListener(this);
		menu3.add(m12);

		menu3.addSeparator();

		m13 = new JMenuItem("Excluir Curso");
		m13.addActionListener(this);
		menu3.add(m13);

		m14 = new JMenuItem("Excluir Disciplina");
		m14.addActionListener(this);
		menu3.add(m14);

		m15 = new JMenuItem("Excluir Aluno");
		m15.addActionListener(this);
		menu3.add(m15);

		m16 = new JMenuItem("Excluir Professor");
		m16.addActionListener(this);
		menu3.add(m16);

		m17 = new JMenuItem("Cursos/Professores");
		m17.addActionListener(this);
		menu2.add(m17);

		m18 = new JMenuItem("Cursos/Disciplinas");
		m18.addActionListener(this);
		menu2.add(m18);

		m19 = new JMenuItem("Professores/Disciplinas");
		m19.addActionListener(this);
		menu2.add(m19);

		m20 = new JMenuItem("Aluno/Disciplina");
		m20.addActionListener(this);
		menu2.add(m20);

		m21 = new JMenuItem("Sair");
		m21.addActionListener(this);
		menu4.add(m21);

		setJMenuBar(bMenu);

		L1 = new JLabel("Sistema de Controle Acadêmico");
		L1.setLocation(40, 30);
		L1.setSize(500, 30);
		L1.setFont(new Font("Serif", Font.BOLD, 30));
		add(L1);

		B3 = new JButton("Sair");
		B3.setLocation(350, 377);
		B3.setSize(100, 40);
		B3.setBackground(new Color(192, 192, 192));
		B3.setFont(new Font("Serif", Font.BOLD, 15));
		B3.addActionListener(this);
		add(B3);

	}

	public static void main(String[] args) {

		new Senha().setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if ((e.getSource() == m1
				|| e.getSource() == m2
				|| e.getSource() == m3
				|| e.getSource() == m4
				|| e.getSource() == m5
				|| e.getSource() == m6
				|| e.getSource() == m7
				|| e.getSource() == m8
				|| e.getSource() == m9
				|| e.getSource() == m10
				|| e.getSource() == m11
				|| e.getSource() == m12
				|| e.getSource() == m13
				|| e.getSource() == m14
				|| e.getSource() == m15
				|| e.getSource() == m16)) {

			if (e.getSource() == m1
					|| e.getSource() == m2
					|| e.getSource() == m3
					|| e.getSource() == m4) {

				method = "insert";

			} else if (e.getSource() == m5
					|| e.getSource() == m6
					|| e.getSource() == m7
					|| e.getSource() == m8) {

				method = "select";

			} else if (e.getSource() == m9
					|| e.getSource() == m10
					|| e.getSource() == m11
					|| e.getSource() == m12) {

				method = "update";

			} else if (e.getSource() == m13
					|| e.getSource() == m14
					|| e.getSource() == m15
					|| e.getSource() == m16) {

				method = "delete";

			}

			if (e.getSource() == m1
					|| e.getSource() == m5
					|| e.getSource() == m9
					|| e.getSource() == m13) {

				new Curso(method).setVisible(true);

			} else if (e.getSource() == m2
					|| e.getSource() == m6
					|| e.getSource() == m10
					|| e.getSource() == m14) {

				new Disciplina(method).setVisible(true);

			} else if (e.getSource() == m3
					|| e.getSource() == m7
					|| e.getSource() == m11
					|| e.getSource() == m15) {

				new Aluno(method).setVisible(true);

			} else if (e.getSource() == m4
					|| e.getSource() == m8
					|| e.getSource() == m12
					|| e.getSource() == m16) {

				new Professor(method).setVisible(true);

			}

			dispose();

		} else if (e.getSource() == m17
				|| e.getSource() == m18
				|| e.getSource() == m19
				|| e.getSource() == m20) {

			method = "select";
			values = "*";

			if (e.getSource() == m17) {

				table = "curso, professor";

			} else if (e.getSource() == m18) {

				table = "curso, disciplina";

			} else if (e.getSource() == m19) {

				table = "professor, disciplina";

			} else if (e.getSource() == m20) {

				table = "aluno, disciplina";

			}

			new Conexao(method, table, values);

		} else if (e.getSource() == m21 || e.getSource() == B3) {

			System.exit(0);

		}

	}

}