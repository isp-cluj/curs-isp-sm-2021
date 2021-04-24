package isp.lab7.safehome;

public class SafeHome {

    public static void main(String[] args) {
        DoorLockController ctrl = new DoorLockController();
        
        SmartDoorUI ui = new SmartDoorUI(ctrl);
        ui.setVisible(true);
    }
}
