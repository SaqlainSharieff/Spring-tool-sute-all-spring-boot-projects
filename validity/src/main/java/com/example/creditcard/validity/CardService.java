package com.example.creditcard.validity;

import org.springframework.stereotype.Service;

@Service
public class CardService {

	public String getValidity(Long num) {
		String str = num.toString();
		String firstSixdigits = str.substring(0, 6);
		Long numextracted = Long.parseLong(firstSixdigits);
		if ((numextracted >= 601100 & numextracted <= 601109) || (numextracted >= 601120 & numextracted <= 601149)
				|| (numextracted >= 601177 & numextracted <= 601179)
				|| (numextracted >= 601186 & numextracted <= 601199)
				|| (numextracted >= 644000 & numextracted <= 65999)&(str.length()==16)) {
			return "Card Identified:American Express";
		}
		String firstfourdigits = str.substring(0, 4);
		Long numextracted4 = Long.parseLong(firstfourdigits);
		if((numextracted4>=3528 & numextracted4 <=3589)
				&(str.length()==16
				||str.length()==17
				||str.length()==18
				||str.length()==19)) {
			return "Card Identified: JCB";
		}
		if((numextracted >= 510000 & numextracted <= 519999)
				||(numextracted >= 222100 & numextracted <= 272099)
				&(str.length()==16)) {
			return "Card Identified: Master Card";
		}
		String firstDigit=str.substring(0, 1);
		Long numExtracted1=Long.parseLong(firstDigit);
		if((numExtracted1==4)&(str.length()==19)) {
			return "card Identified: Visa";
		}
		else {
			return "Invalid Input!!!";
		}
	}

}
