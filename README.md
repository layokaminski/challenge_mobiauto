# Desafio Mobiauto

Projeto criado para o desafio da mobiauto

## ⚙️ Executando os requistos

No arquivo `src/App.java` para testar cada requisito do desafio, devemos chamar a Classe e chamar o método `execute`

### 🔩 Exemplo de execução

```java
public class App {
    public static void main(String[] args) throws Exception {
        FizzBuzz.execute();
    }
}
```
Ou no caso do método necessitar da função `System.out.println` e de parâmetros

```java
public class App {
    public static void main(String[] args) throws Exception {
        int[] wins = { 1, 0, 3 };
        int[] ties = { 2, 2, 0 };
        System.out.println(CalculateChampion.execute(wins, ties));
    }
}
```
