 Write once, run anywhere.
 Para que pudiese funcionar fue creao swing y dejado awt de lado. JAVA swing, trae las clases para crear aplicaiones
 gráficias, está basado en AWT, lo que tiene es que en lugar de dejar dibuar al sistema operativo se encarga de dibujar
 él mismo.
 Paquete java.qwt-fame-jframe-java.swing
 
Hay que hacerlas visibles setVisible, darles tamaño setSize, hay que  decirle qué queremos que haga cuando queremos que se cierre.
Hay un marco principal
hay que importar java.sing

# Vídeo 58
 escribir dentro de la estrucutra de un frame, primero tenemos que conocer la estrucutra.
 Tenemos la mesa que es el jfrma, podemos escribir en él, pero no es lo adecuado, sobre él tenemos que poner paneles
 es como ir agregando capas en photoshop, es en esto que escribimos, básicamente esa es la estructura. Para ello usuamos
 una clase de la api de java, la cuál es JPanel. Hay que hacer una clase que herede de JPanel.
 Nos interesa aintComponent(Graphics g), nos permite dibujar muchos tipos de cosas sobre una lámina.
 
