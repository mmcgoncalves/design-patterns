package command;

public class ConcluiPedido implements Comando{

	private Pedido pedido;

    public ConcluiPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executa() {
    	System.out.println("Finalizando cliente:"+pedido.getCliente());
        pedido.finaliza();
    }


}
