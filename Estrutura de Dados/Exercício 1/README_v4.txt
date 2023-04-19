Programa para Estruturas de Dados:

Um programa que (MAIN)cria/gerencia um objeto(!= classe) de um tipo (classe) criado pelo programador.
 
Esse objeto deve conter e manipular um vetor de N elementos inteiros (tamanho determinado na criação do objeto). 

Este programa deverá conter pelo menos duas classes: o programa principal e a classe que define o objeto com o vetor (podem ser desenvolvidas mais classes).



Programa Classe Principal : MAIN

=> Método para leitura de inteiros.

=> Declaração e instanciação do objeto que contém o vetor, atribuindo valor de referência vazio a todos os elementos.

=> Menu para gerenciar as seguintes opções (no mínimo, as opções listadas. podem existir outras):

01. Preencher o vetor do objeto com números pseudo-randômicos, em uma distribuição que minimize a possibilidade de valores duplicados.

02. Preencher o vetor do objeto com números pseudo-randômicos em ordem crescente;

03. Informar o total de elementos válidos no vetor do objeto;

04. Informar o maior e o menor valores existentes no vetor do objeto;

05. Listar todo o conteúdo do vetor do objeto;

11. Inserir um valor no vetor do objeto em uma determinada posição.

12. Apagar um valor do vetor do objeto, informando o valor a ser removido;

13. Apagar um valor do vetor do objeto, informando a posição do valor a ser removido.

21. Consultar a existência de um valor no vetor do objeto, utilizando busca sequencial;

22. Consultar a existência de um valor no vetor do objeto, utilizando busca binária;

31. Ordenar o vetor do objeto, utilizando o método Bubblesort;

32. Ordenar o vetor do objeto, utilizando o método Insertionsort;

33. Ordenar o vetor do objeto, utilizando o método Selectionsort.

33. Ordenar o vetor do objeto, utilizando o método Quicksort.





Classe que define o Objeto desta aplicação:

=> Atributos

   Um vetor de N elementos  - sendo que N é informado na instanciação deste;

   Sugestão de atributos auxiliares para registrar, entre outros dados:

    . Total de elementos válidos/ocupados

    . Próximo elemento a ser utilizado numa inserção

=> Métodos

    Construtor : instancia o objeto com o vetor e atribui valores iniciais ao vetor e aos outros atributos da classe

    ** Podem haver mais construtores (sobrecarga!)

    povoaVetor : atribui valores pseudo-randômicos a todos os elementos do vetor

    povoaVetorSequencial : atribui em ordem crescente, valores pseudo-randômicos a todos os elementos do vetor (este método pode ser somente uma sobrecarga do anterior!)

    atribuiValor : atribui um valor a um elemento do vetor

    retornaValor : informa o valor existente em determinado elemento do vetor 

    informaTamanho : informa o "length" do vetor

    informaQuantosOcupados : informa quantos dos elementos do vetor possuem valor válido (diferente do valor referência para vazio)

    adicionaValor : insere um valor no próximo elemento livre do vetor - de acordo com alguma estratégia adotada pelo programador (pode fazer uso do método atribuiValor)

    removeValor : remove um valor (atribuindo o valor referência para vazio) em um determinado elemento do vetor

    removeValor : remove um valor informado (atribuindo o valor referência para vazio), caso ele exista no vetor

    menorValor : informa o menor valor válido armazenado no vetor;

    maiorValor : informa o maior valor válido armazenado no vetor;

    buscaSequencial : executa uma busca sequencial de um determinado valor, para verificar se existe um elemento com este valor no vetor e retorna a posição em que foi encontrado.    

     buscaBinária : executa uma busca binária RECURSIVA de um determinado valor, para verificar se existe um elemento com este valor no vetor e retorna a posição em que foi encontrado.    

    ordenaBubble : executa uma ordenação no vetor desordenado (povoado com valores não sequenciais) utilizando o método bubblesort;

    ordenaInsert : executa uma ordenação no vetor desordenado (povoado com valores não sequenciais) utilizando o método insertionsort;

    ordenaSelect : executa uma ordenação no vetor desordenado (povoado com valores não sequenciais) utilizando o método selectionsort;



Para todos os métodos, o programador deverá definir quais os argumentos (parâmetros) que serão informados - bem como determinar os conjuntos diferentes de argumentos que configuram a sobrecarga desses métodos. Também deverá definir qual o tipo de retorno e seus significados, para o caso de usar o retorno como categorização de erro/sucesso do processo.


