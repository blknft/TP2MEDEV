
package tp2_medev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Khalil
 */
public class PGM {
    private int largeur;
    private int hauteur;
    private String commentaire;
    private String niveaux;
    
    public static int tailleMax = 512;

    public PGM() { //Constructeur par défaut, image toute noire
        this.largeur = tailleMax;
        this.hauteur = tailleMax;
        this.commentaire = "#Nouvelle image PGM";
        int dimension = tailleMax*tailleMax;
        String ligne = new String();
        for (int i=0;i<dimension;i++) {
            if (ligne.length() == 63) {
                ligne += "255" + "\n";
                this.niveaux += ligne;
            }
            else {
                if (ligne.length() < 63) {
                    ligne+="255 ";
                }
            }
        }
    }
    
    public PGM(String fichier) { //Constructeur à partir d'un fichier existant
        
        try {
            InputStream ips = new FileInputStream(fichier);
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            br.readLine();
            this.commentaire = br.readLine();
            String slargeur = new String();
            String shauteur = new String();
            String ligne = new String();
            ligne = br.readLine();
            String[] mots = ligne.split(" ");
            slargeur = mots[0];
            shauteur = mots[1];
            this.largeur = Integer.parseInt(slargeur);
            this.hauteur = Integer.parseInt(shauteur);
            br.readLine();
            ligne = br.readLine();
            while (ligne != null) {
                niveaux += ligne + "\n";
                ligne = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
