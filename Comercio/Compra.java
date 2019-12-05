public class Compra
{
  int valorTotal;
  int numeroParcelas;
  
  // Construtores:
  
  //a vista
  public Compra(int valor)
  {
    valorTotal = valor;
    numeroParcelas = 1;
  }
  
  //a prazo
  public Compra(int qtdParcelas, int valorParcela)
  {
    numeroParcelas = qtdParcelas;
    valorTotal = qtdParcelas * valorParcela;
  }
  
  public int getValorTotal()
  {
    return valorTotal;
  }
  
  public int getNumeroParcelas()
  {
    return numeroParcelas;
  }
  
  public int getValorParcelas()
  {
    return valorTotal/numeroParcelas;
  }
  
  
  
  
  
}
