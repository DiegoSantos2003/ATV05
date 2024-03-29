package model;

import Controller.SaldoInsuficienteException;

public class Conta {
    private int agencia;
    private int codigo;
    private float saldo;
    private float limite;

    public Conta() {
        
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void deposita(float valor) {
        saldo += valor;
    }

    public void saca(float valor) throws SaldoInsuficienteException {
        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Limite para saque: " + (saldo + limite));
        }
        saldo -= valor;
    }
}