
class RodarAplicacao {
 public static void main(String[] args) {

  // Instanciando objeto em classe
  Funcionario funcionario = new Funcionario();

  // Upcasts são implicitos
  Funcionario gerente = new Gerente();
  Funcionario vendedor = new Vendedor();
  Funcionario faxineiro = new Faxineiro();

  // Downcast devem ser explicitos
  // Gerente gerente_ = new Funcionario(); // <-- Exemplo erro downcast
  Vendedor vendedor_ = (Vendedor) new Funcionario();
 }
}