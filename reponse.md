# Question 1

Si on a une classe qui hérite déjà d'une autre classe, alors elle ne peut pas étendre de Thread.
Runnable permet de séparer ce qu'il faut faire dans run() est qui l'éxecute avec un Thread.

# Question 2

Le programme sort :
1 A 2 B C 3 D 4 E F G H I J 5 K L 6 7 M 8 9 N 10 O 11 P 12 Q 13 R 14 15 S 16 T U 17 18 19 20 21 22 V 23 24 25 26 W X Y Z

# Question 3

Après avoir executer le programme JulietteAndRomeoJob, on remarque que le compte finis en négatif,
cela est causé par le fait que les threads regarde si il y'a assez d'argent puis dorment 500ms puis retirent leurs argent,
comme le retrait ne se fait qu'après 500ms, si l'autre personne regarde le compte pendant ces 500ms, il y'aura toujours le même montant.