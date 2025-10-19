import java.util.Scanner;

public class savings_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kalkulues i kursimeve");
        System.out.println("Publikuar ne GitHub: https://github.com/pixelity2/savings-calculator-java");
        
        System.out.println(" ");
        
        System.out.println("---Kalkuluesi i kursimeve---");
        
        System.out.println(" ");

        System.out.print("Shkruani shumen e kursimeve mujore: ");
        double kursimetMujore = input.nextDouble();
        
        System.out.println(" ");

        System.out.print("Shkruani % e interesit vjetor: ");
        double interesiVjetor = input.nextDouble();
        double interesiMujor = (interesiVjetor / 100.0) / 12.0;
        
        System.out.println(" ");

        System.out.print("Shkruani kohezgjatjen ne muaj: ");
        int kohezgjatja = input.nextInt();
        
        System.out.println(" ");
        
        System.out.println("Tabela armotizuese per kursimet prej " + kursimetMujore + " /muaj, me interes vjetor prej " + interesiVjetor + "% dhe me kohezgjatje prej " + kohezgjatja + " muajsh.");
        
        System.out.println(" ");
        
        double shumaTotale = 0;
        double shumaTotalePerShfaqje = 0;

        for (int i = 1; i <= kohezgjatja; i++) {
            shumaTotale = (kursimetMujore + shumaTotale) * (1 + interesiMujor);
            shumaTotalePerShfaqje = Math.round(shumaTotale * 100.0) / 100.0;
            System.out.println("Kursimet pas muajit " + i + " jane: " + shumaTotalePerShfaqje);
        }
        
        double kapitali = Math.round((kursimetMujore * kohezgjatja) * 100.0) / 100.0;
        double interesiIFituar = Math.round((shumaTotale - kapitali) * 100.0) / 100.0;
        
        System.out.println(" ");
        
        System.out.println("Kapitali total per " + kohezgjatja + " muaj eshte " + kapitali);
        System.out.println("Interesi i fituar per " + kohezgjatja + " muaj eshte " + interesiIFituar);
        System.out.println("Shuma totale per " + kohezgjatja + " muaj eshte " + shumaTotalePerShfaqje);
        

        

    
    }
}