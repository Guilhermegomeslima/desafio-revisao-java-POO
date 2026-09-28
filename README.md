# desafio-revisao-java-POO

# 📦 Sistema de Gestão de Produtos (POO)

Este repositório contém a resolução de uma atividade prática de Programação Orientada a Objetos (POO) em Java. O objetivo é aplicar conceitos fundamentais como Herança, Polimorfismo, Encapsulamento e utilização de Enums.

## 🎯 Objetivo da Atividade

O sistema deve ser desenvolvido seguindo os seguintes requisitos:

### 1. Enumeração e Classe Base
- [x] Criar o enum **`CategoriaProduto`** para categorizar os produtos (ex: *ALIMENTO, BEBIDA, HIGIENE, LIMPEZA*, etc.).
- [x] Criar a classe **`Produto`** com os atributos: `codigo`, `nome` e `preco`.
- [x] Adicionar o atributo `categoria` (do tipo `CategoriaProduto`) na classe `Produto`. Esse atributo deve estar presente no construtor parametrizado.

### 2. Herança (Subclasse)
- [x] Criar a subclasse **`ProdutoPerecivel`** herdando de `Produto`.
- [x] Adicionar os atributos específicos: `dataValidade` e `temperaturaArmazenamento`.

### 3. Construtores e Encapsulamento
- [x] Todos os atributos de todas as classes devem ser **privados**, com métodos **Getters e Setters** implementados.
- [x] As classes `Produto` e `ProdutoPerecivel` devem ter um **construtor padrão** (vazio) e um **construtor parametrizado**.
- [x] Utilizar a palavra-chave `super()` nos construtores da subclasse para inicializar os atributos herdados.

### 4. Regras de Negócio e Polimorfismo
- [x] Criar o método **`calcularDesconto()`** na classe `Produto` para aplicar um desconto padrão de **10%** sobre o preço.
- [x] Sobrescrever (`@Override`) o método **`calcularDesconto()`** na classe `ProdutoPerecivel` para aplicar um desconto específico de **20%**.
- [x] Implementar o método **`obterDetalhes()`** na classe `Produto` para exibir todos os dados do produto.
- [x] Sobrescrever (`@Override`) o método **`obterDetalhes()`** na classe `ProdutoPerecivel` para incluir também os atributos específicos de validade e temperatura.

### 5. Execução (Classe Principal)
- [x] Criar a classe **`Programa`** contendo o método `main`.
- [x] Instanciar **dois objetos** da classe `Produto` e **um objeto** da classe `ProdutoPerecivel`.
- [x] Preencher os atributos de todos os objetos criados.
- [x] Exibir os detalhes e o **valor total do desconto** aplicado a cada produto na tela.