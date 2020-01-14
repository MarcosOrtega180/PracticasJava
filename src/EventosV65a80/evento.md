#Evento
##Definición
Un evento es un método que desencadena una acción, para poder hacer funconal 
a un programa, nosotros necesitamos de la existencia de los eventos, de lo contrario los usuarios no serían 
capaces de utilizar el programa. Los eventos son muy variados.\
En java no es fácil utilizar eventos, ya que java es un programa totalmente orientado a eventos, por lo cual a veces 
puede ser poco intuitivo.\
Hay que implementar la interfaz action listener.
###Factores a tener en cuenta cuando trabajamos con eventos
* Qué desencadena la acción? Objeto evento (normalmente esto está relaccionado, algún periférico).
* Qué desencadena la acción? Objeto fuente
* Qué desencadena la acción? Objeto listener
##Clases más importantes
Estado dos son las clases básicas
* ActionEvent. Relacionado con eventos del mause.
* WindowEvent.
##Tipos


#Clases adaptadoras
Son clases utilizadas cuando hay demasiados metodos requeridos dentro de una interfaz, esta clase nos ayuda a 
implementar solo aquellos métodos que en verdad necesitemos.

#Listeners
Existen varios tipos de listener dependiendo de cuales sean los eventos qeu querramos ir manejando, todos ellos en 
en algún punto implementan la interfaz ActionListener.\
Muchas de estas interfaces poseen sus métodos adaptadores para no tener que desarrollar necesariamente todos los métodos
que se encuentren incluidos en ellas; entre estos listeners podemos encontrar.
* KeyListener.
* MouseListener.
* WindowListener.
* FocusListener.
* WindowFocusListener.
