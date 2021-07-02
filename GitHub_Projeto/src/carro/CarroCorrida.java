package carro;

public class CarroCorrida extends Carro {
	@Override
	public void Acelerar()
	{
		velocidade+=10;
		System.out.println("Acelerando Carro de Corrida ... " + velocidade);
	}
}
