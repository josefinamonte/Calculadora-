# Calculadora
 calculadora en java capaz de resolver las siguientes operaciones básicas de matemática: suma, resta, multiplicación y división. 

Calculadora Básica

Sistema informático desarrollado a medida

Especificaciones detalladas
En este documento se brindan mayores detalles sobre la implementación del sistema.

Menú de Opciones:

Se requiere construir un menú de opciones en pantalla para que el usuario pueda seleccionar
la operación matemática deseada. El menú debe mostrarse en pantalla de manea similar a la
que se ilustra a continuación:

*** CALCULADORA BÁSICA ***
[1] – SUMAR.
[2] – RESTAR.
[3] – MULTIPLICAR.
[4] – DIVIDIR.
[0] – SALIR DEL PROGRAMA.
SELECCIONAR UNA OPCIÓN [0 a 4] Y PRESIONAR ENTER: __

Validaciones:
• Verificar que la opción ingresada sea de tipo numérica.
• Verificar que la opción ingresada esté entre 0 y 4.

Operaciones Matemáticas

Suma
Esta funcionalidad requiere el ingreso por teclado de dos números enteros positivos y que se
retorne el resultado de la suma entre ambos.
Validaciones:
• Verificar que los datos ingresados sean de tipo numérico.
• Verificar que los datos ingresados sean enteros positivos.
Restricciones:
• Una vez presentado en pantalla el resultado de la suma, preguntar al usuario si desea
efectuar una nueva suma. En caso de responder afirmativamente, seguirá en la
pantalla de la operación “SUMAR”. Caso contrario, deberá regresar al menú principal.

Resta
Esta funcionalidad requiere el ingreso por teclado de dos números enteros positivos y que se
retorne del resultado de la resta entre ambos.
Validaciones:
• Verificar que los datos ingresados sean de tipo numérico.
• Verificar que los datos ingresados sean enteros positivos.
• Verificar que la resta se efectúe utilizando en primer termino el mayor número
ingresado y, en segundo término, el menor número ingresado. Ejemplo: si se ingresan
los números 32 y 79 (en ese orden), la resta deberá efectuarse del siguiente modo: 79
– 32. Por lo tanto, el resultado a devolver será 47.
Restricciones:
• Una vez presentado en pantalla el resultado de la resta, preguntar al usuario si desea
efectuar una nueva resta. En caso de responder afirmativamente, seguirá en la
pantalla de la operación “RESTAR”. Caso contrario, deberá regresar al menú principal.

Multiplicación
Esta funcionalidad requiere el ingreso por teclado de dos números enteros positivos y que se
retorne el resultado del producto entre ambos.
Validaciones:
• Verificar que los datos ingresados sean de tipo numérico.
• Verificar que los datos ingresados sean enteros positivos.
Restricciones:
• Una vez presentado en pantalla el resultado del producto, preguntar al usuario si
desea efectuar una nueva multiplicación. En caso de responder afirmativamente,
seguirá en la pantalla de la operación “MULTIPLICAR”. Caso contrario, deberá regresar
al menú principal.

División
Esta funcionalidad requiere el ingreso por teclado de dos números enteros positivos y que se
retorne del resultado del cociente entre ambos.
Validaciones:
• Verificar que los datos ingresados sean de tipo numérico.
• Verificar que los datos ingresados sean enteros positivos.
• Verificar que el segundo número ingresado sea mayor que cero.
• Verificar que el cociente se efectúe utilizando en primer término el mayor número
ingresado y, en segundo término, el menor número ingresado. Ejemplo: si se ingresan
los números 2 y 10 (en ese orden), la división deberá efectuarse del siguiente modo:
10 / 2. Por lo tanto, el resultado a devolver será 5.
Restricciones:
• Una vez presentado en pantalla el resultado del cociente, preguntar al usuario si desea
efectuar una nueva división. En caso de responder afirmativamente, seguirá en la
pantalla de la operación “DIVIDIR”. Caso contrario, deberá regresar al menú principal.
