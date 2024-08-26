nota01 = float(input("Digite a primeira nota: "))
nota02 = float(input("Digite a segunda nota: "))
nota03 = float(input("Digite a terceira nota: "))

media = (nota01 + nota02 + nota03) / 3

if media < 50:
    print("Aluno reprovado.")
elif media >= 70:
    print("Aluno aprovado.")
else:
    print("Aluno em recuperação.")
