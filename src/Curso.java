import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Curso extends JFrame implements ActionListener, ListSelectionListener {

	JButton B1, B2, B3, B4, B5, B6;
	JTextField Tx1, Tx2, Tx3;
	JLabel L1, L2, L3, L4, L5, L6;
	JRadioButton Nac1, Nac2, Nac3;
	ButtonGroup g1;
	DefaultListModel<String> Lista;
	JList<String> Est;
	String method = "";

	String CodCurso = "",
			NomeCurso = "",
			TipoCurso = "",
			CargaHoraria = "",
			CodInstituto = "";

	public Curso(String methodReceived) {

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
		B4.setFont(new Font("Serif", Font.BOLD, 11));
		B4.addActionListener(this);
		add(B4);

		B5 = new JButton("Incluir");
		B5.setLocation(200, 355);
		B5.setSize(100, 40);
		B5.setBackground(new Color(192, 192, 192));
		B5.setFont(new Font("Serif", Font.BOLD, 15));
		B5.addActionListener(this);
		add(B5);

		B6 = new JButton("Excluir");
		B6.setLocation(350, 355);
		B6.setSize(100, 40);
		B6.setBackground(new Color(192, 192, 192));
		B6.setFont(new Font("Serif", Font.BOLD, 15));
		B6.addActionListener(this);
		add(B6);

		Tx1 = new JTextField("");
		Tx1.setLocation(150, 100);
		Tx1.setSize(70, 20);
		add(Tx1);

		Tx2 = new JTextField("");
		Tx2.setLocation(150, 150);
		Tx2.setSize(70, 20);
		add(Tx2);

		Tx3 = new JTextField("");
		Tx3.setLocation(150, 200);
		Tx3.setSize(70, 20);
		add(Tx3);

		L1 = new JLabel("Cadastramento dos Cursos");
		L1.setLocation(30, 30);
		L1.setSize(400, 30);
		L1.setFont(new Font("Serif", Font.BOLD, 30));
		add(L1);

		L2 = new JLabel("Código do Curso:");
		L2.setLocation(30, 100);
		L2.setSize(110, 20);
		add(L2);

		L3 = new JLabel("Carga Horária:");
		L3.setLocation(30, 150);
		L3.setSize(110, 20);
		add(L3);

		L4 = new JLabel("Código do Instituto:");
		L4.setLocation(30, 200);
		L4.setSize(110, 20);
		add(L4);

		L5 = new JLabel("Tipo do Curso:");
		L5.setLocation(30, 250);
		L5.setSize(110, 20);
		add(L5);

		L6 = new JLabel("Nome do Curso:");
		L6.setLocation(300, 100);
		L6.setSize(110, 20);
		add(L6);

		g1 = new ButtonGroup();

		Nac1 = new JRadioButton("Bacharel");
		Nac1.setLocation(30, 280);
		Nac1.setSize(100, 20);
		Nac1.setBackground(new Color(224, 224, 224));
		Nac1.addActionListener(this);
		g1.add(Nac1);
		add(Nac1);

		Nac2 = new JRadioButton("Gestão");
		Nac2.setLocation(30, 310);
		Nac2.setSize(100, 20);
		Nac2.setBackground(new Color(224, 224, 224));
		Nac2.addActionListener(this);
		g1.add(Nac2);
		add(Nac2);

		Nac3 = new JRadioButton("Outros");
		Nac3.setLocation(30, 340);
		Nac3.setSize(100, 20);
		Nac3.setBackground(new Color(224, 224, 224));
		Nac3.addActionListener(this);
		g1.add(Nac3);
		add(Nac3);

		Lista = new DefaultListModel<String>();
		Lista.addElement("Administração de Empresas");
		Lista.addElement("Bio Medicina");
		Lista.addElement("Ciência Biológica");
		Lista.addElement("Ciência da Computação");
		Lista.addElement("Direito");
		Lista.addElement("Educação Física");
		Lista.addElement("Farmacologia");
		Lista.addElement("Rede de Computadores");
		Lista.addElement("Sistemas de Informação");

		Est = new JList<String>(Lista);
		Est.setLocation(300, 130);
		Est.setSize(180, 180);
		Est.setBackground(new Color(224, 224, 224));
		Est.addListSelectionListener(this);
		add(Est);

		if (method.equals("insert")) {

			B1.setText("Incluir");
			L1.setText("Cadastramento dos Cursos");
			B4.setVisible(false);
			B5.setVisible(false);
			B6.setVisible(false);

		} else if (method.equals("select")) {

			B1.setText("Pesquisar");
			L1.setText("Mostrar Cursos");
			B4.setVisible(false);
			B5.setVisible(false);
			B6.setVisible(false);

		} else if (method.equals("update")) {

			B1.setText("Atualizar");
			L1.setText("Atualização dos Cursos");

		} else if (method.equals("delete")) {

			B1.setText("Remover");
			L1.setText("Excluir Cursos");
			Tx2.setEnabled(false);
			Tx3.setEnabled(false);
			Nac1.setEnabled(false);
			Nac2.setEnabled(false);
			Nac3.setEnabled(false);
			Est.setEnabled(false);
			B4.setVisible(false);
			B5.setVisible(false);
			B6.setVisible(false);

		}

	}

	public static void main(String[] args) {

		new Curso("insert").setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == B1) {

			CodCurso = Tx1.getText();
			CargaHoraria = Tx2.getText();
			CodInstituto = Tx3.getText();

			Tx1.setBackground(new Color(255, 255, 255));
			Tx2.setBackground(new Color(255, 255, 255));
			Tx3.setBackground(new Color(255, 255, 255));
			Nac1.setBackground(new Color(224, 224, 224));
			Nac2.setBackground(new Color(224, 224, 224));
			Nac3.setBackground(new Color(224, 224, 224));
			Est.setBackground(new Color(224, 224, 224));

			if (method.equals("insert")) {

				if (CodCurso.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (CargaHoraria.equals("")) {

					Tx2.setBackground(new Color(255, 192, 192));

				}

				if (CodInstituto.equals("")) {

					Tx3.setBackground(new Color(255, 192, 192));

				}

				if (TipoCurso.equals("")) {

					Nac1.setBackground(new Color(255, 192, 192));
					Nac2.setBackground(new Color(255, 192, 192));
					Nac3.setBackground(new Color(255, 192, 192));

				}

				if (NomeCurso.equals("")) {

					Est.setBackground(new Color(255, 192, 192));

				}

				if (!CodCurso.equals("")
						&& !CargaHoraria.equals("")
						&& !CodInstituto.equals("")
						&& !TipoCurso.equals("")
						&& !NomeCurso.equals("")) {

					new Conexao("insert", "curso (CodCurso, CargaHoraria, CodInstituto, TipoCurso, NomeCurso)",
							"'" + CodCurso + "', '" + CargaHoraria + "', '" + CodInstituto + "', '" + TipoCurso + "', '"
									+ NomeCurso + "'");

				}

			} else if (method.equals("select")) {

				if (CodCurso.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (!CodCurso.equals("")) {

					CodCurso = new String(Pedir.Info("curso", "CodCurso", "CodCurso", CodCurso));

					if (CodCurso.equals("")) {

						JOptionPane.showMessageDialog(null, "Nenhum resultado!", "Sistema de Controle Acadêmico", 3);

					} else {

						CargaHoraria = new String(Pedir.Info("curso", "CargaHoraria", "CodCurso", CodCurso));
						CodInstituto = new String(Pedir.Info("curso", "CodInstituto", "CodCurso", CodCurso));
						TipoCurso = new String(Pedir.Info("curso", "TipoCurso", "CodCurso", CodCurso));
						NomeCurso = new String(Pedir.Info("curso", "NomeCurso", "CodCurso", CodCurso));

						Tx2.setText(CargaHoraria);
						Tx3.setText(CodInstituto);

						if (TipoCurso.equals(Nac1.getActionCommand())) {

							Nac1.setSelected(true);

						}

						if (TipoCurso.equals(Nac2.getActionCommand())) {

							Nac2.setSelected(true);

						}

						if (TipoCurso.equals(Nac3.getActionCommand())) {

							Nac3.setSelected(true);

						}

						Est.setSelectedValue(NomeCurso, true);

					}

				}

			} else if (method.equals("update")) {

				if (CodCurso.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (CargaHoraria.equals("")) {

					Tx2.setBackground(new Color(255, 192, 192));

				}

				if (CodInstituto.equals("")) {

					Tx3.setBackground(new Color(255, 192, 192));

				}

				if (TipoCurso.equals("")) {

					Nac1.setBackground(new Color(255, 192, 192));
					Nac2.setBackground(new Color(255, 192, 192));
					Nac3.setBackground(new Color(255, 192, 192));

				}

				if (NomeCurso.equals("")) {

					Est.setBackground(new Color(255, 192, 192));

				}

				if (!CodCurso.equals("")
						&& !CargaHoraria.equals("")
						&& !CodInstituto.equals("")
						&& !TipoCurso.equals("")
						&& !NomeCurso.equals("")) {

					new Conexao("update", "curso",
							"CodCurso = '" + CodCurso + "', CargaHoraria = '" + CargaHoraria + "', CodInstituto = '"
									+ CodInstituto + "', TipoCurso = '" + TipoCurso + "', NomeCurso = '" + NomeCurso
									+ "'");

				}

			} else if (method.equals("delete")) {

				if (CodCurso.equals("")) {

					Tx1.setBackground(new Color(255, 192, 192));

				}

				if (!CodCurso.equals("")) {

					new Conexao("delete", "curso", "'" + CodCurso + "'");

				}

			}

		} else if (e.getSource() == B2) {

			Tx1.setText("");
			Tx2.setText("");
			Tx3.setText("");
			g1.clearSelection();
			Est.clearSelection();
			NomeCurso = "";

		} else if (e.getSource() == B3) {

			dispose();

		} else if (e.getSource() == B4) {

			CodCurso = Tx1.getText();

			Tx1.setBackground(new Color(255, 255, 255));

			if (CodCurso.equals("")) {

				Tx1.setBackground(new Color(255, 192, 192));

			}

			if (!CodCurso.equals("")) {

				CargaHoraria = new String(Pedir.Info("curso", "CargaHoraria", "CodCurso", CodCurso));
				CodInstituto = new String(Pedir.Info("curso", "CodInstituto", "CodCurso", CodCurso));
				TipoCurso = new String(Pedir.Info("curso", "TipoCurso", "CodCurso", CodCurso));
				NomeCurso = new String(Pedir.Info("curso", "NomeCurso", "CodCurso", CodCurso));

				Tx2.setText(CargaHoraria);
				Tx3.setText(CodInstituto);

				if (TipoCurso.equals(Nac1.getActionCommand())) {

					Nac1.setSelected(true);

				}

				if (TipoCurso.equals(Nac2.getActionCommand())) {

					Nac2.setSelected(true);

				}

				if (TipoCurso.equals(Nac3.getActionCommand())) {

					Nac3.setSelected(true);

				}

				Est.setSelectedValue(NomeCurso, true);

			}

		} else if (e.getSource() == B5) {

			Tx1.setBackground(new Color(255, 255, 255));
			Tx2.setBackground(new Color(255, 255, 255));
			Tx3.setBackground(new Color(255, 255, 255));
			Nac1.setBackground(new Color(224, 224, 224));
			Nac2.setBackground(new Color(224, 224, 224));
			Nac3.setBackground(new Color(224, 224, 224));
			Est.setBackground(new Color(224, 224, 224));

			if (CodCurso.equals("")) {

				Tx1.setBackground(new Color(255, 192, 192));

			}

			if (CargaHoraria.equals("")) {

				Tx2.setBackground(new Color(255, 192, 192));

			}

			if (CodInstituto.equals("")) {

				Tx3.setBackground(new Color(255, 192, 192));

			}

			if (TipoCurso.equals("")) {

				Nac1.setBackground(new Color(255, 192, 192));
				Nac2.setBackground(new Color(255, 192, 192));
				Nac3.setBackground(new Color(255, 192, 192));

			}

			if (NomeCurso.equals("")) {

				Est.setBackground(new Color(255, 192, 192));

			}

			if (!CodCurso.equals("")
					&& !CargaHoraria.equals("")
					&& !CodInstituto.equals("")
					&& !TipoCurso.equals("")
					&& !NomeCurso.equals("")) {

				new Conexao("insert", "curso (CodCurso, CargaHoraria, CodInstituto, TipoCurso, NomeCurso)",
						"'" + CodCurso + "', '" + CargaHoraria + "', '" + CodInstituto + "', '" + TipoCurso + "', '"
								+ NomeCurso + "'");

			}

		} else if (e.getSource() == B6) {

			Tx1.setBackground(new Color(255, 255, 255));
			Tx2.setBackground(new Color(255, 255, 255));
			Tx3.setBackground(new Color(255, 255, 255));
			Nac1.setBackground(new Color(224, 224, 224));
			Nac2.setBackground(new Color(224, 224, 224));
			Nac3.setBackground(new Color(224, 224, 224));
			Est.setBackground(new Color(224, 224, 224));

			if (CodCurso.equals("")) {

				Tx1.setBackground(new Color(255, 192, 192));

			}

			if (!CodCurso.equals("")) {

				new Conexao("delete", "curso", "'" + CodCurso + "'");

			}

		} else if (e.getSource() == Nac1
				|| e.getSource() == Nac2
				|| e.getSource() == Nac3) {

			TipoCurso = e.getActionCommand();

		}
	}

	public void valueChanged(ListSelectionEvent e) {

		if (e.getSource() == Est) {

			NomeCurso = Est.getSelectedValue();

		}

	}

}