
public class Kelvin extends Temperatura {
    //CONTRUTOR
    public Kelvin (double graus){
        super (graus);
    }
    
        //MÉTODO PARA CONVERTER DE K PARA °F
    public double converterKpraF(){
        return ((getGraus()-273.15)*9/5)+ 32;
    }
    // MÉTODO PARA CONVERTER DE K PARA °C
    public double converterKpraC (){
        return getGraus()-273.15;
    }
}
