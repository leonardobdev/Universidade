import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao {

    String url = "jdbc:mysql://localhost:3306/faculdade";
    String user = "root";
    String pass = "root";
    String sql = "";
    String resp = "";
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rset = null;
    ResultSetMetaData rsmd = null;
    String tableOne = "";
    String tableTwo = "";

    public Conexao(String method, String table, String values) {

        try {

            conn = DriverManager.getConnection(url, user, pass);

            if (conn != null) {

                if (method == "insert") {

                    sql = "insert into " + table + " values (" + values + ");";
                    stmt = conn.prepareStatement(sql);
                    stmt.executeUpdate();

                    resp += "Incluido!";

                    JOptionPane.showMessageDialog(null, resp, "Sistema de Controle Acadêmico", 1);

                } else if (method == "select") {

                    sql = "select " + values + " from " + table + " limit 1;";
                    stmt = conn.prepareStatement(sql);
                    rset = stmt.executeQuery();
                    rsmd = rset.getMetaData();

                    String[] arrOfStr = table.split(", ", 2);
        
                    tableOne = arrOfStr[0];
                    tableTwo = arrOfStr[1];

                    while (rset.next()) {

                        for (int column = 1; column <= rsmd.getColumnCount(); column++) {

                            if (rsmd.getColumnLabel(column).equals("CodCurso")
                                    || rsmd.getColumnLabel(column).equals("CodDisc")
                                    || rsmd.getColumnLabel(column).equals("Matricula")
                                    || rsmd.getColumnLabel(column).equals("IdentProf")) {

                                        if (column == 1) {

                                            resp += tableOne + ": \n";

                                        } else {

                                            resp += "\n" + tableTwo + ": \n";

                                        }

                            }

                            resp += rsmd.getColumnLabel(column) + ": " + rset.getString(column) + "\n ";

                        }

                    }

                    if (resp.equals("")) {

                        resp += "Não houve retorno!";

                    }

                    JOptionPane.showMessageDialog(null, resp, "Sistema de Controle Acadêmico", 1);

                } else if (method == "update") {

                    sql = "update " + table + " set " + values + ";";
                    stmt = conn.prepareStatement(sql);
                    stmt.executeUpdate();

                    resp += "Atualizado!";

                    JOptionPane.showMessageDialog(null, resp, "Sistema de Controle Acadêmico", 1);

                } else if (method == "delete") {

                    sql = "delete from " + table + " where " + values + ";";
                    stmt = conn.prepareStatement(sql);
                    stmt.executeUpdate();

                    resp += "Removido!";

                    JOptionPane.showMessageDialog(null, resp, "Sistema de Controle Acadêmico", 1);

                }

            }

        } catch (SQLException sqle) {

            sqle.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro no Banco de Dados!", "Sistema de Controle Acadêmico", 0);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            if (rset != null) {

                try {

                    rset.close();

                } catch (SQLException e) {
                }

            }

            if (stmt != null) {

                try {

                    stmt.close();

                } catch (SQLException e) {
                }

            }

            if (conn != null) {

                try {

                    conn.close();

                } catch (SQLException e) {
                }

            }

        }

    }

    public static void main(String[] args) {

        String method = "select";
        String table = "curso, disciplina, aluno, professor";
        String values = "*";
        new Conexao(method, table, values);

    }

}