package auditoriumseats;

import static auditoriumseats.AuditoriumSeats.con;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;
 

public class CustomerMode extends javax.swing.JFrame {
    static String emailText,email;
    static public Dimension screenSize;
    static Date today;
    static AudiSeatsGrid seatchoose;
    static PreparedStatement newbooking,newstudent,newteacher,newparent,neworganization,updatebooking;
    static Statement stmt;
    static ResultSet rs;
    static int EventId,bookingID; 
    static long CustomerID;
    static boolean underbookingperiod,introductionshown,addNewCustomer,searched,pypAllowed,mypAllowed,seniorAllowed,teacherAllowed,parentsAllowed,organizationAllowed;
    static short customerType;
    static java.text.SimpleDateFormat dateformatter;
    static java.text.SimpleDateFormat timeformatter;
    public CustomerMode() throws SQLException {
        today =  new Date();
        dateformatter = new SimpleDateFormat("EEE MMM dd, yyyy");
        seatchoose = new AudiSeatsGrid();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        initComponents();
        Seat.configureForAdmin=false;
        addNewCustomer=true;
        searched=false;
        timeformatter = new SimpleDateFormat("hh:mm");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        CustomerType = new javax.swing.ButtonGroup();
        AdminForm = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jclear = new javax.swing.JButton();
        jusername = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        CustomerHeader = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ChangingPanel = new javax.swing.JPanel();
        HomeScreen = new javax.swing.JPanel();
        jwelcome = new javax.swing.JLabel();
        jmodifyBooking = new javax.swing.JButton();
        jNewBooking = new javax.swing.JButton();
        jupcomingpanel = new javax.swing.JPanel();
        jlistUpcoming = new javax.swing.JLabel();
        jupcoming = new javax.swing.JLabel();
        jSelectevent = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jNext3 = new javax.swing.JButton();
        jBack8 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jeventsforbooking = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jeventintroduction = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jEventTitle = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jEventStart = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jEventEnd = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jEventDate = new javax.swing.JLabel();
        jEventPoster = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEventDescription = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        Information_form = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        j2step = new javax.swing.JLabel();
        RadioButtons = new javax.swing.JPanel();
        radpyp = new javax.swing.JRadioButton();
        radmyp = new javax.swing.JRadioButton();
        radsenior = new javax.swing.JRadioButton();
        radteacher = new javax.swing.JRadioButton();
        radparent = new javax.swing.JRadioButton();
        radorganization = new javax.swing.JRadioButton();
        jForms = new javax.swing.JPanel();
        empty = new javax.swing.JPanel();
        OrganizationForm = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jOrgPhone = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jOrgFName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jOrgName = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jOrgLName = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jOrgEmail = new javax.swing.JTextField();
        jsearchresult1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        StudentForm = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jsearchresult = new javax.swing.JLabel();
        TeacherForm = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jsearchresult2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        ParentForm = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jsearchresult3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        notAllowed = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jNext = new javax.swing.JButton();
        jBack = new javax.swing.JButton();
        Seats_selection = new javax.swing.JPanel();
        Group_seats = new javax.swing.JPanel();
        jScreen = new javax.swing.JLabel();
        jNext1 = new javax.swing.JButton();
        jBack1 = new javax.swing.JButton();
        Conformation_Page = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jBookingId = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jConfirmBooking = new javax.swing.JButton();
        jBack3 = new javax.swing.JButton();
        jBack4 = new javax.swing.JButton();
        jConsumerModify = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jBack5 = new javax.swing.JButton();
        jBack6 = new javax.swing.JButton();
        jBack7 = new javax.swing.JButton();
        jMainModify = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jBack10 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jBack11 = new javax.swing.JButton();
        jBack9 = new javax.swing.JButton();
        Seats_selectionModify = new javax.swing.JPanel();
        Group_seats1 = new javax.swing.JPanel();
        jScreen1 = new javax.swing.JLabel();
        jNext2 = new javax.swing.JButton();
        jBack12 = new javax.swing.JButton();

        CustomerType.add(radpyp);
        CustomerType.add(radmyp);
        CustomerType.add(radsenior);
        CustomerType.add(radteacher);
        CustomerType.add(radparent);
        CustomerType.add(radorganization);

        AdminForm.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        AdminForm.setTitle("Fill in the Details");
        AdminForm.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        AdminForm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AdminForm.setLocation(screenSize.width / 2 - 530/ 2,
            screenSize.height / 2 - 300/ 2);
        AdminForm.setResizable(false);
        AdminForm.setSize(new java.awt.Dimension(530, 300));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jclear.setText("Clear");
        jclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclearActionPerformed(evt);
            }
        });

        jusername.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusernameActionPerformed(evt);
            }
        });

        jpassword.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Username:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Password:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jusername, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jclear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jpassword)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jusername, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jclear))
                .addContainerGap())
        );

        javax.swing.GroupLayout AdminFormLayout = new javax.swing.GroupLayout(AdminForm.getContentPane());
        AdminForm.getContentPane().setLayout(AdminFormLayout);
        AdminFormLayout.setHorizontalGroup(
            AdminFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AdminFormLayout.setVerticalGroup(
            AdminFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRANAV GOYAL - DOSSIER");
        setBounds(screenSize.width / 2 - 1100/ 2,
            screenSize.height / 2 - 700/ 2,1100,700
        );
        setLocation(screenSize.width / 2 - 1100/ 2,
            screenSize.height / 2 - 700 / 2);
        setName("MainFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 700));

        CustomerHeader.setBackground(new java.awt.Color(30, 139, 195));
        CustomerHeader.setPreferredSize(new java.awt.Dimension(1100, 90));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Admin?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gmis_loho.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText(" GMIS AUDITORIUM");

        javax.swing.GroupLayout CustomerHeaderLayout = new javax.swing.GroupLayout(CustomerHeader);
        CustomerHeader.setLayout(CustomerHeaderLayout);
        CustomerHeaderLayout.setHorizontalGroup(
            CustomerHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerHeaderLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
        );
        CustomerHeaderLayout.setVerticalGroup(
            CustomerHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerHeaderLayout.createSequentialGroup()
                .addGroup(CustomerHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CustomerHeaderLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(CustomerHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ChangingPanel.setBackground(new java.awt.Color(0, 153, 204));
        ChangingPanel.setForeground(new java.awt.Color(0, 153, 204));
        ChangingPanel.setPreferredSize(new java.awt.Dimension(1100, 610));
        ChangingPanel.setLayout(new java.awt.CardLayout());

        HomeScreen.setBackground(new java.awt.Color(12, 188, 188));
        HomeScreen.setPreferredSize(new java.awt.Dimension(1100, 610));

        jwelcome.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jwelcome.setForeground(new java.awt.Color(255, 255, 204));
        jwelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jwelcome.setText("-----WELCOME-----");

        jmodifyBooking.setBackground(new java.awt.Color(51, 153, 255));
        jmodifyBooking.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jmodifyBooking.setForeground(new java.awt.Color(204, 255, 255));
        jmodifyBooking.setText("Modify Previous Booking");
        jmodifyBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmodifyBookingActionPerformed(evt);
            }
        });

        jNewBooking.setBackground(new java.awt.Color(51, 153, 255));
        jNewBooking.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNewBooking.setForeground(new java.awt.Color(204, 255, 255));
        jNewBooking.setText("New Booking");
        jNewBooking.setPreferredSize(new java.awt.Dimension(291, 37));
        jNewBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewBookingActionPerformed(evt);
            }
        });

        jupcomingpanel.setBackground(new java.awt.Color(11, 173, 173));
        jupcomingpanel.setPreferredSize(new java.awt.Dimension(1009, 380));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jupcomingpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jupcoming, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlistUpcoming, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jupcomingpanelLayout.setVerticalGroup(
            jupcomingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jupcomingpanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jupcomingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jupcoming, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(jlistUpcoming, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout HomeScreenLayout = new javax.swing.GroupLayout(HomeScreen);
        HomeScreen.setLayout(HomeScreenLayout);
        HomeScreenLayout.setHorizontalGroup(
            HomeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeScreenLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(HomeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomeScreenLayout.createSequentialGroup()
                        .addComponent(jmodifyBooking)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jNewBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jwelcome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jupcomingpanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        HomeScreenLayout.setVerticalGroup(
            HomeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeScreenLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jupcomingpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomeScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmodifyBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNewBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ChangingPanel.add(HomeScreen, "card2");

        jSelectevent.setBackground(new java.awt.Color(12, 188, 188));

        jPanel8.setBackground(new java.awt.Color(12, 188, 188));

        jNext3.setBackground(new java.awt.Color(30, 139, 195));
        jNext3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jNext3.setForeground(new java.awt.Color(255, 255, 255));
        jNext3.setText("NEXT");
        jNext3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNext3ActionPerformed(evt);
            }
        });

        jBack8.setBackground(new java.awt.Color(30, 139, 195));
        jBack8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBack8.setForeground(new java.awt.Color(255, 255, 255));
        jBack8.setText("BACK");
        jBack8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBack8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBack8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jNext3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNext3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBack8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel51.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Choose the event to be booked:");

        jeventsforbooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeventsforbookingActionPerformed(evt);
            }
        });

        jPanel9.setLayout(new java.awt.CardLayout());

        jeventintroduction.setBackground(new java.awt.Color(0, 153, 153));

        jLabel79.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Event Title:");

        jEventTitle.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jEventTitle.setForeground(new java.awt.Color(255, 255, 255));
        jEventTitle.setText("_");

        jLabel81.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Timeings:");

        jLabel82.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("from");

        jEventStart.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jEventStart.setForeground(new java.awt.Color(255, 255, 255));
        jEventStart.setText("_");

        jLabel84.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("to");

        jEventEnd.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jEventEnd.setForeground(new java.awt.Color(255, 255, 255));
        jEventEnd.setText("_");

        jLabel86.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel86.setText("Description:");
        jLabel86.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel88.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("Date:");

        jEventDate.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jEventDate.setForeground(new java.awt.Color(255, 255, 255));
        jEventDate.setText("_");

        jEventDescription.setEditable(false);
        jEventDescription.setBackground(new java.awt.Color(0, 153, 153));
        jEventDescription.setColumns(20);
        jEventDescription.setFont(jEventTitle.getFont());
        jEventDescription.setForeground(new java.awt.Color(255, 255, 255));
        jEventDescription.setLineWrap(true);
        jEventDescription.setRows(5);
        jEventDescription.setWrapStyleWord(true);
        jEventDescription.setAutoscrolls(false);
        jEventDescription.setBorder(null);
        jEventDescription.setCaretColor(new java.awt.Color(0, 153, 153));
        jEventDescription.setDisabledTextColor(new java.awt.Color(0, 153, 153));
        jScrollPane1.setViewportView(jEventDescription);

        javax.swing.GroupLayout jeventintroductionLayout = new javax.swing.GroupLayout(jeventintroduction);
        jeventintroduction.setLayout(jeventintroductionLayout);
        jeventintroductionLayout.setHorizontalGroup(
            jeventintroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jeventintroductionLayout.createSequentialGroup()
                .addGroup(jeventintroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jeventintroductionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jEventPoster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jeventintroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jeventintroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jEventTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jeventintroductionLayout.createSequentialGroup()
                        .addGroup(jeventintroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jeventintroductionLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel81)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jEventStart, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel84)
                                .addGap(18, 18, 18)
                                .addComponent(jEventEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jeventintroductionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel88)
                                .addGap(18, 18, 18)
                                .addComponent(jEventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jeventintroductionLayout.setVerticalGroup(
            jeventintroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jeventintroductionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jeventintroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jeventintroductionLayout.createSequentialGroup()
                        .addGroup(jeventintroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEventTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jeventintroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addComponent(jEventPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jeventintroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jeventintroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jeventintroductionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jeventintroductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEventStart, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jEventEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel9.add(jeventintroduction, "card2");

        jPanel10.setBackground(new java.awt.Color(0, 153, 153));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Sorry, Bookings for this events haven't opened yet");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.add(jPanel10, "card3");

        javax.swing.GroupLayout jSelecteventLayout = new javax.swing.GroupLayout(jSelectevent);
        jSelectevent.setLayout(jSelecteventLayout);
        jSelecteventLayout.setHorizontalGroup(
            jSelecteventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSelecteventLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSelecteventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jSelecteventLayout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jeventsforbooking, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jSelecteventLayout.setVerticalGroup(
            jSelecteventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSelecteventLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSelecteventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jeventsforbooking))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        ChangingPanel.add(jSelectevent, "card9");

        Information_form.setBackground(HomeScreen.getBackground());
        Information_form.setPreferredSize(new java.awt.Dimension(1100, 610));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("1st--Select your category");

        j2step.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        j2step.setForeground(new java.awt.Color(204, 255, 255));
        j2step.setText("2nd--Fill in the details");

        RadioButtons.setBackground(Information_form.getBackground());
        RadioButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radpyp.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 22)); // NOI18N
        radpyp.setForeground(new java.awt.Color(204, 255, 255));
        radpyp.setText("PYP Student");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Information_form, org.jdesktop.beansbinding.ELProperty.create("${background}"), radpyp, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        radpyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radpypActionPerformed(evt);
            }
        });
        RadioButtons.add(radpyp, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 33, 243, -1));

        radmyp.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 22)); // NOI18N
        radmyp.setForeground(new java.awt.Color(204, 255, 255));
        radmyp.setText("MYP Student");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Information_form, org.jdesktop.beansbinding.ELProperty.create("${background}"), radmyp, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        radmyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radmypActionPerformed(evt);
            }
        });
        RadioButtons.add(radmyp, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 84, 243, -1));

        radsenior.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 22)); // NOI18N
        radsenior.setForeground(new java.awt.Color(204, 255, 255));
        radsenior.setText("Senior School Student");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Information_form, org.jdesktop.beansbinding.ELProperty.create("${background}"), radsenior, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        radsenior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radseniorActionPerformed(evt);
            }
        });
        RadioButtons.add(radsenior, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 135, 243, -1));

        radteacher.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 22)); // NOI18N
        radteacher.setForeground(new java.awt.Color(204, 255, 255));
        radteacher.setText("Teacher");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Information_form, org.jdesktop.beansbinding.ELProperty.create("${background}"), radteacher, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        radteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radteacherActionPerformed(evt);
            }
        });
        RadioButtons.add(radteacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 186, 243, -1));

        radparent.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 22)); // NOI18N
        radparent.setForeground(new java.awt.Color(204, 255, 255));
        radparent.setText("Parent");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Information_form, org.jdesktop.beansbinding.ELProperty.create("${background}"), radparent, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        radparent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radparentActionPerformed(evt);
            }
        });
        RadioButtons.add(radparent, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 237, 243, -1));

        radorganization.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 22)); // NOI18N
        radorganization.setForeground(new java.awt.Color(204, 255, 255));
        radorganization.setText("Organization Represntative");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Information_form, org.jdesktop.beansbinding.ELProperty.create("${background}"), radorganization, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        radorganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radorganizationActionPerformed(evt);
            }
        });
        RadioButtons.add(radorganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 288, -1, -1));

        jForms.setLayout(new java.awt.CardLayout());

        empty.setBackground(new java.awt.Color(12, 188, 188));

        javax.swing.GroupLayout emptyLayout = new javax.swing.GroupLayout(empty);
        empty.setLayout(emptyLayout);
        emptyLayout.setHorizontalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        emptyLayout.setVerticalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jForms.add(empty, "card6");

        OrganizationForm.setBackground(new java.awt.Color(12, 188, 188));

        jLabel21.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Representative's Phone Number");

        jOrgPhone.setBackground(new java.awt.Color(30, 139, 195));
        jOrgPhone.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jOrgPhone.setForeground(new java.awt.Color(255, 255, 255));
        jOrgPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrgPhoneActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("First Name");

        jOrgFName.setBackground(new java.awt.Color(30, 139, 195));
        jOrgFName.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jOrgFName.setForeground(new java.awt.Color(255, 255, 255));
        jOrgFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrgFNameActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Organization Title");

        jOrgName.setBackground(new java.awt.Color(30, 139, 195));
        jOrgName.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jOrgName.setForeground(new java.awt.Color(255, 255, 255));
        jOrgName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrgNameActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Last Name");

        jOrgLName.setBackground(new java.awt.Color(30, 139, 195));
        jOrgLName.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jOrgLName.setForeground(new java.awt.Color(255, 255, 255));
        jOrgLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrgLNameActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Email:");

        jOrgEmail.setBackground(new java.awt.Color(30, 139, 195));
        jOrgEmail.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jOrgEmail.setForeground(new java.awt.Color(255, 255, 255));
        jOrgEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrgEmailActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(12, 188, 188));
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OrganizationFormLayout = new javax.swing.GroupLayout(OrganizationForm);
        OrganizationForm.setLayout(OrganizationFormLayout);
        OrganizationFormLayout.setHorizontalGroup(
            OrganizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrganizationFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OrganizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(OrganizationFormLayout.createSequentialGroup()
                        .addGroup(OrganizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jOrgFName, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(OrganizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jOrgLName)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jOrgPhone)
                    .addComponent(jOrgName)
                    .addComponent(jOrgEmail)
                    .addGroup(OrganizationFormLayout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jsearchresult1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        OrganizationFormLayout.setVerticalGroup(
            OrganizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrganizationFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jOrgPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OrganizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5)
                    .addComponent(jsearchresult1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(OrganizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrganizationFormLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OrganizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jOrgFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jOrgLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jOrgEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jForms.add(OrganizationForm, "card5");

        StudentForm.setBackground(new java.awt.Color(12, 188, 188));

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("STUDENT ID (LAST 6 DIGITS)");

        jTextField1.setBackground(new java.awt.Color(30, 139, 195));
        jTextField1.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name");

        jTextField2.setBackground(new java.awt.Color(30, 139, 195));
        jTextField2.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email:");

        jTextField4.setBackground(new java.awt.Color(30, 139, 195));
        jTextField4.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last Name");

        jTextField5.setBackground(new java.awt.Color(30, 139, 195));
        jTextField5.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Grade");

        jLabel11.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Section");

        jTextField6.setBackground(new java.awt.Color(30, 139, 195));
        jTextField6.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setBackground(new java.awt.Color(30, 139, 195));
        jTextField7.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(12, 188, 188));
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StudentFormLayout = new javax.swing.GroupLayout(StudentForm);
        StudentForm.setLayout(StudentFormLayout);
        StudentFormLayout.setHorizontalGroup(
            StudentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField4)
                    .addGroup(StudentFormLayout.createSequentialGroup()
                        .addGroup(StudentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(StudentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField6)))
                    .addGroup(StudentFormLayout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jsearchresult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        StudentFormLayout.setVerticalGroup(
            StudentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StudentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jsearchresult, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StudentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentFormLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(StudentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(StudentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentFormLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StudentFormLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jForms.add(StudentForm, "card2");

        TeacherForm.setBackground(new java.awt.Color(12, 188, 188));

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TEACHER ID (LAST 6 DIGITS)");

        jTextField3.setBackground(new java.awt.Color(30, 139, 195));
        jTextField3.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("First Name");

        jTextField8.setBackground(new java.awt.Color(30, 139, 195));
        jTextField8.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email:");

        jTextField9.setBackground(new java.awt.Color(30, 139, 195));
        jTextField9.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Last Name");

        jTextField10.setBackground(new java.awt.Color(30, 139, 195));
        jTextField10.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Phone Number");

        jTextField12.setBackground(new java.awt.Color(30, 139, 195));
        jTextField12.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(12, 188, 188));
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TeacherFormLayout = new javax.swing.GroupLayout(TeacherForm);
        TeacherForm.setLayout(TeacherFormLayout);
        TeacherFormLayout.setHorizontalGroup(
            TeacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeacherFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TeacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TeacherFormLayout.createSequentialGroup()
                        .addGroup(TeacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(TeacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jTextField3)
                    .addComponent(jTextField9)
                    .addComponent(jTextField12)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TeacherFormLayout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jsearchresult2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        TeacherFormLayout.setVerticalGroup(
            TeacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeacherFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TeacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addComponent(jsearchresult2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(TeacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TeacherFormLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TeacherFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jForms.add(TeacherForm, "card3");

        ParentForm.setBackground(new java.awt.Color(12, 188, 188));

        jLabel16.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Phone Number");

        jTextField11.setBackground(new java.awt.Color(30, 139, 195));
        jTextField11.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("First Name");

        jTextField13.setBackground(new java.awt.Color(30, 139, 195));
        jTextField13.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Email:");

        jTextField14.setBackground(new java.awt.Color(30, 139, 195));
        jTextField14.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Last Name");

        jTextField15.setBackground(new java.awt.Color(30, 139, 195));
        jTextField15.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Child's First name");

        jTextField16.setBackground(new java.awt.Color(30, 139, 195));
        jTextField16.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Child's Grade");

        jTextField22.setBackground(new java.awt.Color(30, 139, 195));
        jTextField22.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(255, 255, 255));
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Child's Section");

        jTextField23.setBackground(new java.awt.Color(30, 139, 195));
        jTextField23.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(255, 255, 255));
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(12, 188, 188));
        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ParentFormLayout = new javax.swing.GroupLayout(ParentForm);
        ParentForm.setLayout(ParentFormLayout);
        ParentFormLayout.setHorizontalGroup(
            ParentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParentFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ParentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField11)
                    .addComponent(jTextField14)
                    .addGroup(ParentFormLayout.createSequentialGroup()
                        .addGroup(ParentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(ParentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField15)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addGroup(ParentFormLayout.createSequentialGroup()
                                .addGroup(ParentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField22)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ParentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField23)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(ParentFormLayout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jsearchresult3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ParentFormLayout.setVerticalGroup(
            ParentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParentFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ParentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7)
                    .addComponent(jsearchresult3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(ParentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParentFormLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ParentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ParentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParentFormLayout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ParentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(ParentFormLayout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ParentFormLayout.createSequentialGroup()
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jForms.add(ParentForm, "card4");

        notAllowed.setBackground(new java.awt.Color(12, 188, 188));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("You are not authorized to watch this event");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Sorry!");

        javax.swing.GroupLayout notAllowedLayout = new javax.swing.GroupLayout(notAllowed);
        notAllowed.setLayout(notAllowedLayout);
        notAllowedLayout.setHorizontalGroup(
            notAllowedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notAllowedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(notAllowedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(notAllowedLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        notAllowedLayout.setVerticalGroup(
            notAllowedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notAllowedLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jForms.add(notAllowed, "card6");

        jPanel5.setBackground(Information_form.getBackground());

        jNext.setBackground(new java.awt.Color(30, 139, 195));
        jNext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jNext.setForeground(new java.awt.Color(255, 255, 255));
        jNext.setText("NEXT");
        jNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNextActionPerformed(evt);
            }
        });

        jBack.setBackground(new java.awt.Color(30, 139, 195));
        jBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBack.setForeground(new java.awt.Color(255, 255, 255));
        jBack.setText("BACK");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBack, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jNext, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNext, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBack, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout Information_formLayout = new javax.swing.GroupLayout(Information_form);
        Information_form.setLayout(Information_formLayout);
        Information_formLayout.setHorizontalGroup(
            Information_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Information_formLayout.createSequentialGroup()
                .addGroup(Information_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Information_formLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Information_formLayout.createSequentialGroup()
                        .addGroup(Information_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Information_formLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(j2step))
                            .addGroup(Information_formLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(RadioButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jForms, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Information_formLayout.setVerticalGroup(
            Information_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Information_formLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Information_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j2step, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(Information_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jForms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        j2step.setVisible(false);

        ChangingPanel.add(Information_form, "card4");

        Seats_selection.setBackground(HomeScreen.getBackground());
        Seats_selection.setPreferredSize(new java.awt.Dimension(1100, 610));

        Group_seats.setBackground(new java.awt.Color(0, 153, 153));
        Group_seats.setLayout(new java.awt.GridLayout(1, 0));

        jScreen.setBackground(new java.awt.Color(0, 102, 102));
        jScreen.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jScreen.setForeground(new java.awt.Color(255, 255, 255));
        jScreen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScreen.setText("STAGE");
        jScreen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jNext1.setBackground(new java.awt.Color(30, 139, 195));
        jNext1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jNext1.setForeground(new java.awt.Color(255, 255, 255));
        jNext1.setText("NEXT");
        jNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNext1ActionPerformed(evt);
            }
        });

        jBack1.setBackground(new java.awt.Color(30, 139, 195));
        jBack1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBack1.setForeground(new java.awt.Color(255, 255, 255));
        jBack1.setText("BACK");
        jBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Seats_selectionLayout = new javax.swing.GroupLayout(Seats_selection);
        Seats_selection.setLayout(Seats_selectionLayout);
        Seats_selectionLayout.setHorizontalGroup(
            Seats_selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Seats_selectionLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Seats_selectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 746, Short.MAX_VALUE)
                .addComponent(jNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(Seats_selectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Group_seats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Seats_selectionLayout.setVerticalGroup(
            Seats_selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Seats_selectionLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Group_seats, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScreen)
                .addGap(18, 18, 18)
                .addGroup(Seats_selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        ChangingPanel.add(Seats_selection, "card3");

        Conformation_Page.setBackground(HomeScreen.getBackground());
        Conformation_Page.setPreferredSize(new java.awt.Dimension(1100, 610));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("School provide ID / Phone Number");

        jLabel31.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("_");

        jBookingId.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jBookingId.setForeground(new java.awt.Color(255, 255, 255));
        jBookingId.setText("_");

        jLabel34.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("BOOKING ID:");

        jLabel35.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Event attending:");

        jLabel36.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("_");

        jLabel37.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Date attending:");

        jLabel38.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("_");

        jLabel39.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Timeings:");

        jLabel40.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("from");

        jLabel41.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("_");

        jLabel42.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("to");

        jLabel43.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("_");

        jLabel44.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Seats count");

        jLabel45.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("_");

        jLabel46.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Seats Number:");

        jLabel47.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("_");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel37))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel44)
                            .addComponent(jLabel46))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel42)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(jBookingId, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBookingId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel48.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Please Recheck your details");

        jConfirmBooking.setBackground(new java.awt.Color(30, 139, 195));
        jConfirmBooking.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jConfirmBooking.setForeground(new java.awt.Color(255, 255, 255));
        jConfirmBooking.setText("CONFIRM");
        jConfirmBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmBookingActionPerformed(evt);
            }
        });

        jBack3.setBackground(new java.awt.Color(30, 139, 195));
        jBack3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBack3.setForeground(new java.awt.Color(255, 255, 255));
        jBack3.setText("CANCEL");
        jBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBack3ActionPerformed(evt);
            }
        });

        jBack4.setBackground(new java.awt.Color(30, 139, 195));
        jBack4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBack4.setForeground(new java.awt.Color(255, 255, 255));
        jBack4.setText("BACK");
        jBack4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBack4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Conformation_PageLayout = new javax.swing.GroupLayout(Conformation_Page);
        Conformation_Page.setLayout(Conformation_PageLayout);
        Conformation_PageLayout.setHorizontalGroup(
            Conformation_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Conformation_PageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Conformation_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Conformation_PageLayout.createSequentialGroup()
                        .addComponent(jBack4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jConfirmBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Conformation_PageLayout.setVerticalGroup(
            Conformation_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Conformation_PageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(Conformation_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jConfirmBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBack4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        ChangingPanel.add(Conformation_Page, "card5");

        jConsumerModify.setBackground(Information_form.getBackground());

        jPanel3.setBackground(jConsumerModify.getBackground());

        jLabel49.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("STUDENT ID / TEACHER ID / PHONE NUMBER:");

        jTextField24.setBackground(new java.awt.Color(30, 139, 195));
        jTextField24.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(255, 255, 255));
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Booking Code:");

        jTextField25.setBackground(new java.awt.Color(30, 139, 195));
        jTextField25.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(255, 255, 255));
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField25)
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel50)
                .addGap(18, 18, 18)
                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel4.setBackground(jConsumerModify.getBackground());

        jBack5.setBackground(new java.awt.Color(30, 139, 195));
        jBack5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBack5.setForeground(new java.awt.Color(255, 255, 255));
        jBack5.setText("SUBMIT");
        jBack5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBack5ActionPerformed(evt);
            }
        });

        jBack6.setBackground(new java.awt.Color(30, 139, 195));
        jBack6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBack6.setForeground(new java.awt.Color(255, 255, 255));
        jBack6.setText("RESET");
        jBack6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBack6ActionPerformed(evt);
            }
        });

        jBack7.setBackground(new java.awt.Color(30, 139, 195));
        jBack7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBack7.setForeground(new java.awt.Color(255, 255, 255));
        jBack7.setText("CANCEL");
        jBack7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBack7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBack7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBack6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jBack5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBack7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBack6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBack5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jConsumerModifyLayout = new javax.swing.GroupLayout(jConsumerModify);
        jConsumerModify.setLayout(jConsumerModifyLayout);
        jConsumerModifyLayout.setHorizontalGroup(
            jConsumerModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jConsumerModifyLayout.createSequentialGroup()
                .addGroup(jConsumerModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jConsumerModifyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jConsumerModifyLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jConsumerModifyLayout.setVerticalGroup(
            jConsumerModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jConsumerModifyLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        ChangingPanel.add(jConsumerModify, "card6");

        jMainModify.setBackground(Information_form.getBackground());

        jPanel6.setBackground(jConsumerModify.getBackground());

        jBack10.setBackground(new java.awt.Color(30, 139, 195));
        jBack10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBack10.setForeground(new java.awt.Color(255, 255, 255));
        jBack10.setText("RETURN TO HOME");
        jBack10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBack10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBack10)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jBack10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        jLabel53.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("First Name:");

        jLabel54.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Last Name:");

        jLabel55.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("_");

        jLabel56.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("_");

        jLabel59.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Event attending:");

        jLabel60.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("_");

        jLabel61.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Date attending:");

        jLabel62.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("_");

        jLabel63.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Timeings:");

        jLabel64.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("from");

        jLabel65.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("_");

        jLabel66.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("to");

        jLabel67.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("_");

        jLabel70.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Seats Number:");

        jLabel71.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("_");

        jLabel57.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Category");

        jLabel58.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("_");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel57)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel64)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel66)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jBack11.setBackground(new java.awt.Color(30, 139, 195));
        jBack11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBack11.setForeground(new java.awt.Color(255, 255, 255));
        jBack11.setText("DELETE THIS BOOKING");
        jBack11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBack11ActionPerformed(evt);
            }
        });

        jBack9.setBackground(new java.awt.Color(30, 139, 195));
        jBack9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBack9.setForeground(new java.awt.Color(255, 255, 255));
        jBack9.setText("CHANGE SEATS");
        jBack9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBack9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMainModifyLayout = new javax.swing.GroupLayout(jMainModify);
        jMainModify.setLayout(jMainModifyLayout);
        jMainModifyLayout.setHorizontalGroup(
            jMainModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainModifyLayout.createSequentialGroup()
                .addGroup(jMainModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMainModifyLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBack11)
                        .addGap(205, 205, 205)
                        .addComponent(jBack9, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainModifyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jMainModifyLayout.setVerticalGroup(
            jMainModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainModifyLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jMainModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jMainModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBack9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBack11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        ChangingPanel.add(jMainModify, "card6");

        Seats_selectionModify.setBackground(HomeScreen.getBackground());
        Seats_selectionModify.setPreferredSize(new java.awt.Dimension(1100, 610));

        Group_seats1.setBackground(new java.awt.Color(0, 153, 153));
        Group_seats1.setLayout(new java.awt.GridLayout(1, 0));

        jScreen1.setBackground(new java.awt.Color(0, 102, 102));
        jScreen1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jScreen1.setForeground(new java.awt.Color(255, 255, 255));
        jScreen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScreen1.setText("STAGE");
        jScreen1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jNext2.setBackground(new java.awt.Color(30, 139, 195));
        jNext2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jNext2.setForeground(new java.awt.Color(255, 255, 255));
        jNext2.setText("UPDATE");
        jNext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNext2ActionPerformed(evt);
            }
        });

        jBack12.setBackground(new java.awt.Color(30, 139, 195));
        jBack12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBack12.setForeground(new java.awt.Color(255, 255, 255));
        jBack12.setText("CANCEL");
        jBack12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBack12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Seats_selectionModifyLayout = new javax.swing.GroupLayout(Seats_selectionModify);
        Seats_selectionModify.setLayout(Seats_selectionModifyLayout);
        Seats_selectionModifyLayout.setHorizontalGroup(
            Seats_selectionModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Seats_selectionModifyLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jScreen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Seats_selectionModifyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBack12, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 746, Short.MAX_VALUE)
                .addComponent(jNext2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(Seats_selectionModifyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Group_seats1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Seats_selectionModifyLayout.setVerticalGroup(
            Seats_selectionModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Seats_selectionModifyLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Group_seats1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScreen1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Seats_selectionModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBack12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNext2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        ChangingPanel.add(Seats_selectionModify, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ChangingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(CustomerHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CustomerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ChangingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jmodifyBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmodifyBookingActionPerformed
        changeform(ChangingPanel,jConsumerModify);
    }//GEN-LAST:event_jmodifyBookingActionPerformed

    private void jNewBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewBookingActionPerformed
        try {
                fillevnetlist(jeventsforbooking);
                jPanel9.setVisible(false);
                changeform(ChangingPanel,jSelectevent);
                introductionshown=false;
                newbooking = con.prepareStatement("INSERT INTO APP.CURRENTBOOKINGS(BOOKINGID,EVENTID,SEAT_NUMBER,CUSTOMERID) VALUES (?,?,?,?)");
            } catch (SQLException ex) {
                Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }//GEN-LAST:event_jNewBookingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminForm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        changeform(ChangingPanel,jSelectevent);
        changeform(jForms,empty);
        CustomerType.clearSelection();
    }//GEN-LAST:event_jBackActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jOrgPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrgPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOrgPhoneActionPerformed

    private void jOrgFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrgFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOrgFNameActionPerformed

    private void jOrgNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrgNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOrgNameActionPerformed

    private void jOrgLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrgLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOrgLNameActionPerformed

    private void jOrgEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrgEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOrgEmailActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void radpypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radpypActionPerformed
        if (pypAllowed){
            changeform(jForms,StudentForm);
            customerType=1;
            AudiSeatsGrid.maxNumberOfSeats=2;
        }else{
            changeform(jForms,notAllowed);
        }
    }//GEN-LAST:event_radpypActionPerformed

    private void radmypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radmypActionPerformed
        if (mypAllowed){
            changeform(jForms,StudentForm);
            customerType=2;
            AudiSeatsGrid.maxNumberOfSeats=2;
        }else{
            changeform(jForms,notAllowed);
        }
    }//GEN-LAST:event_radmypActionPerformed

    private void radseniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radseniorActionPerformed
        if (seniorAllowed){
            changeform(jForms,StudentForm);
            customerType=3;
            AudiSeatsGrid.maxNumberOfSeats=2;
        }else{
            changeform(jForms,notAllowed);
        }
    }//GEN-LAST:event_radseniorActionPerformed

    private void radteacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radteacherActionPerformed
        if (teacherAllowed){
            changeform(jForms,TeacherForm);
            customerType=4;
            AudiSeatsGrid.maxNumberOfSeats=4;
        }else{
            changeform(jForms,notAllowed);
        }
    }//GEN-LAST:event_radteacherActionPerformed

    private void radparentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radparentActionPerformed
        if (parentsAllowed){
            changeform(jForms,ParentForm);
            customerType=5;
            AudiSeatsGrid.maxNumberOfSeats=6;
        }else{
            changeform(jForms,notAllowed);
        }
    }//GEN-LAST:event_radparentActionPerformed

    private void radorganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radorganizationActionPerformed
        if (organizationAllowed){
            changeform(jForms,OrganizationForm);
            customerType=6;
            AudiSeatsGrid.maxNumberOfSeats=10;
        }else{
            changeform(jForms,notAllowed);
        }
    }//GEN-LAST:event_radorganizationActionPerformed

    private void jusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jusernameActionPerformed

    private void jpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpasswordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AdminForm.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclearActionPerformed
        jusername.setText("");
        jpassword.setText("");
    }//GEN-LAST:event_jclearActionPerformed

    private void jNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNextActionPerformed
        if (searched){
            try {
                boolean detailsFilled = true;
                boolean correctclass = true;
                boolean correctemail = true;
                boolean Firstbooking = true;
                Pattern VALID_EMAIL = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
                Matcher matcher;
                switch (customerType){
                    case 1:
                        if(jTextField2.getText().equals("")||jTextField4.getText().equals("")||jTextField5.getText().equals("")||jTextField6.getText().equals("")||jTextField7.getText().equals("")){
                            detailsFilled = false;
                        }
                        if(!(jTextField7.getText().equals("1")||jTextField7.getText().equals("2")||jTextField7.getText().equals("3")||jTextField7.getText().equals("4")||jTextField7.getText().equals("5"))){
                            correctclass = false;
                        }
                        matcher = VALID_EMAIL.matcher(jTextField4.getText());
                        correctemail = matcher.find();
                        break;
                    case 2:
                        if(jTextField2.getText().equals("")||jTextField4.getText().equals("")||jTextField5.getText().equals("")||jTextField6.getText().equals("")||jTextField7.getText().equals("")){
                            detailsFilled = false;
                        }
                        if(!(jTextField7.getText().equals("6")||jTextField7.getText().equals("7")||jTextField7.getText().equals("8"))){
                            correctclass = false;
                        }
                        matcher = VALID_EMAIL.matcher(jTextField4.getText());
                        correctemail = matcher.find();
                        break;
                    case 3:
                        if(jTextField2.getText().equals("")||jTextField4.getText().equals("")||jTextField5.getText().equals("")||jTextField6.getText().equals("")||jTextField7.getText().equals("")){
                            detailsFilled = false;
                        }
                        if(!(jTextField7.getText().equals("9")||jTextField7.getText().equals("10")||jTextField7.getText().equals("11")||jTextField7.getText().equals("12"))){
                            correctclass = false;
                        }
                        matcher = VALID_EMAIL.matcher(jTextField4.getText());
                        correctemail = matcher.find();
                        break;
                    case 4:
                        if(jTextField8.getText().equals("")||jTextField9.getText().equals("")||jTextField10.getText().equals("")||jTextField12.getText().equals("")){
                            detailsFilled = false;
                        }
                        matcher = VALID_EMAIL.matcher(jTextField9.getText());
                        correctemail = matcher.find();
                        break;
                    case 5:
                        if(jTextField13.getText().equals("")||jTextField14.getText().equals("")||jTextField15.getText().equals("")||jTextField16.getText().equals("")||jTextField22.getText().equals("")||jTextField23.getText().equals("")){
                            detailsFilled = false;
                        }
                        matcher = VALID_EMAIL.matcher(jTextField14.getText());
                        correctemail = matcher.find();
                        break;
                    case 6:
                        if(jOrgFName.getText().equals("")||jOrgName.getText().equals("")||jOrgLName.getText().equals("")||jOrgEmail.getText().equals("")){
                            detailsFilled = false;
                        }
                        matcher = VALID_EMAIL.matcher(jOrgEmail.getText());
                        correctemail = matcher.find();
                        break;
                }
                stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                rs=stmt.executeQuery("SELECT * FROM APP.CURRENTBOOKINGS WHERE CUSTOMERID="+CustomerID+"AND EVENTID="+EventId);
                if (rs.first()){
                    Firstbooking=false;
                }
                rs.close();
                stmt.close();
                if(detailsFilled){
                    if (correctclass){
                        if(correctemail){
                            if(Firstbooking){
                                try {
                                    switch (customerType){
                                        case 1:
                                            email=jTextField4.getText();
                                            break;
                                        case 2:
                                            email=jTextField4.getText();
                                            break;
                                        case 3:
                                            email=jTextField4.getText();
                                            break;
                                        case 4:
                                            email=jTextField9.getText();
                                            break;
                                        case 5:
                                            email=jTextField14.getText();
                                            break;
                                        case 6:
                                            email=jOrgEmail.getText();
                                            break;
                                    }
                                    newbooking.setLong(4, CustomerID);
                                    addseatchoose(Group_seats,EventId);
                                    changeform(ChangingPanel,Seats_selection);
                                } catch (SQLException ex) {
                                    Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "You have already booked for this event previously, return to main page if you wish to modify that booking", "", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Incorrect email format", "", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "The class chosen doesn't satisfy the category", "", JOptionPane.ERROR_MESSAGE);
                    } 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please fill in all the details", "", JOptionPane.ERROR_MESSAGE);
                }            
            } catch (SQLException ex) {
                Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Click 'Search' first to check if your record already exists", "", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jNextActionPerformed

    private void jNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNext1ActionPerformed
        try {
            changeform(ChangingPanel,Conformation_Page);
            newbooking.setString(3, seatchoose.getselectedstring());
            String query = "SELECT BOOKINGID FROM APP.CURRENTBOOKINGS WHERE EVENTID="+EventId;
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery(query);
            rs.last();
            try{
                bookingID = rs.getInt("BOOKINGID")+1;
            }
            catch(SQLException c){
                bookingID = EventId*1000+1;
            }
            rs.close();
            stmt.close();
            
            query = "SELECT EVENT_NAME,EVENT_DATE,STARTINGTIME,ENDINGTIME FROM APP.EVENTS WHERE EVENTID="+EventId;
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery(query);
            rs.first();
            jLabel36.setText(rs.getString("EVENT_NAME"));
            jLabel38.setText(dateformatter.format(rs.getDate("EVENT_DATE")));
            jLabel41.setText(timeformatter.format(rs.getTime("STARTINGTIME")));
            jLabel43.setText(timeformatter.format(rs.getTime("ENDINGTIME")));
            jBookingId.setText(String.valueOf(bookingID));
            jLabel31.setText(String.valueOf(CustomerID));
            jLabel47.setText(seatchoose.getselectedstring());
            jLabel45.setText(String.valueOf(seatchoose.getnumberselected()));
            emailText = "Here is the details for your Booking at the GMIS AUDITORIUM: \n";
            emailText += "School provide ID / Phone Number: ";
            emailText += String.valueOf(CustomerID)+"\n";
            emailText += "Booking ID: ";
            emailText += String.valueOf(bookingID)+"\n";
            emailText += "Event Attending: ";
            emailText += rs.getString("EVENT_NAME")+"\n";
            emailText += "Date Attending: ";
            emailText += dateformatter.format(rs.getDate("EVENT_DATE"))+"\n";
            emailText += "Timings: From ";
            emailText += timeformatter.format(rs.getTime("STARTINGTIME"));
            emailText += " To ";
            emailText += timeformatter.format(rs.getTime("ENDINGTIME"))+"\n";
            emailText += "Number of seats booked: ";
            emailText += String.valueOf(seatchoose.getnumberselected())+"\n";
            emailText += "Seats booked: ";
            emailText += seatchoose.getselectedstring()+"\n";
            emailText += "Looking forward to see you for this event. Greetings";
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jNext1ActionPerformed

    private void jBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBack1ActionPerformed
        changeform(ChangingPanel,Information_form);
    }//GEN-LAST:event_jBack1ActionPerformed

    private void jConfirmBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmBookingActionPerformed
        try {
            if (addNewCustomer){
                switch (customerType){
                case 1:
                    newstudent = con.prepareStatement("INSERT INTO APP.CUSTOMERS(ID,TYPE,FIRSTNAME,LASTNAME,EMAIL,GRADE,SECTION) VALUES (?,?,?,?,?,?,?)");
                    newstudent.setString(3, jTextField2.getText());
                    newstudent.setString(4, jTextField5.getText());
                    newstudent.setString(5, jTextField4.getText());
                    newstudent.setString(6, jTextField7.getText());
                    newstudent.setString(7, jTextField6.getText());
                    newstudent.setLong(1, CustomerID);
                    newstudent.setShort(2, customerType);
                    newstudent.executeUpdate();
                    newstudent.close();
                    break;
                case 2:
                    newstudent = con.prepareStatement("INSERT INTO APP.CUSTOMERS(ID,TYPE,FIRSTNAME,LASTNAME,EMAIL,GRADE,SECTION) VALUES (?,?,?,?,?,?,?)");
                    newstudent.setString(3, jTextField2.getText());
                    newstudent.setString(4, jTextField5.getText());
                    newstudent.setString(5, jTextField4.getText());
                    newstudent.setString(6, jTextField7.getText());
                    newstudent.setString(7, jTextField6.getText());
                    newstudent.setLong(1, CustomerID);
                    newstudent.setShort(2, customerType);
                    newstudent.executeUpdate();
                    newstudent.close();
                    break;
                case 3:
                    newstudent = con.prepareStatement("INSERT INTO APP.CUSTOMERS(ID,TYPE,FIRSTNAME,LASTNAME,EMAIL,GRADE,SECTION) VALUES (?,?,?,?,?,?,?)");
                    newstudent.setString(3, jTextField2.getText());
                    newstudent.setString(4, jTextField5.getText());
                    newstudent.setString(5, jTextField4.getText());
                    newstudent.setString(6, jTextField7.getText());
                    newstudent.setString(7, jTextField6.getText());
                    newstudent.setLong(1, CustomerID);
                    newstudent.setShort(2, customerType);
                    newstudent.executeUpdate();
                    newstudent.close();
                    break;
                case 4:
                    newteacher = con.prepareStatement("INSERT INTO APP.CUSTOMERS(ID,TYPE,FIRSTNAME,LASTNAME,EMAIL,PHONENUMBER) VALUES (?,?,?,?,?,?)");
                    newteacher.setLong(1, CustomerID);
                    newteacher.setShort(2, customerType);
                    newteacher.setString(3, jTextField8.getText());
                    newteacher.setString(4, jTextField10.getText());
                    newteacher.setString(5, jTextField9.getText());
                    newteacher.setLong(6, Long.parseLong(jTextField12.getText()));
                    newteacher.executeUpdate();
                    newteacher.close();
                    break;
                case 5:
                    newparent = con.prepareStatement("INSERT INTO APP.CUSTOMERS(ID,TYPE,FIRSTNAME,LASTNAME,EMAIL,GRADE,PHONENUMBER,SECTION,CHILDFIRSTNAME) VALUES (?,?,?,?,?,?,?,?,?)");
                    newparent.setLong(1, CustomerID);
                    newparent.setShort(2, customerType);
                    newparent.setString(3, jTextField13.getText());
                    newparent.setString(4, jTextField15.getText());
                    newparent.setString(5, jTextField14.getText());
                    newparent.setString(6, jTextField22.getText());
                    newparent.setLong(7, CustomerID);
                    newparent.setString(8, jTextField23.getText());
                    newparent.setString(9, jTextField16.getText());
                    newparent.executeUpdate();
                    newparent.close();
                    break;
                case 6:
                    neworganization = con.prepareStatement("INSERT INTO APP.CUSTOMERS(ID,TYPE,FIRSTNAME,LASTNAME,EMAIL,ORGANIZATIONNAME,PHONENUMBER) VALUES (?,?,?,?,?,?,?)");
                    neworganization.setLong(1, CustomerID);
                    neworganization.setShort(2, customerType);
                    neworganization.setString(3, jOrgFName.getText());
                    neworganization.setString(4, jOrgLName.getText());
                    neworganization.setString(5, jOrgEmail.getText());
                    neworganization.setString(6, jOrgName.getText());
                    neworganization.setLong(7, CustomerID);
                    neworganization.executeUpdate();
                    neworganization.close();
                    break;
                }
            }
            newbooking.setInt(1, bookingID);
            newbooking.executeUpdate();
            resetnewbooking();
            JOptionPane.showMessageDialog(null, "Your booking has been successfully added to our database and its details have been emailed to you", "Success",JOptionPane.PLAIN_MESSAGE);
            sendEmail(emailText,"GMIS AUDITORIUM NEW BOOKING",email);
            returntoconsumerhome();
        } catch (SQLException | MessagingException ex) {
            Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jConfirmBookingActionPerformed

    private void jBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBack3ActionPerformed
        if(cancelpressed()){
            returntoconsumerhome();
        }
    }//GEN-LAST:event_jBack3ActionPerformed

    private void jBack4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBack4ActionPerformed
        changeform(ChangingPanel,Seats_selection);
    }//GEN-LAST:event_jBack4ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jBack5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBack5ActionPerformed
        try {            
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery("SELECT * FROM APP.CURRENTBOOKINGS WHERE CUSTOMERID="+jTextField24.getText());
            boolean bookingfound=false;
            while(!bookingfound&&rs.next()){
                if (jTextField25.getText().equals(String.valueOf(rs.getInt("BOOKINGID")))){
                bookingfound=true;
                CustomerID= rs.getLong("CUSTOMERID");
                EventId=rs.getInt("EVENTID");
                bookingID=rs.getInt("BOOKINGID");
                jLabel71.setText(rs.getString("SEAT_NUMBER"));
                rs.close();
                stmt.close();
                String query = "SELECT EVENT_NAME,EVENT_DATE,STARTINGTIME,ENDINGTIME FROM APP.EVENTS WHERE EVENTID="+EventId;
                stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                rs=stmt.executeQuery(query);
                rs.first();
                jLabel60.setText(rs.getString("EVENT_NAME"));
                jLabel62.setText(dateformatter.format(rs.getDate("EVENT_DATE")));
                jLabel65.setText(timeformatter.format(rs.getTime("STARTINGTIME")));
                jLabel67.setText(timeformatter.format(rs.getTime("ENDINGTIME")));
                rs.close();
                stmt.close();
                query = "SELECT FIRSTNAME,LASTNAME,TYPE,EMAIL FROM APP.CUSTOMERS WHERE ID="+CustomerID;
                stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                rs=stmt.executeQuery(query);
                rs.first();
                jLabel55.setText(rs.getString("FIRSTNAME"));
                jLabel56.setText(rs.getString("LASTNAME"));
                email=rs.getString("EMAIL");
                switch(rs.getByte("TYPE")){
                    case 1:
                        jLabel58.setText("PYP STUDENT");
                        AudiSeatsGrid.maxNumberOfSeats=2;
                        break;
                    case 2:
                        jLabel58.setText("MYP STUDENT");
                        AudiSeatsGrid.maxNumberOfSeats=2;
                        break;
                    case 3:
                        jLabel58.setText("SENIOR SCHOOL STUDENT");
                        AudiSeatsGrid.maxNumberOfSeats=2;
                        break;
                    case 4:
                        jLabel58.setText("TEACHER");
                        AudiSeatsGrid.maxNumberOfSeats=4;
                        break;
                    case 5:
                        jLabel58.setText("PARENT");
                        AudiSeatsGrid.maxNumberOfSeats=6;
                        break;
                    case 6:
                        jLabel58.setText("EXTERNAL ORGANIZATION");
                        AudiSeatsGrid.maxNumberOfSeats=10;
                        break;  
                }
                rs.close();
                stmt.close();
                changeform(ChangingPanel,jMainModify);
            }
            }
            
            if(!bookingfound){
                JOptionPane.showMessageDialog(null, "Incorrect Booking Code", "", JOptionPane.ERROR_MESSAGE);
                rs.close();
                stmt.close();
            }
            
            }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO booking found associated to this customer ID", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBack5ActionPerformed

    private void jBack6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBack6ActionPerformed
        resermodifybooking();
    }//GEN-LAST:event_jBack6ActionPerformed

    private void jBack7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBack7ActionPerformed
        if(cancelpressed()){
            resermodifybooking();
            returntoconsumerhome();
        }
    }//GEN-LAST:event_jBack7ActionPerformed

    private void jBack9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBack9ActionPerformed
        try {
            changeform(ChangingPanel,Seats_selectionModify);
            seatchoose.refresh(EventId,CustomerID);
            Group_seats1.add(seatchoose); 
            seatchoose.setBackground(Group_seats1.getBackground());
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBack9ActionPerformed

    private void jBack10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBack10ActionPerformed
        if(0==JOptionPane.showConfirmDialog(null, "Sure you wish to stop viewing/modifying your Booking", "Alert", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE)){
            resermodifybooking();
            returntoconsumerhome();
        }
    }//GEN-LAST:event_jBack10ActionPerformed

    private void jBack11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBack11ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Are you sure you wish to Delete this booking permanently", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE)==0){
        try {
            String query = "DELETE FROM APP.CURRENTBOOKINGS WHERE BOOKINGID="+bookingID;
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stmt.executeUpdate(query);
            stmt.close();
            resermodifybooking();
            returntoconsumerhome();
            emailText="This email is to notify you that your booking (with ID:"+String.valueOf(bookingID)+") has been successfully deleted";
            sendEmail(emailText,"GMIS AUDITORIUM BOOKING DELETED",email);
        } catch (SQLException ex) {
            Logger.getLogger(AdminMode.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (MessagingException ex) {
                Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBack11ActionPerformed

    private void jNext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNext2ActionPerformed
        try {
            updatebooking = con.prepareStatement("UPDATE APP.CURRENTBOOKINGS SET SEAT_NUMBER=? WHERE BOOKINGID=?");
            updatebooking.setInt(2, bookingID);
            updatebooking.setString(1, seatchoose.getselectedstring());
            updatebooking.executeUpdate();
            JOptionPane.showMessageDialog(null, "SUCCESSFULLY UPDATED", "Success",JOptionPane.PLAIN_MESSAGE);
            changeform(ChangingPanel,jMainModify);
            emailText="This email is to notify you that your booking (with ID:"+String.valueOf(bookingID)+") has been successfully updated\nNew seats: "+seatchoose.getselectedstring();
            sendEmail(emailText,"GMIS AUDITORIUM BOOKING UPDATED",email);
        } catch (SQLException | MessagingException ex) {
            Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jNext2ActionPerformed

    private void jBack12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBack12ActionPerformed
        if(cancelpressed()){
            changeform(ChangingPanel,jMainModify);
        }
    }//GEN-LAST:event_jBack12ActionPerformed

    private void jNext3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNext3ActionPerformed
        if (jeventsforbooking.getSelectedIndex()!=0){
            if(underbookingperiod){
                try {
                    changeform(ChangingPanel,Information_form);
                    newbooking.setInt(2, EventId);
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Selected event not in the booking period", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a event", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jNext3ActionPerformed

    private void jBack8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBack8ActionPerformed
        if (cancelpressed()){
            try {
                returntoconsumerhome();
                resetnewbooking();
            } catch (SQLException ex) {
                Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBack8ActionPerformed

    private void jeventsforbookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeventsforbookingActionPerformed
        if (jeventsforbooking.getSelectedIndex()!=0){    
            try {
                String selected = jeventsforbooking.getItemAt(jeventsforbooking.getSelectedIndex());
                String query = "SELECT * FROM APP.EVENTS WHERE EVENT_NAME='"+selected+"'";
                stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                rs=stmt.executeQuery(query);
                rs.first();
                if (today.before(rs.getDate("BOOKING_START"))){
                    changeform(jPanel9,jPanel10);
                    jLabel30.setText("Sorry, Bookings for this events haven't opened yet. Check back on "+dateformatter.format(rs.getDate("BOOKING_START")));
                    underbookingperiod=false;
                }
                else{
                    if(today.after(rs.getDate("BOOKING_END"))){
                        changeform(jPanel9,jPanel10);
                        jLabel30.setText("Sorry, Bookings for this events have closed");
                        underbookingperiod=false;
                    }
                    else{
                        EventId = rs.getInt("EVENTID");
                        jEventTitle.setText(rs.getString("EVENT_NAME"));
                        jEventDescription.setBorder(null);
                        jEventDescription.setText(rs.getString("DESCRIPTION"));
                        jEventDate.setText(dateformatter.format(rs.getDate("EVENT_DATE")));
                        jEventStart.setText(timeformatter.format(rs.getTime("STARTINGTIME")));
                        jEventEnd.setText(timeformatter.format(rs.getTime("ENDINGTIME")));
                        byte[] poster = rs.getBytes("POSTER");
                        ImageIcon MyImage = new ImageIcon(poster);
                        Image img = MyImage.getImage();
                        Image newImg = img.getScaledInstance(jEventPoster.getWidth(), jEventPoster.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon image = new ImageIcon(newImg);
                        jEventPoster.setIcon(image);
                        pypAllowed = rs.getBoolean("PYP");
                        mypAllowed = rs.getBoolean("MYP");
                        seniorAllowed = rs.getBoolean("SENIOR");
                        teacherAllowed = rs.getBoolean("TEACHERS");
                        parentsAllowed = rs.getBoolean("PARENTS");
                        organizationAllowed = rs.getBoolean("EXTERNALORG");
                        changeform(jPanel9,jeventintroduction);
                        underbookingperiod=true;
                    }
                }
                rs.close();
                stmt.close();
                jPanel9.setVisible(true);
            }
            catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_jeventsforbookingActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        try {
            long id= Long.parseLong(jTextField1.getText());
            String query = "SELECT * FROM APP.CUSTOMERS WHERE ID="+id+"AND TYPE="+customerType;
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery(query);
            rs.first();
            try{
                CustomerID = rs.getLong("ID");
                jTextField2.setText(rs.getString("FIRSTNAME"));
                jTextField5.setText(rs.getString("LASTNAME"));
                jTextField7.setText(rs.getString("GRADE"));
                jTextField6.setText(rs.getString("SECTION"));
                jTextField4.setText(rs.getString("EMAIL"));
                addNewCustomer=false;
            }
            catch(SQLException ex){
                addNewCustomer=true;
                CustomerID=Long.parseLong(jTextField1.getText());
                JOptionPane.showMessageDialog(null, "Record not found in this category of audience, Please fill in the details yourself", "Sorry", JOptionPane.INFORMATION_MESSAGE);
            }
            rs.close();
            stmt.close();
            searched=true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            long id= Long.parseLong(jTextField3.getText());
            String query = "SELECT * FROM APP.CUSTOMERS WHERE ID="+id+"AND TYPE="+customerType;
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery(query);
            rs.first();
            try{
                CustomerID = rs.getLong("ID");
                jTextField8.setText(rs.getString("FIRSTNAME"));
                jTextField10.setText(rs.getString("LASTNAME"));
                jTextField12.setText(String.valueOf(rs.getLong("PHONENUMBER")));
                jTextField9.setText(rs.getString("EMAIL"));
                addNewCustomer=false;
            }
            catch(SQLException ex){
                addNewCustomer=true;
                CustomerID=Long.parseLong(jTextField3.getText());
                JOptionPane.showMessageDialog(null, "Record not found in this category of audience, Please fill in the details yourself", "Sorry", JOptionPane.INFORMATION_MESSAGE);
            }
            rs.close();
            stmt.close();
            searched=true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            long id= Long.parseLong(jTextField11.getText());
            String query = "SELECT * FROM APP.CUSTOMERS WHERE ID="+id+"AND TYPE="+customerType;
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery(query);
            rs.first();
            try{
                CustomerID = rs.getLong("ID");
                jTextField13.setText(rs.getString("FIRSTNAME"));
                jTextField15.setText(rs.getString("LASTNAME"));
                jTextField12.setText(String.valueOf(rs.getLong("PHONENUMBER")));
                jTextField16.setText(rs.getString("CHILDFIRSTNAME"));
                jTextField22.setText(rs.getString("GRADE"));
                jTextField23.setText(rs.getString("SECTION"));
                jTextField14.setText(rs.getString("EMAIL"));
                addNewCustomer=false;
            }
            catch(SQLException ex){
                addNewCustomer=true;
                CustomerID=Long.parseLong(jTextField11.getText());
                JOptionPane.showMessageDialog(null, "Record not found in this category of audience, Please fill in the details yourself", "Sorry", JOptionPane.INFORMATION_MESSAGE);
            }
            rs.close();
            stmt.close();
            searched=true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            long id= Long.parseLong(jOrgPhone.getText());
            String query = "SELECT * FROM APP.CUSTOMERS WHERE ID="+id+"AND TYPE="+customerType;
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery(query);
            rs.first();
            try{
                
                CustomerID = rs.getLong("ID");
                jOrgFName.setText(rs.getString("FIRSTNAME"));
                jOrgLName.setText(rs.getString("LASTNAME"));
                jOrgName.setText(rs.getString("ORGANIZATIONNAME"));
                jOrgEmail.setText(rs.getString("EMAIL"));
                addNewCustomer=false;
            }
            catch(SQLException ex){
                addNewCustomer=true;
                CustomerID=Long.parseLong(jOrgPhone.getText());
                JOptionPane.showMessageDialog(null, "Record not found in this category of audience, Please fill in the details yourself", "Sorry", JOptionPane.INFORMATION_MESSAGE);
            }
            rs.close();
            stmt.close();
            searched=true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            try (Statement accessadmin = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE)) {
                rs=accessadmin.executeQuery("SELECT * FROM APP.ADMIN_ACCOUNTS WHERE USERNAME='"+jusername.getText()+"'");
                rs.first();
                if (jpassword.getText().equals(rs.getString("PASSWORD"))){
                    String fullname = rs.getString("FIRST_NAME")+" "+rs.getString("LAST_NAME");
                    this.dispose();
                    AdminForm.dispose();
                    AdminMode Admin = new AdminMode(fullname);
                    Admin.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Password", "", JOptionPane.ERROR_MESSAGE);
                }
                rs.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Username not found", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
//            java.util.logging.Logger.getLogger(Consumer_Initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Consumer_Initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Consumer_Initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Consumer_Initial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new Consumer_Initial().setVisible(true);
//                } catch (SQLException ex) {
//                    Logger.getLogger(Consumer_Initial.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//    }
    
    void resetnewbooking() throws SQLException{
        //jeventsforbooking.removeAll();
        addNewCustomer=true;
        searched=false;
        newbooking.close();
        changeform(jForms,empty);
        CustomerType.clearSelection();
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jOrgPhone.setText("");
        jOrgFName.setText("");
        jOrgName.setText("");
        jOrgLName.setText("");
        jOrgEmail.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
    }
    void resermodifybooking(){
        jTextField24.setText("");
        jTextField25.setText("");
    }
    public void changeform(JPanel parent,JPanel child){
        parent.removeAll();
        parent.add(child);
        parent.validate();
        parent.repaint();
        parent.setVisible(true);
    }
    boolean cancelpressed(){
        int answer = JOptionPane.showConfirmDialog(null, "Are you sure you wish to cancel, all your changes will be aborted", "Alert", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        return answer==0;        
    }
    String upcomingevent(){
        String text; 
        try {
            text = "<html>";
            String query = "SELECT * FROM APP.EVENTS ORDER BY EVENT_DATE ASC";
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery(query);
            while (rs.next()){
                if(!today.after(rs.getDate("EVENT_DATE"))){
                    text += "<U>";
                    text += rs.getString("EVENT_NAME");
                    text += "</U>";
                    text += "&nbsp;&nbsp;&nbsp;ON&nbsp;&nbsp;&nbsp;";
                    text += "<U>";
                    text += dateformatter.format(rs.getDate("EVENT_DATE"));
                    text += "</U>";
                    text += "<br><br>";
                }
            }
            rs.close();
            stmt.close();
            text += "</html>";
        } catch (SQLException ex) {
            text = "NO UPCOMMING EVENTS";
        }
        return text;
    }
    void returntoconsumerhome(){
        changeform(ChangingPanel,HomeScreen);
        jlistUpcoming.setText(upcomingevent());
    }
    void addseatchoose(JPanel parent,int eventID) throws SQLException{
        seatchoose.refresh(eventID);
        parent.add(seatchoose);
        seatchoose.setBackground(parent.getBackground());        
    }
//    public ImageIcon ResizeImage(String ImagePath, JLabel label)
//    {
//        ImageIcon MyImage = new ImageIcon(ImagePath);
//        Image img = MyImage.getImage();
//        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon image = new ImageIcon(newImg);
//        return image;
//    }

    void fillevnetlist(JComboBox<String> combobox) throws SQLException{
        combobox.removeAllItems();
        combobox.addItem("Please Choose One....");
        String query = "SELECT EVENT_NAME,EVENT_DATE FROM APP.EVENTS";
        stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        rs=stmt.executeQuery(query);
        while (rs.next()){
            if(!today.after(rs.getDate("EVENT_DATE"))){
                combobox.addItem(rs.getString("EVENT_NAME"));
            }
        }
        rs.close();
        stmt.close();
    }
    
    static void sendEmail(String etext,String esubject, String email) throws MessagingException{
        try {
            String host ="smtp.gmail.com" ;
            String user = "pranavgmis@gmail.com";
            String pass = "adminaccess";
            String to = email;
            String from = "pranavgmis@gmail.com";
            String subject = esubject;
            String messageText = etext;
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);
            
            Transport transport=mailSession.getTransport("smtp");
            transport.connect(host, user, pass);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            System.out.println("message send successfully");
        } catch (AddressException ex) {
            Logger.getLogger(CustomerMode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDialog AdminForm;
    public javax.swing.JPanel ChangingPanel;
    public javax.swing.JPanel Conformation_Page;
    public javax.swing.JPanel CustomerHeader;
    public javax.swing.ButtonGroup CustomerType;
    public javax.swing.JPanel Group_seats;
    public javax.swing.JPanel Group_seats1;
    public javax.swing.JPanel HomeScreen;
    public javax.swing.JPanel Information_form;
    public javax.swing.JPanel OrganizationForm;
    public javax.swing.JPanel ParentForm;
    public javax.swing.JPanel RadioButtons;
    public javax.swing.JPanel Seats_selection;
    public javax.swing.JPanel Seats_selectionModify;
    public javax.swing.JPanel StudentForm;
    public javax.swing.JPanel TeacherForm;
    public javax.swing.JPanel empty;
    public javax.swing.JLabel j2step;
    public javax.swing.JButton jBack;
    public javax.swing.JButton jBack1;
    public javax.swing.JButton jBack10;
    public javax.swing.JButton jBack11;
    public javax.swing.JButton jBack12;
    public javax.swing.JButton jBack3;
    public javax.swing.JButton jBack4;
    public javax.swing.JButton jBack5;
    public javax.swing.JButton jBack6;
    public javax.swing.JButton jBack7;
    public javax.swing.JButton jBack8;
    public javax.swing.JButton jBack9;
    public javax.swing.JLabel jBookingId;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jConfirmBooking;
    public javax.swing.JPanel jConsumerModify;
    public javax.swing.JLabel jEventDate;
    public javax.swing.JTextArea jEventDescription;
    public javax.swing.JLabel jEventEnd;
    public javax.swing.JLabel jEventPoster;
    public javax.swing.JLabel jEventStart;
    public javax.swing.JLabel jEventTitle;
    public javax.swing.JPanel jForms;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel34;
    public javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel37;
    public javax.swing.JLabel jLabel38;
    public javax.swing.JLabel jLabel39;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel40;
    public javax.swing.JLabel jLabel41;
    public javax.swing.JLabel jLabel42;
    public javax.swing.JLabel jLabel43;
    public javax.swing.JLabel jLabel44;
    public javax.swing.JLabel jLabel45;
    public javax.swing.JLabel jLabel46;
    public javax.swing.JLabel jLabel47;
    public javax.swing.JLabel jLabel48;
    public javax.swing.JLabel jLabel49;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel50;
    public javax.swing.JLabel jLabel51;
    public javax.swing.JLabel jLabel53;
    public javax.swing.JLabel jLabel54;
    public javax.swing.JLabel jLabel55;
    public javax.swing.JLabel jLabel56;
    public javax.swing.JLabel jLabel57;
    public javax.swing.JLabel jLabel58;
    public javax.swing.JLabel jLabel59;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel60;
    public javax.swing.JLabel jLabel61;
    public javax.swing.JLabel jLabel62;
    public javax.swing.JLabel jLabel63;
    public javax.swing.JLabel jLabel64;
    public javax.swing.JLabel jLabel65;
    public javax.swing.JLabel jLabel66;
    public javax.swing.JLabel jLabel67;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel70;
    public javax.swing.JLabel jLabel71;
    public javax.swing.JLabel jLabel79;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel81;
    public javax.swing.JLabel jLabel82;
    public javax.swing.JLabel jLabel84;
    public javax.swing.JLabel jLabel86;
    public javax.swing.JLabel jLabel88;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jMainModify;
    public javax.swing.JButton jNewBooking;
    public javax.swing.JButton jNext;
    public javax.swing.JButton jNext1;
    public javax.swing.JButton jNext2;
    public javax.swing.JButton jNext3;
    public javax.swing.JTextField jOrgEmail;
    public javax.swing.JTextField jOrgFName;
    public javax.swing.JTextField jOrgLName;
    public javax.swing.JTextField jOrgName;
    public javax.swing.JTextField jOrgPhone;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel10;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    public javax.swing.JPanel jPanel8;
    public javax.swing.JPanel jPanel9;
    public javax.swing.JLabel jScreen;
    public javax.swing.JLabel jScreen1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel jSelectevent;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField10;
    public javax.swing.JTextField jTextField11;
    public javax.swing.JTextField jTextField12;
    public javax.swing.JTextField jTextField13;
    public javax.swing.JTextField jTextField14;
    public javax.swing.JTextField jTextField15;
    public javax.swing.JTextField jTextField16;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField22;
    public javax.swing.JTextField jTextField23;
    public javax.swing.JTextField jTextField24;
    public javax.swing.JTextField jTextField25;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTextField jTextField9;
    public javax.swing.JButton jclear;
    public javax.swing.JPanel jeventintroduction;
    public javax.swing.JComboBox<String> jeventsforbooking;
    public javax.swing.JLabel jlistUpcoming;
    public javax.swing.JButton jmodifyBooking;
    public javax.swing.JPasswordField jpassword;
    public javax.swing.JLabel jsearchresult;
    public javax.swing.JLabel jsearchresult1;
    public javax.swing.JLabel jsearchresult2;
    public javax.swing.JLabel jsearchresult3;
    public javax.swing.JLabel jupcoming;
    public javax.swing.JPanel jupcomingpanel;
    public javax.swing.JTextField jusername;
    public javax.swing.JLabel jwelcome;
    public javax.swing.JPanel notAllowed;
    public javax.swing.JRadioButton radmyp;
    public javax.swing.JRadioButton radorganization;
    public javax.swing.JRadioButton radparent;
    public javax.swing.JRadioButton radpyp;
    public javax.swing.JRadioButton radsenior;
    public javax.swing.JRadioButton radteacher;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    
}
