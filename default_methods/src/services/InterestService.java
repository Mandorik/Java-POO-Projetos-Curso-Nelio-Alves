package services;

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRate();
	default double payment(double amount, int months) {

		if (months < 1) {
			throw new InvalidParameterException("Invalid input");
		} else
			for (int i = 0; i < months; i++) {
				amount = amount * ((100 + getInterestRate()) / 100);
			}

		return amount;
	}}


	// O getInterestRate() não pode ser default pois precisa do interestRate e a interface não armazena estado
	// Interface não pode ter construtor também