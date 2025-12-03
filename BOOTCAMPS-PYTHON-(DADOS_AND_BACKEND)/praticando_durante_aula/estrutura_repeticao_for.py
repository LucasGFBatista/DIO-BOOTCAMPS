texto = input("Informe um texto: ")
VOGAIS = "AEIOU"

# exemplo interavel
for letra in texto:
    if letra.upper() in VOGAIS:
        print(letra, end="")
else:
    print() # Apenas para adicionar quebra de linha
    
    
    
# Exemplo utilizando a função built-in range

for numero in range(0, 55,5):
    print(numero, end=" ")
    

