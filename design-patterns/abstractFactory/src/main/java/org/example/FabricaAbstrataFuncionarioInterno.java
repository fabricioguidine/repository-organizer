package org.example;
public class FabricaAbstrataFuncionarioInterno implements FabricaAbstrata{
    @Override
    public Holerite createHolerite() {
        return new HoleriteFuncionarioInterno();
    }
    @Override
    public Relatorio createRelatorio() {
        return new RelatorioFuncionarioInterno();
    }
}
