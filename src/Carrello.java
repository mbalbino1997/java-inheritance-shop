import java.util.Locale;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) throws Exception {
        int num;
        int index=0;
        boolean firstTime=true;
        Scanner sc= new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Quanti prodotti vuoi inserire nel carrello?");
        do {
            if(!firstTime) System.out.println("Inserisci un numero maggiore di 0");
            num=sc.nextInt();
        } while(num<=0);
        Prodotto[] arrayProdotti= new Prodotto[num];
        while(index<arrayProdotti.length) {
            int productNumber;
            do {System.out.println("Inserisci il numero corrispondente al prodotto per selezionarlo 1-Smartphone; 2-Televisore; 3-Cuffie");
            productNumber = sc.nextInt();} while(productNumber!=1 && productNumber!=2 && productNumber!=3);
            System.out.println("Inserisci il codice del prodotto:");
            int code=sc.nextInt();
            sc.nextLine();
            System.out.println("Inserisci il nome del prodotto:");
            String name=sc.nextLine();
            System.out.println("Inserisci il brand del prodotto:");
            String brand=sc.nextLine();
            System.out.println("Inserisci il prezzo del prodotto:");
            double price=sc.nextDouble();
            sc.nextLine();
            System.out.println("Inserisci l'iva del prodotto:");
            int iva=sc.nextInt();
            sc.nextLine();
            switch(productNumber) {
                case 1:
                    System.out.println("Inserisci l'IMEI del prodotto:");
                    String IMEI=sc.nextLine();
                    System.out.println("Inserisci la memoria del prodotto (GB):");
                    double memory=sc.nextDouble();
                    sc.nextLine();
                    arrayProdotti[index]=new Smartphone(code,name, brand, price, iva, IMEI, memory);
                    break;

                case 2:
                    System.out.println("Inserisci la grandezza del prodotto (pollici):");
                    double size=sc.nextDouble();
                    sc.nextLine();
                    System.out.println("E' una smart tv? (si/no)");
                    String inp = sc.nextLine();
                    boolean smartTv=inp.equalsIgnoreCase("si");
                    arrayProdotti[index]=new Televisori(code, name, brand, price, iva, size, smartTv);
                    break;

                case 3:
                    System.out.println("Inserisci il colore del prodotto:");
                    String colour=sc.nextLine();
                    System.out.println("Sono cuffie wireless? (si/no)");
                    String inp2 = sc.nextLine();
                    boolean wireless=inp2.equalsIgnoreCase("si");
                    arrayProdotti[index]=new Cuffie(code, name, brand, price, iva, colour, wireless);
                    break;
            }

            index++;

        }

        for(Prodotto prodotto : arrayProdotti) {
            System.out.println(prodotto);
        }

    }
}
