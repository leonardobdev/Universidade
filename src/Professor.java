import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class Professor extends JFrame implements ActionListener {

	JButton B1, B2, B3, B4;
	JTextField Tx1, Tx2, Tx3, Tx4, Tx5, Tx6, Tx7, Tx8, Tx9, Tx10;
	JLabel L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13;
	JRadioButton Nac1, Nac2, Nac3, Nac4, Nac5, Nac6, Nac7, Nac8;
	ButtonGroup g1, g2;
	String method = "";

	String IdentProf = "",
			NomeProf = "",
			Rua = "",
			Numero = "",
			Bairro = "",
			Cidade = "",
			Estado = "",
			TelFixo = "",
			Celular = "",
			DataNasc = "",
			EspecProf = "",
			TituloProf = "";

	public Professor(String methodReceived) {

		method = methodReceived;

		setTitle("Sistema de Controle Acadêmico");
		setResizable(false);
		setSize(500, 500);
		setLocation(450, 100);
		getContentPane().setBackground(new Color(200, 200, 200));
		setLayout(null);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		getRootPane().setBorder(BorderFactory.createLineBorder(Color.black, 0));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		addWindowListener(new java.awt.event.WindowAdapter() {

			public void windowClosed(java.awt.event.WindowEvent windowEvent) {

				new Projeto().setVisible(true);

			}

		});

		B1 = new JButton("Incluir");
		B1.setLocation(50, 400);
		B1.setSize(100, 40);
		B1.setBackground(new Color(192, 192, 192));
		B1.setFont(new Font("Serif", Font.BOLD, 15));
		B1.addActionListener(this);
		add(B1);

		B2 = new JButton("Limpar");
		B2.setLocation(200, 400);
		B2.setSize(100, 40);
		B2.setBackground(new Color(192, 192, 192));
		B2.setFont(new Font("Serif", Font.BOLD, 15));
		B2.addActionListener(this);
		add(B2);

		B3 = new JButton("Sair");
		B3.setLocation(350, 400);
		B3.setSize(100, 40);
		B3.setBackground(new Color(192, 192, 192));
		B3.setFont(new Font("Serif", Font.BOLD, 15));
		B3.addActionListener(this);
		add(B3);

		B4 = new JButton("⌕");
		B4.setLocation(153, 400);
		B4.setSize(44, 40);
		B4.setBackground(new Color(192, 192, 192));
		B4.setFont(new Font("Serif", Font.BOLD, 12));
		B4.addActionListener(this);
		add(B4);

		Tx1 = new JTextField("");
		Tx1.setLocation(150, 100);
		Tx1.setSize(70, 20);
		add(Tx1);

		Tx2 = new JTextField("");
		Tx2.setLocation(68, 130);
		Tx2.setSize(152, 20);
		add(Tx2);

		Tx3 = new JTextField("");
		Tx3.setLocation(100, 160);
		Tx3.setSize(120, 20);
		add(Tx3);

		Tx4 = new JTextField("");
		Tx4.setLocation(150, 190);
		Tx4.setSize(70, 20);
		add(Tx4);

		Tx5 = new JTextField("");
		Tx5.setLocation(100, 220);
		Tx5.setSize(120, 20);
		add(Tx5);

		Tx6 = new JTextField("");
		Tx6.setLocation(320, 100);
		Tx6.setSize(150, 20);
		add(Tx6);

		Tx7 = new JTextField("");
		Tx7.setLocation(440, 130);
		Tx7.setSize(30, 20);
		add(Tx7);

		Tx8 = new JTextField("");
		Tx8.setLocation(385, 160);
		Tx8.setSize(85, 20);
		add(Tx8);

		Tx9 = new JTextField("");
		Tx9.setLocation(385, 190);
		Tx9.setSize(85, 20);
		add(Tx9);

		Tx10 = new JTextField("");
		Tx10.setLocation(400, 220);
		Tx10.setSize(70, 20);
		add(Tx10);

		L1 = new JLabel("Cadastramento dos Professores");
		L1.setLocation(30, 30);
		L1.setSize(400, 30);
		L1.setFont(new Font("Serif", Font.BOLD, 30));
		add(L1);

		L2 = new JLabel("Identificação:");
		L2.setLocation(30, 100);
		L2.setSize(110, 20);
		add(L2);

		L3 = new JLabel("Nome:");
		L3.setLocation(30, 130);
		L3.setSize(110, 20);
		add(L3);

		L4 = new JLabel("Rua:");
		L4.setLocation(30, 160);
		L4.setSize(110, 20);
		add(L4);

		L5 = new JLabel("Número:");
		L5.setLocation(30, 190);
		L5.setSize(110, 20);
		add(L5);

		L6 = new JLabel("Bairro:");
		L6.setLocation(30, 220);
		L6.setSize(110, 20);
		add(L6);

		L7 = new JLabel("Cidade:");
		L7.setLocation(250, 100);
		L7.setSize(110, 20);
		add(L7);

		L8 = new JLabel("Estado:");
		L8.setLocation(250, 130);
		L8.setSize(110, 20);
		add(L8);

		L9 = new JLabel("Telefone:");
		L9.setLocation(250, 160);
		L9.setSize(110, 20);
		add(L9);

		L10 = new JLabel("Celular:");
		L10.setLocation(250, 190);
		L10.setSize(110, 20);
		add(L10);

		L11 = new JLabel("Data de Nascimento:");
		L11.setLocation(250, 220);
		L11.setSize(150, 20);
		add(L11);

		L12 = new JLabel("Especialização:");
		L12.setLocation(30, 250);
		L12.setSize(110, 20);
		add(L12);

		L13 = new JLabel("Título:");
		L13.setLocation(250, 250);
		L13.setSize(110, 20);
		add(L13);

		g1 = new ButtonGroup();
		g2 = new ButtonGroup();

		Nac1 = new JRadioButton("Direito");
		Nac1.setLocation(30, 280);
		Nac1.setSize(100, 20);
		Nac1.setBackground(new Color(224, 224, 224));
		Nac1.addActionListener(this);
		g1.add(Nac1);
		add(Nac1);

		Nac2 = new JRadioButton("Informática");
		Nac2.setLocation(30, 300);
		Nac2.setSize(100, 20);
		Nac2.setBackground(new Color(224, 224, 224));
		Nac2.addActionListener(this);
		g1.add(Nac2);
		add(Nac2);

		Nac3 = new JRadioButton("Matemática");
		Nac3.setLocation(30, 320);
		Nac3.setSize(100, 20);
		Nac3.setBackground(new Color(224, 224, 224));
		Nac3.addActionListener(this);
		g1.add(Nac3);
		add(Nac3);

		Nac4 = new JRadioButton("Medicina");
		Nac4.setLocation(30, 340);
		Nac4.setSize(100, 20);
		Nac4.setBackground(new Color(224, 224, 224));
		Nac4.addActionListener(this);
		g1.add(Nac4);
		add(Nac4);

		Nac5 = new JRadioButton("Bacharel");
		Nac5.setLocation(250, 280);
		Nac5.setSize(170, 20);
		Nac5.setBackground(new Color(224, 224, 224));
		Nac5.addActionListener(this);
		g2.add(Nac5);
		add(Nac5);

		Nac6 = new JRadioButton("Especialista Lato Sensu");
		Nac6.setLocation(250, 300);
		Nac6.setSize(170, 20);
		Nac6.setBackground(new Color(224, 224, 224));
		Nac6.addActionListener(this);
		g2.add(Nac6);
		add(Nac6);

		Nac7 = new JRadioButton("Mestrado");
		Nac7.setLocation(250, 320);
		Nac7.setSize(170, 20);
		Nac7.setBackground(new Color(224, 224, 224));
		Nac7.addActionListener(this);
		g2.add(Nac7);
		add(Nac7);

		Nac8 = new JRadioButton("Doutorado");
		Nac8.setLocation(250, 340);
		Nac8.setSize(170, 20);
		Nac8.setBackground(new Color(224, 224, 224));
		Nac8.addActionListener(this);
		g2.add(Nac8);
		add(Nac8);

		if (method.equals("insert")) {

			B1.setText("Incluir");
			L1.setText("Cadastramento dos Professores");
			B4.setVisible(false);

		} else if (method.equals("select")) {

			B1.setText("Pesquisar");
			L1.setText("Mostrar Professores");
			B4.setVisible(false);

		} else if (method.equals("update")) {

			B1.setText("Atualizar");
			L1.setText("Atualização dos Professores");

		} else if (method.equals("delete")) {

			B1.setText("Remover");
			L1.setText("Excluir Professores");
			Tx2.setEnabled(false);
			Tx3.setEnabled(false);
			Tx4.setEnabled(false);
			Tx5.setEnabled(false);
			Tx6.setEnabled(false);
			Tx7.setEnabled(false);
			Tx8.setEnabled(false);
			Tx9.setEnabled(false);
			Tx10.setEnabled(false);
			Nac1.setEnabled(false);
			Nac2.setEnabled(false);
			Nac3.setEnabled(false);
			Nac4.setEnabled(false);
			Nac5.setEnabled(false);
			Nac6.setEnabled(false);
			Nac7.setEnabled(false);
			Nac8.setEnabled(false);
			B4.setVisible(false);

		}

	}

	public static void main(String[] args) {

		new Professor("insert").setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == B1) {

			IdentProf = Tx1.getText();
			NomeProf = Tx2.getText();
			Rua = Tx3.getText();
			Numero = Tx4.getText();
			Bairro = Tx5.getText();
			Cidade = Tx6.getText();
			Estado = Tx7.getText();
			TelFixo = Tx8.getText();
			Celular = Tx9.getText();
			DataNasc = Tx10.getText();

			Tx1.setBackground(new Color(255, 255, 255));
			Tx2.setBackground(new Color(255, 255, 255));
			Tx3.setBackground(new Color(255, 255, 255));
			Tx4.setBackground(new Color(255, 255, 255));
			Tx5.setBackground(new Color(255, 255, 255));
			Tx6.setBackground(new Color(255, 255, 255));
			Tx7.setBackground(new Color(255, 255, 255));
			Tx8.setBackground(new Color(255, 255, 255));
			Tx9.setBackground(new Color(255, 255, 255));
			Tx10.setBackground(new Color(255, 255, 255));
			Nac1.setBackground(new Color(224, 224, 224));
			Nac2.setBackground(new Color(224, 224, 224));
			Nac3.setBackground(new Color(224, 224, 224));
			Nac4.setBackground(new Color(224, 224, 224));
			Nac5.setBackground(new Color(224, 224, 224));
			Nac6.setBackground(new Color(224, 224, 224));
			Nac7.setBackground(new Color(224, 224, 224));
			Nac8.setBackground(new Color(224, 224, 224));

			if (method.equals("insert")) {

				if (IdentProf.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (NomeProf.equals("")) {

					Tx2.setBackground(new Color(255, 192, 192));

				}

				if (Rua.equals("")) {

					Tx3.setBackground(new Color(255, 192, 192));

				}

				if (Numero.equals("")) {

					Tx4.setBackground(new Color(255, 192, 192));

				}

				if (Bairro.equals("")) {

					Tx5.setBackground(new Color(255, 192, 192));

				}

				if (Cidade.equals("")) {

					Tx6.setBackground(new Color(255, 192, 192));

				}

				if (Estado.equals("")) {

					Tx7.setBackground(new Color(255, 192, 192));

				}

				if (TelFixo.equals("")) {

					Tx8.setBackground(new Color(255, 192, 192));

				}

				if (Celular.equals("")) {

					Tx9.setBackground(new Color(255, 192, 192));

				}

				if (DataNasc.equals("")) {

					Tx10.setBackground(new Color(255, 192, 192));

				}

				if (EspecProf.equals("")) {

					Nac1.setBackground(new Color(255, 192, 192));
					Nac2.setBackground(new Color(255, 192, 192));
					Nac3.setBackground(new Color(255, 192, 192));
					Nac4.setBackground(new Color(255, 192, 192));

				}

				if (TituloProf.equals("")) {

					Nac5.setBackground(new Color(255, 192, 192));
					Nac6.setBackground(new Color(255, 192, 192));
					Nac7.setBackground(new Color(255, 192, 192));
					Nac8.setBackground(new Color(255, 192, 192));

				}

				if (!IdentProf.equals("")
						&& !NomeProf.equals("")
						&& !Rua.equals("")
						&& !Numero.equals("")
						&& !Bairro.equals("")
						&& !Cidade.equals("")
						&& !Estado.equals("")
						&& !TelFixo.equals("")
						&& !Celular.equals("")
						&& !DataNasc.equals("")
						&& !EspecProf.equals("")
						&& !TituloProf.equals("")) {

					new Conexao("insert",
							"professor (IdentProf, NomeProf, Rua, Numero, Bairro, Cidade, Estado, TelFixo, Celular, DataNasc, EspecProf, TituloProf)",
							"'" + IdentProf + "', '" + NomeProf + "', '" + Rua + "', '" + Numero + "', '" + Bairro
									+ "', '" + Cidade + "', '" + Estado + "', '" + TelFixo + "', '" + Celular + "', '"
									+ DataNasc + "', '" + EspecProf + "', '" + TituloProf + "'");

				}

			} else if (method.equals("select")) {

				if (IdentProf.equals("")) {

					Tx1.setBackground(new Color(255, 100, 100));

				}

				if (!IdentProf.equals("")) {

					IdentProf = new String(Pedir.Info("professor", "IdentProf", "IdentProf", IdentProf));

					if (IdentProf.equals("")) {

						JOptionPane.showMessageDialog(null, "Nenhum resultado!", "Sistema de Controle Acadêmico", 3);

					} else {

						NomeProf = new String(Pedir.Info("professor", "NomeProf", "IdentProf", IdentProf));
						Rua = new String(Pedir.Info("professor", "Rua", "IdentProf", IdentProf));
						Numero = new String(Pedir.Info("professor", "Numero", "IdentProf", IdentProf));
						Bairro = new String(Pedir.Info("professor", "Bairro", "IdentProf", IdentProf));
						Cidade = new String(Pedir.Info("professor", "Cidade", "IdentProf", IdentProf));
						Estado = new String(Pedir.Info("professor", "Estado", "IdentProf", IdentProf));
						TelFixo = new String(Pedir.Info("professor", "TelFixo", "IdentProf", IdentProf));
						Celular = new String(Pedir.Info("professor", "Celular", "IdentProf", IdentProf));
						DataNasc = new String(Pedir.Info("professor", "DataNasc", "IdentProf", IdentProf));
						EspecProf = new String(Pedir.Info("professor", "EspecProf", "IdentProf", IdentProf));
						TituloProf = new String(Pedir.Info("professor", "TituloProf", "IdentProf", IdentProf));

						Tx2.setText(NomeProf);
						Tx3.setText(Rua);
						Tx4.setText(Numero);
						Tx5.setText(Bairro);
						Tx6.setText(Cidade);
						Tx7.setText(Estado);
						Tx8.setText(TelFixo);
						Tx9.setText(Celular);
						Tx10.setText(DataNasc);

						if (EspecProf.equals(Nac1.getActionCommand())) {

							Nac1.setSelected(true);

						}

						if (EspecProf.equals(Nac2.getActionCommand())) {

							Nac2.setSelected(true);

						}

						if (EspecProf.equals(Nac3.getActionCommand())) {

							Nac3.setSelected(true);

						}

						if (EspecProf.equals(Nac4.getActionCommand())) {

							Nac4.setSelected(true);

						}

						if (TituloProf.equals(Nac5.getActionCommand())) {

							Nac5.setSelected(true);

						}

						if (TituloProf.equals(Nac6.getActionCommand())) {

							Nac6.setSelected(true);

						}

						if (TituloProf.equals(Nac7.getActionCommand())) {

							Nac7.setSelected(true);

						}

						if (TituloProf.equals(Nac8.getActionCommand())) {

							Nac8.setSelected(true);

						}

					}

				}

			} else if (method.equals("update")) {

				if (IdentProf.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (NomeProf.equals("")) {

					Tx2.setBackground(new Color(255, 192, 192));

				}

				if (Rua.equals("")) {

					Tx3.setBackground(new Color(255, 192, 192));

				}

				if (Numero.equals("")) {

					Tx4.setBackground(new Color(255, 192, 192));

				}

				if (Bairro.equals("")) {

					Tx5.setBackground(new Color(255, 192, 192));

				}

				if (Cidade.equals("")) {

					Tx6.setBackground(new Color(255, 192, 192));

				}

				if (Estado.equals("")) {

					Tx7.setBackground(new Color(255, 192, 192));

				}

				if (TelFixo.equals("")) {

					Tx8.setBackground(new Color(255, 192, 192));

				}

				if (Celular.equals("")) {

					Tx9.setBackground(new Color(255, 192, 192));

				}

				if (DataNasc.equals("")) {

					Tx10.setBackground(new Color(255, 192, 192));

				}

				if (EspecProf.equals("")) {

					Nac1.setBackground(new Color(255, 192, 192));
					Nac2.setBackground(new Color(255, 192, 192));
					Nac3.setBackground(new Color(255, 192, 192));
					Nac4.setBackground(new Color(255, 192, 192));

				}

				if (TituloProf.equals("")) {

					Nac5.setBackground(new Color(255, 192, 192));
					Nac6.setBackground(new Color(255, 192, 192));
					Nac7.setBackground(new Color(255, 192, 192));
					Nac8.setBackground(new Color(255, 192, 192));

				}

				if (!IdentProf.equals("")
						&& !NomeProf.equals("")
						&& !Rua.equals("")
						&& !Numero.equals("")
						&& !Bairro.equals("")
						&& !Cidade.equals("")
						&& !Estado.equals("")
						&& !TelFixo.equals("")
						&& !Celular.equals("")
						&& !DataNasc.equals("")
						&& !EspecProf.equals("")
						&& !TituloProf.equals("")) {

					new Conexao("update", "professor",
							"IdentProf = '" + IdentProf + "', NomeProf = '" + NomeProf + "', Rua = '" + Rua
									+ "', Numero = '" + Numero + "', Bairro = '" + Bairro + "', Cidade = '" + Cidade
									+ "', Estado = '" + Estado + "', TelFixo = '" + TelFixo + "', Celular = '" + Celular
									+ "', DataNasc = '" + DataNasc + "', EspecProf = '" + EspecProf
									+ "', TituloProf = '" + TituloProf + "'");

				}

			} else if (method.equals("delete")) {

				if (IdentProf.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (!IdentProf.equals("")) {

					new Conexao("delete", "professor", "'" + IdentProf + "'");

				}

			}

		} else if (e.getSource() == B2) {

			Tx1.setText("");
			Tx2.setText("");
			Tx3.setText("");
			Tx4.setText("");
			Tx5.setText("");
			Tx6.setText("");
			Tx7.setText("");
			Tx8.setText("");
			Tx9.setText("");
			Tx10.setText("");
			g1.clearSelection();
			g2.clearSelection();
			EspecProf = "";
			TituloProf = "";

		} else if (e.getSource() == B3) {

			dispose();

		} else if (e.getSource() == B4) {

			IdentProf = Tx1.getText();

			Tx1.setBackground(new Color(255, 255, 255));

			if (IdentProf.equals("")) {

				Tx1.setBackground(new Color(255, 100, 100));

			}

			if (!IdentProf.equals("")) {

				NomeProf = new String(Pedir.Info("professor", "NomeProf", "IdentProf", IdentProf));
				Rua = new String(Pedir.Info("professor", "Rua", "IdentProf", IdentProf));
				Numero = new String(Pedir.Info("professor", "Numero", "IdentProf", IdentProf));
				Bairro = new String(Pedir.Info("professor", "Bairro", "IdentProf", IdentProf));
				Cidade = new String(Pedir.Info("professor", "Cidade", "IdentProf", IdentProf));
				Estado = new String(Pedir.Info("professor", "Estado", "IdentProf", IdentProf));
				TelFixo = new String(Pedir.Info("professor", "TelFixo", "IdentProf", IdentProf));
				Celular = new String(Pedir.Info("professor", "Celular", "IdentProf", IdentProf));
				DataNasc = new String(Pedir.Info("professor", "DataNasc", "IdentProf", IdentProf));
				EspecProf = new String(Pedir.Info("professor", "EspecProf", "IdentProf", IdentProf));
				TituloProf = new String(Pedir.Info("professor", "TituloProf", "IdentProf", IdentProf));

				Tx2.setText(NomeProf);
				Tx3.setText(Rua);
				Tx4.setText(Numero);
				Tx5.setText(Bairro);
				Tx6.setText(Cidade);
				Tx7.setText(Estado);
				Tx8.setText(TelFixo);
				Tx9.setText(Celular);
				Tx10.setText(DataNasc);

				if (EspecProf.equals(Nac1.getActionCommand())) {

					Nac1.setSelected(true);

				}

				if (EspecProf.equals(Nac2.getActionCommand())) {

					Nac2.setSelected(true);

				}

				if (EspecProf.equals(Nac3.getActionCommand())) {

					Nac3.setSelected(true);

				}

				if (EspecProf.equals(Nac4.getActionCommand())) {

					Nac4.setSelected(true);

				}

				if (TituloProf.equals(Nac5.getActionCommand())) {

					Nac5.setSelected(true);

				}

				if (TituloProf.equals(Nac6.getActionCommand())) {

					Nac6.setSelected(true);

				}

				if (TituloProf.equals(Nac7.getActionCommand())) {

					Nac7.setSelected(true);

				}

				if (TituloProf.equals(Nac8.getActionCommand())) {

					Nac8.setSelected(true);

				}

			}

		} else if (e.getSource() == Nac1
				|| e.getSource() == Nac2
				|| e.getSource() == Nac3
				|| e.getSource() == Nac4) {

			EspecProf = e.getActionCommand();

		} else if (e.getSource() == Nac5
				|| e.getSource() == Nac6
				|| e.getSource() == Nac7
				|| e.getSource() == Nac8) {

			TituloProf = e.getActionCommand();

		}

	}

}