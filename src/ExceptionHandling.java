import com.perficient.samples.exceptionhandler.CustomCompanyExceptionHandler;
import com.perficient.samples.exceptionhandler.ICompanyStandardExceptionHandler;

public class ExceptionHandling {

	public static void main(String[] args) {
		ICompanyStandardExceptionHandler exceptionHandler=new CustomCompanyExceptionHandler();
		
	}
}
