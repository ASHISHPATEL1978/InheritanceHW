package inheritancehw;

public class RunClass {

    public static void main(String[] args) {
        System.out.println(" Parent Class OnlineBanking ");
        BankingSystem A = new BankingSystem();
        A.openapp();
        A.entersecuritynumber();
        A.selectaccount();
        A.enterpayeedetails();
        A.enteramount();
        A.finishpayment();

        System.out.println (" Child Class HSBCBank ");
        HSBCBank H = new HSBCBank();
        H.openapp();
        H.entersecuritynumber();
        H.selectaccount();
        H.enterpayeedetails();
        H.enteramount();
        H.finishpayment();

        System.out.println (" Child Class NatWestBank ");
        NatWestBank N = new NatWestBank();
        N.openapp();
        N.entersecuritynumber();
        N.selectaccount();
        N.enterpayeedetails();
        N.enteramount();
        N.finishpayment();

        System.out.println (" Child Class SantanderBank ");
        SantanderBank S = new SantanderBank();
        S.openapp();
        S.entersecuritynumber();
        S.selectaccount();
        S.enterpayeedetails();
        S.enteramount();
        S.finishpayment();

    }
}
