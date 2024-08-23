valor = int(input("Digite o valor do saque: "))

notas50 = valor // 50
valor = valor % 50

notas10 = valor // 10
valor = valor % 10

notas1 = valor

print("Valor do saque: ", (notas50 * 50) + (notas10 * 10) + notas1)
print("Número de notas de 50: ", notas50)
print("Número de notas de 10: ", notas10)
print("Número de notas de 1: ", notas1)
