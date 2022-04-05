import java.util.regex.Pattern;


public class Carte{
    private int signe;
    private String name;
    private int value;

    final Pattern patternSigne = Pattern.compile("[0-3]");
    final Pattern patternName = Pattern.compile("[1-9]|10|11|12|13");

    public int getSigne() {
        return signe;
    }

    public void setSigne(int signe) {
        this.signe = signe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    //constructeurs
    public Carte(int signe, int value, String name) {

        if (patternSigne.matcher(""+signe).matches() && (patternName.matcher(name) ).matches() && value == Integer.parseInt(name)){
            this.signe = signe;
            this.value = value;
            this.name = name;
        }
        else{
            System.out.println("Mauvais format!!");
        }
        
    }

    private String showSigne(){
        switch (this.signe){
            case 0:
                return "trefle";
            case 1:
                return "pique";
            case 2:
                return "coeur";
            case 3:
                return "carreau";
            default:
                return "inconnu";
        }

    }

    public void printOut(){
        System.out.println("Carte: " + name + "; Signe: " + showSigne() + "; Valeur: " + value);
    }

}