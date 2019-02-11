
package auditoriumseats;

import DatabaseUI.*;
import static auditoriumseats.AuditoriumSeats.con;
//import static auditoriumseats.AuditoriumSeats.currentPath;
import java.awt.Image;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author pranav goyal
 */
public class AdminMode extends CustomerMode {
    static CustomersDb consumerdatabse;
    static EventsDb eventdatabse;
    static BookingsDb bookingdatabase;
    static Byte step;
    static boolean shown,bookingshown, athome;
    static EventBookingDetails bookingdetails;
    static FileNameExtensionFilter filter;
    static int eventID;
    static String eventName, eventDescription, eventReservedSeats;
    static Date eventDate, BookingStart, BookingEnd;
    static Time eventStartingTime, eventEndingTime;
    static Boolean PYP,MYP,Senior,Teachers,Parents,externalOrg;
    static PreparedStatement newevent,newadmin,deleteevent,deletebookings,updatereserved,updatebookingdetails;
    static boolean ondatabaseaccess;
    static File imagefile;
    public AdminMode() throws SQLException {
        filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
        initComponents();
        seatchoose=new AudiSeatsGrid();
        bookingdetails=new EventBookingDetails();
        Seat.configureForAdmin=true;
        athome=true;
        ondatabaseaccess=false;
    }
    public AdminMode(String adminName) throws SQLException {
        filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
        initComponents();
        jLabel1.setText("Welcome "+adminName);
        seatchoose=new AudiSeatsGrid();
        bookingdetails=new EventBookingDetails();
        Seat.configureForAdmin=true;
        athome=true;
        ondatabaseaccess=false;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Imagechooser = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        adminchangingPanel = new javax.swing.JPanel();
        homePage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jupcomingpanel = new javax.swing.JPanel();
        jlistUpcoming = new javax.swing.JLabel();
        jupcoming = new javax.swing.JLabel();
        Eventinput_1 = new javax.swing.JPanel();
        jEventinputPanel = new javax.swing.JPanel();
        jPrimarydetails = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jEventTitle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jeventDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jhourstart = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jminutestart = new javax.swing.JSpinner();
        jhourend = new javax.swing.JSpinner();
        jminuteend = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jdescription = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jposter = new javax.swing.JPanel();
        jBack1 = new javax.swing.JButton();
        adminPoster = new javax.swing.JLabel();
        jBookingdetails = new javax.swing.JPanel();
        jRestricted = new javax.swing.JPanel();
        jEventinpputtitle = new javax.swing.JLabel();
        jnext = new javax.swing.JButton();
        jBack = new javax.swing.JButton();
        jNext = new javax.swing.JButton();
        jNewAdmin = new javax.swing.JPanel();
        jNewAdminFillin = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jFirstname = new javax.swing.JTextField();
        jLastname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jUsermail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jRepassword = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jModifyrestricted = new javax.swing.JPanel();
        jchangeRestricted = new javax.swing.JPanel();
        jEventlist2 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jlowerpanel = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jmodifybooking = new javax.swing.JPanel();
        jchangebookingdetails = new javax.swing.JPanel();
        jEventlist1 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jlowerpanel1 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jDisplayDatabase = new javax.swing.JPanel();
        databaseholder = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jExit = new javax.swing.JMenuItem();

        Imagechooser.setDialogTitle("Event's Poster");
        Imagechooser.setFileFilter(filter);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRANAV GOYAL - DOSSIER");
        setBounds(screenSize.width / 2 - 1100/ 2,
            screenSize.height / 2 - 700/ 2,1100,700
        );
        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setLocation(screenSize.width / 2 - 1100/ 2,
            screenSize.height / 2 - 700 / 2);
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 700));

        jPanel2.setBackground(new java.awt.Color(0, 69, 69));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMIN MODE");

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Click here to leave");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
        );

        adminchangingPanel.setLayout(new java.awt.CardLayout());

        homePage.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME ");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        jButton1.setText("ADD NEW EVENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jupcomingpanel.setBackground(new java.awt.Color(0, 88, 88));

        jlistUpcoming.setBackground(new java.awt.Color(255, 255, 0));
        jlistUpcoming.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jlistUpcoming.setForeground(new java.awt.Color(255, 255, 255));
        jlistUpcoming.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlistUpcoming.setText(upcomingevent());

        jupcoming.setBackground(new java.awt.Color(204, 255, 204));
        jupcoming.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jupcoming.setForeground(new java.awt.Color(255, 255, 255));
        jupcoming.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jupcoming.setText("Upcoming Events:");

        javax.swing.GroupLayout jupcomingpanelLayout = new javax.swing.GroupLayout(jupcomingpanel);
        jupcomingpanel.setLayout(jupcomingpanelLayout);
        jupcomingpanelLayout.setHorizontalGroup(
            jupcomingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jupcomingpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jupcoming, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlistUpcoming, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        jupcomingpanelLayout.setVerticalGroup(
            jupcomingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jupcomingpanelLayout.createSequentialGroup()
                .addGroup(jupcomingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jupcomingpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlistUpcoming, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                    .addComponent(jupcoming, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout homePageLayout = new javax.swing.GroupLayout(homePage);
        homePage.setLayout(homePageLayout);
        homePageLayout.setHorizontalGroup(
            homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jupcomingpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        homePageLayout.setVerticalGroup(
            homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jupcomingpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        adminchangingPanel.add(homePage, "card2");

        Eventinput_1.setBackground(new java.awt.Color(0, 102, 102));

        jEventinputPanel.setBackground(new java.awt.Color(0, 90, 90));
        jEventinputPanel.setLayout(new java.awt.CardLayout());

        jPrimarydetails.setBackground(jEventinputPanel.getBackground());

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Event Title:");

        jEventTitle.setFont(jdescription.getFont());

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Date:");
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 21));

        jeventDate.setDate(today);
        jeventDate.setFont(jdescription.getFont());
        jeventDate.setMinSelectableDate(today);

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Timings(24 h):");
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 21));

        jhourstart.setFont(jdescription.getFont());
        jhourstart.setModel(new javax.swing.SpinnerNumberModel(12, 0, 24, 1));

        jLabel7.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("(24-H clock format)");
        jLabel7.setPreferredSize(new java.awt.Dimension(120, 21));

        jLabel8.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("to");
        jLabel8.setPreferredSize(new java.awt.Dimension(120, 21));

        jminutestart.setFont(jdescription.getFont());
        jminutestart.setModel(new javax.swing.SpinnerNumberModel(15, 0, 60, 1));

        jhourend.setFont(jdescription.getFont());
        jhourend.setModel(new javax.swing.SpinnerNumberModel(14, 0, 24, 1));

        jminuteend.setFont(jdescription.getFont());
        jminuteend.setModel(new javax.swing.SpinnerNumberModel(10, 0, 60, 1));

        jLabel9.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText(":");
        jLabel9.setPreferredSize(new java.awt.Dimension(120, 21));

        jLabel10.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText(":");
        jLabel10.setPreferredSize(new java.awt.Dimension(120, 21));

        jLabel11.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Description");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jdescription.setColumns(20);
        jdescription.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jdescription.setRows(5);
        jScrollPane1.setViewportView(jdescription);

        jLabel12.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("from");
        jLabel12.setPreferredSize(new java.awt.Dimension(120, 21));

        javax.swing.GroupLayout jPrimarydetailsLayout = new javax.swing.GroupLayout(jPrimarydetails);
        jPrimarydetails.setLayout(jPrimarydetailsLayout);
        jPrimarydetailsLayout.setHorizontalGroup(
            jPrimarydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPrimarydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jEventTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jeventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jhourstart, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jminutestart, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jhourend, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jminuteend, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPrimarydetailsLayout.setVerticalGroup(
            jPrimarydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPrimarydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jEventTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPrimarydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jeventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPrimarydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jhourstart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jminutestart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jhourend, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPrimarydetailsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPrimarydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jminuteend, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addGroup(jPrimarydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jEventinputPanel.add(jPrimarydetails, "card2");

        jposter.setBackground(Eventinput_1.getBackground());

        jBack1.setBackground(new java.awt.Color(0, 102, 102));
        jBack1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBack1.setForeground(new java.awt.Color(255, 255, 255));
        jBack1.setText("UPLOAD NEW POSTER");
        jBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jposterLayout = new javax.swing.GroupLayout(jposter);
        jposter.setLayout(jposterLayout);
        jposterLayout.setHorizontalGroup(
            jposterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jposterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jposterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminPoster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBack1, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE))
                .addContainerGap())
        );
        jposterLayout.setVerticalGroup(
            jposterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jposterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminPoster, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jEventinputPanel.add(jposter, "card5");

        jBookingdetails.setBackground(new java.awt.Color(0, 90, 90));
        jBookingdetails.setLayout(new java.awt.GridLayout(1, 0));
        jEventinputPanel.add(jBookingdetails, "card3");

        jRestricted.setBackground(jEventinputPanel.getBackground());
        jRestricted.setPreferredSize(new java.awt.Dimension(0, 374));
        jRestricted.setLayout(new java.awt.GridBagLayout());
        jEventinputPanel.add(jRestricted, "card4");

        jEventinpputtitle.setFont(new java.awt.Font("Tekton Pro Cond", 1, 24)); // NOI18N
        jEventinpputtitle.setForeground(new java.awt.Color(204, 255, 255));
        jEventinpputtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEventinpputtitle.setText("Fill in the Event's Primary details");

        jnext.setBackground(new java.awt.Color(0, 102, 102));
        jnext.setForeground(new java.awt.Color(255, 255, 255));
        jnext.setText("Next");
        jnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnextActionPerformed(evt);
            }
        });

        jBack.setBackground(new java.awt.Color(0, 102, 102));
        jBack.setForeground(new java.awt.Color(255, 255, 255));
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });

        jNext.setBackground(new java.awt.Color(0, 102, 102));
        jNext.setForeground(new java.awt.Color(255, 255, 255));
        jNext.setText("Cancel");
        jNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Eventinput_1Layout = new javax.swing.GroupLayout(Eventinput_1);
        Eventinput_1.setLayout(Eventinput_1Layout);
        Eventinput_1Layout.setHorizontalGroup(
            Eventinput_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Eventinput_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Eventinput_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jEventinpputtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEventinputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Eventinput_1Layout.createSequentialGroup()
                        .addComponent(jNext, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBack, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jnext, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Eventinput_1Layout.setVerticalGroup(
            Eventinput_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Eventinput_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEventinpputtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEventinputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(Eventinput_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNext, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnext, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        adminchangingPanel.add(Eventinput_1, "card3");

        jNewAdmin.setBackground(homePage.getBackground());

        jNewAdminFillin.setBackground(new java.awt.Color(0, 92, 92));

        jLabel14.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("First Name");

        jFirstname.setFont(jdescription.getFont());

        jLastname.setFont(jdescription.getFont());

        jLabel15.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Last Name");

        jUsermail.setFont(jdescription.getFont());
        jUsermail.setText("sample@email.com");
        jUsermail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUsermailMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("User Mail:");

        jLabel17.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Password:");

        jPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordMouseClicked(evt);
            }
        });
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Re-Password:");

        jRepassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRepasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jNewAdminFillinLayout = new javax.swing.GroupLayout(jNewAdminFillin);
        jNewAdminFillin.setLayout(jNewAdminFillinLayout);
        jNewAdminFillinLayout.setHorizontalGroup(
            jNewAdminFillinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNewAdminFillinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jNewAdminFillinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jNewAdminFillinLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jUsermail, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE))
                    .addGroup(jNewAdminFillinLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jNewAdminFillinLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRepassword))
                    .addGroup(jNewAdminFillinLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPassword)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jNewAdminFillinLayout.setVerticalGroup(
            jNewAdminFillinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jNewAdminFillinLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jNewAdminFillinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jNewAdminFillinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsermail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jNewAdminFillinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jNewAdminFillinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRepassword, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setText("Cancel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setText("Save");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 102, 102));
        jButton8.setText("Reset");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jNewAdminLayout = new javax.swing.GroupLayout(jNewAdmin);
        jNewAdmin.setLayout(jNewAdminLayout);
        jNewAdminLayout.setHorizontalGroup(
            jNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNewAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNewAdminFillin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jNewAdminLayout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jNewAdminLayout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jNewAdminLayout.setVerticalGroup(
            jNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNewAdminLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jNewAdminFillin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jNewAdminLayout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jNewAdminLayout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );

        adminchangingPanel.add(jNewAdmin, "card4");

        jModifyrestricted.setBackground(homePage.getBackground());

        jchangeRestricted.setBackground(new java.awt.Color(0, 96, 96));
        jchangeRestricted.setLayout(new java.awt.GridBagLayout());

        jEventlist2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jEventlist2ItemStateChanged(evt);
            }
        });
        jEventlist2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neweventselected(evt);
            }
        });
        jEventlist2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jEventlist2PropertyChange(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("First select the event here:");

        jlowerpanel.setBackground(jModifyrestricted.getBackground());

        jButton9.setBackground(new java.awt.Color(0, 102, 102));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Cancel");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 102, 102));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Save");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jlowerpanelLayout = new javax.swing.GroupLayout(jlowerpanel);
        jlowerpanel.setLayout(jlowerpanelLayout);
        jlowerpanelLayout.setHorizontalGroup(
            jlowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlowerpanelLayout.createSequentialGroup()
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jlowerpanelLayout.setVerticalGroup(
            jlowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlowerpanelLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jlowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jModifyrestrictedLayout = new javax.swing.GroupLayout(jModifyrestricted);
        jModifyrestricted.setLayout(jModifyrestrictedLayout);
        jModifyrestrictedLayout.setHorizontalGroup(
            jModifyrestrictedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jModifyrestrictedLayout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(49, 49, 49)
                .addComponent(jEventlist2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
            .addGroup(jModifyrestrictedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jModifyrestrictedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jchangeRestricted, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlowerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jModifyrestrictedLayout.setVerticalGroup(
            jModifyrestrictedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jModifyrestrictedLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jModifyrestrictedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEventlist2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jchangeRestricted, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlowerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        adminchangingPanel.add(jModifyrestricted, "card5");

        jmodifybooking.setBackground(homePage.getBackground());

        jchangebookingdetails.setBackground(new java.awt.Color(0, 90, 90));
        jchangebookingdetails.setPreferredSize(new java.awt.Dimension(967, 426));
        jchangebookingdetails.setLayout(new java.awt.GridLayout(1, 0));

        jEventlist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEventlist1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("First select the event here:");

        jlowerpanel1.setBackground(jModifyrestricted.getBackground());

        jButton11.setBackground(new java.awt.Color(0, 102, 102));
        jButton11.setText("Cancel");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 102, 102));
        jButton12.setText("Save");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jlowerpanel1Layout = new javax.swing.GroupLayout(jlowerpanel1);
        jlowerpanel1.setLayout(jlowerpanel1Layout);
        jlowerpanel1Layout.setHorizontalGroup(
            jlowerpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlowerpanel1Layout.createSequentialGroup()
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jlowerpanel1Layout.setVerticalGroup(
            jlowerpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlowerpanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jlowerpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jmodifybookingLayout = new javax.swing.GroupLayout(jmodifybooking);
        jmodifybooking.setLayout(jmodifybookingLayout);
        jmodifybookingLayout.setHorizontalGroup(
            jmodifybookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jmodifybookingLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel20)
                .addGap(49, 49, 49)
                .addComponent(jEventlist1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(jmodifybookingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jmodifybookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jchangebookingdetails, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
                    .addComponent(jlowerpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jmodifybookingLayout.setVerticalGroup(
            jmodifybookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jmodifybookingLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jmodifybookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEventlist1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jchangebookingdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlowerpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        adminchangingPanel.add(jmodifybooking, "card6");

        jDisplayDatabase.setBackground(homePage.getBackground());

        databaseholder.setBackground(new java.awt.Color(0, 96, 96));
        databaseholder.setLayout(new java.awt.GridLayout(1, 0));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setText("BACK TO HOMEPAGE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDisplayDatabaseLayout = new javax.swing.GroupLayout(jDisplayDatabase);
        jDisplayDatabase.setLayout(jDisplayDatabaseLayout);
        jDisplayDatabaseLayout.setHorizontalGroup(
            jDisplayDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDisplayDatabaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDisplayDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
                    .addComponent(databaseholder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDisplayDatabaseLayout.setVerticalGroup(
            jDisplayDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDisplayDatabaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(databaseholder, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        adminchangingPanel.add(jDisplayDatabase, "card7");

        jMenuBar1.setPreferredSize(new java.awt.Dimension(66, 32));
        jMenuBar1.setRequestFocusEnabled(false);

        jMenu2.setText("New");

        jMenuItem1.setText("Event");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem5.setText("Admin Account");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Modify");

        jMenuItem6.setText("Restricted Seats");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Booking Details");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("Database");

        jMenuItem3.setText("Customers");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Events");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem8.setText("Bookings");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Delete");

        jMenuItem9.setText("Booking Records of passed events");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem11.setText("All the Datails of Passed Events");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Exit");

        jMenuItem2.setText("Exit Admin Mode");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jExit.setText("Exit Application");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jMenu1.add(jExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminchangingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(adminchangingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1100, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        try {
            System.exit(0);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            newevent();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        returntocunsumer();   
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnextActionPerformed
        try {
                
            switch (step){
            case 1:
                if (jEventTitle.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "PLease enter the new event's name", "error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    eventStartingTime = new Time((int) jhourstart.getValue(),(int) jminutestart.getValue(),00);
                    eventEndingTime = new Time((int) jhourend.getValue(),(int) jminuteend.getValue(),00);
                    if (eventEndingTime.before(eventStartingTime)){
                        JOptionPane.showMessageDialog(null, "The ending time can't be before the event starts", "error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        String query = "SELECT EVENTID FROM APP.EVENTS";
                        stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                        rs=stmt.executeQuery(query);
                        rs.last();
                        try{
                            EventId = rs.getInt("EVENTID")+1;
                        }
                        catch(SQLException c){
                            EventId = 1;
                        }
                        rs.close();
                        stmt.close();
                        newevent.setInt(1, EventId);
                        newevent.setString(2, jEventTitle.getText());
                        java.sql.Date sqlDate = new java.sql.Date(jeventDate.getDate().getTime());
                        newevent.setDate(3, sqlDate);
                        eventStartingTime = new Time((int) jhourstart.getValue(),(int) jminutestart.getValue(),00);
                        newevent.setTime(4, eventStartingTime);
                        eventEndingTime = new Time((int) jhourend.getValue(),(int) jminuteend.getValue(),00);
                        newevent.setTime(5, eventEndingTime);
                        newevent.setString(6, jdescription.getText());
                        String currentPath=System.getProperty("user.dir");
                        imagefile=new File(currentPath+"\\lib\\Default_poster.jpg");
                        ImageIcon image = new ImageIcon(getClass().getResource("/Images/Default_poster.jpg"));
                        Image img = image.getImage();
                        img = img.getScaledInstance(adminPoster.getWidth(), adminPoster.getHeight(), Image.SCALE_SMOOTH);
                        image = new ImageIcon(img);
                        adminPoster.setIcon(image);
                        jEventinpputtitle.setText("Select the Poster for the new Event");
                        changeform(jEventinputPanel,jposter);
                        jBack.setVisible(true);
                        step=2;
                    }
                }
                break;
            case 2:
                InputStream is = new FileInputStream(imagefile);
                newevent.setBlob(16, is);
                //setting up paramenters
                changeform(jEventinputPanel,jBookingdetails);
                bookingdetails.jDateending.setDate(jeventDate.getDate());
                bookingdetails.jDatebeginning.setDate(today);
                bookingdetails.jDatebeginning.setMaxSelectableDate(jeventDate.getDate());
                bookingdetails.jDateending.setMaxSelectableDate(jeventDate.getDate());
                jEventinpputtitle.setText("Fill in the Event's Booking details");
                step=3;
                break;
            case 3:
                java.sql.Date sqlBookingStartDate = new java.sql.Date(bookingdetails.jDatebeginning.getDate().getTime());
                java.sql.Date sqlBookingEndDate = new java.sql.Date(bookingdetails.jDateending.getDate().getTime());
                if (sqlBookingStartDate.after(sqlBookingEndDate)){
                    JOptionPane.showMessageDialog(null, "Bookings can't close before they begin!!!", "error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    if(bookingdetails.jPYP.isSelected()||bookingdetails.jMYP.isSelected()||bookingdetails.jSenior.isSelected()||bookingdetails.jTeachers.isSelected()||bookingdetails.jParents.isSelected()||bookingdetails.jExternalOrg.isSelected()){
                        newevent.setDate(8, sqlBookingStartDate);
                        newevent.setDate(9, sqlBookingEndDate);
                        newevent.setBoolean(10, bookingdetails.jPYP.isSelected());
                        newevent.setBoolean(11, bookingdetails.jMYP.isSelected());
                        newevent.setBoolean(12, bookingdetails.jSenior.isSelected());
                        newevent.setBoolean(13, bookingdetails.jTeachers.isSelected());
                        newevent.setBoolean(14, bookingdetails.jParents.isSelected());
                        newevent.setBoolean(15, bookingdetails.jExternalOrg.isSelected());
                        //setting up paramenters
                        addseatchoose(jRestricted,EventId);
                        changeform(jEventinputPanel,jRestricted);
                        jEventinpputtitle.setText("Select the restricted seats (only for special guest)");
                        step=4;
                        jnext.setText("Finish");
                    }else{
                        JOptionPane.showMessageDialog(null, "Select at least one category of audience!!!", "error", JOptionPane.ERROR_MESSAGE);        
                    }    
                }
                break;
            case 4:
                newevent.setString(7, seatchoose.getselectedstring());
                newevent.executeUpdate();
                newevent.close();
                JOptionPane.showMessageDialog(null, "New event successfully added", "Success",JOptionPane.INFORMATION_MESSAGE);
                returntoadminhome();
                break;
            }
        }
        catch (SQLException | FileNotFoundException ex) {
                Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jnextActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        switch (step){
            case 4:
                //jRestricted.removeAll();
                changeform(jEventinputPanel,jBookingdetails);
                jEventinpputtitle.setText("Fill in the Event's Booking details");
                step=3;
                jnext.setText("Next");
                break;
            case 3:
                //jRestricted.removeAll();
                changeform(jEventinputPanel,jposter);
                jEventinpputtitle.setText("Select the Poster for the new Event");
                step=2;
                //jnext.setText("Next");
                break;
            case 2:
                changeform(jEventinputPanel,jPrimarydetails);
                jEventinpputtitle.setText("Fill in the Event's Primary details");
                jBack.setVisible(false);
                step=1;
                break;
        }
        jeventDate.getCalendar().getTime();
    }//GEN-LAST:event_jBackActionPerformed

    private void jNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNextActionPerformed
        if(cancelpressed()){
            try {
                newevent.close();
                resetnewevent();
                returntoadminhome();
            } catch (SQLException ex) {
                Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jNextActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        changeform(adminchangingPanel,jNewAdmin);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordMouseClicked
    }//GEN-LAST:event_jPasswordMouseClicked

    private void jRepasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRepasswordMouseClicked
    }//GEN-LAST:event_jRepasswordMouseClicked

    private void jUsermailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUsermailMouseClicked
        jUsermail.setText("");
    }//GEN-LAST:event_jUsermailMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(cancelpressed()){
            returntoadminhome();
            resetAdmin();
            jUsermail.setText("sample@gmail.com");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            newadmin = con.prepareStatement("INSERT INTO APP.ADMIN_ACCOUNTS(USERNAME,FIRST_NAME,LAST_NAME,PASSWORD) VALUES (?,?,?,?)");
            String Password = new String(jPassword.getPassword());
            String Repassword = new String(jRepassword.getPassword());
            if(Password.equals(Repassword)){
                newadmin.setString(1, jUsermail.getText());
                newadmin.setString(2, jFirstname.getText());
                newadmin.setString(3, jLastname.getText());
                newadmin.setString(4, Password);
                newadmin.executeUpdate();
                JOptionPane.showMessageDialog(null, "New admin account successfully configured", "Success",JOptionPane.INFORMATION_MESSAGE);
                newadmin.close();
                returntoadminhome();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error, Passwords don't match!!!", "error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        resetAdmin();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            newevent();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        returntocunsumer();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if (changingtab()){
            try {
                fillevnetlist(jEventlist2);
                jchangeRestricted.setVisible(false);
                jlowerpanel.setVisible(false);
                changeform(adminchangingPanel,jModifyrestricted);
                shown=false;
                jchangeRestricted.add(seatchoose);
                seatchoose.setBackground(jchangeRestricted.getBackground());
                athome=false;
            } catch (SQLException ex) {
                Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void neweventselected(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neweventselected
        if (jEventlist2.getSelectedIndex()!=0){    
            try {
                String selected = jEventlist2.getItemAt(jEventlist2.getSelectedIndex());
                String query = "SELECT EVENTID FROM APP.EVENTS WHERE EVENT_NAME='"+selected+"'";
                stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                rs=stmt.executeQuery(query);
                rs.first();
                EventId = rs.getInt("EVENTID");
                seatchoose.refresh(EventId);
                rs.close();
                stmt.close();
                jchangeRestricted.setVisible(true);
                jlowerpanel.setVisible(true);
//                if(!shown){
//                    jchangeRestricted.setVisible(true);
//                    jlowerpanel.setVisible(true);
//                    shown=true;
//                }
            }
            catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_neweventselected

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(cancelpressed()){
            returntoadminhome();
            jchangeRestricted.removeAll();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            updatereserved=con.prepareStatement("UPDATE APP.EVENTS SET RESERVED_SEATS = ? WHERE EVENTID = ?");
            updatereserved.setInt(2, EventId);
            updatereserved.setString(1, seatchoose.getselectedstring());
            updatereserved.executeUpdate();
            updatereserved.close();
            JOptionPane.showMessageDialog(null, "The changes were updated successfully", "Success",JOptionPane.INFORMATION_MESSAGE);
            returntoadminhome();
            jchangeRestricted.removeAll();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if (changingtab()){
            try {
                fillevnetlist(jEventlist1);
            } catch (SQLException ex) {
                System.out.println("hey");
                Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
            }
            jchangebookingdetails.setVisible(false);
            jlowerpanel1.setVisible(false);
            bookingdetails.setBackground(jchangebookingdetails.getBackground());
            jchangebookingdetails.add(bookingdetails);
            changeform(adminchangingPanel,jmodifybooking);
            athome=false;
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jEventlist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEventlist1ActionPerformed
        if (jEventlist1.getSelectedIndex()!=0){    
            try {
                String selected = jEventlist1.getItemAt(jEventlist1.getSelectedIndex());
                String query = "SELECT EVENTID FROM APP.EVENTS WHERE EVENT_NAME='"+selected+"'";
                stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                rs=stmt.executeQuery(query);
                rs.first();
                EventId = rs.getInt("EVENTID");
                bookingdetails.refresh(EventId);
                rs.close();
                stmt.close();
                if(!bookingshown){
                    jchangebookingdetails.setVisible(true);
                    jlowerpanel1.setVisible(true);
                    bookingshown=true;
                }
            }
            catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        
    }//GEN-LAST:event_jEventlist1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(cancelpressed()){
            returntoadminhome();
            jchangebookingdetails.removeAll();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            updatebookingdetails=con.prepareStatement("UPDATE APP.EVENTS SET BOOKING_START =?,BOOKING_END=?,PYP=?,MYP=?,SENIOR=?,TEACHERS=?,PARENTS=?,EXTERNALORG=? WHERE EVENTID = ?");
            java.sql.Date sqlBookingStartDate = new java.sql.Date(bookingdetails.jDatebeginning.getDate().getTime());
            updatebookingdetails.setDate(1, sqlBookingStartDate);
            java.sql.Date sqlBookingEndDate = new java.sql.Date(bookingdetails.jDateending.getDate().getTime());
            updatebookingdetails.setDate(2, sqlBookingEndDate);
            updatebookingdetails.setBoolean(3, bookingdetails.jPYP.isSelected());
            updatebookingdetails.setBoolean(4, bookingdetails.jMYP.isSelected());
            updatebookingdetails.setBoolean(5, bookingdetails.jSenior.isSelected());
            updatebookingdetails.setBoolean(6, bookingdetails.jTeachers.isSelected());
            updatebookingdetails.setBoolean(7, bookingdetails.jParents.isSelected());
            updatebookingdetails.setBoolean(8, bookingdetails.jExternalOrg.isSelected());
            updatebookingdetails.setInt(9, EventId);
            updatebookingdetails.executeUpdate();
            updatebookingdetails.close();
            JOptionPane.showMessageDialog(null, "The changes were updated successfully", "Success",JOptionPane.INFORMATION_MESSAGE);
            returntoadminhome();
            jchangebookingdetails.removeAll();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         returntoadminhome();
         databaseholder.removeAll();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jEventlist2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jEventlist2PropertyChange
        
    }//GEN-LAST:event_jEventlist2PropertyChange

    private void jEventlist2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jEventlist2ItemStateChanged
        
    }//GEN-LAST:event_jEventlist2ItemStateChanged

    private void jBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBack1ActionPerformed
        int result = Imagechooser.showDialog(null, "Select this poster");
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = Imagechooser.getSelectedFile();
            imagefile=new File(selectedFile.getAbsolutePath());
            ImageIcon image = new ImageIcon(selectedFile.getAbsolutePath());
            Image img = image.getImage();
            img = img.getScaledInstance(adminPoster.getWidth(), adminPoster.getHeight(), Image.SCALE_SMOOTH);
            image = new ImageIcon(img);
            adminPoster.setIcon(image);
          }
        else if(result == JFileChooser.CANCEL_OPTION){
            
        }
    }//GEN-LAST:event_jBack1ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Are you sure you wish to Delete the bookings records of events that have passed away?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE)==0){
        try {
            deletebookings = con.prepareStatement("DELETE FROM APP.CURRENTBOOKINGS WHERE EVENTID=?");
            String query = "SELECT EVENTID,EVENT_DATE FROM APP.EVENTS";
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery(query);
            while(rs.next()){
                EventId = rs.getInt("EVENTID");
                if(rs.getDate("EVENT_DATE").before(today)){
                    deletebookings.setInt(1, EventId);
                    deletebookings.executeUpdate();
                }
            }
            rs.close();
            stmt.close();
            deletebookings.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Are you sure you wish to Delete the bookings records AND details of events that have passed away?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE)==0){
            try {
                deletebookings = con.prepareStatement("DELETE FROM APP.CURRENTBOOKINGS WHERE EVENTID=?");
                deleteevent = con.prepareStatement("DELETE FROM APP.EVENTS WHERE EVENTID=?");
                String query = "SELECT EVENTID,EVENT_DATE FROM APP.EVENTS";
                stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                rs=stmt.executeQuery(query);
                while(rs.next()){
                    EventId = rs.getInt("EVENTID");
                    if(rs.getDate("EVENT_DATE").before(today)){
                        deleteevent.setInt(1, EventId);
                        deleteevent.executeUpdate();
                        deletebookings.setInt(1, EventId);
                        deletebookings.executeUpdate();
                    }
                }
                rs.close();
                stmt.close();
                deleteevent.close();
                deletebookings.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(changingtab()){
            athome=false;
            consumerdatabse = new CustomersDb();
            databaseholder.add(consumerdatabse);
            consumerdatabse.setBackground(databaseholder.getBackground());
            consumerdatabse.setVisible(true);
            changeform(adminchangingPanel,jDisplayDatabase);
            ondatabaseaccess=true;
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(changingtab()){    
            athome=false;
            eventdatabse = new EventsDb();
            databaseholder.add(eventdatabse);
            eventdatabse.setBackground(databaseholder.getBackground());
            eventdatabse.setVisible(true);
            changeform(adminchangingPanel,jDisplayDatabase);
            ondatabaseaccess=true;
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        if(changingtab()){
            athome=false;
            bookingdatabase = new BookingsDb();
            databaseholder.add(bookingdatabase);
            bookingdatabase.setBackground(databaseholder.getBackground());
            bookingdatabase.setVisible(true);
            changeform(adminchangingPanel,jDisplayDatabase);
            ondatabaseaccess=true;
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(adminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(adminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(adminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(adminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new adminWindow().setVisible(true);
//                } catch (SQLException ex) {
//                    Logger.getLogger(adminWindow.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//    }
    void returntocunsumer(){
        this.dispose();
        try {  
            new CustomerMode().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void resetnewevent(){
        
    }
    void resetAdmin(){
        jFirstname.setText("");
        jLastname.setText("");
        jUsermail.setText("");
        jPassword.setText("");
        jRepassword.setText("");
    }
    void newevent() throws SQLException{
        jEventTitle.setText("");
        newevent = con.prepareStatement("INSERT INTO APP.EVENTS(EVENTID,EVENT_NAME,EVENT_DATE,STARTINGTIME,ENDINGTIME,DESCRIPTION,RESERVED_SEATS,BOOKING_START,BOOKING_END,PYP,MYP,SENIOR,TEACHERS,PARENTS,EXTERNALORG,POSTER) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        changeform(adminchangingPanel,Eventinput_1);
        changeform(jEventinputPanel,jPrimarydetails);
        jEventinpputtitle.setText("Fill in the Event's Primary details");
        jnext.setText("Next");
        jBack.setVisible(false);
        athome=false;
        jBookingdetails.add(bookingdetails);
        jeventDate.setMinSelectableDate(today);
        //seatchoose.setBackground(jBookingdetails.getBackground());
        //bookingdetails.setVisible(true);
        step=1;
    }
    
    boolean changingtab(){
        if (!athome){
            if(ondatabaseaccess){
                databaseholder.removeAll();
                ondatabaseaccess=false;
            }
            int answer = JOptionPane.showConfirmDialog(null, "Are you sure you wish to leave current page without saving, all your changes will be aborted", "Alert", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            return answer==0; 
        }
        else{
            return true;
        }
               
    }
    
    void returntoadminhome(){
        changeform(adminchangingPanel,homePage);
        jlistUpcoming.setText(upcomingevent());
        athome=true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Eventinput_1;
    private javax.swing.JFileChooser Imagechooser;
    private javax.swing.JLabel adminPoster;
    private javax.swing.JPanel adminchangingPanel;
    private javax.swing.JPanel databaseholder;
    private javax.swing.JPanel homePage;
    private javax.swing.JButton jBack;
    private javax.swing.JButton jBack1;
    private javax.swing.JPanel jBookingdetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jDisplayDatabase;
    private javax.swing.JTextField jEventTitle;
    private javax.swing.JLabel jEventinpputtitle;
    private javax.swing.JPanel jEventinputPanel;
    private javax.swing.JComboBox<String> jEventlist1;
    private javax.swing.JComboBox<String> jEventlist2;
    private javax.swing.JMenuItem jExit;
    private javax.swing.JTextField jFirstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLastname;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jModifyrestricted;
    private javax.swing.JPanel jNewAdmin;
    private javax.swing.JPanel jNewAdminFillin;
    private javax.swing.JButton jNext;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPanel jPrimarydetails;
    private javax.swing.JPasswordField jRepassword;
    private javax.swing.JPanel jRestricted;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jUsermail;
    private javax.swing.JPanel jchangeRestricted;
    private javax.swing.JPanel jchangebookingdetails;
    private javax.swing.JTextArea jdescription;
    private com.toedter.calendar.JDateChooser jeventDate;
    private javax.swing.JSpinner jhourend;
    private javax.swing.JSpinner jhourstart;
    private javax.swing.JLabel jlistUpcoming;
    private javax.swing.JPanel jlowerpanel;
    private javax.swing.JPanel jlowerpanel1;
    private javax.swing.JSpinner jminuteend;
    private javax.swing.JSpinner jminutestart;
    private javax.swing.JPanel jmodifybooking;
    private javax.swing.JButton jnext;
    private javax.swing.JPanel jposter;
    private javax.swing.JLabel jupcoming;
    private javax.swing.JPanel jupcomingpanel;
    // End of variables declaration//GEN-END:variables
}
