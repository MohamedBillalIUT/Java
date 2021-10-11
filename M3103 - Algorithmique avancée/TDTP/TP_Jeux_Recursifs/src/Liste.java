import java.*;
class Liste{
    private int valeur;
    private Liste poteau_suiv;

    public Liste(int valeur) {
        //création d'un contructeur nous permettant de créer un cylindre avec une liste vide.
        //Liste_suiv étant nul on pourra le mettre comme dernier cylindre ou comme seul cylindre disponible.
        this.valeur = valeur;
        this.poteau_suiv = null ;
    }

    public Liste(int valeur, Liste poteau_suiv){
        //Création d'un constructeur créant une liste étant la liste suivante
        //Nous sera utile pour le paramétrage du jeu.
        this.valeur=valeur;
        this.poteau_suiv= poteau_suiv;
    }

    public int getValeur() {
        return valeur;
    }

    public Liste getPoteau_suiv() {
        return poteau_suiv;
    }

    private void setValeur(int valeur) {
        this.valeur = valeur;
    }

    /*
    Question 1.1.
    Ecrire d’abord la méthode public void resoudreAux(int n, int i, int j) qui pour
    tout n ≥ 1 affiche une liste de coups permettant, étant donné un jeu de Hanoï avec n disques initialement
    sur le poteau i, de déplacer ces n disques sur le poteau j (avec i et j dans {1, 2, 3}, i 6 = j).
    Par exemple, resoudreAux(2,2,1) affiche:
    "2 -> 3"
    "2 -> 1"
    "3 -> 1"
    * */
    public void resoudreAux(int n, int i, int j){
        if(n>=1){
            System.out.println(n + '->' + i);
            System.out.println(n + '->' + j);
            resoudreAux(n-1, i-1, j-1);
        }
    }
}