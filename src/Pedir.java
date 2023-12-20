import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Pedir {

    public static String Info(String table, String label, String key, String values) {

        String url = "jdbc:mysql://localhost:3306/faculdade";
        String user = "root";
        String pass = "root";
        String sql = "";
        String resp = "";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rset = null;
        ResultSetMetaData rsmd = null;

        try {

            conn = DriverManager.getConnection(url, user, pass);

            if (conn != null) {

                sql = "select " + label + " from " + table + " where " + key + " = " + values + ";";
                stmt = conn.prepareStatement(sql);
                rset = stmt.executeQuery();
                rsmd = rset.getMetaData();

                while (rset.next()) {

                    for (int column = 1; column <= rsmd.getColumnCount(); column++) {

                        resp = rset.getString(column);

                    }

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

        return resp;

    }

    public static String main(String[] args) {

        String table = "curso";
        String label = "CargaHoraria";
        String key = "CodCurso";
        String values = "CodCurso";
        return new String(Info(table, label, key, values));

    }

}