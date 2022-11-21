package Interface;

public class TestAnimal {

	public static void main(String[] args) {
		Fish d = new Fish(0,"Fato");
		Cat c = new Cat(4,"Gorkem");
		Animal a = new Fish(0, "Nemo");
		Animal e = new Spider(6);
		Pet p = new Cat(4);
		
		e.info();
		c.info();
		a.info();
	}

}
