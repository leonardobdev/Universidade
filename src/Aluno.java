import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Aluno extends JFrame implements ActionListener, ListSelectionListener {

	JButton B1, B2, B3, B4;
	JTextField Tx1, Tx2, Tx3, Tx4, Tx5, Tx6, Tx7, Tx8, Tx9;
	JLabel L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11;
	DefaultListModel<String> Lista;
	JList<String> Est = null;
	String method = "";

	String Matricula = "",
			Nome = "",
			DataNasc = "",
			CodCurso = "",
			NomeCurso = "",
			CodDisc = "",
			NomeDisc = "",
			NP1 = "",
			NP2 = "",
			Media = "",
			Faltas = "";

	public Aluno(String methodReceived) {

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
		Tx1.setLocation(180, 100);
		Tx1.setSize(70, 20);
		add(Tx1);

		Tx2 = new JTextField("");
		Tx2.setLocation(98, 130);
		Tx2.setSize(152, 20);
		add(Tx2);

		Tx3 = new JTextField("");
		Tx3.setLocation(180, 160);
		Tx3.setSize(70, 20);
		add(Tx3);

		Tx4 = new JTextField("");
		Tx4.setLocation(180, 190);
		Tx4.setSize(70, 20);
		add(Tx4);

		Tx5 = new JTextField("");
		Tx5.setLocation(120, 220);
		Tx5.setSize(130, 20);
		add(Tx5);

		Tx6 = new JTextField("");
		Tx6.setLocation(180, 250);
		Tx6.setSize(70, 20);
		add(Tx6);

		Tx7 = new JTextField("");
		Tx7.setLocation(180, 280);
		Tx7.setSize(70, 20);
		add(Tx7);

		Tx8 = new JTextField("");
		Tx8.setLocation(180, 310);
		Tx8.setSize(70, 20);
		add(Tx8);

		Tx9 = new JTextField("");
		Tx9.setLocation(180, 340);
		Tx9.setSize(70, 20);
		add(Tx9);

		L1 = new JLabel("Cadastramento dos Alunos");
		L1.setLocation(30, 30);
		L1.setSize(400, 30);
		L1.setFont(new Font("Serif", Font.BOLD, 30));
		add(L1);

		L2 = new JLabel("Matrícula:");
		L2.setLocation(30, 100);
		L2.setSize(110, 20);
		add(L2);

		L3 = new JLabel("Nome:");
		L3.setLocation(30, 130);
		L3.setSize(110, 20);
		add(L3);

		L4 = new JLabel("Data de Nascimento:");
		L4.setLocation(30, 160);
		L4.setSize(120, 20);
		add(L4);

		L5 = new JLabel("Código do Curso:");
		L5.setLocation(30, 190);
		L5.setSize(110, 20);
		add(L5);

		L6 = new JLabel("Nome do Curso:");
		L6.setLocation(30, 220);
		L6.setSize(110, 20);
		add(L6);

		L7 = new JLabel("Nota da NP1:");
		L7.setLocation(30, 250);
		L7.setSize(110, 20);
		add(L7);

		L8 = new JLabel("Nota da NP2:");
		L8.setLocation(30, 280);
		L8.setSize(110, 20);
		add(L8);

		L9 = new JLabel("Média:");
		L9.setLocation(30, 310);
		L9.setSize(110, 20);
		add(L9);

		L10 = new JLabel("Faltas:");
		L10.setLocation(30, 340);
		L10.setSize(110, 20);
		add(L10);

		L11 = new JLabel("Disciplina:");
		L11.setLocation(300, 100);
		L11.setSize(110, 20);
		add(L11);

		Lista = new DefaultListModel<String>();

		for (int i = 1;; i++) {

			String CodDiscTemp = new String(Pedir.Info("disciplina", "CodDisc", "CodDisc", Integer.toString(i)));
			String NomeDiscTemp = new String(Pedir.Info("disciplina", "NomeDisc", "CodDisc", Integer.toString(i)));

			if (CodDiscTemp.equals("") || NomeDiscTemp.equals("")) {

				break;

			}

			Lista.addElement(CodDiscTemp + " - " + NomeDiscTemp);

		}

		Est = new JList<String>(Lista);
		Est.setLocation(300, 130);
		Est.setSize(180, 180);
		Est.setBackground(new Color(224, 224, 224));
		Est.addListSelectionListener(this);
		add(Est);

		if (method.equals("insert")) {

			B1.setText("Incluir");
			L1.setText("Cadastramento dos Alunos");
			B4.setVisible(false);

		} else if (method.equals("select")) {

			B1.setText("Pesquisar");
			L1.setText("Mostrar Alunos");
			B4.setVisible(false);

		} else if (method.equals("update")) {

			B1.setText("Atualizar");
			L1.setText("Atualização dos Alunos");

		} else if (method.equals("delete")) {

			B1.setText("Remover");
			L1.setText("Excluir Alunos");
			Tx2.setEnabled(false);
			Tx3.setEnabled(false);
			Tx4.setEnabled(false);
			Tx5.setEnabled(false);
			Tx6.setEnabled(false);
			Tx7.setEnabled(false);
			Tx8.setEnabled(false);
			Tx9.setEnabled(false);
			Est.setEnabled(false);
			B4.setVisible(false);

		}

	}

	public static void main(String[] args) {

		new Aluno("insert").setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == B1) {

			Matricula = Tx1.getText();
			Nome = Tx2.getText();
			DataNasc = Tx3.getText();
			CodCurso = Tx4.getText();
			NomeCurso = Tx5.getText();
			NP1 = Tx6.getText();
			NP2 = Tx7.getText();
			Media = Tx8.getText();
			Faltas = Tx9.getText();

			Tx1.setBackground(new Color(255, 255, 255));
			Tx2.setBackground(new Color(255, 255, 255));
			Tx3.setBackground(new Color(255, 255, 255));
			Tx4.setBackground(new Color(255, 255, 255));
			Tx5.setBackground(new Color(255, 255, 255));
			Tx6.setBackground(new Color(255, 255, 255));
			Tx7.setBackground(new Color(255, 255, 255));
			Tx8.setBackground(new Color(255, 255, 255));
			Tx9.setBackground(new Color(255, 255, 255));
			Est.setBackground(new Color(224, 224, 224));

			if (method.equals("insert")) {

				if (Matricula.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (Nome.equals("")) {

					Tx2.setBackground(new Color(255, 192, 192));

				}

				if (DataNasc.equals("")) {

					Tx3.setBackground(new Color(255, 192, 192));

				}

				if (CodCurso.equals("")) {

					Tx4.setBackground(new Color(255, 192, 192));

				}

				if (NomeCurso.equals("")) {

					Tx5.setBackground(new Color(255, 192, 192));

				}

				if (NP1.equals("")) {

					Tx6.setBackground(new Color(255, 192, 192));

				}

				if (NP2.equals("")) {

					Tx7.setBackground(new Color(255, 192, 192));

				}

				if (Media.equals("")) {

					Tx8.setBackground(new Color(255, 192, 192));

				}

				if (Faltas.equals("")) {

					Tx9.setBackground(new Color(255, 192, 192));

				}

				if (CodDisc.equals("")) {

					Est.setBackground(new Color(255, 192, 192));

				}

				if (NomeDisc.equals("")) {

					Est.setBackground(new Color(255, 192, 192));

				}

				if (!Matricula.equals("")
						&& !Nome.equals("")
						&& !DataNasc.equals("")
						&& !CodCurso.equals("")
						&& !NomeCurso.equals("")
						&& !CodDisc.equals("")
						&& !NomeDisc.equals("")
						&& !NP1.equals("")
						&& !NP2.equals("")
						&& !Media.equals("")
						&& !Faltas.equals("")) {

					new Conexao("insert",
							"aluno (Matricula, Nome, DataNasc, CodCurso, NomeCurso, CodDisc, NomeDisc, NP1, NP2, Media, Faltas)",
							"'" + Matricula + "', '" + Nome + "', '" + DataNasc + "', '" + CodCurso + "', '" + NomeCurso
									+ "', '" + CodDisc + "', '" + NomeDisc + "', '" + NP1 + "', '" + NP2 + "', '"
									+ Media + "', '" + Faltas + "'");

				}

			} else if (method.equals("select")) {

				if (Matricula.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (!Matricula.equals("")) {

					Matricula = new String(Pedir.Info("aluno", "Matricula", "Matricula", Matricula));

					if (Matricula.equals("")) {

						JOptionPane.showMessageDialog(null, "Nenhum resultado!", "Sistema de Controle Acadêmico", 3);

					} else {

						Nome = new String(Pedir.Info("aluno", "Nome", "Matricula", Matricula));
						DataNasc = new String(Pedir.Info("aluno", "DataNasc", "Matricula", Matricula));
						CodCurso = new String(Pedir.Info("aluno", "CodCurso", "Matricula", Matricula));
						NomeCurso = new String(Pedir.Info("aluno", "NomeCurso", "Matricula", Matricula));
						CodDisc = new String(Pedir.Info("aluno", "CodDisc", "Matricula", Matricula));
						NomeDisc = new String(Pedir.Info("aluno", "NomeDisc", "Matricula", Matricula));
						NP1 = new String(Pedir.Info("aluno", "NP1", "Matricula", Matricula));
						NP2 = new String(Pedir.Info("aluno", "NP2", "Matricula", Matricula));
						Media = new String(Pedir.Info("aluno", "Media", "Matricula", Matricula));
						Faltas = new String(Pedir.Info("aluno", "Faltas", "Matricula", Matricula));

						Tx2.setText(Nome);
						Tx3.setText(DataNasc);
						Tx4.setText(CodCurso);
						Tx5.setText(NomeCurso);
						Tx6.setText(NP1);
						Tx7.setText(NP2);
						Tx8.setText(Media);
						Tx9.setText(Faltas);

						Est.setSelectedValue(CodDisc + " - " + NomeDisc, true);

					}

				}

			} else if (method.equals("update")) {

				if (Matricula.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (Nome.equals("")) {

					Tx2.setBackground(new Color(255, 192, 192));

				}

				if (DataNasc.equals("")) {

					Tx3.setBackground(new Color(255, 192, 192));

				}

				if (CodCurso.equals("")) {

					Tx4.setBackground(new Color(255, 192, 192));

				}

				if (NomeCurso.equals("")) {

					Tx5.setBackground(new Color(255, 192, 192));

				}

				if (NP1.equals("")) {

					Tx6.setBackground(new Color(255, 192, 192));

				}

				if (NP2.equals("")) {

					Tx7.setBackground(new Color(255, 192, 192));

				}

				if (Media.equals("")) {

					Tx8.setBackground(new Color(255, 192, 192));

				}

				if (Faltas.equals("")) {

					Tx9.setBackground(new Color(255, 192, 192));

				}

				if (CodDisc.equals("") || CodDisc.equals("")) {

					Est.setBackground(new Color(255, 192, 192));

				}

				if (!Matricula.equals("")
						&& !Nome.equals("")
						&& !DataNasc.equals("")
						&& !CodCurso.equals("")
						&& !NomeCurso.equals("")
						&& !CodDisc.equals("")
						&& !NomeDisc.equals("")
						&& !NP1.equals("")
						&& !NP2.equals("")
						&& !Media.equals("")
						&& !Faltas.equals("")) {

					new Conexao("update", "aluno",
							"Matricula = '" + Matricula + "', Nome = '" + Nome + "', DataNasc = '" + DataNasc
									+ "', CodCurso = '" + CodCurso + "', NomeCurso = '"
									+ NomeCurso + "', CodDisc = '" + CodDisc + "', NomeDisc = '" + NomeDisc
									+ "', NP1 = '"
									+ NP1 + "', NP2 = '" + NP2 + "', Media = '"
									+ Media + "', Faltas = '" + Faltas + "'");

				}

			} else if (method.equals("delete")) {

				if (Matricula.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (!Matricula.equals("")) {

					new Conexao("delete", "aluno", "'" + Matricula + "'");

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

			CodDisc = "";
			NomeDisc = "";

			DefaultListModel<String> ListaTemp = new DefaultListModel<String>();

			for (int i = 1;; i++) {

				String CodDiscTemp = new String(Pedir.Info("disciplina", "CodDisc", "CodDisc", Integer.toString(i)));
				String NomeDiscTemp = new String(Pedir.Info("disciplina", "NomeDisc", "CodDisc", Integer.toString(i)));

				if (CodDiscTemp.equals("") || NomeDiscTemp.equals("")) {

					break;

				}

				ListaTemp.addElement(CodDiscTemp + " - " + NomeDiscTemp);

			}
			Est.setModel(ListaTemp);

		} else if (e.getSource() == B3) {

			dispose();

		} else if (e.getSource() == B4) {

			Matricula = Tx1.getText();

			Tx1.setBackground(new Color(255, 255, 255));

			if (Matricula.equals("")) {

				Tx1.setBackground(new Color(255, 192, 192));

			}

			if (!Matricula.equals("")) {

				Nome = new String(Pedir.Info("aluno", "Nome", "Matricula", Matricula));
				DataNasc = new String(Pedir.Info("aluno", "DataNasc", "Matricula", Matricula));
				CodCurso = new String(Pedir.Info("aluno", "CodCurso", "Matricula", Matricula));
				NomeCurso = new String(Pedir.Info("aluno", "NomeCurso", "Matricula", Matricula));
				CodDisc = new String(Pedir.Info("aluno", "CodDisc", "Matricula", Matricula));
				NomeDisc = new String(Pedir.Info("aluno", "NomeDisc", "Matricula", Matricula));
				NP1 = new String(Pedir.Info("aluno", "NP1", "Matricula", Matricula));
				NP2 = new String(Pedir.Info("aluno", "NP2", "Matricula", Matricula));
				Media = new String(Pedir.Info("aluno", "Media", "Matricula", Matricula));
				Faltas = new String(Pedir.Info("aluno", "Faltas", "Matricula", Matricula));

				Tx2.setText(Nome);
				Tx3.setText(DataNasc);
				Tx4.setText(CodCurso);
				Tx5.setText(NomeCurso);
				Tx6.setText(NP1);
				Tx7.setText(NP2);
				Tx8.setText(Media);
				Tx9.setText(Faltas);

				Est.setSelectedValue(CodDisc + " - " + NomeDisc, true);

			}

		}

	}

	public void valueChanged(ListSelectionEvent e) {

		if (e.getSource() == Est) {

			String str = Est.getSelectedValue();
			String[] arrOfStr = str.split(" - ", 2);

			CodDisc = arrOfStr[0];
			NomeDisc = arrOfStr[1];

		}

	}

}