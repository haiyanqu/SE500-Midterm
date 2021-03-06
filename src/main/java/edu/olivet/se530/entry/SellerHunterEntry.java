package edu.olivet.se530.entry;

import java.io.IOException;

import edu.olivet.se530.SellerHunter;
import edu.olivet.se530.model.Offer;

/**
 * Seller猎手
 * @author <a href="mailto:nathanaelibport@gmail.com">Nathanael Yang</a> Jan 8, 2015 2:11:20 PM
 */
class SellerHunterEntry {

	public static void main(String[] args) throws IOException {
		SellerHunter hunter = new SellerHunter();
		Offer offer = hunter.huntOffer("031043601X", "New");
		System.out.println(offer);
	}	
}
