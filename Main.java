package fr.dauphine.javaavance.td2;
import java.io.*;
/** Cette classe permet de creer un objet Mere avec toutes ses methodes */
class Mere {
	/** Affiche Mere_a  */
	public void a() {System.out.println("Mere_a"); }
	/** Affiche une fille @param fille la fille a afficher */
	void b(Fille fille) {System.out.println("Mere_b(Fille)");}
	/** Affiche Mere_c */
	void c() {System.out.println("Mere_c");}
	/** Affiche une Mere @param mere la mere a afficher */
	void c(Mere mere) {System.out.println("Mere_c(Mere)"); }
	/** Affiche static Mere_d */
	static void d() {System.out.println("static Mere_d");}
	/** Affiche Mere_e */
	protected void e() {System.out.println("Mere_e");}
	/** Affiche Mere_f */
	private void f() {System.out.println("Mere_f");}
	/** Fais appel a la méthode f()*/
	public void printF() { f(); }
	/** Affiche Mere_g, @return 2 encapsul� dans un objet */
	Object g() {System.out.println("Mere_g"); return 2;}
	/** Affiche Mere_h ; @return 2 */
	int h() {System.out.println("Mere_h"); return 2;}
	/** Affiche Mere_i */
	void i() {System.out.println("Mere_i");}
	/** Affiche Mere_j, @throws Exception  */
	void j() throws Exception {System.out.println("Mere_j"); }
	/** Affiche Mere_k, @throws IOException */
	void k() throws IOException {System.out.println("Mere_k"); }
	/** Affiche Mere_l ,@throws Exception */
	void l() throws Exception {System.out.println("Mere_l"); }
	/** Affiche Mere_m ,@throws Exception ,@throws ArrayIndexOutOfBoundsException */
	void m() throws Exception, ArrayIndexOutOfBoundsException {System.out.println("Mere_m"); }

}
/** Classe Fille qui herite d'une mere */
class Fille extends Mere{
	
	void miage() {System.out.println("Miage");}

	//Red�finition
	public void a() {System.out.println("Fille_a"); }
	
	//Red�finition
	protected void b(Fille fille) {System.out.println("Fille_b(Fille)");}
	
	//Red�finition
	public void c(Mere mere) {System.out.println("Fille_c(Mere)");}
	//Surcharge
	void c(Fille b) {System.out.println("Fille_c(Fille)"); }
	
	//Red�finition
	static void d() {System.out.println("static Fille_d");}
	//Surcharge
	static void d(Mere mere) {System.out.println("Fille_d(Mere)");}

	//Red�finition
	protected void f() {System.out.println("Fille_f");}
	
	//Red�finition
	String g() {System.out.println("Fille_g"); return "c";}
	//Red�finition
	void k() throws IOException {System.out.println("Fille_k"); }
	//Red�finition
	void l() {System.out.println("Fille_l");}
	//Red�finition
	void m() throws IOException, IllegalArgumentException {System.out.println("Fille_m"); }
}

public class Main {
	/** @param arg ,@throws Exception */
	public static void main(String[] args) throws Exception {
		Mere mere=new Mere();
		Mere mereFille=new Fille();
		Fille fille=new Fille();
		//fais appel � la m�thode miage de la fille output : Miage
		fille.miage();
		//cast explicite donc on appel la m�thode miage de la fille output : Miage
		((Fille)mereFille).miage();
		//fais appel � la m�thode de la mere output : Mere_a
		mere.a();
		//fais appel � la m�thode de la fille output : Fille_a
		mereFille.a();
		//fais appel � la m�thode de la fille output : Fille_a
		fille.a();
		//fais appel � la m�thode de la fille quand meme output : Fille_a
		((Mere)mereFille).a();
		//fais appel � la m�thode de la fille et malgr� le param�tre null  output : Fille_b(Fille)
		mereFille.b(null);
		//fais appel � la m�thode de la fille
		mereFille.c();
		//fais appel � la m�thode de la fille avec une Mere comme argument
		mereFille.c(mere);
		//fais appel � la m�thode de la fille mais mereFille est consid�r�e comme une Mere
		mereFille.c(mereFille);
		//fais appel � la m�thode de la fille mais avec une fille comme argument
		mereFille.c(fille);
		//fais appel � la m�thode de la fille mais avec une fille comme argument
		fille.c(fille);
		
		//�a n'appelle que d() de la m�re car la m�thode est static
		mere.d();
		mereFille.d();
	
		//Output pour les deux Mere_f car ce sont les m�thodes de la m�re qui sont appel�es
		mere.printF();
		mereFille.printF();
		
		//M�thode de la m�re output : Mere_j
		mereFille.j();
		//M�thode de la fille car red�finie output : Fille_k
		mereFille.k();
		//M�thode de la fille car red�finie output : Fille_l
		mereFille.l();
		//M�thode de la fille car red�finie output : Fille_m
		mereFille.m();
	}
}