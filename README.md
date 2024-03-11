<h1>MÁQUINA EXPENDEDORA</h1>
 <H3>OBJETIVO</H3>
 <ul>
   <li>Crear el código de una máquina expendedora por medio del lenguaje JAVA, que permita mostrar los productos disponibles los cuales cuentan con un código específico y un valor.<br>
   Simular la compra de un producto por medio de su código en consola, introduciendo su valor en monedas, recibiendo el producto y sus vueltas si se da el caso</li>
 </ul>

 <h3>INSTRUCCIONES</h3>
 
  <p>Al ejecutar el prgrama dara la Bienvenida y mostrará los productos que hay disponibles en la máquina Expendedora con su respectivo código, nombre, cantidad y valor.<br>
  Siguiendo a esto le solicita al usuario que ingrese el código del producto que desea teniendo en cuenta la disponibilidad de este, luego se visualizara el producto elegido <br>
  por medio de un mensaje, de la misma manera ser solicitará el valor del producto elegido<br>
  Mostrará un mensaje "¡Compra fue exitosa!" <br>
  Se vizualizará un mensaje "Sus vueltas son:" en caso de que el valor ingresado sea mayor al valor del producto.<br>
  Por otra parte se enviara un mensaje que preguntara si desea apagar la maquina dando la indicación de presionar 1 o en su defecto presionar otro número </p>

  <h3> VALIDACIONES</h3>
  <ol start="1">
  <li>Válidar que el producto seleccionado este en la lista y si no es asi le envia un mensaje: "El producto que ha seleccionado no existe. Por favor, seleccione otro producto" </li>
  <li> Válidar  que al momento de elegir el producto por medio del código, solo deje ingresar números enteros de lo contrario enviara un mensaje: "Este campo solo permite números enteros. Por favor, inténtelo de nuevo:"</li>
  <li> Válidar que solo ingrese una cantidad monedas epecificas de lo contrario mostrará: Debe ingresar una moneda válida para continuar. Dinero devuelto:" y le devuelve el dinero ingresado y le dice que lo intente nuevamente</li>
  <li>Válidar si el valor ingresado es mayor al valor del producto, si es asi, hace la resta y le da su cambio</li>
  <li>Válidar si le hace falta dinero, envia este mensaje: "Lo siento, pero necesitas más dinero para continuar. Te devolvemos lo que has introducido " te devuelve el valor ingresado</li>
<h3>NOTA</h3>
<p> La parte del Stock de los productos se presentará en otra versión.</p>
  
