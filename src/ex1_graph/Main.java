package ex1_graph;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Graph g1 = new Graph("G2000.txt");
           // Graph g2 = new Graph("G101.txt");
            System.out.println("test 1");
            Test t1 = new Test("test2000.txt", g1);
           // System.out.println("test 2");
           // Test t2 = new Test("test101.txt", g2);
        } catch (IOException ex) {
            Logger.getLogger(Graph.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
