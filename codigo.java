public class CadastroJogadores {

public void salvar(String nome, int numeroCamisa) {


Jogador novoJogador = new Jogador(nome, numeroCamisa);

SistemaDeCadastro.adicionarJogador(novoJogador);

mostrarMensagem("Jogador cadastrado com sucesso!");
}

private void mostrarMensagem(String mensagem) {
}
}
