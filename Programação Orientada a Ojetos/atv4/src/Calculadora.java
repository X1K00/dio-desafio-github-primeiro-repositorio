class Calculadora implements OperacaoMatematica {
    //Interface
    
    @Override
    public void soma(double operando1, double operando2){
        System.out.println("Soma: "+ (operando1 + operando2));
    }
    @Override
    public void subtracao(double operando1, double operando2){
        System.out.println("Subtração: "+ (operando1 - operando2));
    }
    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("multiplicação: "+ (operando1 * operando2));
        
    }
    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println("Divisão: "+ (operando1 / operando2));
        
    }
}

// A interface obriga o terceiro a implementar os metodos que vc vai chamar dentro de algum processamento seu