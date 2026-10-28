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

> ¿Como conectar un repositorio de GitHub a nuestro documento local?

Si queremos conectar el repositorio de GitHub con nuestro repositorio local, aconsejo que al trabajar desde GitHub no utilizemos localmente el comando git init, sino ejecutar las siguientes instrucciones:

* Primero creamos el repositorio en la nube de Github
* Copiamos el enlace SSH
* Abrimos terminal de GitBash como administrador
* Ingresamos al area donde queramos agregar el repositorio

```sh
    cd Documents # O el area donde se quiera agregar el repo
    mkdir Proyectos
    cd Proyectos
    git clone git@github.com:CodeFire2026/Repo-UmbrellaCoders.git
    cd Prueba-Inicio-Repo
    git pull origin main
    git fetch
    git branch # Estara la rama main por defecto
    touch README.md
    git status
    git add .
    git commit -m "Creamos el readme"
    git log
    git push origin main
```

## Clase 2

### Clave SSH

Cargar llave SSH publica en GitHub

> **NOTA:** Si ya has realizado este proceso en tu equipo, no se debe repetir el SSH

Para copiar la llave publica:

1. Ir al archivo .ssh, alli encontraras el archivo .pub
2. Abrir archivo .pub, se puede abrir con el txt
3. Copiar el contenido que esta dentro.

En Github:

1. En Github ir a Settings > SSH and GPG Keys
2. Click en New SSH Key
3. Colocar el nombre y pegar la ssh publica

**Se aconseja que la ssh tenga el nombre del ordenador en el que estas trabajando. Esto se debe hacer con cada pc nueva o dispositivo nuevo que tengamos para acceder a nuestra cuenta de GitHub.**

### Comandos de Git

```sh
    git branch # Vemos en que rama estamos
    git checkout master # Ponernos en la rama master
    git branch -M main # Cambiamos el nombre a la rama master
    git remote add origin git@github.com:nombreUsuario/class-git.git # Agregamos el repositorio remoto, este es un ejemplo
    git remote -v # Vemos si ya esta conectado
    git merge segunda # Mergeamos lo que tenemos en la rama segunda en main
    git commit -am "Uso de GitHub parte 20" # Hacemos el commit de hoy
    git push origin main # Pasamos todo lo hecho a GitHub, revisar en el repositorio en GitHub.
```

Frente al cambio de nombre de rama master a main, suele suceder que en el repo de GitHub se hayan creado dos ramas, la rama master y la rama main.

Para solucionar esto:

1. Ir al repositorio en Github
2. Ir a settings > Branches
3. Cambiar la rama principal de master a main
4. Una vez hecho el cambio ya podemos borrar la rama master

## Clase 3

### Cambios en GitHub: de master a main

El escritor argentino Julio Cortázar afirma que las palabras tienen color y peso. Por otro lado, los sinónimos existen por definición, pero no expresan lo mismo. Feo no es lo mismo que desagradable, ni aromático es lo mismo que oloroso.

Por lo anterior, podemos afirmar que los sinónimos no expresan lo mismo, no tienen el mismo “color” ni el mismo “peso”.

Sí, esta lectura es parte de la enseñanza profesional de Git & GitHub.

Desde el 1 de octubre de 2020 GitHub cambió el nombre de la rama principal: ya no es “master” -como aprenderás aquí- sino main.

Este derivado de una profunda reflexión ocasionada por el movimiento #BlackLivesMatter.

La industria de la tecnología lleva muchos años usando términos como master, slave, blacklist o whitelist y esperamos pronto puedan ir desapareciendo.

Y sí, las palabras importan.

Por lo que de aquí en adelante cada vez que me escuches mencionar “master” debes saber que hago referencia a “main”.

¿Cuando es que sigue siendo master y cuando sigue siendo main?

* Cuando se crea un repositorio desde git bash en nuestro ordenador a través de git init, sigue siendo el estandar como master.
* Cuando se crea un repositorio desde github la rama que se crea por default es main

¿Qué hacer con esto? 

Debes cambiar el nombre de la rama master a main con el comando:

```bash
git branch -M main
```

