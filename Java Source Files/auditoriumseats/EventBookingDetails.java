
package auditoriumseats;
import static auditoriumseats.AuditoriumSeats.con;
import java.sql.*;
import javax.swing.JPanel;
public class EventBookingDetails extends JPanel {

    static ResultSet rs;
    static PreparedStatement pstmt;
    public EventBookingDetails() {
        initComponents();
        //this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jDatebeginning = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jDateending = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jPYP = new javax.swing.JCheckBox();
        jMYP = new javax.swing.JCheckBox();
        jSenior = new javax.swing.JCheckBox();
        jTeachers = new javax.swing.JCheckBox();
        jParents = new javax.swing.JCheckBox();
        jExternalOrg = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(0, 90, 90));
        setPreferredSize(new java.awt.Dimension(967, 426));

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BOOKING OPENS ON");

        jLabel12.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("AND CLOSES BY");

        jLabel13.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CATEGORY OF AUDIENCE ALLOWED");

        jPYP.setBackground(new java.awt.Color(0, 90, 90));
        jPYP.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPYP.setForeground(new java.awt.Color(255, 255, 255));
        jPYP.setText("PYP students");
        jPYP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPYPActionPerformed(evt);
            }
        });

        jMYP.setBackground(new java.awt.Color(0, 90, 90));
        jMYP.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jMYP.setForeground(new java.awt.Color(255, 255, 255));
        jMYP.setText("MYP students");
        jMYP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMYPActionPerformed(evt);
            }
        });

        jSenior.setBackground(new java.awt.Color(0, 90, 90));
        jSenior.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jSenior.setForeground(new java.awt.Color(255, 255, 255));
        jSenior.setText("Senior Students");
        jSenior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSeniorActionPerformed(evt);
            }
        });

        jTeachers.setBackground(new java.awt.Color(0, 90, 90));
        jTeachers.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTeachers.setForeground(new java.awt.Color(255, 255, 255));
        jTeachers.setText("Teachers");
        jTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeachersActionPerformed(evt);
            }
        });

        jParents.setBackground(new java.awt.Color(0, 90, 90));
        jParents.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jParents.setForeground(new java.awt.Color(255, 255, 255));
        jParents.setText("Parents");
        jParents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jParentsActionPerformed(evt);
            }
        });

        jExternalOrg.setBackground(new java.awt.Color(0, 90, 90));
        jExternalOrg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jExternalOrg.setForeground(new java.awt.Color(255, 255, 255));
        jExternalOrg.setText("External Organization");
        jExternalOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExternalOrgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDatebeginning, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateending, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPYP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTeachers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jParents, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(jMYP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jExternalOrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSenior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateending, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDatebeginning, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPYP)
                    .addComponent(jMYP)
                    .addComponent(jSenior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jExternalOrg)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTeachers)
                        .addComponent(jParents)))
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    void refresh(int eventid) throws SQLException{
        resetall();
        fetchbookingdetails(eventid);
    }
    
    void fetchbookingdetails(int eventid) throws SQLException{
        try{
            String query = "SELECT * FROM APP.EVENTS WHERE EVENTID=?";
            pstmt=con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            pstmt.setInt(1,eventid);
            rs=pstmt.executeQuery();
            rs.next();
            if(rs.getBoolean("PYP")){
                jPYP.setSelected(true);
            }
            if(rs.getBoolean("MYP")){
                jMYP.setSelected(true);
            }
            if(rs.getBoolean("SENIOR")){
                jSenior.setSelected(true);
            }
            if(rs.getBoolean("TEACHERS")){
                jTeachers.setSelected(true);
            }
            if(rs.getBoolean("PARENTS")){
                jParents.setSelected(true);
            }
            if(rs.getBoolean("EXTERNALORG")){
                jExternalOrg.setSelected(true);
            }
            jDatebeginning.setDate(rs.getDate("BOOKING_START"));
            jDateending.setDate(rs.getDate("BOOKING_END"));
            jDateending.setMaxSelectableDate(rs.getDate("EVENT_DATE"));
            
            rs.close();
        }
        catch(NullPointerException e){
            
        }
    }
    
    void resetall(){
        jPYP.setSelected(false);
        jMYP.setSelected(false);
        jSenior.setSelected(false);
        jTeachers.setSelected(false);
        jParents.setSelected(false);
        jExternalOrg.setSelected(false);
    }
    
    private void jPYPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPYPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPYPActionPerformed

    private void jMYPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMYPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMYPActionPerformed

    private void jSeniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSeniorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSeniorActionPerformed

    private void jTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeachersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeachersActionPerformed

    private void jParentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jParentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jParentsActionPerformed

    private void jExternalOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExternalOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jExternalOrgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser jDatebeginning;
    public com.toedter.calendar.JDateChooser jDateending;
    public javax.swing.JCheckBox jExternalOrg;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JCheckBox jMYP;
    public javax.swing.JCheckBox jPYP;
    public javax.swing.JCheckBox jParents;
    public javax.swing.JCheckBox jSenior;
    public javax.swing.JCheckBox jTeachers;
    // End of variables declaration//GEN-END:variables
}
