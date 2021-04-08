package my.example;

public class DisplayTable {
    public void NextDayDelivery(){
        line();
        System.out.printf("\n\t\t\tDocument (below 2kg)\t\t\t\tParcel(above 2kg)\n");
        line();
        System.out.printf("\n\t   First 500gm\t   Subsequent 250gm\t\t2.001-2.5kg\t\tSubsequent 500gm\n");
        line();
        System.out.printf("\nZone 1\t\t4.90\t\t\t0.80\t\t\t\t10.50\t\t\t0.50\n");
        System.out.printf("\nZone 2\t\t5.40\t\t\t1.00\t\t\t\t16.00\t\t\t2.00\n");
        System.out.printf("\nZone 3\t\t6.90\t\t\t1.50\t\t\t\t21.00\t\t\t3.00\n");
        System.out.printf("\nZone 4\t\t7.40\t\t\t1.50\t\t\t\t26.00\t\t\t3.50\n");
        System.out.printf("\nZone 5\t\t7.90\t\t\t2.00\t\t\t\t31.00\t\t\t4.00\n");
        line();
    }

    public void SameDayDelivery(){
        line();
        System.out.printf("\nWeight\t\t\t\tLocal Town\t\t\t\t\t\t\t\tCross Town\n\t\t");
        line();
        System.out.printf("\n\t\t  Domestic Charge\tSurcharge\tTotal\t  Domestic Charge\tSurcharge\tTotal\n");
        line();
        System.out.printf("\nBelow 500gm\t\t4.90\t\t  6.00\t\t10.90\t\t   5.40\t\t\t  7.50\t\t12.90\n");
        System.out.printf("500gm-750gm\t\t5.70\t\t  6.00\t\t11.70\t\t   6.40\t\t\t  7.50\t\t13.90\n");
        System.out.printf("750gm-1kg\t\t6.50\t\t  6.00\t\t12.50\t\t   7.40\t\t\t  7.50\t\t14.90\n");
        line();
    }

    public void PrepaidBoxEnvelope() {
        line();
        System.out.printf("\nJenis\t\t Envelope S\t\t\t Envelope L\t\t      Prepaid Box S\t\t  Prepaid Box M\t\t  Prepaid Box L\n");
        line();
        System.out.printf("\nSaiz\t\t280mm*200mm\t\t\t380mm*320mm\t\t\t340mm*250mm*80mm\t340mm*250mm*150mm\t380mm*320mm*x200mm\n\n");
        System.out.printf("Berat Max\t\t500g\t\t\t\t1kg\t\t\t\t\t 2kg\t\t\t\t\t5kg\t\t\t\t  10kg\n\n");
        System.out.printf("Harga\t\t   RM7.31\t\t\t  Rm10.49\t\t\t   RM13.78\t\t\t\t  RM21.20\t\t\t RM31.80\n");
        line();
    }

    public void posEkspres() {
        line();
        System.out.printf("\nJenis\t\t\t  LG\t\t\t\t  LE(C5)\t\t\t LD(B4)\t\t\t     LK\n");
        line();
        System.out.printf("\nSaiz\t\t   220mm*110mm\t\t\t229mm*162mm\t\t  353mm*250mm\t\t 340mm*250mm\n\n");
        System.out.printf("Berat Max\t\t 100g\t\t\t\t   250g\t\t\t\t  500g\t\t\t\t1000g\n\n");
        System.out.printf("Berat Max\t\t 3mm\t\t\t\t   5mm\t\t\t\t  10mm\t\t\t\t25mm\n\n");
        System.out.printf("Harga\t\t\tRM3.18\t\t\t\t  Rm3.71\t\t\t RM4.77\t\t\t    RM7.42\n");
        line();
    }

    public void line(){
        int line = 1;
        while (line <= 100) {
            System.out.printf("%c", 45);
            line++;
            }
        }

}
