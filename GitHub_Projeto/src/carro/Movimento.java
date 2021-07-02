package carro;

public class Movimento {

	public static void main(String[] args) {
		Carro c = new Carro();
		System.out.println("----- Movimentando Carro -----");
		c.Acelerar();
		c.Acelerar();
		c.Acelerar();
		c.Acelerar();
		c.Acelerar();
		c.Desacelerar();
		c.Desacelerar();
		c.Desacelerar();
		c.Acelerar();
		c.Acelerar();
		c.Acelerar();
		CarroCorrida cc = new CarroCorrida();
		System.out.println("----- Movimentando Carro Corrida -----");
		cc.Acelerar();
		cc.Acelerar();
		cc.Acelerar();
		cc.Desacelerar();
		cc.Desacelerar();
		cc.Desacelerar();
	}

}
