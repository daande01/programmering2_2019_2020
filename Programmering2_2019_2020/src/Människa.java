
public class Människa {

	private static int vikt= 80;
	private static int ålder= 40;

	public static void nyperson() {


		if (vikt<80 && vikt>50) {

			System.out.println("du kan donera");
		}else {

			System.out.println("du kan ej donera");
		}

	}






	public static void main(String[] args) {
			int i = getage();
			System.out.println(i);

	}






	private static int getage() {

		return ålder;

	}
}