O cambiando la asignación por default con este otro comando:

```bash
git config --global init.defaultBranch main
```

A partir de este comando siempre que ingreses git init será la rama main.

Si clonamos un repositorio que fue creado desde github no serán necesarios estos cambios ya que prevalece la rama main.

Otro comando que deben saber es:

```bash
gitk
```

Si no te funciona el comando gitk es posible no lo tengas instalado por defecto.

Para instalar gitk debemos ejecutar los siguientes comandos:

```bash
sudo apt-get update
sudo apt-get install gitk
```

Podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando **gitk**. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.

### Git

> Actualizar repositorio local

Cuando trabajamos en equipo, o bien trabajamos individualmente con diferentes computadoras, debemos traer los cambios realizados en el repositorio remoto al local para mantener nuestro entorno al día y evitar conflictos.

Flujo de trabajo:

```bash
cd repositorio # Ingresamos al repositorio
git checkout main # Cambiamos a la rama principal (main)
git pull origin main # Traemos los cambios que se hicieron
git checkout second # Actualizamos las demas ramas
git pull origin second
git checkout trabajo
git pull origin trabajo

# O hacer merge
git checkout main
git merge origin/main
git checkout second
git merge origin/second
git checkout trabajo
git merge origin/trabajo
```

## Clase 4

### Tu primer Push

La creación de las SSH es necesario solo una vez por cada computadora. Aquí conocerás cómo conectar a GitHub usando SSH.

Luego de crear nuestras llaves SSH podemos entregarle la llave pública a GitHub para comunicarnos de forma segura y sin necesidad de escribir nuestro usuario y contraseña todo el tiempo.

Para esto debes entrar a la Configuración de Llaves SSH en GitHub, crear una nueva llave con el nombre que le quieras dar y el contenido de la llave pública de tu computadora.

Ahora podemos actualizar la URL que guardamos en nuestro repositorio remoto, solo que, en vez de guardar la URL con HTTPS, vamos a usar la URL con SSH:

```sh
git remote set-url origin url-ssh-del-repositorio-en-github
```

Comandos para copiar la llave SSH:

Estas son las rutas del ssh publico

* Mac:

```bash
pbcopy < ~/.ssh/id_rsa.pub
```

* Windows (Git Bash):

```bash
clip < ~/.ssh/id_rsa.pub
```

* Linux (Ubuntu):

```bash
cat ~/.ssh/id_rsa.pub
```

**Importante**

Las buenas costumbres nos enseñan que antes de hacer un push, siempre debemos hacer un pull, un fetch, esto para que si alguien ya hizo algún cambio, no se genere un conflicto.

### Invitar a un colaborador

Estos son los pasos para invitar a un colaborador en un repositorio en Github:

1. Ir al repositorio en Github.
2. Settings -> colaborators (nos pedira ingresar contraseña o un 2FA de verificación).
3. Enviar la invitación escribiendo el nombre de usuario.

Del otro lado el usuario invitado solo debe aceptar y listo, ya puede participar del proyecto haciendo commit.

## Clase 5

### Git tag y versiones en GitHub

En Git, las etiquetas o tags tienen un papel importante al asignar versiones a los commits más significativos de un proyecto.

Aprender a utilizar el comando git tag, entender los diferentes tipos de etiquetas, cómo crearlas, eliminarlas y compartirlas, es esencial para un flujo de trabajo eficiente.

#### Creación de etiquetas en Git

Sustituye con un identificador semántico que refleje el estado del repositorio en el momento de la creación. Git admite etiquetas anotadas y ligeras:

* **Etiquetas anotadas:** Almacenan información adicional como la fecha, etiquetador y correo electrónico; son ideales para publicaciones públicas.

```bash
  git tag -a v-01-00 -m "Mensaje del tag"
```

* **Etiquetas ligeras:** Son más simples y funcionan como marcadores apuntando a un commit específico.

Si queremos crear el tag al commit en el que estamos ubicados:

```bash
  git tag v1.0
```

Si queremos crear el tag sobre un commit específico:

Ejecutamos:

