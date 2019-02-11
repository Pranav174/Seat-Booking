package auditoriumseats;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Seat {
    boolean seatSelected;
    boolean booked;
    boolean reserved;
    static boolean configureForAdmin;
    JLabel seatimage; 
    String name;
    
    Seat (String position,JLabel label){
        name=position;
        seatimage=label;
        seatSelected=false;
        booked=false;
        reserved=false;
        configureForAdmin=true;
    }
    void clicked(){
        if (configureForAdmin){
            if (!booked){
                if (!seatSelected){
                    seatimage.setIcon(new ImageIcon(getClass().getResource("/Images/Reserved_chair.png")));
                    seatSelected = true;
                }
                else{
                    seatimage.setIcon(new ImageIcon(getClass().getResource("/Images/White_chair.png")));
                    seatSelected = false;
                }
            }
        }
        else{
            if (!booked&&!reserved){
                if (!seatSelected){
                    if(AudiSeatsGrid.numberselected<AudiSeatsGrid.maxNumberOfSeats){
                        seatimage.setIcon(new ImageIcon(getClass().getResource("/Images/Yellow_chair.png")));
                        seatSelected = true;
                        AudiSeatsGrid.numberselected++;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "You can only book "+AudiSeatsGrid.maxNumberOfSeats+" seats", "LIMIT REACHED", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    seatimage.setIcon(new ImageIcon(getClass().getResource("/Images/White_chair.png")));
                    seatSelected = false;
                    AudiSeatsGrid.numberselected--;
                }
            }
        }
        
    }
    void booked(){
        seatimage.setIcon(new ImageIcon(getClass().getResource("/Images/Grey_chair.png")));
        booked=true;
    }
    void reserved(){
        seatimage.setIcon(new ImageIcon(getClass().getResource("/Images/Reserved_chair.png")));
        if (configureForAdmin){
            seatSelected = true;
        }
        reserved=true;
    }
    void reset(){
        seatimage.setIcon(new ImageIcon(getClass().getResource("/Images/White_chair.png")));
        booked=false;
        reserved=false;
        seatSelected = false;
    }
}
