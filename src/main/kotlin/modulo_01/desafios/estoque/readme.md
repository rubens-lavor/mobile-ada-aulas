## Controle de Estoque:

Você foi contratado pelo mecanico do seu bairro, para ajuda-ló a organizer seu estoque de peças, para isso você utilizou
seus conhecimentos em programação para automatizar um sistema que cumpra os seguintes requisitos.

- Ter um menu principal, onde o usuário pode decidir o que quer fazer:

  - ADICIONAR ITEM
  - EDITAR ITEM
  - EXIBIR ITENS EM ESTOQUE
  - EXIBIR TODOS OS ITENS
  - FECHAR SISTEMA

- Salvar os seguintes campos para exibir, id (valor inteiro que se inicia a partir do 1 e não pode se repetir), nome da peça e quantidade;

- A lista pode ter os campos 'nome' e 'quantidade' editados, o usuário pode altera-los quando necessário;

- Não será possivel excluir um item da lista, somente desativa-lo zerando sua quantidade.

- Deve ser possivel exibir a lista completa de peças e a lista de peças em estoque, onde a quantidade seja maior que zero.

- A Quantidade máxima de cada item no estoque é de 999, caso tente adicionar mais itens que ultrapasse esse valor no estoque
deve ser lançada uma Excpetion (LimiteEstoqueMaxExcpetion);

- O Programa deve tratar as exceções que podem acontecer

Ex:

ID | Peça | Quantidade

#0001| Parafuso | 38 | 

#0002| Porca | 38 | 

#0003| Parafuso II | 38 | 

#0004| Parafuso III | 38 |