```bash
  git log --oneline
```

Nos aparecera algo asi:

```bash
9261c41 Agrego clase 3 de github al readme.md
ee923fa Agrego clase 2 de github al readme.md
c362443 Termino clase 1 de github
```

Elegimos el commit y copiamos su identificador

```bash
  git tag v1.0 ee923fa
```

#### Listado de etiquetas

Para obtener una lista de etiquetas existentes en el repositorio, ejecutamos:

```bash
git tag
```

Esto mostrará una lista de las etiquetas existentes, como:

```sh
v1.0
v1.1
v1.2
```

Para perfeccionar la lista, puedes utilizar opciones adicionales, como -l con una expresión comodín.

```bash
git tag -l "v1.*"
```

### Uso compartido de etiquetas

Compartir etiquetas requiere un enfoque explícito al usar el comando git push. Por defecto, las etiquetas no se envían automáticamente. Para enviar etiquetas específicas, utiliza:

**Subir una etiqueta especifica:**

```bash
git push origin nombreTag
```

**Subir todas las etiquetas que tengamos:**

```bash
git push origin --tags
```

### Eliminación de etiquetas

Para eliminar una etiqueta, usa el siguiente comando:

```bash
git tag -d <nombreTag>
```

Esto eliminará la etiqueta identificada por "nombreTag" en el repositorio local.

En resumen, las etiquetas en Git son esenciales para asignar versiones y capturar instantáneas importantes en el historial de un proyecto. Aprender a crear, listar, compartir y eliminar etiquetas mejorará tu flujo de trabajo con Git.

## Clase 6

### Error con tags

> ¿Que pasa si por error cargamos un tag con el mismo nombre dos veces?

Si intentamos crear dos tags con el mismo nombre en Git, se produce un error, pues los tags deben tener nombres unicos dentro del repositorio. Git no permite crear un segundo tag con el mismo nombre.

Si intentamos subir un tag que ya existe en GitHub con git push, el servidor remoto también rechazará el envío para proteger la integridad de las versiones.

> ¿Como solucionamos este problema?

Para solucionarlo, podemos eliminar el tag incorrecto y volver a crearlo apuntando al commit correcto:

1. Verificamos todos los tags existentes:

```bash
git tag
```

2. Vemos a qué commit apunta el tag:

```bash
git show v1.0 # O la version que sea
```

3. Si el tag apunta al commit incorrecto, lo eliminamos localmente:

```bash
git tag -d v1.0
```

4. Eliminamos el tag del repositorio remoto:

```bash
git push origin --delete v1.0
```

5. Vemos los commits para copiar el identificador del commit correcto

```bash
git log --oneline
```

6. Ahora creamos el tag apuntando al commit correcto:

```bash
git tag v1.0 e23fa90
```

7. Lo subimos a github:

```bash
git push origin v1.0
```

Asi el tag v1.0 queda apuntando al commit correcto

## Clase 8

### Repaso: ¿Qué es Git?

Git es un sistema de control de versiones que permite registrar y administrar los cambios realizados en los archivos de un proyecto.

Nos permite guardar diferentes versiones de nuestro proyecto mediante commits, consultar el historial de cambios y trabajar con diferentes ramas sin afectar directamente la version principal.

Git tambien permite conectar nuestro repositorio local con un repositorio remoto, como GitHub, para trabajar en equipo, almacenar y compartir nuestro codigo.

### Manejo de ramas en GitHub

Las ramas nos permiten hacer cambios a nuestros archivos sin modificar la versión principal (main).

Podemos trabajar con ramas que nunca enviamos a GitHub, así como tambien pueden haber ramas importantes en GitHub que nunca usamos o tengamos en el repositorio local. Lo crucial es que aprendas a manejarlas para trabajar profesionalmente.

Si, estando en otra rama, modificamos los archivos y hacemos commit, tanto el historial (git log) como los archivos serán afectados.

La ventaja que tiene usar ramas es que las modificaciones solo afectarán a esa rama en particular.

Si luego de “guardar” los archivosn (usando commit) nos movemos a otra rama ```git checkout otraRama``` veremos como las modificaciones de la rama pasada no aparecen en la otraRama.

