package com.perficient.samples.exceptionhandler;

public class CompanyStandardExceptionHandler implements ICompanyStandardExceptionHandler {

	@Override
	public String HandleException(int exceptionCode) {
		String message=null;
		switch (exceptionCode) {
			case 400:
				message = "Message for error 400";
				break;
			case 401:
				message = "Message for error 401";
				break;
			case 402:
				message = "Message for error 402";
				break;
			case 403:
				message = "Message for error 403";
				break;
			case 404:
				message = "Message for error 404";
				break;
			case 405:
				message = "Message for error 405";
				break;
		}

		return message;
	}

}
