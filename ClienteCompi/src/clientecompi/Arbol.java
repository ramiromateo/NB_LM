package clientecompi;


import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.awt.*;

public class Arbol extends JPanel {

    AreaArbol demoArea;
    JTextArea textArea;
    final static String newline = "\n";
    JsonObject json;

    public Arbol(TreeNode tree) {
        super(new GridBagLayout());
        GridBagLayout gridbag = (GridBagLayout) getLayout();
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.weightx = 1.0;
        c.weighty = 1.0;

        c.insets = new Insets(1, 1, 1, 1);
        demoArea = new AreaArbol(tree);
        gridbag.setConstraints(demoArea, c);
        add(demoArea);

        c.insets = new Insets(0, 0, 0, 0);
        setPreferredSize(new Dimension(450, 450));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mostrar();
    }

    public void mostrar() {
        JFrame ventana = new JFrame("TreeExpandEventDemo");
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JComponent newContentPane = this;
        newContentPane.setOpaque(true); //content panes must be opaque
        ventana.setContentPane(newContentPane);

        ventana.pack();
        ventana.setVisible(true);
    }

    class AreaArbol extends JScrollPane {

        Dimension minSize = new Dimension(100, 100);
        JTree tree;

        public AreaArbol(TreeNode root) {
            TreeNode rootNode = root;
            tree = new JTree(rootNode);

            setViewportView(tree);
        }

        private TreeNode createNodes() {
            DefaultMutableTreeNode root;
            DefaultMutableTreeNode grandparent;
            DefaultMutableTreeNode parent;
            DefaultMutableTreeNode child;

            root = new DefaultMutableTreeNode("San Francisco");

            grandparent = new DefaultMutableTreeNode("Potrero Hill");
            root.add(grandparent);
            //
            parent = new DefaultMutableTreeNode("Restaurants");
            grandparent.add(parent);
            child = new DefaultMutableTreeNode("Thai Barbeque");
            parent.add(child);
            child = new DefaultMutableTreeNode("Goat Hill Pizza");
            parent.add(child);
            //
            parent = new DefaultMutableTreeNode("Grocery Stores");
            grandparent.add(parent);
            child = new DefaultMutableTreeNode("Good Life Grocery");
            parent.add(child);
            child = new DefaultMutableTreeNode("Safeway");
            parent.add(child);

            grandparent = new DefaultMutableTreeNode("Noe Valley");
            root.add(grandparent);
            //
            parent = new DefaultMutableTreeNode("Restaurants");
            grandparent.add(parent);
            child = new DefaultMutableTreeNode("Hamano Sushi");
            parent.add(child);
            child = new DefaultMutableTreeNode("Hahn's Hibachi");
            parent.add(child);
            //
            parent = new DefaultMutableTreeNode("Grocery Stores");
            grandparent.add(parent);
            child = new DefaultMutableTreeNode("Real Foods");
            parent.add(child);
            child = new DefaultMutableTreeNode("Bell Market");
            parent.add(child);

            return root;
        }

        public Dimension getMinimumSize() {
            return minSize;
        }

        public Dimension getPreferredSize() {
            return minSize;
        }

    }

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event-dispatching thread.
     */
}
