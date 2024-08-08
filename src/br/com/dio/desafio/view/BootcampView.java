package br.com.dio.desafio.view;

import br.com.dio.desafio.model.Bootcamp;
import br.com.dio.desafio.model.Dev;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BootcampView extends JFrame {
    private JTextField nomeDevField;
    private JButton inscreverButton;
    private JTextArea conteudosInscritosArea;
    private Bootcamp bootcamp;

    public BootcampView(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
        setTitle("Inscrição no Bootcamp");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel nomeDevLabel = new JLabel("Nome do Desenvolvedor:");
        nomeDevLabel.setBounds(10, 10, 100, 25);
        add(nomeDevLabel);

        nomeDevField = new JTextField();
        nomeDevField.setBounds(120, 10, 200, 25);
        add(nomeDevField);

        inscreverButton = new JButton("Inscrever");
        inscreverButton.setBounds(120, 50, 100, 25);
        add(inscreverButton);

        conteudosInscritosArea = new JTextArea();
        conteudosInscritosArea.setBounds(10, 90, 360, 150);
        conteudosInscritosArea.setLineWrap(true);
        conteudosInscritosArea.setWrapStyleWord(true);
        add(conteudosInscritosArea);

        JScrollPane scrollPane = new JScrollPane(conteudosInscritosArea);
        scrollPane.setBounds(10, 90, 360, 150);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        add(scrollPane);

        inscreverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeDev = nomeDevField.getText();
                Dev dev = new Dev();
                dev.setNome(nomeDev);
                dev.inscreverBootcamp(bootcamp);

                conteudosInscritosArea.setText("Nome " + nomeDev + ":\n" + dev.getConteudosInscritos());
            }
        });
    }
}
