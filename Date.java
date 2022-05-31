class Date {
    //Déclaration des attributs 
    int jour, mois, annee;

    //constructeur 
    Date(int j, int m, int a)
    {
        this.jour = j ;
        this.mois = m ;
        this.annee = a ;
    }

    public String verschaine()
    {
        return this.jour + "/" + this.mois + "/" + this.annee ;
    }

    public static void main(String args[]){
        Date d = new Date(20, 10, 1999);
        System.out.println(d.verschaine());
    }

}