> **Comandos para manejo de ramas en GitHub**

```sh
  git branch branchName # Crear una rama
  git checkout -b branchName # Otro comando para crea una rama
  git checkout branchName # Movernos a una rama 
  git push origin branchName # Publicar una rama local al repositorio remoto
```

### Gitk

El comando ```gitk``` sirve para poder ver graficamente nuestro entorno y flujo de trabajo local con Git. Asi rambien podemos entender mejor todo el funcionamiento de ramas, merge y todo el flujo de un formato ordenado.

Gitk fue el primer visor grafico que se desarrollo para ver de manera grafica el historial de un repositorio en Git.

Si no funciona el comando ```gitk``` es posible no lo tengamos instalado por defecto. Para esto debemos ejecutar los siguientes comandos:

```sh
  sudo apt-get update
  sudo apt-get install gitk
```

## Clase 9

### Configurar múltiples colaboradores en un repositorio de GitHub

Por defecto, cualquier persona puede clonar o descargar tu proyecto desde GitHub, pero no pueden crear commits, ni ramas. Esto quiere decir que pueden copiar tu proyecto pero no colaborar con él, si este es publico, de otra manera, osea, si es privado es necesario que realmente estes haciendo una invitación, sino no lo van a poder ver. Existen varias formas de solucionar esto para poder aceptar contribuciones. Una de ellas es añadir a cada persona de nuestro equipo como colaborador de nuestro repositorio.

> ¿Cómo agregar colaboradores en Github?

1. En Github, ir a nuestro repositorio.
2. Settings -> Collaborators
3. Seleccionar la opción para agregar colaboradores.
4. Ingresar el nombre de usuario o email de las personas que queremos invitar.
5. Enviar la invitación y esperar a que la acepten.

### Corregir mensaje de un commit

Si como colaborador agregaste erróneamente el mensaje del commit, lo puedes cambiar de la siguiente manera:

```bash
git commit --amend # Corregir el mensaje
git pull origin main # Traer el repositorio remoto
git push --set-upstream origin main # Ejecutar el cambio, el error arreglado
```

### Comienzo del colaborador

1. Preparar el entorno de trabajo

```bash
cd Documentos
mkdir class-git
cd class-git
ls -al
```

2. Clonar el repositorio de Github

  1. Ingresar al repo en GitHub
  2. Copiar la URL
  3. Ejecutar el siguiente comando:

```bash
  git clone url-copiada-github
```

Esto descarga el repositorio y su historial al equipo local.

No pide ni usuario ni contraseña si el repositorio es publico. En uno privado, el usuario debe tener acceso y autenticarse cuando corresponda.

3. Realizar modificaciones

```bash
code . #Abre VSC para realizar los cambios
```

También podemos crear o modificar un archivo desde la terminal:

```bash
vim historia.txt
```

**Control de Vim (Git Bash en Windows o Ubuntu)**

- Esc para salir del modo de edicion.
- Escribir :wq!
- Presionar enter.

**Utilizando Nano**

- Presionar Ctrl + x
- Presionar s
- Presionar enter

4. Revisar y registrar los cambios, hacer el primer commit

```bash
git status
git commit -am "Mi primer commit"
git pull origin main
git fetch
git branch
git log
git log --graph
git push origin main
```

- git status: muestra el estado de los archivos.
- git commit -am: crea un commit con los cambios de archivos que Git ya está siguiendo.
- git pull origin main: trae e integra los cambios de la rama remota main.
- git fetch: descarga información del repositorio remoto sin integrar los cambios.
- git branch: muestra las ramas locales. Para ver también las ramas remotas, utilizamos git branch -a.
- git log: muestra el historial de commits.
- git log --graph: muestra gráficamente las relaciones entre los commits.
- git push origin main: intenta subir los cambios a la rama remota main, Va a pedir un email que será el del colaborador, su contraseña.

5. Error de permisos al subir los cambios

Si GitHub devuelve un error de permisos al ejecutar git push origin main, puede deberse a que el propietario del repositorio todavía no autorizó al colaborador.

