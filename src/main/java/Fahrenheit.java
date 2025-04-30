
public class Fahrenheit extends Temperatura{
    //CONSTRUTOR 
    public Fahrenheit (double graus){
        super(graus);
    }
    
    //MÉTODO PARA CONVERTER DE °F PARA °C
    public double converterFpraC(){
        return (getGraus() - 32) / 1.8;
    }
    // MÉTODO PARA CONVERTER DE °F PARA K 
    public double converterFpraK (){
        return  (getGraus()+ 459.67) / 1.8;
    }
}
 