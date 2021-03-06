package ex1_graph;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Test {

    private String filename;
    private Graph graph;
    
    public Test(String name_of_file,Graph g) {
        filename = name_of_file;
        graph = g;
        runExec();
    }

    public void runExec() {
        BufferedReader execFile = fileIn(filename);
        String line;
        StringTokenizer st;
        int v1, v2, BL_Number, num_of_queries;
        int[] BLArr;

        try {
            line = execFile.readLine();
            st = new StringTokenizer(line);

            num_of_queries = Integer.parseInt(st.nextToken());

            for (int i = 0; i < num_of_queries - 1; i++) {
                line = execFile.readLine();
                st = new StringTokenizer(line,", ");
                v1 = Integer.parseInt(st.nextToken());
                v2 = Integer.parseInt(st.nextToken());
                BL_Number = Integer.parseInt(st.nextToken());
                BLArr = new int[BL_Number];
               
                for (int j = 0; j < BLArr.length; j++) {
                    BLArr[j] = Integer.parseInt(st.nextToken());
                }
                System.out.println(v1+" "+v2+" "+BL_Number+" "+Arrays.toString(BLArr)+ " " +graph.dijkstra.getShortestPathWithBL(v1, v2, BLArr));
            }
            graph.endRunFile();
            System.out.println("Graph: |V|="+graph.getvertex()+", |E|="+graph.getEdges()+", "+graph.dijkstra.isTriangle_inequality() +", Radius: "+graph.dijkstra.getRadius()+", Diameter: "+graph.dijkstra.getDiameter()+", runtime: "+graph.runTime()+" ms");

        } catch (IOException ex) {
            Logger.getLogger(Graph_algo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private BufferedReader fileIn(String file) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException fnf) {
            System.out.println("File " + file + " not found.\n");
        } catch (IOException io) {
            System.out.println("File " + file + " has I/O problems.\n");
        }

        return br;
    }
}
