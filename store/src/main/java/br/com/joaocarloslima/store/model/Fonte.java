package br.com.joaocarloslima.store.model;

public class Fonte extends Componente {
    
    private int potencia;

    public Fonte(Long id, String nome, int consumo, double preco, int potencia) {
        setId(id);
        setNome(nome);
        setConsumo(consumo);
        setPreco(preco);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    
}
