/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    }

}
