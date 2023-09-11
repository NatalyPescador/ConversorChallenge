# ConversorChallenge
En este proyecto utilizo la biblioteca 'javax.swing' de Java para crear un conversor de monedas y temperatura. De esta manera, se les permite a los usuarios convertir entre diferentes monedas y unidades de temperatura de manera fácil y rápida.



## :mag: Descripción del proyecto
Este proyecto surgió de un desafio que se nos propuso a los desarrolladores, en el que era necesario crear una solución para realizar conversiones entre divisas y temperatura. En este desafio se nos propuso usar la biblioteca Swing de Java con la cual es posible crear interfaces gráficas de usuarios (GUI) interactivas. 

 Además de lo anterior, era necesario cumplir con los siguientes requerimientos del desafio:

 Convertir de la moneda de mi país a las siguientes divisas: 
  - Convertir a Dólar
  - Convertir a Euros
  - Convertir a Libras Esterlinas
  - Convertir a Yen Japonés
  - Convertir a Won surcoreano

Así como realizar el proceso inverso: poder convertir de las diferentes divisas a la moneda de mi país. 



## 🔨: Funcionalidades del proyecto 
- `Funcionalidad 1`: Conversión entre la divisa de mi país (Colombia) a 5 diferentes divisas
- `Funcionalidad 2`: Conversión de 5 diferentes divisas a la divisa de mi país (Colombia)
- `Funcionalidad 3`: Extra: conversión entre diferentes unidades de temperatura como Celsius, Fahrenheit y Kelvin

https://github.com/NatalyPescador/ConversorChallenge/assets/132100591/99e57601-fab4-4909-a7c3-5630ed5f96ac



## :wrench:Configuración del proyecto

### Constructor

En el constructor de la clase principial 'Conversor' se realizan los ajustes generales de la interfaz del menú principal. Allí utilizamos los siguientes métodos para personalizar la interfaz gráfica a nuestro gusto:
- setResizable: Al estar en falso no permite que reajuste el tamaño de la ventana principal
- setSize: Definir las medidas de la ventana emergente
- setLocationRelativeTo: Al estar en null la ventana emergente se abre en la mitad de la pantalla
- setTitle: Definir el titulo que va a estar en la ventana emergente
- setDefaultCloseOperation: Al cerrar la ventana el programa no se seguirá ejecutando

En el constructor también se podrá personalizar el texto de la etiqueta y de las opciones del menú, así como agregar más si así lo requerimos 

### Conversor de moneda
El método principal de nuestro programa es el de conversión de moneda. Cuando se invoca este método, se solicita al usuario ingresar la tasa de cambio actual de la moneda que se desea convertir, lo que genera el proceso de conversión correspondiente.

Dentro de este método, se le pide al usuario que ingrese la cantidad que desea convertir utilizando la función JOptionPane.showInputDialog(). En este método también se implementa un bloque try-catch para manejar posibles excepciones en caso de que el usuario introduzca un valor inválido. Esto asegura que el programa siga funcionando incluso si se producen errores en la entrada del usuario. 

Al mismo tiempo, se da formato a la conversion para que el valor final no exceda cierta cantidad de decimales y este se concatena a un mensaje con la ayuda de JOptionPane.showMessageDialog() con el resultado de la conversión. 

![image](https://github.com/NatalyPescador/ConversorChallenge/assets/132100591/bd877276-822e-4c3a-bbb6-28255c03f4ce)


### Interfaces de eventos 
La principal interfaz que implementa nuestra clase principal es el ActionListener, con la ayuda de la sobreescritura de su principal método le damos funcionalidad a los botones para generar la interactividad del usuario con las ventanas emergentes.

![image](https://github.com/NatalyPescador/ConversorChallenge/assets/132100591/f2434f73-5ccb-4005-905a-f199078ce090)


### Main
En nuestra clase Main simplemente instanciamos nuestra clase principal y configuramos la interfaz como visible para que nuestro programa se ejecute correctamente. 

![image](https://github.com/NatalyPescador/ConversorChallenge/assets/132100591/cc7ff833-8e8f-4dc5-af6a-553c2e0021be)


## Desarrollado por:

[<img src="https://avatars.githubusercontent.com/u/132100591?v=4" width=115><br><sub>Nataly Guzman Pescador</sub>](https://github.com/NatalyPescador) 














