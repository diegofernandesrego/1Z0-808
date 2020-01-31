## Trabalhando com tipos de dados em java

A declaração de variável no java, obrigatoriamente, deve informar o tipo e o nome de desejamos para ela.
Nem toda linguagem exige que as variáveis sejam iniciadas antes de serem
utilizadas. Mas, no Java, a inicialização é obrigatória e pode ser implícita ou
explícita. É de fundamental importância saber que, para usar uma variável, é
necessário que ela tenha sido iniciada explicitamente ou implicitamente em
algum momento antes da sua utilização

```java
public void method(){
    int age;

    System.out.println(age); //compilation error
}
```
Já o código a seguir mostra a inicialização explícita de nossa variável:

```java
public void method(){
    int age;

    age = 10; //explicit initialization

    System.out.println(age); // ok
```

Podemos declarar e iniciar a variável na mesma instrução:

```java
double pi = 3.14;
```

Se eu tenho um IF, a inicialização deve ser feita em todos so caminhos possiveis para que não haja um erro de compilação no momento de utilizaçao da variável.

```java
void method(init a){
    double x;
    if(a > 1){
        x = 6;
    }
    System.out.printn(x); //compile error
}

```

O código a seguir mostra como corrigir a situação

```java
void method(init a){
    double x;
    if(a > 1){
        x = 6 ;
    }else{
        x= 0
    }
    
    System.out.println(x); //ok
}
```

Quando a variável é membro de uma classe, ela é iniciada implicitamente
junto com o objeto com um valor default, esse processo pode ser chamado de
inicialização implícita ( implicit initialization ).
```java
class Exam {
        double timeLimit; // implicit initialization: 0.0
    }
    
    Exam exam = new Exam();
    
    System.out.println(exam.timeLimit);
```

Outro momento em que ocorre a inicialização implícita é criação de arrays;

```java
ini[] numbers = new int[10];

System.out.println(number[0])//
```

Tanto quando declaradas como variáveis membro, ou quando array são criados, os valores default para variáveis são;

- Primitivos numéricos interios **0**
- Primitivos numéricos com ponto flutuante **0.0**
- boolean **false**
- char **vazio**, equivalente a **0**
- referência **null**


parei na pagia 60 tipo primitivo -------------------------