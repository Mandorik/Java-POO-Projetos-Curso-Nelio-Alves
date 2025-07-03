package services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {

	private Double interestRate;

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}


	// Por agora ser um método default, não há mais necessidade de ter no service que o implementa, não precisa sobreescrevê-los

	//	@Override
	//	public double payment(double amount, int months) {
	//
	//		if (months < 1) {
	//			throw new InvalidParameterException("Invalid input");
	//		} else
	//			for (int i = 0; i < months; i++) {
	//				amount = amount * ((100 + interestRate) / 100);
	//			}
	//
	//		return amount;
	//	}

	public double payment2(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero!");
		}
		return amount * Math.pow(1.0 + interestRate / 100.0, months);
	}
}

