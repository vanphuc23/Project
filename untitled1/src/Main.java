import javax.swing.*;

class Test {

    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Erase your hard disk? ");
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Disk erased");
        } else {
            JOptionPane.showMessageDialog(null, "Cancelled");
        }
    }
}