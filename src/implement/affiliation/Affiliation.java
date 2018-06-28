package implement.affiliation;

import implement.payday.Paycheck;

public interface Affiliation {
	NoAffiliation NO_AFFILIATION = new NoAffiliation();
	double calculateDeductions(Paycheck payCheck);
}
