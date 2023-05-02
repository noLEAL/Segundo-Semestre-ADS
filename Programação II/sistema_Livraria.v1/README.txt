Trabalho Prático 1 – Sistema de livraria .v1

Uma livraria solicitou um software para cadastro de seus produtos (livros).
Durante os processos iniciais de projeto foram levantados os seguintes requisitos para
o software:

Requisito 1: O cadastro dos produtos precisa guardar as seguintes informações:
● Titulo
● Código
● Editora
● Área
● Ano
● Valor
● Quantidade em Estoque

Os dados dos livros devem ser armazenados em algum tipo de estrutura de dados como
por exemplo vetores ou listas.

Requisito 2: Listar todos os livros que foram cadastrados e suas informações. O
seguinte exemplo foi dado:

>>>>> Cod#0301
Titulo/Editora: Compiladores/Pearson
Categoria: Computação
Ano: 2016
Valor: R$ 85,00
Estoque: 125 unidades
Valor total em estoque: R$ 10625,00

>>>>>> Cod#1203
Titulo/Editora: Engenharia de Software/Pressman
Categoria: Computação
Ano: 2011
Valor: R$ 78
Estoque: 100 unidades
Valor total em estoque: R$ 7800,00

Requisito 3: Algumas formas de busca e filtragem de livros conforme suas informações:
● Busca pelo nome do livro.
● Informar quais livros tem preço menor que um valor.
● Apresentar livros de uma categoria específica.
● Buscar livros com valor de estoque maior que o indicado pelo usuário.

Requisito 4: Uma interface de usuário onde seja possível selecionar as ações
disponíveis. O sistema deve permitir que sejam executadas múltiplas ações. O seguinte
exemplo foi dado:

1 – Cadastrar novo livro
2 – Listar livros
3 – Buscar livros por nome
4 – Buscar livros por categoria
5 – Buscar livros por preço
6 – Busca por quantidade em estoque
7 – Valor total no estoque
0 – Encerrar atividades