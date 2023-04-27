package com.perficient.samples.patterns.providers;

import com.perficient.samples.patterns.services.PromoCodeService;

public class PromotionalProvider extends Provider {

	private float amount;
	private int promotionalCode;
	
	public PromotionalProvider(IProviderRecharge recharge, int promotionalCode) {
		super(recharge);
		this.promotionalCode=promotionalCode;
		PromoCodeService promoService=new PromoCodeService();
		amount=promoService.getAmount(promotionalCode);
	}

	public float getAmount() {
		
		return amount;
	}

	public int getPromotionalCode() {
		return promotionalCode;
	}

	public void setPromotionalCode(int promotionalCode) {
		this.promotionalCode = promotionalCode;
	}
	
	@Override
	public boolean recharge(String cellNumber, float amount) {
		System.out.println("Promotional recharge for code: " + promotionalCode + " for " + this.amount + " of free credit");
		return super.recharge(cellNumber, this.amount);
	}
	
}
