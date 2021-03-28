import javax.swing.*;


public class Main {
    public class  Janela  extends JFrame{
        public Janela(){

            setTitle("Compilador");
            setSize(500,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);

        }

    }
    public static void main(String[] args) {
        Janela janela = new Janela();
    }
}
