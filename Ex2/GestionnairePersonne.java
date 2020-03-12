import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Décrivez votre classe GestionnairePersonne ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class GestionnairePersonne
{
    private ArrayList<Personne> personnes = new ArrayList<>();
    private ArrayList<String> nationalites = new ArrayList<>();
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String lectureFichier(String path)throws IOException{
        BufferedReader lecteurAvecBuffer = null;
        String texte = "";
        String ligne;
        try{
              lecteurAvecBuffer = new BufferedReader(new FileReader(path));
        }
        catch(FileNotFoundException exc){
              System.out.println("Erreur d'ouverture");
        }
        while ((ligne = lecteurAvecBuffer.readLine()) != null)
          texte += ligne + "\n";
        lecteurAvecBuffer.close();
        return texte;
    }
    
    public void chargerNationalites(){
        // A développer
    }
    
    public ArrayList chargerPersonnes(String donnees){
        // A développer
        return null;
    }
    
    public void afficheMoinsTrente(){
       // A développer
    }
    
    public void afficheNationalite(){
        // A développer
    }
    
    public void recherchePersonne(String valeur){
        // A développer
    }
    
    public void main() throws IOException{
        personnes.clear();
        personnes = chargerPersonnes(lectureFichier("personnes.txt"));
        chargerNationalites();
        afficheMoinsTrente();
        afficheNationalite();
        recherchePersonne("Hoeffer");
        recherchePersonne("Suisse");
        recherchePersonne("mi");
        recherchePersonne("Test");
    }
}
