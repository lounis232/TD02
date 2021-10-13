package fr.dauphine.javaavance.td2.exo3;

public class Expr {
	/**
	 - Attribut x representant la valeur de l'expression. J'ai choisi de le mettre en prive plutot qu'en protected 
	 */
	private double x=0;
	/**
	 - Constructeur initialisant la variable x � 0
	 */
	public Expr() {
		this.x = 0.0;
	}
	/**
	 - Méthode eval retournant une copie defensive de l'attribut x @return a la copie defensive de x
	 */
	public double eval() {
		double a = this.x;
		return a;
	}
	/**
	 - Attribut une nouvelle valeur � x @param a la nouvelle valeur
	 */
	public void setX(double a ) {
		this.x = a;
	}
	@Override
	public String toString() {
		return this.x+"";
	}
}
