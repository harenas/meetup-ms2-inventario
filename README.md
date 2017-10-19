# Meetup Microservices Session2
### Inventario Service

Servicio encargado de las siguientes operaciones

* Mostrar todos los productos en formato inventario (con información de stock y precios a clientes BÁSICO y PREMIUM)

	http://localhost:18000/inventario/


* Mostrar información de inventario de un producto en particular según su {id}

	http://localhost:16000/inventario/{id}
    
    
* Mostrar información de inventario de todos los productos pertenecientes a la categoría {id}

	http://localhost:16000/inventario/categoria/{id}


*Para efectos de este meetup, todos los servicios son GET.*



La configuración de la aplicación se encuentra en el archivo:

	$RUTA_BASE/src/main/resources/application.yml

### Instalación ###
```console

[user@machine]$ cd $RUTA_BASE
[user@machine]$ mvn install

```

### Ejecución ###
```console

[user@machine]$ java -jar target/inventario-0.0.1-SNAPSHOT.jar

```


