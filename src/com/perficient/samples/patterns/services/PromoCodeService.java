package com.perficient.samples.patterns.services;

public class PromoCodeService implements IPromoCodeService {

	@Override
	public float getAmount(int code) {
		/*Check database for code
		  validate if code exists and has not been used
		  return the amount associated with the code 
		  exception if code doesn't exist or if has been already used
		 */
		return 100;
	}
	

}
