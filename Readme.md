Exercice 1 L'arbre généalogique
On désire réaliser un système permettant de construire et d'afficher un arbre généalogique.
Question a
a) Créer la classe Date qui contient une date sous la forme de 3 entiers, le jour, le mois et l'année.
b) Définir un constructeur de la forme Date(int j, int m, int a) qui sert à construire une telle date.
c) Définir une méthode versChaine() qui retourne une chaîne de caractère, représentation de la date sous
la forme jour/mois/année.
Exemple:
Date d = new Date(20, 10, 1999);
System.out.println(d.versChaine()); // affiche: 20/10/1999
Question B
a) Définir la classe Personne qui est telle que toute personne est définie par son nom, son prénom, sa
date de naissance et éventuellement par son père, sa mère (qui sont tous deux des personnes) et par sa
date de décès.
b) Faire un constructeur qui permet de créer une personne à partir de son nom, son prénom, le jour, le
mois et l'année de sa date de naissance.
c) Faire des méthodes d'accès pour la définition du pere, de la mere et de l'année de décès de la
personne. Voilà ce que cela donne:
Personne Omar = new Personne("Foulen", "Omar", 3, 1, 1966);
Personne Zina = new Personne("Felten", "Zina", 5, 9, 1942);
Personne Karim = new Personne("Foulen", "Karim", 15, 10, 1938);
Personne Warda = new Personne("Ben Flen", "Zahra", 21, 11, 1908);
Personne Akram = new Personne("Felten", "Akram", 12, 06, 1905);
Warda.deces(10,08,1986);
Akram.deces(1,12,1970);
Omar.pere(Karim); // Omar a comme pere Karim
Omar.mere(Zina);
Zina.pere(Akram);
Zina.mere(Warda);
d) Faire une méthode afficher() dans Personne qui donne le résultat suivant:
Omar.afficher()
→
Omar Foulen
né(e) le 3/1/1996
Warda.afficher()
→

Zahra Ben Flen
né(e) le 21/11/1908
décédé(e) le 10/08/1986
e) Faire une méthode afficherGenealogie() dans Personne affiche toute la généalogie d'une personne.
Exemple:
Omar.afficherGenealogie();
→
Omar Foulen
né(e) le 3/1/1996
a comme père:
Karim Foulen
né(e) le 15/10/1938
a comme mère:
Zina Felten
né(e) le 5/9/1942
a comme père:
Akram Felten
né(e) le 5/9/1942
décédé(e) le 1/12/1970
a comme mère
Zahra Ben Flen
né(e) le 21/11/1908
décédé(e) le 10/08/1986