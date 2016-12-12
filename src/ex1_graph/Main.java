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
            Graph graph1 = new Graph("G2000.txt");
            System.out.println("test 1");
            Test test1 = new Test("test2000.txt", graph1);
         
        } catch (IOException ex) {
            Logger.getLogger(Graph.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
