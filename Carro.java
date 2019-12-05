import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class Carro
{
  int potencia;
  float velocidade;
  String nome;
  
  void acelerar() 
  {
    velocidade += potencia;
  }
  
  void frear()
  {
  	velocidade *= 0.5;
  }
  
  void getVelocidade()
  {
    return velocidade;
  }
  
  void imprimir()
  {
    System.out.println("O carro "+nome+" está a velocidade de "+getVelocidade()+" km/h.");
  }
  
}
