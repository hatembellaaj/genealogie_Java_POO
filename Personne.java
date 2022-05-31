public class Personne {
    //Déclaration des attributs 
    String nom;
    String prenom; 
    Date date_de_naissance;
    Personne pere,mere;
    Date date_de_deces;

    //constructeur
    Personne(String n, String p, int j, int m, int a){
        this.nom=n;
        this.prenom=p;
        this.date_de_naissance= new Date(j, m, a);
    }

    //accesseurs & modificateurs
    void pere(Personne p)
    {
        this.pere = p ;
    }
    Personne pere()
    {
        return this.pere;
    }
    void mere(Personne m)
    {
        this.mere = m ;
    }
    Personne mere()
    {
        return this.mere;
    }
    void deces(int j, int m, int a)
    {
        this.date_de_deces=new Date(j, m, a);
    }
    Date deces()
    {
        return this.date_de_deces;
    }

    //Programme principal 
    public static void main(String args[]){
        Personne Omar = new Personne("Foulen", "Omar", 3, 1, 1966);
        Personne Zina = new Personne("Felten", "Zina", 5, 9, 1942);
        Personne Karim = new Personne("Foulen", "Karim", 15, 10, 1938);
        Personne Warda = new Personne("Ben Flen", "Zahra", 21, 11, 1908);
        Personne Akram = new Personne("Felten", "Akram", 12, 6, 1905);
        Warda.deces(10,8,1986);
        Akram.deces(1,12,1970);
        Omar.pere(Karim); // Omar a comme pere Karim
        Omar.mere(Zina);
        Zina.pere(Akram);
        Zina.mere(Warda);

        Omar.afficher();

    }   
    
    public void afficher()
    {
        System.out.println(this.prenom + " " + this.nom);
        System.out.println("né(e) le " + this.date_de_naissance.verschaine());
        if (this.date_de_deces!= null)
            System.out.println("Décédé(e) le " + this.date_de_deces.verschaine());
        if (pere != null)
        {
            pere.afficher();
        }
        if (mere != null)
        {
            mere.afficher();
        }


    }


}
