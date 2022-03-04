package gui;

public class AppMemoire {
    public static void main(String[] args) {
       // ControleurMemoire.bienvenu();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleurMemoire();
            }
        });
    }
}
