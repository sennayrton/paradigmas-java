def esPrimo(num):
    if num < 1:
        return False
    elif num == 2:
        return True
    else:
        for i in range(2, num):
            if num % i == 0:
                return False
        return True            

def main():
    num = int(input('Escribe un entero: '))
    resul = esPrimo(num)

    if resul is True:
        print('Es primo')
    else:
        print('No es primo')

if __name__ == '__main__':
    main()
