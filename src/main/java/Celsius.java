
public class Celsius extends Temperatura{
   
    //CONSTRUTOR
    public Celsius (double graus){
        super(graus);
    }
    
    //METODO PARA CONVERTER DE C PRA K 
    public double converterCpraK (){
        return getGraus() + 273.15;
    }
    
     //METODO PARA CONVERTER DE °C PRA °F  
    public double converterCpraF(){
        return (getGraus() *9/5)+32;
    }
   
}
