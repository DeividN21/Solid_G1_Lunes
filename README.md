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
