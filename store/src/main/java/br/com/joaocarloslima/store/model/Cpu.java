package br.com.joaocarloslima.store.model;

public class Cpu extends Componente {
    
    private Socket socket;

    public Cpu(Long id, String nome, int consumo, double preco, Socket socket){
        setId(id);
        setNome(nome);
        setConsumo(consumo);
        setPreco(preco);
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }
    
}


