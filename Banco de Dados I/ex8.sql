#1 - Faça as inserções dos seguintes alunos:

 #INSERT INTO <<nome_da_tabela>>

  #         (<<campo 1>>, <<campo 2>>, ...)

   #        VALUES

    #       (<<valor 1>>, <<valor 2>>, ...);

INSERT INTO escola.aluno
    (nome, ra, endereco, telefone, rg, cpf)
    VALUES
	('Marcos Paulo', 12354, 'Rua dos Eucaliptos', '5132470987', '8878788', '123445590'),
	('Caroline Silveira', 8667, 'Rua das Margaridas', '51987659877', '7657657', '178678609'),
	('Inácio Pena', 65654, 'Rua dos Marimbondos', '51767687709', '76576588', '5467587'),
	('Carla Farias', 8987, 'Rua das Gurias', '5198655576', '7657657', '9876434-19');

#2 - Faça as inserções dos seguintes professores:

INSERT INTO escola.professor
	(nome, num_matricula, endereco, telefone, email)
	VALUES
	('Joana Mendes', 1223, 'Rua das Princesas', '53987679770', 'joana.mendes@gmail.com'),
	('Flávio Canto', 4523, 'Rua dos Cangurus', '53876549087', 'flavio.cantop@hotmail.com');

#3 - Faça as inserções dos seguintes cursos:

INSERT INTO escola.curso
	(nome, id, duracao, professor_num_matricula)
    VALUES
    ('Informática Básica', 1, 60, 1223),
	('Informática Avançada', 2, 90, 4523);

#4 - Faça as inserções das seguintes salas:

401, Laboratório de Info I .
404, Laboratório de Info II .
403, Laboratório de Info III .

#5 - Os estudantes estão matriculados nos seguintes cursos:

Marcos Paulo - Informática Básica
Caroline Silveira - Informática Básica e Informática Avançada
Inácio Pena - Informática Avançada
Carla Farias - Informática Básica e Informática Avançada

#6 - Os cursos tem as seguintes turmas:

Informática Básica, Manhã, na sala 401
Informática Avançada, Noite, na sala 403
Informática Avançada, Tarde, na sala 404

#7 - Matricule os alunos nas suas respectivas turmas:

Turma de informática básica manhã: todos estudantes do curso nessa turma;
Turma de informática avançada noite: Caroline Silveira e Inácio Pena
Turma de Informática avançada tarde: Carla Farias

#INSERT ATE AQUI

#8 - Selecione as turmas que tem aula na sala 401.

#9 - Selecione os estudantes, as turmas e o professor do curso de informática avançada.

#10 - Atualize a turma de Informática Básica para o turno da tarde.