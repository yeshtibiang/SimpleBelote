import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Belote {

    private Carte[] cartes;
    private Joueur[] joueurs;

    public Carte[] getCartes() {
        return cartes;
    }

    public void setCartes(Carte[] cartes) {
        this.cartes = cartes;
    }

    public Joueur[] getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(Joueur[] joueurs) {
        this.joueurs = joueurs;
    }

    public Belote(){
        Joueur doudou = new Joueur("Doudou");
        Joueur fatou = new Joueur("Fatou");
        Joueur dieynaba = new Joueur("Dieynaba");
        Joueur lamine = new Joueur("Lamine");

        Carte carte1 = new Carte(0, 1, "1");
        Carte carte2 = new Carte(0, 2, "2");
        Carte carte3 = new Carte(0, 3, "3");
        Carte carte4 = new Carte(0, 4, "4");
        Carte carte5 = new Carte(0, 5, "5");
        Carte carte6 = new Carte(0, 6, "6");
        Carte carte7 = new Carte(0, 7, "7");
        Carte carte8 = new Carte(0, 8, "8");
        Carte carte9 = new Carte(0, 9, "9");
        Carte carte10 = new Carte(0, 10, "10");
        Carte carte11 = new Carte(0, 11, "11");
        Carte carte12 = new Carte(0, 12, "12");
        Carte carte13 = new Carte(0, 13, "13");

        Carte carte14 = new Carte(1, 1, "1");
        Carte carte15 = new Carte(1, 2, "2");
        Carte carte16 = new Carte(1, 3, "3");
        Carte carte17 = new Carte(1, 4, "4");
        Carte carte18 = new Carte(1, 5, "5");
        Carte carte19 = new Carte(1, 6, "6");
        Carte carte20 = new Carte(1, 7, "7");
        Carte carte21 = new Carte(1, 8, "8");
        Carte carte22 = new Carte(1, 9, "9");
        Carte carte23 = new Carte(1, 10, "10");
        Carte carte24 = new Carte(1, 11, "11");
        Carte carte25 = new Carte(1, 12, "12");
        Carte carte26 = new Carte(1, 13, "13");

        Carte carte27 = new Carte(2, 1, "1");
        Carte carte28 = new Carte(2, 2, "2");
        Carte carte29 = new Carte(2, 3, "3");
        Carte carte30 = new Carte(2, 4, "4");
        Carte carte31 = new Carte(2, 5, "5");
        Carte carte32 = new Carte(2, 6, "6");
        Carte carte33 = new Carte(2, 7, "7");
        Carte carte34 = new Carte(2, 8, "8");
        Carte carte35 = new Carte(2, 9, "9");
        Carte carte36 = new Carte(2, 10, "10");
        Carte carte37 = new Carte(2, 11, "11");
        Carte carte38 = new Carte(2, 12, "12");
        Carte carte39 = new Carte(2, 13, "13");

        Carte carte40 = new Carte(3, 1, "1");
        Carte carte41 = new Carte(3, 2, "2");
        Carte carte42 = new Carte(3, 3, "3");
        Carte carte43 = new Carte(3, 4, "4");
        Carte carte44 = new Carte(3, 5, "5");
        Carte carte45 = new Carte(3, 6, "6");
        Carte carte46 = new Carte(3, 7, "7");
        Carte carte47 = new Carte(3, 8, "8");
        Carte carte48 = new Carte(3, 9, "9");
        Carte carte49 = new Carte(3, 10, "10");
        Carte carte50 = new Carte(3, 11, "11");
        Carte carte51 = new Carte(3, 12, "12");
        Carte carte52 = new Carte(3, 13, "13");

        //distribuer les cartes dans l'ordre que l'on veut
        //Pour le premier joueur
        ArrayList<Carte> paquet = new ArrayList<Carte>();

        paquet.add(carte1);
        paquet.add(carte2);
        paquet.add(carte3);
        paquet.add(carte4);
        paquet.add(carte5);
        paquet.add(carte6);
        paquet.add(carte7);
        paquet.add(carte8);
        paquet.add(carte9);
        paquet.add(carte10);
        paquet.add(carte11);
        paquet.add(carte12);
        paquet.add(carte13);
        paquet.add(carte14);
        paquet.add(carte15);
        paquet.add(carte16);
        paquet.add(carte17);
        paquet.add(carte18);
        paquet.add(carte19);
        paquet.add(carte20);
        paquet.add(carte21);
        paquet.add(carte22);
        paquet.add(carte23);
        paquet.add(carte24);
        paquet.add(carte25);
        paquet.add(carte26);
        paquet.add(carte27);
        paquet.add(carte28);
        paquet.add(carte29);
        paquet.add(carte30);
        paquet.add(carte31);
        paquet.add(carte32);
        paquet.add(carte33);
        paquet.add(carte34);
        paquet.add(carte35);
        paquet.add(carte36);
        paquet.add(carte37);
        paquet.add(carte38);
        paquet.add(carte39);
        paquet.add(carte40);
        paquet.add(carte41);
        paquet.add(carte42);
        paquet.add(carte43);
        paquet.add(carte44);
        paquet.add(carte45);
        paquet.add(carte46);
        paquet.add(carte47);
        paquet.add(carte48);
        paquet.add(carte49);
        paquet.add(carte50);
        paquet.add(carte51);
        paquet.add(carte52);

        //ajout des joueurs à la liste
        joueurs = new Joueur[4];
        joueurs[0] = doudou;
        joueurs[1] = fatou;
        joueurs[2] = dieynaba;
        joueurs[3] = lamine;

        //Ajout des cartes aux joueurs
        int i = 0, j = 0, taillePaquet = paquet.size();
        while (i < taillePaquet) {
            if (j > 3)
                j = 0;

            //ajout la carte à la position j au joueur i
            this.joueurs[j].ajouterCarte(paquet.get(i));
            i++;
            j++;
        }


    }

    public static void main(String[] args) {
        Belote belote = new Belote();
        int i = 0, posJoueurPremier;
        int winnerId;


        //pour chaque tour stockons la position du joueur et sa carte dans un hash map
        HashMap<Integer, Joueur> joueurPasMSigne = new HashMap<Integer, Joueur>();
        Carte jouerEnPremier;
        jouerEnPremier = belote.joueurs[i].jouerEnPremier();
        posJoueurPremier = i;
        belote.cartes = new Carte[4];
        belote.cartes[i] = jouerEnPremier;
        do {

            for (i = 0; i < belote.joueurs.length; i++) {
                if (i != posJoueurPremier) {
                    Carte carteJouer = belote.joueurs[i].play(jouerEnPremier.getSigne());
                    if (carteJouer == null){
                        joueurPasMSigne.put(i, belote.joueurs[i]);
                    }else{
                        belote.cartes[i] = belote.joueurs[i].play(jouerEnPremier.getSigne());
                    }
                }
            }
            //fin du tour
            //vérifier le gagnant
            winnerId = 0;
            int max = 0;
            for (int g = 0; g < belote.cartes.length; g++){
                if (belote.cartes[g] != null && (belote.cartes[g].getValue() > max)){
                    winnerId = g;
                    max = belote.cartes[g].getValue();
                }
            }

            if (!joueurPasMSigne.isEmpty()) {
                for (int z: joueurPasMSigne.keySet()){
                    System.out.println(z);
                    belote.cartes[z] = belote.joueurs[z].jouerEnPremier();
                }
            }

            //on met à jour le score du gagant
            System.out.println("Winner Id " + winnerId);
            System.out.println(Arrays.toString(belote.cartes));
            belote.joueurs[winnerId].toutGagant(belote.cartes);
            posJoueurPremier = winnerId;
            //Le gagnant lance le jeu
            jouerEnPremier = belote.joueurs[winnerId].jouerEnPremier();

            belote.cartes =new Carte[4];
            belote.cartes[posJoueurPremier] = jouerEnPremier;

        } while (jouerEnPremier != null);

        for (int t = 0; t < belote.joueurs.length; t++){
            System.out.println("Nom Joueur: " + belote.joueurs[t].getName() + " Score: " + belote.joueurs[t].getScore());
        }

    }
}