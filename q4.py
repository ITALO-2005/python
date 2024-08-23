print("Considere uma equação de segundo grau no formato:")
print("ax² + bx - c = 0")

a = int(input("Digite o valor de 'a':"))
b = int(input("Digite o valor de 'b':"))
c = int(input("Digite o valor de 'c':"))
              
delta = b**2 - 4*a*c
raiz1 = (-b + delta**(1/2) ) / (2*a)
raiz2 = (-b - delta**(1/2) ) / (2*a)

print("As raizes são:", raiz1, raiz2)