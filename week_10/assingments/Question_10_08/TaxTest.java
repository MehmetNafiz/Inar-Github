package week_10.assingments.Question_10_08;

public class TaxTest {

    static final String COLUMN_HEADER = "Taxable Income |  Single Filer | Married Jointly |  Married Separately |" +
            "  Head " + "Of House";

    public static void main(String[] args) {

        double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets2009 = {
                {8_350, 33_950, 82_250, 171_550, 372_950},
                {16_700, 67_900, 137_050, 20_885, 372_950},
                {8_350, 33_950, 68_525, 104_425, 186_475},
                {11_950, 45_500, 117_450, 190_200, 372_950}
        };

        System.out.println(COLUMN_HEADER);

        for (int taxable = 50_000;  taxable<=60_000; taxable += 1000){

            System.out.printf("\t%d", taxable);

            Tax taxHelper2 = new Tax(Tax.SINGLE_FILER, brackets2009, taxable, rates2009);
            System.out.printf("\t\t\t %.2f", taxHelper2.getTax());

            taxHelper2.setFilingStatus(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER);
            System.out.printf("\t\t %.2f", taxHelper2.getTax());

            taxHelper2.setFilingStatus(Tax.MARRIED_SEPARATELY);
            System.out.printf("\t\t\t %.2f", taxHelper2.getTax());

            taxHelper2.setFilingStatus(Tax.HEAD_OF_HOUSEHOLD);
            System.out.printf("\t\t\t %.2f" + "\n", taxHelper2.getTax());
        }
    }
}
