# Solid_G1_Lunes

## Principio SRP

### Captura de Ejecución:
![Imagen](https://github.com/DeividN21/Solid_G1_Lunes/blob/main/Ejecuci%C3%B3n_SRP.png?raw=true)

### Reflexión:
Al aplicar el principio de responsabilidad única, nos dimos cuenta de la importancia que es que cada clase haga solo una cosa. Antes, la clase UserManager hacía de todo, validaba, guardaba datos y enviaba correos. Eso volvía el código más complicado y difícil de mantener.
 
Al separar esas tareas en clases distintas, el código quedó más limpio y más fácil de modificar.
 
Este principio ayuda a organizar mejor los proyectos.


## Principio OCP

### Captura de Ejecución:
![Imagen](https://github.com/DeividN21/Solid_G1_Lunes/blob/main/Ejecuci%C3%B3n_OCP.png?raw=true)

### Reflexión:
Al aplicar el principio de Open/Closed, percibimos que la clase NotificationService violaba este principio porque usaba condicionales (if-else) para manejar diferentes tipos de notificaciones. Por lo tanto, en la refactorización se creó una interfaz con un método send(), y se crearon clases independientes que implementan esta interfaz. Esto permitió usar polimorfismo en lugar de condicionales, es decir, para agregar un nuevo tipo de notificación, basta con crear una nueva clase que implemente Notification.

## Principio LSP

### Captura de Ejecución:
![Imagen](https://github.com/DeividN21/Solid_G1_Lunes/blob/main/Ejecuci%C3%B3n_LSP.png?raw=true)

### Reflexión:
Al aplicar LSP, resultó en un diseño más coherente y seguro, donde los objetos se comportan de manera predecible según su tipo base. De esta forma, se resolvieron las excepciones inesperadas al intentar ejecutar métodos no aplicables (como walk() en Fish) y además, la refactorización dividió las responsabilidades mediante la creación de interfaces específicas.


## Principio ISP

### Captura de Ejecución:
![Imagen](https://github.com/DeividN21/Solid_G1_Lunes/blob/main/Ejecuci%C3%B3n_ISP.png?raw=true)

### Reflexión:
En el proyecto inicial, la interfaz Device violaba el ISP al incluir el método charge(), que no era aplicable a todos los dispositivos. Por lo tanto, la refactorización dividió la interfaz Device en interfaces más específicas con turnOn() y turnOff()) y Chargeable (con charge()). Es decir, el resultado fue un diseño más limpio y modular, donde las clases no están sobrecargadas con responsabilidades que no son relevantes.


## Principio DIP

### Captura de Ejecución:
![Imagen](https://github.com/DeividN21/Solid_G1_Lunes/blob/main/Ejecuci%C3%B3n_DIP.png?raw=true)

### Reflexión:
En el proyecto inicial, la clase PaymentProcessor violaba el DIP al depender directamente de la clase concreta CreditCardPayment, lo que dificultaba cambiar o agregar nuevos métodos de pago sin modificar el código. Por esto, en la refactorización se introdujo una interfaz PaymentMethod con un método processPayment(), y se crearon clases concretas como CreditCardPayment, PayPalPayment, y CryptoPayment que implementan esta interfaz. Como resultado, se transformó un sistema rígido en uno flexible y desacoplado, demostrando la importancia de depender de abstracciones en lugar de implementaciones concretas.


## Reflexión General sobre los Principios SOLID

### Reflexión 1 (José Naranjo):
El principio más desafiante de aplicar fue el de Sustitución de Liskov (LSP), ya que nos hizo cuestionar cómo estábamos estructurando la herencia en las clases y nos obligó a pensar más allá del funcionamiento básico, para asegurarnos de que las subclases realmente pudieran reemplazar a sus clases padre sin generar errores. Entender y aplicar este principio implicó pensar la lógica y dividir responsabilidades correctamente. Creo que SOLID mejora el diseño de software porque nos guía hacia un código más limpio, mantenible y preparado para el cambio, algo fundamental en proyectos reales donde los requerimientos suelen evolucionar. De todos los principios, el que más aplicaré en futuros proyectos será el de Abierto/Cerrado (OCP), porque me permite extender funcionalidades sin tener que modificar lo que ya funciona, reduciendo riesgos y haciendo que el desarrollo sea más flexible y escalable.

### Reflexión 2 (David Navarrete):
El principio más complicado para mí fue el de OCP (Abierto/Cerrado) porque tuvimos que cambiar nuestra forma de pensar: normalmente escribíamos código que funcionara, sin pensar en cómo crecería luego. Nos costó separar responsabilidades y entender cómo extender sin modificar. Aun así, notamos que los principios SOLID en general ayuda a que el software sea más fácil de mantener y menos frágil cuando hay cambios. En particular, me gustó mucho aplicar el SRP (Responsabilidad Única), porque nos permitió organizar mejor las clases y evitar que una sola clase hiciera de todo. Lo usaré en el proyecto de titulación.

### Reflexión 3 (Tomás Nuñez):
Para mí, el principio más desafiante fue LSP, porque al principio parecía fácil, pero cuando trabajamos con el ejemplo del pez y el método walk(), entendimos que no todo lo que hereda funciona igual. Nos ayudó a ver que a veces heredamos por costumbre y no porque tenga sentido lógico. Aprender los principios SOLID cambió nuestra forma de pensar al diseñar software. Sin duda, el OCP es el principio que más planeo aplicar, porque me permite agregar funcionalidades nuevas sin tocar lo que ya existe, lo cual es ideal para proyectos que seguirán creciendo.

### Reflexión 4 (Anahí Quezada):
Aplicar el Principio de Responsabilidad Única (SRP) fue lo más difícil para mí, ya que tendíamos a crear clases con muchas funciones “por comodidad”. Sin embargo, al descomponerlas en clases más pequeñas y específicas, vimos cómo se volvía más fácil probar, mantener y entender el código. Por lo tanto, los principios SOLID nos ayudaron a ver que un buen diseño no se trata solo de que el programa funcione, sino de que sea entendible y adaptable por cualquier miembro del equipo. El principio que más quiero aplicar en mis futuros desarrollos es LSP, porque me hizo reflexionar sobre el uso correcto de la herencia y cómo evitar errores inesperados al sustituir objetos.

### Reflexión 5 (Anthony Rodriguez):
El principio más difícil de aplicar fue el OCP, ya que nos obligó a confiar más en interfaces y polimorfismo, algo que no habíamos usado tanto. Nos hizo salir de la costumbre de usar muchos if y empezar a pensar en clases que se puedan “enchufar” al sistema sin romper lo demás. Nos dimos cuenta de que los principios SOLID no son solo una teoría; realmente hace que el software sea más ordenado, comprensible y menos propenso a errores. De todos los principios, el que más voy a seguir usando es SRP, porque dividir responsabilidades me ayudó a tener un código más modular y claro, especialmente en proyectos grandes o en equipo.
