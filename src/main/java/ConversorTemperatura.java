public class ConversorTemperatura {

    public static void main(String[] args) {
        Temperatura c1 = new Temperatura(50.5);
        
        System.out.println("Temp em °F " + c1.converterCpraF());
        
        
        Temperatura c2 = new Temperatura(100);
        
        System.out.println("Temp em K " + c2.converterCpraK());
    }
}
