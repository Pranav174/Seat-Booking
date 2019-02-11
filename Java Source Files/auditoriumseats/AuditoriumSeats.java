package auditoriumseats;
import java.sql.*;
public class AuditoriumSeats {
    static Connection con;
    static AdminMode gui;
    static CustomerMode consumergui;
    public static void main(String[] args)throws SQLException, ClassNotFoundException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        dbconnect();
        maintainUI();
        consumergui = new CustomerMode();consumergui.setVisible(true);
        //gui = new AdminMode();gui.setVisible(true);
    }
    static void dbconnect() throws SQLException{
        String host,uname,upass;
        host="jdbc:derby:GMISDatabase";
        uname="Pranav";
        upass="adminaccess";
        con=DriverManager.getConnection(host,uname,upass);
    }

    private static void maintainUI() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}

