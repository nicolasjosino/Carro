public class Carro {
  String fabricante, modelo;
  int ano;

  public void Andar(double velocidade){
    System.out.println("o " + fabricante + " " + modelo + " " + ano + " está andando a " + velocidade + "km/h.");
  }
}