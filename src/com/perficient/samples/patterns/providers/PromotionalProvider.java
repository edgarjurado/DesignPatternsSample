package com.perficient.samples.patterns.providers;

import com.perficient.samples.patterns.services.PromoCodeService;

public class PromotionalProvider extends Provider {

	private float promoAmount;
	private int promotionalCode;
	PromoCodeService promoService=new PromoCodeService();
	IProvider provider;
	
	public PromotionalProvider(IProvider provider, int promotionalCode) {
		super(provider.getRecharge());
		this.provider=provider;
		this.promotionalCode=promotionalCode;
	}

	public int getPromotionalCode() {
		return promotionalCode;
	}

	public void setPromotionalCode(int promotionalCode) {
		this.promotionalCode = promotionalCode;
	}
	
	@Override
	public float recharge(String cellNumber, float amount) {
		promoAmount=promoService.getAmount(promotionalCode);
		System.out.println("Promotional recharge for code: " + promotionalCode + " for " + promoAmount + " of free credit");
		float credit= provider.recharge(cellNumber, amount);
		System.out.println("recharge to be paid by client: " + (credit-promoAmount));
		return credit-promoAmount;
	}
	
}
