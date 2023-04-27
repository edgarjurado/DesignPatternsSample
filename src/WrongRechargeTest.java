import com.perficient.wrong.samples.WrongServiceAmericanCell;
import com.perficient.wrong.samples.WrongServiceEuropeanCell;

public class WrongRechargeTest {

	public static void main(String[] args) {
		
		WrongServiceEuropeanCell europeanCell=new WrongServiceEuropeanCell();
		europeanCell.recharge("1234567890", 50);
		System.out.println("------------------------------");
		WrongServiceAmericanCell americanCell=new WrongServiceAmericanCell();
		americanCell.recharge("6789012345", 150);
	}

}
