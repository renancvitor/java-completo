package Services;

import java.security.InvalidParameterException;

public class UsalInterestService implements InterestService {

    private double interestRate;

    public UsalInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
