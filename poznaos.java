/* 
	@authors Миша.
	@publisher Pozna Corporation.
	@version PoznaOS 1.0.8 Pre-Alpha.
										*/
import java.io.File;
import java.util.Scanner;
/*
	@see 1.0.0 Pre-alpha
							*/
public class oneZeroEight {
	public static void main(String args[]) {
		String password = "null";
		loop1:
		for (; password.equals("USSR");) {
			Scanner pass = new Scanner(System.in);
			System.out.print("Введите пароль: ");
			password = pass.nextLine();
			if (password.equals("USSR")) {
				for(; true;) {
					Scanner in = new Scanner(System.in);
					System.out.println("Введите команду, используйте help для получения списка команд: ");
					String command = in.nextLine();
					if (command.equals("help")) {
						System.out.println("open - открыть файл или папку\n close - закрыть файл или папку\n create - создать файл или папку\n delete - удалить файл или папку\n end - закрыть PoznaOS");
					}
					else if (command.equals("end")) {
						break loop1;
					}
					else if (command.equals("Java")) {
						System.out.print("I am sorry, Duke!");
					}
					else {
						System.out.println("Неизвестная команда");
					}
				}
			}
		}
	}
}
