package Banco;

public class ColaBanco {
    private Cliente[] filaClientes;
    private int capacidadMaxima;
    private int tamaño;
    private int frente;
    private int trasero;

    public ColaBanco(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        this.filaClientes = new Cliente[capacidadMaxima];
        this.tamaño = 0;
        this.frente = 0;
        this.trasero = -1;
    }

    public void agregarCliente(Cliente cliente){
        if (tamaño < capacidadMaxima) {
            trasero = (trasero + 1) % capacidadMaxima;
            filaClientes[trasero] = cliente;
            tamaño++;
            System.out.println("Cliente " + cliente.getNombre() + " se ha unido a la fila");
        } else {
            System.out.println("Lo lamento la fila ya está llena, vaya a la calle");
        }
    }

    public Cliente atenderSiguienteCliente(){
        if (tamaño > 0) {
            Cliente clienteAtendido = filaClientes[frente];
            frente = (frente + 1) % capacidadMaxima;
            tamaño--;
            System.out.println("Cliente: " + clienteAtendido.getNombre() + " fue atendido");
            return clienteAtendido;
        } else {
            System.out.println("No hay más personas en la fila");
            return null;
        }
    }

    public int cantidadClientesEnFila(){
        return tamaño;
    }
}
