package topensa;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxScheme;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rtextarea.RTextScrollPane;


public class CampoTexto extends JPanel {

    private RSyntaxTextArea areaTexto;
    private RTextScrollPane scrollTexto;
    private boolean guardado;
    private String path;
    boolean tipo;

    public CampoTexto(boolean bo) {
        super(new GridLayout());
        iniciarAjustes(bo);
        iniciarColores();
    }

    private void iniciarColores() {
        SyntaxScheme scheme = areaTexto.getSyntaxScheme();
        scheme.getStyle(Token.RESERVED_WORD).foreground = Color.BLUE;
        scheme.getStyle(Token.LITERAL_STRING_DOUBLE_QUOTE).foreground = Color.ORANGE;
        scheme.getStyle(Token.IDENTIFIER).foreground = Color.BLACK;
        scheme.getStyle(Token.DATA_TYPE).foreground = Color.BLACK;
        scheme.getStyle(Token.COMMENT_EOL).foreground = Color.GRAY;
        scheme.getStyle(Token.LITERAL_CHAR).foreground = Color.ORANGE;
        scheme.getStyle(Token.COMMENT_MULTILINE).foreground = Color.GRAY;
        scheme.getStyle(Token.SEPARATOR).foreground = Color.black;
        scheme.getStyle(Token.OPERATOR).foreground = Color.black;
        scheme.getStyle(Token.FUNCTION).foreground = Color.black;
    }

    private void iniciarAjustes(boolean bo) {
        AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory) TokenMakerFactory.getDefaultInstance();
        
            atmf.putMapping("text", "Analizador.SintaxisDracoScript");
        
        areaTexto = new RSyntaxTextArea(20, 60);
        areaTexto.setSyntaxEditingStyle("text");
        areaTexto.setCodeFoldingEnabled(true);
        areaTexto.setCurrentLineHighlightColor(new Color(227, 242, 253, 200));
        areaTexto.setFadeCurrentLineHighlight(true);
        areaTexto.setBorder(BorderFactory.createEmptyBorder());
        areaTexto.setFont(new Font("Consolas", 0, 15));
        scrollTexto = new RTextScrollPane(areaTexto);
        scrollTexto.setViewportBorder(BorderFactory.createEmptyBorder());
        this.add(scrollTexto);
    }

    public String getTexto() {
        return areaTexto.getText();
    }

    public void setTexto(String texto) {
        areaTexto.setText(texto);
    }

    /**
     * @return the guardado
     */
    public boolean isGuardado() {
        return guardado;
    }

    /**
     * @param guardado the guardado to set
     */
    public void setGuardado(boolean guardado) {
        this.guardado = guardado;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the areaTexto
     */
    public RSyntaxTextArea getAreaTexto() {
        return areaTexto;
    }

    /**
     * @param areaTexto the areaTexto to set
     */
    public void setAreaTexto(RSyntaxTextArea areaTexto) {
        this.areaTexto = areaTexto;
    }

    
}
