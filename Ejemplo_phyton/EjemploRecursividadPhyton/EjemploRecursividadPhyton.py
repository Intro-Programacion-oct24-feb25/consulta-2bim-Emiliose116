def factorial(n):
    if n == 1:  
        return 1
    else:
        return n * factorial(n - 1) 

num = 9
print(f"El factorial de {num} es: {factorial(num)}")

