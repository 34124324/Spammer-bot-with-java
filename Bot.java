import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Spammer {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		String Text;
		int X = 1;
		int M;
		
		Robot R = new Robot();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\t\t" + "<< Welcome welcome >>" + "\n");
		
		System.out.print("Enter the message you want to send : ");
		Text = scan.nextLine();
		
		System.out.print("\n" + "Enter the number of messages you want to send : ");
		M = scan.nextInt();
		StringSelection SS = new StringSelection(Text);
		Clipboard CB = Toolkit.getDefaultToolkit().getSystemClipboard();
		CB.setContents(SS, null);
		scan.close();
		
		System.out.println("\n" + "!!! The Spamming will start in 10 seconds !!!");
		
		Thread.sleep(10000);
	
		while(X <= M) {
			
			Thread.sleep(100);
			
			R.keyPress(KeyEvent.VK_CONTROL);
			R.keyPress(KeyEvent.VK_V);
			R.keyRelease(KeyEvent.VK_CONTROL);
			R.keyRelease(KeyEvent.VK_V);
		
			R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
		
			X++;
		
		}
	}
}
