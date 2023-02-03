public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Cookie" , 10 , 120,105,30 ) ;
        Fighter f2 = new Fighter("Alex", 20,85,103, 40) ;

        Match match = new Match(f1,f2, 90,110) ;
        match.run();

    }
}
