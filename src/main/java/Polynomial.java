

public class Polynomial {

    // Això és una prova

    public float[] polinomyal;
    StringBuilder sb = new StringBuilder();

    // Constructor per defecte. Genera un polinomi zero
    public Polynomial() {
        polinomyal = new float[1];
        polinomyal[0] = 0;
    }

    // Constructor a partir dels coeficients del polinomi en forma d'array
    public Polynomial(float[] cfs) {
        if (cfs.length == 1 || cfs.length == 0) {
            polinomyal = new float[1];
            polinomyal[0] = 0;
        } else {
            polinomyal = new float[cfs.length-1];
            System.arraycopy(cfs, 0, polinomyal, 0, polinomyal.length);
        }
    }

    // Constructor a partir d'un string
    public Polynomial(String s) {
    }

    // Suma el polinomi amb un altre. No modifica el polinomi actual (this). Genera un de nou
    public Polynomial add(Polynomial p) {
        return null;
    }

    // Multiplica el polinomi amb un altre. No modifica el polinomi actual (this). Genera un de nou
    public Polynomial mult(Polynomial p2) {
        return null;
    }

    // Divideix el polinomi amb un altre. No modifica el polinomi actual (this). Genera un de nou
    // Torna el quocient i també el residu (ambdós polinomis)
    public Polynomial[] div(Polynomial p2) {
       return null;
    }

    // Troba les arrels del polinomi, ordenades de menor a major
    public float[] roots() {
        return null;
    }

    // Torna "true" si els polinomis són iguals. Això és un override d'un mètode de la classe Object
    @Override
    public boolean equals(Object o) {
        return false;
    }

    // Torna la representació en forma de String del polinomi. Override d'un mètode de la classe Object
    @Override
    public String toString() {
        for (float aPolinomyal : this.polinomyal) {
            sb.append((int) aPolinomyal);
        }
        return sb.toString();
    }
}
