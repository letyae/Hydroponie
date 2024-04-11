

/*******
 * Lire les donnees depuis System.in
 * Utilise System.out.println pour afficher le resultat
 * Utilise System.err.println pour afficher des donnees de debug
 * ***/
import java.util.*;

public class Hydroponie {

    public static int countIrrigation(char[][] grille, int x, int y)
    {
    int nombreIrrigation = 0;

    if (Math.abs(x - 1) < grille.length && Math.abs(y - 1) < grille.length) {
      if (grille[Math.abs(x - 1)][Math.abs(y - 1)] == '.') {
        nombreIrrigation++;
        grille[Math.abs(x - 1)][Math.abs(y - 1)] = 'o';
      }
    }

    if (Math.abs(x - 1) < grille.length && y < grille.length) {
      if (grille[Math.abs(x - 1)][y] == '.') {
        nombreIrrigation++;
        grille[Math.abs(x - 1)][y] = 'o';
      }
    }

    if (Math.abs(x - 1) < grille.length && y + 1 < grille.length) {
      if (grille[Math.abs(x - 1)][y + 1] == '.') {
        nombreIrrigation++;
        grille[Math.abs(x - 1)][y + 1] = 'o';
      }
    }

    if (x < grille.length && Math.abs(y - 1) < grille.length) {
      if (grille[x][Math.abs(y - 1)] == '.') {
        nombreIrrigation++;
        grille[x][Math.abs(y - 1)] = 'o';
      }
    }

    if (x < grille.length && y + 1 < grille.length) {
      if (grille[x][y + 1] == '.') {
        nombreIrrigation++;
        grille[x][y + 1] = 'o';
      }
    }

    if (x + 1 < grille.length && Math.abs(y - 1) < grille.length) {
      if (grille[x + 1][Math.abs(y - 1)] == '.') {
        nombreIrrigation++;
        grille[x + 1][Math.abs(y - 1)] = 'o';
      }
    }

    if (x + 1 < grille.length && y < grille.length) {
      if (grille[x + 1][y] == '.') {
        nombreIrrigation++;
        grille[x + 1][y] = 'o';
      }
    }

    if (x + 1 < grille.length && y + 1 < grille.length) {
      if (grille[x + 1][y + 1] == '.') {
        nombreIrrigation++;
        grille[x + 1][y + 1] = 'o';
      }
    }

    return nombreIrrigation;
  }
  
	
	public void main() {
		
    String line = "";
    Scanner sc = new Scanner(System.in);
    int taille = sc.nextInt(), i, j, k = 0;
    sc.nextLine();

    char[][] grille = new char[taille][taille];

    while (k < taille) {
      line = sc.nextLine();
      i = 0;

      while (i < taille && k < taille) {
        grille[k][i] = line.charAt(i);
        i++;
      }
      k++;
    }

	


    int nombreIrrigation = 0;

    for (i = 0; i < grille.length; i++) {
      for (j = 0; j < grille.length; j++) {
        if (grille[i][j] == 'X')
        nombreIrrigation += countIrrigation(grille, i, j);
      }
    }

    System.out.println(nombreIrrigation);



	}
}











