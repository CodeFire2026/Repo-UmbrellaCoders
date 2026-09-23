# Repo-UmbrellaCoders

Repositorio Umbrella Coders - Cohorte 2026

## GitHub

## Clase 1

USO DE GITHUB
Github es una plataforma que nos permite guardar repositorios de Git que podemos usar como servidores remotos y ejecutar algunos comandos de forma visual e interactiva (sin necesidad de la consola de comandos).
Luego de crear nuestra cuenta, podemos crear o importar repositorios, crear organizaciones y proyectos de trabajo, descubrir repositorios de otras personas, contribuir a esos proyectos, dar estrellas y muchas otras cosas.

COMANDOS
 #Import repository, New repository, New organization: significa que es como tu empresa,
 #New project: significa es como un grupo de repositorios que puedes tener dentro de una empresa,
 #New gist: es un pedasito de codigo que puedes compartir

New repository #Ponemos el nombre: Prueba-Inicio.Repo,
Descripcion: Asi armamos un repositorio. Hay muchas licencias para publicar el codigo

Create repository #puede ser privado o publico.

README.md
El README.md es el archivo que veremos por defecto al entrar a un repositorio. Es una muy buena practica configurarlo para describir el proyecto, los requerimientos y las instrucciones que debemos seguir para contribuir correctamente.

Para clonar un repositorio desde GitHub (o cualquier otro servidor remoto) debemos copiar la URL (por ahora, usando ssh) y ejecutar el comando git clone + la URL que acabamos de copiar. Esto descargara la version de nuestro proyecto que se encuentra en GitHub.

ATENCION: Por que? Porque a traves de https nos pedira usuario(nombre perfil) y contrasenia. Igual esto ya no funciona de una manera facil.

Sin embargo, esto solo funciona para las personas que quieren empezar a contribuir en el proyecto.

Como conectar un repositorio de GitHub a nuestro documento local.
Si queremos conectar el repositorio de GitHub con nuestro repositorio local, aconsejo que al trabajar desde GitHub no utilizemos localmente el comando git init, sino ejecutar las siguientes instrucciones:

## Clase 6

Error con tags

Que pasa si por error cargamos un tag con el mismo nombre dos veces?

Si intentamos crear dos tags con el mismo nombre en Git, se produce un error, pues los tags deben tener nombres unicos dentro del repositorio. Git no permite crear un segundo tag con el mismo nombre.

Como solucionamos este problema?

Para solucionarlo, podemos eliminar el tag incorrecto y volver a crearlo apuntando al commit correcto, o utilizar un nombre diferente para el nuevo tag.
