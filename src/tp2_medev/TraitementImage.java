
package tp2_medev;

import java.io.*;


public class TraitementImage {


    public static void main(String[] args) {
        
    }
    
    public static void lecture(String fichier) {
        String chaine = "";
        try {
            InputStream ips = new FileInputStream(fichier);
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
                chaine += ligne + "\n";
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    
    
}
