import java.util.Scanner;
public class durtns{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("������� ���� �Է� : ");
	String str = scanner.nextLine();
	char ch=' ';
	for (int i=str.length()-1; i>=0; i--){
		ch=str.charAt(i);
		System.out.print(ch);
	}
	System.out.println();
	}
	
	
}