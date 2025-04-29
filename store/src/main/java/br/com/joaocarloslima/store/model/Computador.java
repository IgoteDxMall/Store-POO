package br.com.joaocarloslima.store.model;

public class Computador {
    public PlacaMae placaMae;
    public Cpu cpu;
    public Ram ram;
    public Fonte fonte;

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Fonte getFonte() {
        return fonte;
    }

    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }

    public String status() {
        if (placaMae == null || cpu == null || ram == null || fonte == null) {
            return "Computador incompleto";
        }

        if (!placaMae.compativel(cpu)) {
            return "Incompatibilidade entre CPU e Placa Mãe";
        }

        if (placaMae.getTipoMemoria() != ram.getTipo()) {
            return "Incompatibilidade entre RAM e Placa Mãe";
        }

        int consumoTotal = placaMae.getConsumo() + cpu.getConsumo() + ram.getConsumo();
        if (consumoTotal > fonte.getPotencia()) {
            return "Fonte insuficiente para o sistema";
        }

        return "Computador completo e funcionando";
    }

    public double precoTotal() {
        double total = 0;
        if (placaMae != null) total += placaMae.getPreco();
        if (cpu != null) total += cpu.getPreco();
        if (ram != null) total += ram.getPreco();
        if (fonte != null) total += fonte.getPreco();
        return total;
    }

}
