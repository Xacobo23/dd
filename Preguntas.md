### Tras finalizarr el proyecto, responde de forma concisa (máximo 1 párrafo) y clara a las siguientes preguntas que te darán indicios de  tu grado de entendimiento del patrón Strategy

- ¿Cuáles son las estrategias?
  
  Las estrategias están formadas por el patrón Strategy de las clases de ataque.

- ¿Está el código de las diferentes ataques mezclado?¿El código del ataque con espada es independiente del código del ataque con arco?  .Relaciona esto con algún principio SOLID.
  
  Es independiente y está relacionado con el principio de responsabilidad única por como se modifica la clase.

- ¿Para que vale la interface Ataque?
  
  Sirve para nombrar los métodos necesarios de las clases donde se implementa quedando en esta vacíos.

- ¿Qué clases o clase se encarga del papel de contexto?

  La clase DDApp que utiliza los distintos tipos de ataque.

- ¿En que se parece y  en que se diferencia el  contexto de tu proyecto al contexto del Patrón teórico del boletín?
  
  Se parecen en el uso del patrón Strategy y se diferencia en el uso dado a las clases.

- ¿Quién es el Cliente?
  
  Es la clase que usa las clases del patrón Strategy.

- ¿Como cambia el cliente de  estrategia?
  
  Invocando al metodo necesario y donde se le necesite.

- ¿Para cambiar de estrategia, tiene que conocer el cliente detalles de implementación de la estrategia?
  
  No, con conocer la interfaz de Ataque valdría, para así crear la clase con los métodos necesarios.

- ¿Si creamos un nuevo tipo de ataque para un nuevo cliente, por ejemplo App2,  es necesario modificar el cliente antiguo? Relaciona esto con algún principio SOLID.
  
  No es necesario. Se relaciona con el Principio de Abierto/Cerrado porque con el cliente antiguo no hace falta modificarlo para incluir un nuevo tipo de ataque, con crear la nueva clase valdría.