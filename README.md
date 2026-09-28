# 📦 Sistema de Gestão de Produtos (POO)

Este repositório contém a resolução de uma atividade prática de Programação Orientada a Objetos (POO) em Java. O objetivo é aplicar conceitos fundamentais como Herança, Polimorfismo, Encapsulamento e utilização de Enums.

## 🎯 Objetivo da Atividade

O sistema foi desenvolvido seguindo os seguintes requisitos:

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

---

## ⚙️ Pré-requisitos

Para rodar este projeto na sua máquina, você vai precisar de:
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) instalado (versão 8 ou superior).
- Uma IDE para compilar e executar o código, como **jGRASP**, **VS Code**, Eclipse ou IntelliJ.

---

## 📥 Como baixar o projeto

Você pode fazer o download do projeto em formato `.zip` diretamente pelo GitHub, ou clonar o repositório utilizando o Git.

Para clonar via terminal, escolha um diretório de sua preferência e execute o seguinte comando:

```bash
# Clonar o repositório
git clone https://github.com/Guilhermegomeslima/desafio-revisao-java-POO.git

# Entrar no diretório do projeto
cd desafio-revisao-java-POO
```

---

## ▶️ Como Executar

### Opção 1: Usando o jGRASP (IDE utilizada no projeto)
1. Abra o jGRASP.
2. Vá em `File > Open` e abra os 4 arquivos `.java` do projeto (`CategoriaProduto.java`, `Produto.java`, `ProdutoPerecivel.java` e `Programa.java`).
3. Deixe o arquivo **`Programa.java`** (que contém o método `main`) aberto e em foco na tela.
4. Clique no botão de **Compilar** (ícone de um sinal de `+` verde no menu superior) ou pressione `Ctrl + B`.
5. Após compilar sem erros, clique no botão de **Executar** (ícone de um boneco correndo) ou pressione `Ctrl + R`.
6. A saída do programa será exibida na aba **"Run I/O"** na parte inferior da tela.

### Opção 2: Usando o Visual Studio Code (VS Code)
1. Certifique-se de ter a extensão **Extension Pack for Java** instalada no seu VS Code.
2. Abra a pasta onde os arquivos `.java` foram salvos (`File > Open Folder...`).
3. Abra o arquivo **`Programa.java`**.
4. Logo acima da linha `public static void main(String[] args)`, aparecerá um pequeno botão clicável escrito **Run** (Executar). Clique nele.
5. O VS Code irá compilar as dependências automaticamente e exibirá o resultado na aba **Terminal**.