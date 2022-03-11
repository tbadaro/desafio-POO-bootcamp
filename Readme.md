# Desafio de projeto: Bootcamp com orientação a objeto

Projeto desevolvido para o desafio de projeto: Abstraindo um Bootcamp Usando Orientação a Obejtos em Java.

O projeto implementa funcionalidades de um bootcamp online, tais quais o gerenciamento de Devs matriculados, e 
atividades como cursos e mentorias ministradas.

Classe Conteudo: 
A classe conteúdo é a classe mãe das classes Curso e Mentoria. Todo conteúdo tem um nome e uma descrição, com os 
métodos de get e set de ambos, além de um método para o cálculo de pontuação por atividade realizada, calcularXp().

Classe Curso:
A classe curso descreve os cursos ministrados no bootcamp. Como classe filha de Conteudo, ela recebe um nome e uma 
descrição, além de possuir uma carga horária. Na classe Curso, o método para cálculo de XP multiplica a carga horária
por um valor padrão de 10, totalizando a pontuação recebida pela conclusão do curso.

Classe Mentoria:
A classe curso descreve as emntorias ministradas no bootcamp. Como classe filha de Conteudo, ela recebe um nome e uma 
descrição, além de possuir uma data. Na classe Mentoria, o método para cálculo de XP apenas soma o valor 
padrão com 20.

Classe Dev:
A classe Dev descreve os participantes do bootcamp. O dev é descrito por um nome e um código identificador gerado a 
a partir do valor fixo DEV acrescido de um sequencial que parte de 1. O identificador foi implementado para o caso de
haver devs homônimos. Além disso cada dev tem uma lista de conteúdos nos quais se inscreveu e uma lista de conteúdos
concluídos. A classe possui 3 métodos principais além dos getters e setters: 
    
    inscreverBootcamp(Bootcamp bootcamp): Recebe como parâmtro o bootcamp no qual o dev será inscrito e o adiciona na 
    lista de devs matriculados no bootcamp. Adiciona o conteúdo do bootcamp à lista do dev de conteúdos inscritos. 
    Adiciona o ID do dev a uma lista auxiliar de IDs.

    progredir(): Esse método representa a conclusão de um conteúdo do bootcamp. Ele remove o primeiro conteúdo da 
    lista de inscritos e adiciona à lista de conteúdos concluídos.

    calcularTotalXp(): calcula a partir dos contaúdos concluídos o total de XP que o dev possui. 

Classe Bootcamp: 
A classe Bootcamp inicia o objeto bootcamp. Um bootcamp possui um nome, uma descrição, uma data de
início e uma de fim. Além disso cada bootcamp possui uma lista de conteúdos, uma de devs inscritos, e uma auxiliar de
Ids dos devs. Além dos getters e setters, a classe possui 3 métodos: 

    imprimirListaDevs(): Retorna os nomes e os Ids de todos os devs inscritos no bootcamp.

    imprimirListaConteudo(): Retorna o título de todos os conteúdos registrados no bootcamp.

    imprimirInfoDev(idDev): Recebe o Id de um dos devs inscritos, já que é um valor único, e retorna o nome,
    o id, os conteúdos inscritos e concluídos e o XP total.

Main:
A título de teste das funções implementas, a classe Main possui exemplos de operações possíveis dentro de um fluxo
normal de operação da aplicação. Na ordem:

    -Criação de um bootcamp e especificação do nome e descrição;

    -Criação de 2 cursos e uma mentoria, e a especificação de nomes, descrições, 
    carga horária no caso dos cursos e data para a mentoria;

    -Adição dos conteúdos ao bootcamp;

    -Criação do primeiro dev e inscrição no bootcamp;
    -Criação do segundo dev e inscrição no bootcamp;

    -Progredir o primeiro dev duas vezes;
    -Progredir o segundo dev três vezes;
      
    -Imprimir a lista de devs;
    -Imprimir a lista de conteúdo;
    -Imprimir as informações do dev com id DEV1;
    -Tentar imprimir as informações de um dev não cadastrado, DEV3, para testar o retorno de erro.   


