package compi1.pro_1servidor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;


public class CampoTexto extends JScrollPane {

    private JPanel panelPrincipal;
    private JTextPane texto;
    private JTextArea contadorLineas;

    public CampoTexto(JPanel panelPrincipal,String contenido) {
        super(panelPrincipal, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.panelPrincipal = panelPrincipal;
        this.panelPrincipal.setLayout(new BorderLayout());
        this.setBounds(0, 0, 778, 414);
        generarArea(contenido);
    }

    private void generarArea(String contenido) {
        texto = new JTextPane();
        texto.setText(contenido);
        texto.setFont(new Font("Arial", 0, 14));
        contadorLineas = new JTextArea(1, 1);
        contadorLineas.setEditable(false);
        contadorLineas.setFont(new Font("Arial", 0, 14));
        contadorLineas.setBackground(Color.LIGHT_GRAY);
        contadorLineas.setText("1");
        texto.getDocument().addDocumentListener(documentoEscuchador());
        getPanelPrincipal().add(contadorLineas, BorderLayout.WEST);
        getPanelPrincipal().add(texto, BorderLayout.CENTER);
    }

    public String rellenarNumeroLineas() {
        int caretPossition = texto.getDocument().getLength();
        Element root = (Element) texto.getDocument().getDefaultRootElement();
        String filasC = "1" + System.getProperty("line.separator");
        int a;
        for (a = 2; a <= root.getElementIndex(caretPossition) + 1; a++) {
            filasC += a + "\n";
        }
        return filasC;
    }

    private DocumentListener documentoEscuchador() {
        DocumentListener listener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                contadorLineas.setText(rellenarNumeroLineas());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                contadorLineas.setText(rellenarNumeroLineas());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                contadorLineas.setText(rellenarNumeroLineas());
            }

        };
        return listener;
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public JTextPane getTexto() {
        return texto;
    }

    public void setTexto(JTextPane texto) {
        this.texto = texto;
    }
    public void setTexto(String texto) {
        this.texto.setText(texto);
    }

}
