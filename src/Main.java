import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {

            JFrame janela= new JFrame("Compilador");
            JPanel painelCodigo = new JPanel();
            JTextArea texto= new JTextArea();
            JTextArea Paineltexto= new JTextArea();

            painelCodigo.setLayout(null);

            JButton gerar= new JButton("Depurar");
            JButton retornar = new JButton("Voltar");
            JButton apagar= new JButton("Apagar");



            //Painel


            painelCodigo.setBackground( Color.BLACK );
            janela.add(painelCodigo);

            //Botoes
            painelCodigo.add(gerar);
            painelCodigo.add(retornar);
            painelCodigo.add(apagar);
            gerar.setBounds(875,20,80,60);
            retornar.setBounds(875,100,80,60);
            apagar.setBounds(875,180,80,60);


            //Texto
            painelCodigo.add(texto);
            painelCodigo.add(Paineltexto);
            texto.setBounds(10,10,850,600);
            Paineltexto.setBounds(10,680,950,300);

            //Tela principal
            janela.setBounds(150,35,1000,1050);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setLocationRelativeTo(null);

            janela.setVisible(true);



    }
}
