package projet_simulation_feu;

/*
 * Projet de simulation de feu de foret
 * Auteurs : Maxime Innocenti & Antoine Henriet
 * 01/02/2022
 * Codé en Java
*/

public class Eau extends Case{
    
    //Attributs
    private boolean inflammable;
    private int combustion;
    private int type_case;

    //Getter & Setter
    public boolean isInflammable() {
        return inflammable;
    }

    public void setInflamable(boolean inflammable) {
        this.inflammable = inflammable;
    }

    public int getCombustion() {
        return combustion;
    }

    public void setCombustion(int combustion) {
        this.combustion = combustion;
    }

    public int getType_case() {
        return type_case;
    }

    public void setType_case(int type_case) {
        this.type_case = type_case;
    }
    
    //Constructeurs
    public Eau(int i, int j, double hum) {
        super(i,j, hum);
        setEtat_flamme(getTab_etat_flamme()[5]);   // Au départ la case est eau
        this.inflammable = false;
        this.combustion = 0;
        this.type_case = -1;
    }
}
