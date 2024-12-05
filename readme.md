# Ejercicio POO

Desarrolla un sistema para un juego de rol que incorpore interfaces, herencia, polimorfismo, comparadores y enumeraciones. El juego debe incluir los siguientes elementos:

- Una interfaz Combatiente que defina métodos comunes para todos los personajes que pueden luchar.

- Una clase abstracta Personaje que implemente Combatiente y contenga atributos y métodos comunes.

- Clases concretas que hereden de Personaje: Guerrero, Mago y Arquero.

- Una enumeración TipoArma que incluya diferentes tipos de armas.

- Una interfaz Habilidad y clases que la implementen para representar habilidades especiales.

- Un sistema de inventario que use un comparador para ordenar los objetos por valor.

- Un método polimórfico usarHabilidad() que se comporte de manera diferente según la clase del personaje.

- Una clase Batalla que simule un combate entre personajes, utilizando sus habilidades y armas.

Implementa el sistema completo, asegurándote de utilizar correctamente interfaces, herencia, polimorfismo, comparadores y enumeraciones.

Incluye un método main() que demuestre el funcionamiento del sistema.

***Ayuda***

```
te proporcionaré una lista de las clases que necesitas desarrollar junto con sus métodos, parámetros y valores de retorno:

Interfaz Combatiente:

atacar(Combatiente objetivo): void
recibirDanio(int danio): void
estaVivo(): boolean
Clase abstracta Personaje:

Constructor(String nombre, int salud, int nivel, TipoArma arma)
getNombre(): String
getSalud(): int
getNivel(): int
getArma(): TipoArma
setSalud(int salud): void
setNivel(int nivel): void
setArma(TipoArma arma): void
atacar(Combatiente objetivo): void
recibirDanio(int danio): void
estaVivo(): boolean
usarHabilidad(Combatiente objetivo): void (abstracto)
Enum TipoArma:

ESPADA, ARCO, BASTON, DAGA
Interfaz Habilidad:

ejecutar(Combatiente usuario, Combatiente objetivo): void
Clase Guerrero (extiende Personaje):

Constructor(String nombre, int salud, int nivel)
atacar(Combatiente objetivo): void
usarHabilidad(Combatiente objetivo): void
Clase Mago (extiende Personaje):

Constructor(String nombre, int salud, int nivel)
atacar(Combatiente objetivo): void
usarHabilidad(Combatiente objetivo): void
Clase Arquero (extiende Personaje):

Constructor(String nombre, int salud, int nivel)
atacar(Combatiente objetivo): void
usarHabilidad(Combatiente objetivo): void
Clase ObjetoInventario:

Constructor(String nombre, int valor)
getNombre(): String
getValor(): int
Clase Batalla:

simularCombate(Combatiente personaje1, Combatiente personaje2): void (estático)
Clase JuegoRol:

main(String[] args): void
Clases de habilidades específicas (implementan Habilidad):

EmbateGuerrero
BolaDeFuegoMago
FlechaPrecisaArquero
Comparador para ObjetoInventario:

Implementar Comparator<ObjetoInventario>
compare(ObjetoInventario o1, ObjetoInventario o2): int
Esta lista cubre todas las clases principales que necesitas implementar para el sistema de juego de rol. Recuerda que algunas clases, como las habilidades específicas, pueden requerir métodos adicionales según la lógica que quieras implementar.```

