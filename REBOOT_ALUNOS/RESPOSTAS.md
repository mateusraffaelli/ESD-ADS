# Operação REBOOT — registro da equipe

Integrante: Mateus Raffaelli

## Missão 1 — Inventário
Previsão ANTES de executar (vetor final, tamanho, capacidade e deslocamentos):
- Resultado do código com erro: [99, 10, 10, 10, 0], tamanho 4, 3 deslocamentos (todos copiando o 10).
- Resultado correto: [99, 10, 20, 30, 0].

Resultado observado na versão inicial:
- Inserir no início/meio espalha o primeiro valor pelas posições seguintes. Inserir no fim funciona. remover deixa o último valor duplicado

Causa da falha e correção (explique; não basta colar o código):
- O laço andava da esquerda para a direita, e cada cópia apagava o próximo elemento antes de ele ser copiado. Para deslocar para a direita, o laço precisa ir de trás para frente
- o limite i < tamanho - 2 pulava o último deslocamento. O certo é i < tamanho - 1.

Custo de inserir no início e no fim com espaço; por quê?
- Inserir no início: O(n), porque todos os elementos precisam andar uma posição.
- Inserir no fim: O(1), porque não há nada para deslocar.

## Missão 2 — Fila circular
Previsão ANTES de executar (posições físicas, início, fim, tamanho e ordem lógica):
- os elementos entram em sequência e, quando chegam ao fim do vetor, voltam para o começo.

Resultado observado: 
- A fila quebrava com erro de índice fora do limite

Causa da falha e correção:
- os ponteiros só subiam (inicio++) e nunca voltavam ao começo do vetor. A solução é usar o resto da divisão:
inicio = (inicio + 1) % dados.length

Como distinguir cheia de vazia? Como obter O(1) nas operações?
- tamanho == 0 -> vazia
- tamanho == dados.length -> cheia
- Para obter O(1) é só usar os índices inicio e fim e a variável tamanho. Assim não é preciso nenhum laço para mover elementos.

## Missão 3 — Escalonador
Previsão ANTES de executar (turno, processo, executado, restante, fila):
- cada processo usa a CPU por um tempo. Se não terminar, volta para o fim da fila.

Causa das falhas e correções:
- Usar addFirst() em vez de addLast(): o processo voltava para o início da fila
- Somar o quantum inteiro mesmo quando o processo precisava de menos: Math.min(quantum, restante[p])
- Alterar o array original do usuário : usar uma cópia (duracoes.clone())

Por que um processo volta ao fim? Por que preservar o array de entrada?
- Para que os outros processos que esperam também têm sua vez
- Para evitar efeitos colaterais. Quem chamou o método pode precisar dos dados originais para outras contas.


## Fechamento individual (cada integrante responde)
Nome:
1. Tamanho e capacidade são a mesma coisa?
Resposta: Não. Tamanho é a quantidade de elementos atual e capacidade é o total de elementos que pode ter 
2. A fila pode começar fisicamente no índice 2?
Resposta: Sim. O "inicio" pode apontar para qualquer indice no array
3. O primeiro processo a chegar precisa terminar primeiro?
Resposta: Não. Se o primeiro processo a chegar for muito longo e o segundo processo for muito curto, o segundo processo pode terminar antes do primeiro
4. Qual conteúdo você precisa praticar mais?
Resposta: Escalanador

## Desafio extra, se houver tempo
Novo cenário de teste, resultado esperado e qual erro ele detecta:
