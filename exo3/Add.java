package fr.dauphine.javaavance.td2.exo3;
 class Add extends Expr{
	/**
	 - Constructeur qui prend en argument les deux expressions � additionner
	 - @param e1 la premi�re valeur
	 - @param e2 la seconde valeur
	 */
	public Add(Expr e1, Expr e2) {
		this.setX(e1.eval() + e2.eval());
		System.out.println(e1 + " + " +e2);
	}
	
}
