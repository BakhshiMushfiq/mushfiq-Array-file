package Polymorphism;

public class PolyLanguageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyOverload lang = new PolyOverload ();
		lang.amerecanLanguage();
		lang.formalLanguage();
		
		PolyChildLanguage inter = new PolyChildLanguage () ;
			inter.inernationalLang();
		
	
	}

}