6. Agregar al colaborador en GitHub

Repositorio > Settings > Collaborators

Alli agregamos el correo o nombre de usuario: el colaborador debe tener un email publico y visible o de otra manera debera ser con el nombre de usuario publico: ingresar el username y debe ir como colaborador.

Se puede enviar un email con la url, pero ya GitHub envia una notificación al usuario de invitado, es una cosa que debemos empezar a consultar y revisar.

7. Volver a subir los cambios

El colaborador debe aceptar la invitación, una vez hecho eso ya tendrá total acceso para hacer push al repositorio.

```bash
git pull origin main
git push origin main #Colocar nombre de usuario y contraseña, listo
```

8. Verificar los cambios desde el repositorio del propietario

Si el dueño del repositorio no ve los cambios, debe actualizar y revisar el historial:

```bash
git pull origin main
git fetch
git log --stat
```

- git pull origin main: integra los cambios remotos en la rama local actual.
- git fetch: actualiza la información del repositorio remoto.
- git log --stat: muestra el historial de commits y los archivos modificados.

9. Distribuir el trabajo mediante ramas

A partir de ahora el dueño del repositorio y el colaborador deberán repartir el trabajo, esto se hace con distintas ramas de trabajo: el dueño trabajará desde la rama header y el colaborador desde la rama footer, al final cuando se termine, se hara un merge para terminar el proyecto.

## Clase 10

### Flujo de trabajo profesional: hacer merge de ramas de desarrollo a main

Para poder desarrollar software de manera óptima y ordenada, necesitamos tener un flujo de trabajo profesional, que nos permita trabajar en conjunto sin interrumpir el trabajo de otros desarrolladores.

Una buena práctica de flujo de trabajo sería la siguiente:

1. Crear ramas.
2. Asignar una rama a cada programador.
3. El programador baja el repositorio con `git pull origin main` (en la clase se nombró como `master`, que es lo mismo que `main`, como vimos en la Clase 3).
4. El programador cambia de rama.
5. El programador trabaja en esa rama y hace commits.
6. El programador sube su trabajo con `git push origin nombre_rama`.
7. El encargado de organizar el proyecto baja, revisa y unifica todos los cambios.

```sh
git pull origin main # Bajamos el repositorio
git checkout nombre_rama # Cambiamos a nuestra rama de trabajo
git add .
git commit -m "Descripcion del cambio" # Trabajamos y hacemos commits en nuestra rama
git push origin nombre_rama # Subimos nuestro trabajo a GitHub
```

Y el encargado de organizar el proyecto unifica los cambios en `main`:

```sh
git checkout main # Nos paramos en la rama principal
git pull origin main # La actualizamos
git merge nombre_rama # Unificamos los cambios de la rama del programador
git push origin main # Subimos el resultado final a GitHub
```

## Clase 11

### Flujo de trabajo profesional: archivos binarios

Cargar imágenes en el repositorio representa un problema: las imágenes son pesadas, y si las subimos al repositorio, cada vez que hagamos cambios vamos a estar trayendo la imagen nuevamente. Para GitHub, estas imágenes son **archivos binarios**, y mientras más binarios carguemos, más pesado va a ser el repositorio, algo que no forma parte de las buenas prácticas.

Otra cosa muy importante a tener en cuenta es que cada commit tiene un **tamaño máximo de carga predefinido de 100 MB**. Si lo superamos, no podremos subir los commits. Si acoplamos un archivo binario que pese más que eso en un commit, será un problema: no nos dejará seguir commiteando, porque siempre seguirá arrastrando el archivo binario.

> **Buena práctica:** evitar subir archivos binarios pesados (imágenes, videos, etc.) al repositorio.

## Clase 12

### Flujo de trabajo profesional: ya hemos llegado al nivel más alto de GitHub

Con esta clase llegamos al nivel más alto de GitHub dentro del curso. Ya terminando el semestre, este `README.md` debe estar completo, escrito en lenguaje **Markdown**, con todos los comandos y prácticas vistos en cada clase.

El archivo se presenta en clase en vivo por Zoom.
