# Ejercicio 4: Calculadora de Impuestos
# Crear una función para calcular el total de un pago incluyendo
# un impuesto aplicado. (IVA)
# Formula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
# Proporcione el pago sin impuesto: 1000
# Proporcione el monto del impuesto: 21%
# Pago con impuesto: xxxxx

def calcular_pago_con_impuesto(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto / 100)
    return pago_total


# Prueba de la función
pago_sin_impuesto = 1000
impuesto = 21

pago_total = calcular_pago_con_impuesto(pago_sin_impuesto, impuesto)
print(f"Pago con impuesto: {pago_total}")