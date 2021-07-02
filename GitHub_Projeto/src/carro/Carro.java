package carro;

public class Carro {
	int velocidade=10;
	
	public void Acelerar()
	{
		velocidade++;
		System.out.println("Acelerando Carro ... " + velocidade);
	}
	
	public void Desacelerar()
	{
		velocidade--;
		System.out.println("Desacelerando Carro / Corrida ... " + velocidade);
	}
}
