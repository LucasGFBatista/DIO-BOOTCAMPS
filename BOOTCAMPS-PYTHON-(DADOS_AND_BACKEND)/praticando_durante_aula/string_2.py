nome = "Lucas"
idade = 26
profissao = "Programador"
linguagem = "Java"
saldo = 38.526

pessoa = {"nome": "Lucas",
          "idade": 26,
          "saldo": 38.526}

print("Nome: %s Idade: %d" % (nome,idade))
print("Nome: {} Idade: {}"  .format(nome, idade))
print("Nome: {1} Idade: {0}"  .format(idade, nome))
print("Nome: {nome} Idade: {idade}"  .format(idade=idade, nome=nome))

print("Nome: {nome} Idade: {idade}" .format(**pessoa) )


print(f"Nome: {nome} Idade: {idade} Saldo: {saldo:.2f}")