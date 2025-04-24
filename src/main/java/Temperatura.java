
public class Temperatura {
    //ATRIBUTO PRIVADO PARA ARMAZENAR A TEMPERATURA 
    private double tempC;
    
    //CONSTRUTOR - CRIAR O OBJETO COM UMA TEMPERATURA INICIAL 
    
    public Temperatura(double  tempStartC){
    this.tempC = tempStartC;
    }
    
    // GETTER - PARA PEGAR OU LER A TEMPERATURA 
    public double getTemperaturaEmC(){
        return tempC;
    }
    
    // SETTER
    public void setTemperaturaEmC (double changeTempC){
    this.tempC = changeTempC; 
    }
    
    //METODO PARA CONVERTER DE °C PRA °F  
    public double converterCpraF(){
        return (tempC*9/5)+32;
    }
    
    //METODO PARA CONVERTER DE °C PRA K 
    public double converterCpraK (){
        return tempC + 273.15;
    }
}
