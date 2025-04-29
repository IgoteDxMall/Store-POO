package br.com.joaocarloslima.store.model;

public class Ram extends Componente {
    
    private TipoMemoria tipo;
    private int tamanhoGb;

    public Ram(Long id, String nome, int consumo, double preco, TipoMemoria tipo, int tamanhoGb){
        setId(id);
        setNome(nome);
        setConsumo(consumo);
        setPreco(preco);
        this.tipo = tipo;
        this.tamanhoGb = tamanhoGb;
    }

    public TipoMemoria getTipo() {
        return tipo;
    }

    public int getTamanhoGb() {
        return tamanhoGb;
    }
}
