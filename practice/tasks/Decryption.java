import java.util.Scanner;

public class Decryption{

   public static void main(String...args){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a four digit integer: ");
        int userInput = sc.nextInt();


	int firstDigit = (userInput / 1000);	
	int secondDigit = (userInput / 100) % 10;
	int thirdDigit = (userInput / 10) % 10;
	int fourthDigit = userInput % 10;

	int FirstDigitEncryption = (firstDigit - 7) % 10;
	int SecondDigitEncryption = (secondDigit - 7) % 10;
	int ThirdDigitEncryption = (thirdDigit - 7) % 10;
	int FourthDigitEncryption = (fourthDigit - 7) % 10;

	int firstDigitEncrypted = ThirdDigitEncryption * 1000;
	int secondDigitEncrypted = FourthDigitEncryption * 100;
	int ThirdDigitEncrypted = FirstDigitEncryption * 10;
	int FourthDigitEncrypted = SecondDigitEncryption * 1;

	int Encryption = (firstDigitEncrypted) - (secondDigitEncrypted) - (ThirdDigitEncrypted) - (FourthDigitEncrypted);

	System.out.println(Encryption);

}

}