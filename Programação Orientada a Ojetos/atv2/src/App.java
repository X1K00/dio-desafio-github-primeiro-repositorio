public class App {
    public static void main(String[] args) {
        
        // Funcionario funcionario = new Funcionario();

        // Funcionario gerente = new Gerente();
        // Funcionario vendedor = new Vendedor();
        // Funcionario faxineiro = new Faxineiro();

        // //Gerente gerente_ = new Funcionario();
        // Vendedor vendedor_ = (Vendedor) new Funcionario();
    Funcionario[] classes = new Funcionario[]{new Gerente(), new Faxineiro(), new Vendedor()}; 
    
    //polimorfismo
    for (Funcionario classe: classes){
        classe.metodo1();
    }
    System.out.println("");

    for (Funcionario classe: classes){
        classe.metodo2();
    }
    System.out.println("");

    //sobrescrita
    Faxineiro faxineiro = new Faxineiro();
    faxineiro.metodo2();

    }
}
