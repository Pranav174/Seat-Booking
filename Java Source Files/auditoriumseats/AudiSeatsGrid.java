package auditoriumseats;
import static auditoriumseats.AuditoriumSeats.con;
import java.sql.*;
import javax.swing.JPanel;
public class AudiSeatsGrid extends JPanel {
    static Seat A1,A2,A3,A4,A5,A6,A7,A8,B1,B2,B3,B4,B5,B6,B7,B8,C1,C2,C3,C4,C5,C6,C7,C8,D1,D2,D3,D4,D5,D6,D7,D8,E1,E2,E3,E4,E5,E6,E7,E8;
    public static Seat[][] seatmatrix;
    static ResultSet rs;
    static PreparedStatement pstmt;
    static int maxNumberOfSeats, numberselected;
    public AudiSeatsGrid() throws SQLException {
        initComponents();
        numberselected=0;
        A1 = new Seat("A1",jA1);
        A2 = new Seat("A2",jA2);
        A6 = new Seat("A6",jA6);
        A3 = new Seat("A3",jA3);
        A4 = new Seat("A4",jA4);
        A5 = new Seat("A5",jA5);
        A7 = new Seat("A7",jA7);
        A8 = new Seat("A8",jA8);
        B1 = new Seat("B1",jB1);
        B2 = new Seat("B2",jB2);
        B6 = new Seat("B6",jB6);
        B3 = new Seat("B3",jB3);
        B4 = new Seat("B4",jB4);
        B5 = new Seat("B5",jB5);
        B7 = new Seat("B7",jB7);
        B8 = new Seat("B8",jB8);
        C1 = new Seat("C1",jC1);
        C2 = new Seat("C2",jC2);
        C6 = new Seat("C6",jC6);
        C3 = new Seat("C3",jC3);
        C4 = new Seat("C4",jC4);
        C5 = new Seat("C5",jC5);
        C7 = new Seat("C7",jC7);
        C8 = new Seat("C8",jC8);
        D1 = new Seat("D1",jD1);
        D2 = new Seat("D2",jD2);
        D6 = new Seat("D6",jD6);
        D3 = new Seat("D3",jD3);
        D4 = new Seat("D4",jD4);
        D5 = new Seat("D5",jD5);
        D7 = new Seat("D7",jD7);
        D8 = new Seat("D8",jD8);
        E1 = new Seat("E1",jE1);
        E2 = new Seat("E2",jE2);
        E6 = new Seat("E6",jE6);
        E3 = new Seat("E3",jE3);
        E4 = new Seat("E4",jE4);
        E5 = new Seat("E5",jE5);
        E7 = new Seat("E7",jE7);
        E8 = new Seat("E8",jE8);
        seatmatrix=new Seat[][]{{A1,A2,A3,A4,A5,A6,A7,A8},{B1,B2,B3,B4,B5,B6,B7,B8},{C1,C2,C3,C4,C5,C6,C7,C8},{D1,D2,D3,D4,D5,D6,D7,D8},{E1,E2,E3,E4,E5,E6,E7,E8}};       
        //dbconnect();   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jA1 = new javax.swing.JLabel();
        jA2 = new javax.swing.JLabel();
        jA3 = new javax.swing.JLabel();
        jA4 = new javax.swing.JLabel();
        jA5 = new javax.swing.JLabel();
        jA6 = new javax.swing.JLabel();
        jA7 = new javax.swing.JLabel();
        jA8 = new javax.swing.JLabel();
        jB1 = new javax.swing.JLabel();
        jB2 = new javax.swing.JLabel();
        jB3 = new javax.swing.JLabel();
        jB4 = new javax.swing.JLabel();
        jB5 = new javax.swing.JLabel();
        jB6 = new javax.swing.JLabel();
        jB7 = new javax.swing.JLabel();
        jB8 = new javax.swing.JLabel();
        jC1 = new javax.swing.JLabel();
        jC2 = new javax.swing.JLabel();
        jC3 = new javax.swing.JLabel();
        jC4 = new javax.swing.JLabel();
        jC5 = new javax.swing.JLabel();
        jC6 = new javax.swing.JLabel();
        jC7 = new javax.swing.JLabel();
        jC8 = new javax.swing.JLabel();
        jD1 = new javax.swing.JLabel();
        jD2 = new javax.swing.JLabel();
        jD3 = new javax.swing.JLabel();
        jD4 = new javax.swing.JLabel();
        jD5 = new javax.swing.JLabel();
        jD6 = new javax.swing.JLabel();
        jD7 = new javax.swing.JLabel();
        jD8 = new javax.swing.JLabel();
        jE1 = new javax.swing.JLabel();
        jE2 = new javax.swing.JLabel();
        jE3 = new javax.swing.JLabel();
        jE4 = new javax.swing.JLabel();
        jE5 = new javax.swing.JLabel();
        jE6 = new javax.swing.JLabel();
        jE7 = new javax.swing.JLabel();
        jE8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        jA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jA1MouseClicked(evt);
            }
        });

        jA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jA2MouseClicked(evt);
            }
        });

        jA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jA3MouseClicked(evt);
            }
        });

        jA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jA4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jA4MouseClicked(evt);
            }
        });

        jA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jA5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jA5MouseClicked(evt);
            }
        });

        jA6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jA6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jA6MouseClicked(evt);
            }
        });

        jA7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jA7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jA7MouseClicked(evt);
            }
        });

        jA8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jA8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jA8MouseClicked(evt);
            }
        });

        jB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB1MouseClicked(evt);
            }
        });

        jB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB2MouseClicked(evt);
            }
        });

        jB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB3MouseClicked(evt);
            }
        });

        jB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jB4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB4MouseClicked(evt);
            }
        });

        jB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jB5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB5MouseClicked(evt);
            }
        });

        jB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jB6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB6MouseClicked(evt);
            }
        });

        jB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jB7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB7MouseClicked(evt);
            }
        });

        jB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jB8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB8MouseClicked(evt);
            }
        });

        jC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jC1MouseClicked(evt);
            }
        });

        jC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jC2MouseClicked(evt);
            }
        });

        jC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jC3MouseClicked(evt);
            }
        });

        jC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jC4MouseClicked(evt);
            }
        });

        jC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jC5MouseClicked(evt);
            }
        });

        jC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jC6MouseClicked(evt);
            }
        });

        jC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jC7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jC7MouseClicked(evt);
            }
        });

        jC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jC8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jC8MouseClicked(evt);
            }
        });

        jD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jD1MouseClicked(evt);
            }
        });

        jD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jD2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jD2MouseClicked(evt);
            }
        });

        jD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jD3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jD3MouseClicked(evt);
            }
        });

        jD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jD4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jD4MouseClicked(evt);
            }
        });

        jD5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jD5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jD5MouseClicked(evt);
            }
        });

        jD6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jD6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jD6MouseClicked(evt);
            }
        });

        jD7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jD7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jD7MouseClicked(evt);
            }
        });

        jD8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jD8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jD8MouseClicked(evt);
            }
        });

        jE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jE1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jE1MouseClicked(evt);
            }
        });

        jE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jE2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jE2MouseClicked(evt);
            }
        });

        jE3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jE3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jE3MouseClicked(evt);
            }
        });

        jE4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jE4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jE4MouseClicked(evt);
            }
        });

        jE5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jE5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jE5MouseClicked(evt);
            }
        });

        jE6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jE6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jE6MouseClicked(evt);
            }
        });

        jE7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jE7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jE7MouseClicked(evt);
            }
        });

        jE8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/White_chair.png"))); // NOI18N
        jE8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jE8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jD1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jD2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jA1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jA2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jE1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jE2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jC2)))
                .addGap(100, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jA3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jA4)
                        .addGap(18, 18, 18)
                        .addComponent(jA5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jA6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(jA7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jA8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jC3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jC4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jB4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jB6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jB7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jB8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jC5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jC6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jE3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jE4)
                        .addGap(18, 18, 18)
                        .addComponent(jE6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jE5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jE7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jE8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jD3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jD4)
                        .addGap(18, 18, 18)
                        .addComponent(jD5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jD6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jC7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jC8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jD7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jD8)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jA1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jA7)
                                .addComponent(jA6)
                                .addComponent(jA8)
                                .addComponent(jA5)
                                .addComponent(jA4))
                            .addComponent(jA2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jA3, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB1)
                            .addComponent(jB2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jC2)
                            .addComponent(jC1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB3)
                            .addComponent(jB5)
                            .addComponent(jB6)
                            .addComponent(jB7)
                            .addComponent(jB8)
                            .addComponent(jB4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jC4)
                            .addComponent(jC3)
                            .addComponent(jC6)
                            .addComponent(jC5)
                            .addComponent(jC8)
                            .addComponent(jC7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jD5)
                            .addComponent(jD6)
                            .addComponent(jD7)
                            .addComponent(jD8)
                            .addComponent(jD4)
                            .addComponent(jD3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jE5)
                            .addComponent(jE6)
                            .addComponent(jE4)
                            .addComponent(jE3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jE8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jE7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jD1)
                            .addComponent(jD2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jE2)
                            .addComponent(jE1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 
    
    void refresh(int eventid) throws SQLException{
        numberselected=0;
        resetall();
        fetchbooked(eventid);
        fetchreserved(eventid);
    }
    void refresh(int eventid,long customerId) throws SQLException{
        numberselected=0;
        resetall();
        fetchbooked(eventid,customerId);
        fetchreserved(eventid);
    }
    int getnumberselected(){
        return numberselected;
    }
    String getselectedstring(){
        String result="";
        boolean first=true;
        for (int i=0; i<5;i++){
            for (int j=0; j<8;j++){
                if(seatmatrix[i][j].seatSelected){
                    if(first){
                        result=seatmatrix[i][j].name;
                        first=false;
                    }
                    else{
                        result=result+","+seatmatrix[i][j].name;
                    }
                }
            }
        }
        return result;
    }
    
    void fetchbooked(int eventid) throws SQLException{
        try{
            String query = "SELECT SEAT_NUMBER FROM APP.CURRENTBOOKINGS WHERE EVENTID=?";
            pstmt=con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            pstmt.setInt(1,eventid);
            rs=pstmt.executeQuery();
            while (rs.next()){
                String seatNumber =rs.getString("SEAT_NUMBER");
                String[] seats = seatNumber.split(",");
                char row;
                int i=0,j;
                for (int index=0;index<seats.length;index++){
                    seats[index] = seats[index].replaceAll("\\s","");
                    row = seats[index].charAt(0);
                    switch (row){
                        case 'A':
                            i=0;
                            break;
                        case 'B':
                            i=1;
                            break;
                        case 'C':
                            i=2;
                            break;
                        case 'D':
                            i=3;
                            break;
                        case 'E':
                            i=4;
                            break;
                    }
                    j=Character.getNumericValue(seats[index].charAt(1))-1;
                    seatmatrix[i][j].booked();
                }
            }
            rs.close();
        }
        catch(NullPointerException e){
            
        }
    }
    
    void fetchbooked(int eventid, long customerId) throws SQLException{
        try{
            String query = "SELECT SEAT_NUMBER, CUSTOMERID FROM APP.CURRENTBOOKINGS WHERE EVENTID=?";
            pstmt=con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            pstmt.setInt(1,eventid);
            rs=pstmt.executeQuery();
            while (rs.next()){
                String seatNumber =rs.getString("SEAT_NUMBER");
                String[] seats = seatNumber.split(",");
                char row;
                int i=0,j;
                for (int index=0;index<seats.length;index++){
                    seats[index] = seats[index].replaceAll("\\s","");
                    row = seats[index].charAt(0);
                    switch (row){
                        case 'A':
                            i=0;
                            break;
                        case 'B':
                            i=1;
                            break;
                        case 'C':
                            i=2;
                            break;
                        case 'D':
                            i=3;
                            break;
                        case 'E':
                            i=4;
                            break;
                    }
                    j=Character.getNumericValue(seats[index].charAt(1))-1;
                    if (customerId == rs.getLong("CUSTOMERID")){
                        seatmatrix[i][j].clicked();
                    }
                    else{
                        seatmatrix[i][j].booked();
                    }
                    
                }
            }
            rs.close();
        }
        catch(NullPointerException e){
            
        }
    }
    void fetchreserved(int eventid) throws SQLException{
        try{
            String query = "SELECT RESERVED_SEATS FROM APP.EVENTS WHERE EVENTID=?";
            pstmt=con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            pstmt.setInt(1,eventid);
            rs=pstmt.executeQuery();
            while (rs.next()){
                String seatNumber =rs.getString("RESERVED_SEATS");
                String[] seats = seatNumber.split(",");
                char row;
                int i=0,j;
                for (int index=0;index<seats.length;index++){
                    seats[index] = seats[index].replaceAll("\\s","");
                    row = seats[index].charAt(0);
                    switch (row){
                        case 'A':
                            i=0;
                            break;
                        case 'B':
                            i=1;
                            break;
                        case 'C':
                            i=2;
                            break;
                        case 'D':
                            i=3;
                            break;
                        case 'E':
                            i=4;
                            break;
                    }
                    j=Character.getNumericValue(seats[index].charAt(1))-1;
                    seatmatrix[i][j].reserved();
                }
            }
            rs.close();
        }
        catch(NullPointerException e){
            
        }
    }
    
    void resetall(){
        for (int i=0; i<5;i++){
            for (int j=0; j<8;j++){
                seatmatrix[i][j].reset();
            }
        }
    }
    private void jA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jA1MouseClicked
        A1.clicked();           
    }//GEN-LAST:event_jA1MouseClicked

    private void jA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jA2MouseClicked
        A2.clicked();
    }//GEN-LAST:event_jA2MouseClicked

    private void jA3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jA3MouseClicked
        A3.clicked();
    }//GEN-LAST:event_jA3MouseClicked

    private void jA4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jA4MouseClicked
        A4.clicked();
    }//GEN-LAST:event_jA4MouseClicked

    private void jA5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jA5MouseClicked
        A5.clicked();
    }//GEN-LAST:event_jA5MouseClicked

    private void jA6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jA6MouseClicked
        A6.clicked();
    }//GEN-LAST:event_jA6MouseClicked

    private void jA7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jA7MouseClicked
        A7.clicked();
    }//GEN-LAST:event_jA7MouseClicked

    private void jA8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jA8MouseClicked
        A8.clicked();
    }//GEN-LAST:event_jA8MouseClicked

    private void jB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB1MouseClicked
        B1.clicked();
    }//GEN-LAST:event_jB1MouseClicked

    private void jB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB2MouseClicked
        B2.clicked();
    }//GEN-LAST:event_jB2MouseClicked

    private void jB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB3MouseClicked
        B3.clicked();
    }//GEN-LAST:event_jB3MouseClicked

    private void jB4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB4MouseClicked
        B4.clicked();
    }//GEN-LAST:event_jB4MouseClicked

    private void jB5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB5MouseClicked
        B5.clicked();
    }//GEN-LAST:event_jB5MouseClicked

    private void jB6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB6MouseClicked
        B6.clicked();
    }//GEN-LAST:event_jB6MouseClicked

    private void jB7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB7MouseClicked
        B7.clicked();
    }//GEN-LAST:event_jB7MouseClicked

    private void jB8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB8MouseClicked
        B8.clicked();
    }//GEN-LAST:event_jB8MouseClicked

    private void jC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jC1MouseClicked
        C1.clicked();
    }//GEN-LAST:event_jC1MouseClicked

    private void jC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jC2MouseClicked
        C2.clicked();
    }//GEN-LAST:event_jC2MouseClicked

    private void jC3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jC3MouseClicked
        C3.clicked();
    }//GEN-LAST:event_jC3MouseClicked

    private void jC4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jC4MouseClicked
        C4.clicked();
    }//GEN-LAST:event_jC4MouseClicked

    private void jC5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jC5MouseClicked
        C5.clicked();
    }//GEN-LAST:event_jC5MouseClicked

    private void jC6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jC6MouseClicked
        C6.clicked();
    }//GEN-LAST:event_jC6MouseClicked

    private void jC7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jC7MouseClicked
        C7.clicked();
    }//GEN-LAST:event_jC7MouseClicked

    private void jC8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jC8MouseClicked
        C8.clicked();
    }//GEN-LAST:event_jC8MouseClicked

    private void jD1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jD1MouseClicked
        D1.clicked();
    }//GEN-LAST:event_jD1MouseClicked

    private void jD2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jD2MouseClicked
        D2.clicked();
    }//GEN-LAST:event_jD2MouseClicked

    private void jD3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jD3MouseClicked
        D3.clicked();
    }//GEN-LAST:event_jD3MouseClicked

    private void jD4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jD4MouseClicked
        D4.clicked();
    }//GEN-LAST:event_jD4MouseClicked

    private void jD5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jD5MouseClicked
        D5.clicked();
    }//GEN-LAST:event_jD5MouseClicked

    private void jD6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jD6MouseClicked
        D6.clicked();
    }//GEN-LAST:event_jD6MouseClicked

    private void jD7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jD7MouseClicked
        D7.clicked();
    }//GEN-LAST:event_jD7MouseClicked

    private void jD8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jD8MouseClicked
        D8.clicked();
    }//GEN-LAST:event_jD8MouseClicked

    private void jE1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jE1MouseClicked
        E1.clicked();
    }//GEN-LAST:event_jE1MouseClicked

    private void jE2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jE2MouseClicked
        E2.clicked();
    }//GEN-LAST:event_jE2MouseClicked

    private void jE3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jE3MouseClicked
        E3.clicked();
    }//GEN-LAST:event_jE3MouseClicked

    private void jE4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jE4MouseClicked
        E4.clicked();
    }//GEN-LAST:event_jE4MouseClicked

    private void jE5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jE5MouseClicked
        E5.clicked();
    }//GEN-LAST:event_jE5MouseClicked

    private void jE6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jE6MouseClicked
        E6.clicked();
    }//GEN-LAST:event_jE6MouseClicked

    private void jE7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jE7MouseClicked
        E7.clicked();
    }//GEN-LAST:event_jE7MouseClicked

    private void jE8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jE8MouseClicked
        E8.clicked();
    }//GEN-LAST:event_jE8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jA1;
    private javax.swing.JLabel jA2;
    private javax.swing.JLabel jA3;
    private javax.swing.JLabel jA4;
    private javax.swing.JLabel jA5;
    private javax.swing.JLabel jA6;
    private javax.swing.JLabel jA7;
    private javax.swing.JLabel jA8;
    private javax.swing.JLabel jB1;
    private javax.swing.JLabel jB2;
    private javax.swing.JLabel jB3;
    private javax.swing.JLabel jB4;
    private javax.swing.JLabel jB5;
    private javax.swing.JLabel jB6;
    private javax.swing.JLabel jB7;
    private javax.swing.JLabel jB8;
    private javax.swing.JLabel jC1;
    private javax.swing.JLabel jC2;
    private javax.swing.JLabel jC3;
    private javax.swing.JLabel jC4;
    private javax.swing.JLabel jC5;
    private javax.swing.JLabel jC6;
    private javax.swing.JLabel jC7;
    private javax.swing.JLabel jC8;
    private javax.swing.JLabel jD1;
    private javax.swing.JLabel jD2;
    private javax.swing.JLabel jD3;
    private javax.swing.JLabel jD4;
    private javax.swing.JLabel jD5;
    private javax.swing.JLabel jD6;
    private javax.swing.JLabel jD7;
    private javax.swing.JLabel jD8;
    private javax.swing.JLabel jE1;
    private javax.swing.JLabel jE2;
    private javax.swing.JLabel jE3;
    private javax.swing.JLabel jE4;
    private javax.swing.JLabel jE5;
    private javax.swing.JLabel jE6;
    private javax.swing.JLabel jE7;
    private javax.swing.JLabel jE8;
    // End of variables declaration//GEN-END:variables
}
