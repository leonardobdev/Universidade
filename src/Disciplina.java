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

public class Disciplina extends JFrame implements ActionListener {

	JButton B1, B2, B3, B4;
	JTextField Tx1, Tx2, Tx3;
	JLabel L1, L2, L3, L4, L5;
	JRadioButton Nac1, Nac2, Nac3, Nac4, Nac5, Nac6;
	ButtonGroup g1;
	String method = "";

	String CodDisc = "",
			NomeDisc = "",
			CargaHoraria = "",
			AulasSemana = "";

	public Disciplina(String methodReceived) {

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
		Tx1.setLocation(205, 100);
		Tx1.setSize(70, 20);
		add(Tx1);

		Tx2 = new JTextField("");
		Tx2.setLocation(145, 150);
		Tx2.setSize(130, 20);
		add(Tx2);

		Tx3 = new JTextField("");
		Tx3.setLocation(205, 200);
		Tx3.setSize(70, 20);
		add(Tx3);

		L1 = new JLabel("Cadastramento das Disciplinas");
		L1.setLocation(30, 30);
		L1.setSize(400, 30);
		L1.setFont(new Font("Serif", Font.BOLD, 30));
		add(L1);

		L2 = new JLabel("Código da Disciplina:");
		L2.setLocation(30, 100);
		L2.setSize(120, 20);
		add(L2);

		L3 = new JLabel("Nome da Disciplina:");
		L3.setLocation(30, 150);
		L3.setSize(120, 20);
		add(L3);

		L4 = new JLabel("Carga Horária:");
		L4.setLocation(30, 200);
		L4.setSize(110, 20);
		add(L4);

		L5 = new JLabel("Aulas por Semana:");
		L5.setLocation(300, 100);
		L5.setSize(110, 20);
		add(L5);

		g1 = new ButtonGroup();

		Nac1 = new JRadioButton("1");
		Nac1.setLocation(300, 130);
		Nac1.setSize(100, 20);
		Nac1.setBackground(new Color(224, 224, 224));
		Nac1.addActionListener(this);
		g1.add(Nac1);
		add(Nac1);

		Nac2 = new JRadioButton("2");
		Nac2.setLocation(300, 160);
		Nac2.setSize(100, 20);
		Nac2.setBackground(new Color(224, 224, 224));
		Nac2.addActionListener(this);
		g1.add(Nac2);
		add(Nac2);

		Nac3 = new JRadioButton("3");
		Nac3.setLocation(300, 190);
		Nac3.setSize(100, 20);
		Nac3.setBackground(new Color(224, 224, 224));
		Nac3.addActionListener(this);
		g1.add(Nac3);
		add(Nac3);

		Nac4 = new JRadioButton("4");
		Nac4.setLocation(300, 220);
		Nac4.setSize(100, 20);
		Nac4.setBackground(new Color(224, 224, 224));
		Nac4.addActionListener(this);
		g1.add(Nac4);
		add(Nac4);

		Nac5 = new JRadioButton("5");
		Nac5.setLocation(300, 250);
		Nac5.setSize(100, 20);
		Nac5.setBackground(new Color(224, 224, 224));
		Nac5.addActionListener(this);
		g1.add(Nac5);
		add(Nac5);

		Nac6 = new JRadioButton("6");
		Nac6.setLocation(300, 280);
		Nac6.setSize(100, 20);
		Nac6.setBackground(new Color(224, 224, 224));
		Nac6.addActionListener(this);
		g1.add(Nac6);
		add(Nac6);

		if (method.equals("insert")) {

			B1.setText("Incluir");
			L1.setText("Cadastramento dos Disciplinas");
			B4.setVisible(false);

		} else if (method.equals("select")) {

			B1.setText("Pesquisar");
			L1.setText("Mostrar Disciplinas");
			B4.setVisible(false);

		} else if (method.equals("update")) {

			B1.setText("Atualizar");
			L1.setText("Atualização dos Disciplinas");

		} else if (method.equals("delete")) {

			B1.setText("Remover");
			L1.setText("Excluir Disciplinas");
			Tx2.setEnabled(false);
			Tx3.setEnabled(false);
			Nac1.setEnabled(false);
			Nac2.setEnabled(false);
			Nac3.setEnabled(false);
			Nac4.setEnabled(false);
			Nac5.setEnabled(false);
			Nac6.setEnabled(false);
			B4.setVisible(false);

		}

	}

