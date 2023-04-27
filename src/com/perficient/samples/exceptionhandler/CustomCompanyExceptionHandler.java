package com.perficient.samples.exceptionhandler;

public class CustomCompanyExceptionHandler extends CompanyStandardExceptionHandler {

	private ICompanyStandardExceptionHandler exceptionHandler=new CompanyStandardExceptionHandler();
	
	@Override
	public String HandleException(int exceptionCode) {
		return exceptionCode==500? "Message for error 500":exceptionHandler.HandleException(exceptionCode);
	}
}
