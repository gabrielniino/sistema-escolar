# 🧠 Sistema de Relacionamentos em Java - POO com Associação, Agregação e Composição

<img align="center" alt="Java" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">

---

## 📚 Informações da Atividade

- **Professor:** Marcelo Yamamoto  
- **Matéria:** Linguagem de Programação Orientada a Objetos

---

## 📝 Descrição

Este projeto demonstra os conceitos fundamentais da **Programação Orientada a Objetos (P.O.O.)** em Java, com foco em:

- **Associação** (entre `Disciplina` e `Professor`)
- **Agregação** (entre `Curso` e `Aluno`)
- **Composição** (entre `Pessoa` e `Endereco`)

A aplicação cria um mini sistema onde instâncias de objetos se relacionam para simular cenários acadêmicos.

---

## 🌱 Estrutura do Projeto

```
src/
├── app/
│   └── App.java
└── model/
    ├── Aluno.java
    ├── Curso.java
    ├── Disciplina.java
    ├── Endereco.java
    ├── Pessoa.java
    └── Professor.java
```

---

## 🧠 Conceitos Aplicados

- Associação simples entre objetos
- Agregação (relacionamento "tem-um" com independência de ciclo de vida)
- Composição (relacionamento "tem-um" com dependência de ciclo de vida)
- Modularização de classes em pacotes
- Uso de construtores personalizados
- Exibição de dados via métodos de instância
- Documentação com **Javadoc**

---

## 💡 Como Executar

1. Compile e execute com uma IDE como Eclipse, IntelliJ ou VSCode, ou via terminal:

   ```bash
   javac -d bin src/model/*.java src/app/App.java
   java -cp bin app.App
   ```

2. Para gerar a documentação HTML com o **Javadoc**:

   ```bash
   javadoc -d docs -sourcepath src -subpackages model:app
   ```

3. Abra o arquivo `docs/index.html` no navegador para visualizar a documentação.

---

## 📌 Observações

Este projeto foi desenvolvido com o objetivo de fixar conceitos de relacionamento entre classes em POO, destacando diferenças entre associação, agregação e composição em um contexto didático e prático.

---

## 👨‍💼 Autor

Gabriel G. Pereira  
Engenharia de Software

