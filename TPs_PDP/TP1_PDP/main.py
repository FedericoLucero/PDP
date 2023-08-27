import argparse
import ast
import random

def fibonacci(n:int):
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)

def potencia(b:int, n:int):
    b = int(b)
    n = int(n)
    if n == 0:
        return 1
    else:
        return b * potencia(b, n - 1)

def posiciones_de(a:str ,b:str ,list1:list() ,i:int):
    if i >= len(a):
        return list1
    if a[i:i+len(b)] == b:
        list1.append(i)
    return posiciones_de(a, b, list1, i + 1)

def vectores_iguales(list_a:list(), list_b:list()):
    if not list_a and not list_b:
        return True
    if not list_a or not list_b:
        return False
    if list_a[0] == list_b[0]:
        return vectores_iguales(list_a[1:], list_b[1:])
    else:
        return False

def pascal_line(n:int):
    if n == 0:
        return
    elif n == 1:
        return [1]
    else:
        prev_line = pascal_line(n - 1)
        new_line = [1]
        for i in range(len(prev_line) - 1):
            new_line.append(prev_line[i] + prev_line[i + 1])
        new_line.append(1)
        return new_line

def invertir(_list1:list()):
    if len(_list1) <= 1:
        return _list1
    else:
        return [_list1[-1]] + invertir(_list1[:-1])

def entrega_de_paquetes(casas:list()):
    if len(casas) == 0:
        return
    else:
        casa_actual = casas[0]
        print(f"Entrego el paquete en {casa_actual}")
        return entrega_de_paquetes(casas[1:])

def ratatuille(camino:int):
    if camino == 3:
        print("Va por camino 3")
        return 7
    else:
        if camino == 1:
            print("Va por camino 1")
            tiempo = 3
        elif camino == 2:
            print("Va por camino 2")
            tiempo = 5
        
        nuevo_camino = random.randint(1, 3)
        tiempo += ratatuille(nuevo_camino)
        return tiempo

def Allways(n:int):
    return Allways_sub(n, [n], 0)

def Allways_sub(n:int, path:list(), cont:int):
    if n == 0:
        print(path)
        cont += 1
    elif n > 0:
        cont = Allways_sub(n - 1, [n - 1] + path, cont)
        cont = Allways_sub(n - 2, [n - 2] + path, cont)
    return cont


if __name__ == "__main__":
    parser = argparse.ArgumentParser()

    parser.add_argument("-fibonacci", type=int, metavar="n", help="Devuelve el n-ésimo número de la sucesión de Fibonacci")
    parser.add_argument("-potencia", type=int, nargs=2, metavar=("b", "n"), help="Devuelve el valor de elevar b a la potencia n")
    parser.add_argument("-posiciones_de", nargs=4, metavar=("a", "b", "list", "i"), help="Devuelve una lista con las posiciones en donde se encuentra b dentro de a.")
    parser.add_argument("-vectores_iguales", nargs=2, metavar=("list_a", "list_b"), help="Devuelve TRUE si las dos listas son iguales, FALSE en caso contrario.")
    parser.add_argument("-pascal_line", type=int, metavar="n", help="arma el la n-esima linea del triangulo de pascal")
    parser.add_argument("-invertir", nargs=1, metavar=("_list1"), help="función recursiva llamada Invertir que, dada una lista L, la invierte.")
    parser.add_argument("-entrega_de_paquetes", nargs=1, metavar=("_list1"), help="ante una lista de posibles casas donde entregar, permita informar la entrega del paquete cuando lo tenga el trabajador.")
    parser.add_argument("-ratatuille", action="store_true", help="Devuelve el tiempo que tarda la rata en salir de la jaula")
    parser.add_argument("-Allways", type=int, metavar="n", help="calcula el número de caminos posibles para alcanzar un adoquín objetivo numerado con n")

    args = parser.parse_args()

    if args.fibonacci:
        resultado = fibonacci(args.fibonacci)
        print(f"El {args.fibonacci}-esimo numero de la sucesion de Fibonacci es: {resultado}")

    if args.potencia:
        b, n = args.potencia
        resultado = potencia(b, n)
        print(f"El valor de elevar {b} a la potencia {n} es: {resultado}")

    if args.posiciones_de:
        a, b, _list, i = args.posiciones_de
        resultado = posiciones_de(a, b, ast.literal_eval(_list) , int(i))
        print(f"La lista con las posiciones en donde se ecunetra {b} dentro de {a} es: {resultado}")

    if args.vectores_iguales:
        _list1, _list2 = args.vectores_iguales
        resultado = vectores_iguales(ast.literal_eval(_list1), ast.literal_eval(_list2))
        print(f"El resultado de comparar ambas listas es: {resultado}")
        if resultado == True:
            print("por lo tanto son iguales")
        else:
            print("por lo tanto no son iguales")

    if args.pascal_line:
        resultado = pascal_line(args.pascal_line)
        print(f"La {args.pascal_line}-esima linea del triangulo de pascal es: {resultado}")

    if args.invertir:
        _list1 = args.invertir[0]
        resultado = invertir(ast.literal_eval(_list1))
        print(f"Lista original: {_list1}")
        print(f"Lista invertida: {resultado}")

    if args.entrega_de_paquetes:
        _list1 = args.entrega_de_paquetes[0]
        _list1 = ast.literal_eval(_list1)
        print(f"Lista de casas: {_list1}")
        entrega_de_paquetes(_list1)

    if args.ratatuille:
        camino_inicial = random.randint(1, 3)
        tiempo_total = ratatuille(camino_inicial)
        print(f"Tiempo total: {tiempo_total}")

    if args.Allways:
        n = args.Allways
        if n <= 0:
            print("El número debe ser mayor que cero.")
        else:
            num_caminos = Allways(n)
            print(f"El número de caminos posibles para alcanzar el adoquín {n} es: {num_caminos}")

    
    # fibonacci(10)
    # fibonacci(10000) #error

    # potencia(4,2)
    # potencia(10,10)

    # posiciones_de("Un tete a tete con Tete", "te",[],0)
    # posiciones_de("tres tristes tigres", "tr",[],0)

    # vectores_iguales([1, 2, 3, 4, 5], [1, 2, 3, 4, 5])
    # vectores_iguales([6, 0, 2, 1, 1], [0, 8, 3, 1, 5])

    # pascal_line(2)
    # pascal_line(5)

    # invertir([1, 2, 3, 4, 5])
    # invertir([0, 8, 3, 1, 5])

    # entrega_de_paquetes(["Casa de Pablo", "Casa de Caro",  "Casa de Caty", "Casa de Luna"])
    # entrega_de_paquetes(["Casa de Juan", "Casa de Tomas",  "Casa de Flor", "Casa de Benja"])

    # ratatuille()
    # ratatuille()

    # Allways(3)
    # Allways(5)