	public static void main(String[] args) {

		new Disciplina("insert").setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == B1) {

			CodDisc = Tx1.getText();
			NomeDisc = Tx2.getText();
			CargaHoraria = Tx3.getText();

			Tx1.setBackground(new Color(255, 255, 255));
			Tx2.setBackground(new Color(255, 255, 255));
			Tx3.setBackground(new Color(255, 255, 255));
			Nac1.setBackground(new Color(224, 224, 224));
			Nac2.setBackground(new Color(224, 224, 224));
			Nac3.setBackground(new Color(224, 224, 224));
			Nac4.setBackground(new Color(224, 224, 224));
			Nac5.setBackground(new Color(224, 224, 224));
			Nac6.setBackground(new Color(224, 224, 224));

			if (method.equals("insert")) {

				if (CodDisc.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (NomeDisc.equals("")) {

					Tx2.setBackground(new Color(255, 192, 192));

				}

				if (CargaHoraria.equals("")) {

					Tx3.setBackground(new Color(255, 192, 192));

				}

				if (AulasSemana.equals("")) {

					Nac1.setBackground(new Color(255, 192, 192));
					Nac2.setBackground(new Color(255, 192, 192));
					Nac3.setBackground(new Color(255, 192, 192));
					Nac4.setBackground(new Color(255, 192, 192));
					Nac5.setBackground(new Color(255, 192, 192));
					Nac6.setBackground(new Color(255, 192, 192));

				}

				if (!CodDisc.equals("")
						&& !NomeDisc.equals("")
						&& !CargaHoraria.equals("")
						&& !AulasSemana.equals("")) {

					new Conexao("insert", "disciplina (CodDisc, NomeDisc, CargaHoraria, AulasSemana)",
							"'" + CodDisc + "', '" + NomeDisc + "', '" + CargaHoraria + "', '" + AulasSemana + "'");

				}

			} else if (method.equals("select")) {

				if (CodDisc.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (!CodDisc.equals("")) {

					CodDisc = new String(Pedir.Info("disciplina", "CodDisc", "CodDisc", CodDisc));

					if (CodDisc.equals("")) {

						JOptionPane.showMessageDialog(null, "Nenhum resultado!", "Sistema de Controle Acadêmico", 3);

					} else {

						NomeDisc = new String(Pedir.Info("disciplina", "NomeDisc", "CodDisc", CodDisc));
						CargaHoraria = new String(Pedir.Info("disciplina", "CargaHoraria", "CodDisc", CodDisc));
						AulasSemana = new String(Pedir.Info("disciplina", "AulasSemana", "CodDisc", CodDisc));

						Tx2.setText(NomeDisc);
						Tx3.setText(CargaHoraria);

						if (AulasSemana.equals(Nac1.getActionCommand())) {

							Nac1.setSelected(true);

						}

						if (AulasSemana.equals(Nac2.getActionCommand())) {

							Nac2.setSelected(true);

						}

						if (AulasSemana.equals(Nac3.getActionCommand())) {

							Nac3.setSelected(true);

						}

						if (AulasSemana.equals(Nac4.getActionCommand())) {

							Nac4.setSelected(true);

						}

						if (AulasSemana.equals(Nac5.getActionCommand())) {

							Nac5.setSelected(true);

						}

						if (AulasSemana.equals(Nac6.getActionCommand())) {

							Nac6.setSelected(true);

						}

					}

				}

			} else if (method.equals("update")) {

				if (CodDisc.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (NomeDisc.equals("")) {

					Tx2.setBackground(new Color(255, 192, 192));

				}

				if (CargaHoraria.equals("")) {

					Tx3.setBackground(new Color(255, 192, 192));

				}

				if (AulasSemana.equals("")) {

					Nac1.setBackground(new Color(255, 192, 192));
					Nac2.setBackground(new Color(255, 192, 192));
					Nac3.setBackground(new Color(255, 192, 192));
					Nac4.setBackground(new Color(255, 192, 192));
					Nac5.setBackground(new Color(255, 192, 192));
					Nac6.setBackground(new Color(255, 192, 192));

				}

				if (!CodDisc.equals("")
						&& !NomeDisc.equals("")
						&& !CargaHoraria.equals("")
						&& !AulasSemana.equals("")) {

					new Conexao("update", "disciplina", "CodDisc = '" + CodDisc + "', NomeDisc = '" + NomeDisc
							+ "', CargaHoraria = '" + CargaHoraria + "', AulasSemana = '" + AulasSemana + "'");

				}

			} else if (method.equals("delete")) {

				if (CodDisc.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (!CodDisc.equals("")) {

					new Conexao("delete", "disciplina", "'" + CodDisc + "'");

				}

			}

		} else if (e.getSource() == B2) {

			Tx1.setText("");
			Tx2.setText("");
			Tx3.setText("");
			g1.clearSelection();
			AulasSemana = "";

		} else if (e.getSource() == B3) {

			dispose();

		} else if (e.getSource() == B4) {

			CodDisc = Tx1.getText();

			Tx1.setBackground(new Color(255, 255, 255));

			if (CodDisc.equals("")) {

				Tx1.setBackground(new Color(255, 192, 192));

			}

			if (!CodDisc.equals("")) {

				NomeDisc = new String(Pedir.Info("disciplina", "NomeDisc", "CodDisc", CodDisc));
				CargaHoraria = new String(Pedir.Info("disciplina", "CargaHoraria", "CodDisc", CodDisc));
				AulasSemana = new String(Pedir.Info("disciplina", "AulasSemana", "CodDisc", CodDisc));

				Tx2.setText(NomeDisc);
				Tx3.setText(CargaHoraria);

				if (AulasSemana.equals(Nac1.getActionCommand())) {

					Nac1.setSelected(true);

				}

				if (AulasSemana.equals(Nac2.getActionCommand())) {

					Nac2.setSelected(true);

				}

				if (AulasSemana.equals(Nac3.getActionCommand())) {

					Nac3.setSelected(true);

				}

				if (AulasSemana.equals(Nac4.getActionCommand())) {

					Nac4.setSelected(true);

				}

				if (AulasSemana.equals(Nac5.getActionCommand())) {

					Nac5.setSelected(true);

				}

				if (AulasSemana.equals(Nac6.getActionCommand())) {

					Nac6.setSelected(true);

				}

			}

		} else if (e.getSource() == Nac1
				|| e.getSource() == Nac2
				|| e.getSource() == Nac3
				|| e.getSource() == Nac4
				|| e.getSource() == Nac5
				|| e.getSource() == Nac6) {

			AulasSemana = e.getActionCommand();

		}

	}

}