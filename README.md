# Control-de-plazas-final

## Situación:

Debido a la entrada de la nueva gestión federal se requiere llevar un control de las plazas de seguridad de policía así como de los
comandantes con los que cuenta la federación a fin de poner en marcha el mando único policial. Buscando manejar más eficaz y
eficientemente su información administrativa la federación lo contrata a usted a fin de que diseñe, implemente y ponga en marcha un
sistema informático gráfico con el paradigma orientado a objetos en el lenguaje JAVA para la gestión de los Comandantes de Policía,
Plazas de Seguridad y Ordenes a Comandantes.

## Requerimientos:

* COMANDANTES:
    * El sistema deberá tener un catálogo de COMANDANTES donde se manejarán la información de cada comandante de policía, cada
    comandante tiene la información de: Nombre (String longitud:15), Apellido Paterno(String longitud:15) ,Cedula (Int), Especialidad
    (String,Longitud 15), Antiguedad (Int). El sistema debe dar la funcionalidad para dar de ALTA (Validada), BAJA, MODIFICAR y
    BUSCAR (por Nombre) del comandante.
    
    ```java
    String Nombre;
    String Apaterno;
    Integer Cedula;
    String Especialidad;
    Integer Antiguedad;
    ```

* PLAZAS:
    * El sistema deberá tener un catálogo de las Plazas de Seguridad donde se maneja la información pertinente a cada sección del país, el
    cual contiene: Nombre de La Plaza(String), Número de policías con las que cuenta la plaza (Int), Numero de Población Civil (int),
    Ciudad cede de la comandancia(String), IDPlaza (String). El Sistema debe dar la funcionalidad de ALTA (validada), BAJA,
    MODIFICAR y BUSCAR (Por nombre de plaza, Por IDPlaza) al catalogo de Plazas.
    ARCHIVOS
    
    ```java
    String Nombre;
    Integer Policias;
    Integer NPC;
    String Ciudad;
    String IDPlaza;
    ```
    
> El Sistema deberá tener una pestaña de archivos donde generará un archivo de texto que contengan la totalidad de las plazas, así como
> otro archivo de texto con la totalidad de los comandantes con los que cuenta el sistema. Otro botón permitirá Leer archivo de plazas o
> leer archivo de comandantes a fin de restaurar las estructuras Comandantes o Plazas en el sistema.

* ORDENES:
    * El sistema deberá tener una pestaña de ORDENES donde el usuario seleccionará desde un control alimentado por los registros de
    Comandantes al oficial que se asignará a una Plaza. Acto seguido seleccionará desde un control alimentado por los registros de Plazas
    el lugar a donde se asignara. Al finalizar la operación de ORDEN el sistema generará un Archivo de Texto el cual tendrá la información
    de la Orden realizada, esto como documento oficial para su aplicación.
    Finalmente, La Federación requiere REPORTES en Archivo de Texto de: Total de las Ordenes creadas desde que el programa arranco
    

## Ponderación (TODO):

- [x] Validación de todos los campos en las altas de catálogos (5pts).
- [ ] Pantallas Funcionales para Altas, Bajas y Modificaciones de registros de COMANDANTES (15pts). 5pts cada una
- [ ] Pantallas Funcionales para Altas, Bajas y Modificaciones de registros de PLAZAS (15pts). 5pts cada una
- [ ] Pantalla Funcional para la Búsqueda de Comandante por Nombre (10 pts).
- [ ] Pantalla Funcional para la Búsqueda de Plaza por Nombre (5 pts).
- [ ] Pantalla Funcional para la Búsqueda de Plaza por IDPlaza (5 pts.)
- [ ] Funcionalidad de creación de archivo de texto de COMANDANTES (5pts).
- [ ] Funcionalidad de creación de archivo de texto de PLAZAS (5pts).
- [ ] Funcionalidad de lectura de archivo de texto de COMANDANTES para reconstrucción del mismo (5pts)
- [ ] Funcionalidad de lectura de archivo de texto de PLAZAS para reconstrucción del mismo (5pts)
- [ ] Funcionalidad de pantalla de ORDENES y generación escrita de la Orden para el comandante (15 pts.)
- [ ] Creación de reporte TXT con total de las ORDENES hechas durante el ciclo del programa (10 pts).
