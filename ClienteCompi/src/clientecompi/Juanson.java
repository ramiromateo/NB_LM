package clientecompi;


import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 *
 * @author sebas
 */
public class Juanson {

    private boolean vacio;
    private JsonObject raiz;

    public Juanson() {
        vacio = true;
        raiz = new JsonObject();
    }

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public JsonObject getRaiz() {
        return raiz;
    }

    public void setRaiz(JsonObject raiz) {
        this.raiz = raiz;
    }

    

    

    public TreeNode getArbol() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Arbol");
        DefaultMutableTreeNode score = new DefaultMutableTreeNode("Score");
    
        root.add(score);
    
        String[] clasi = {"Clases", "Variables", "Metodos", "Comentarios"};
        int i, j;
        for(i = 0; i < clasi.length; i++){
            DefaultMutableTreeNode clasificacion = new DefaultMutableTreeNode(clasi[i]);
            
            root.add(clasificacion);
        }
        return root;
    }
    
    

}
