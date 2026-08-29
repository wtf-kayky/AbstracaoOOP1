# 💳 Exercício de Abstração - Contas Bancárias

Este é um pequeno projeto para praticar o conceito de **abstração** em Java, usando uma classe abstrata (`ContaAbs`) e uma classe concreta (`conta`).

## O que o sistema faz?

- Cria contas com usuário e senha
- Deposita e saca dinheiro
- Valida senha com mínimo de 4 caracteres
- Mostra o saldo da conta
- A classe abstrata obriga a implementar um método `aplicarbeneficios()`


## O que foi praticado

- **Abstração**: a classe `ContaAbs` define um método abstrato que as filhas precisam implementar
- **Encapsulamento**: atributos privados e métodos públicos
- **Validações**: senha com tamanho mínimo, valores de saque e depósito

## Melhorias futuras

- Criar uma classe `Main` para testar as contas
- Criar uma classe filha de `ContaAbs` que implemente `aplicarbeneficios()`

---
**Autor:** [Kayke Vieira]
