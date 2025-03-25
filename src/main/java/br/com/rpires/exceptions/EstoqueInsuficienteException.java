package br.com.rpires.exceptions;

public class EstoqueInsuficienteException extends RuntimeException {

    private static final long serialVersionUID = -2268140970978666251L;

    public EstoqueInsuficienteException(String msg) {
        super(msg);
    }
}
