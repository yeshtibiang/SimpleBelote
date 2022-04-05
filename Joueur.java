public class Joueur{
    private String name;
    private int score;
    private int compteur;
    private Carte[] cartes;

    public Joueur(String name){
        this.name = name;
        this.score = 0;
        this.compteur = 0;
        this.cartes = new Carte[13];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    public Carte[] getCartes() {
        return cartes;
    }

    public void setCartes(Carte[] cartes) {
        this.cartes = cartes;
    }

    public Carte jouerEnPremier(){
        for (int i = 0; i < this.cartes.length; i++){
            if (this.cartes[i] != null){
                Carte carteToSend = this.cartes[i];
                this.cartes[i] = null;
                this.compteur--;
                return carteToSend;
            }
        }
        return null;
    }

    public void ajouterCarte(Carte carte){
        cartes[compteur++] = carte;
    }

    public Carte play(int signe){
        for (int i = 0; i < this.cartes.length; i++){
            Carte carte = this.cartes[i];
            if (carte != null && carte.getSigne() == signe){
                this.cartes[i] = null;
                this.compteur--;
                return carte;
            }
        }
        return this.jouerEnPremier();
    }



    public void toutGagant(Carte[] cartes){

        for (int i = 0; i < cartes.length; i++){
            this.score += cartes[i].getValue();
        }
    }

}