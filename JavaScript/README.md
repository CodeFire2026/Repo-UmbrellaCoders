# Funciones descriptivas en JavaScript


En JavaScript usamos la notación **camelCase** (la primera palabra en minúscula y las siguientes con la primera letra en mayúscula) y los identificadores se escriben normalmente en **inglés**. Un buen nombre de función debe decirnos **qué hace** sin necesidad de leer su código.

A continuación se explica el significado en español de cada función y sus puntos importantes.

---

## 1. Funciones de manipulación de datos

Son funciones que reciben datos, los procesan, los transforman o los revisan.

### `calculateTotalPrice()`
**Significado:** "calcular precio total".
- ✅ Es muy descriptiva
- ✅ Indica que hace un cálculo (`calculate`)
- ✅ Especifica qué calcula: el precio total (`TotalPrice`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `formatUserInput()`
**Significado:** "dar formato a lo que ingresa el usuario".
- ✅ Es muy descriptiva
- ✅ Indica que cambia la forma de los datos (`format`)
- ✅ Especifica sobre qué trabaja: lo que escribe el usuario (`UserInput`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `validateEmailAddress()`
**Significado:** "validar dirección de correo electrónico".
- ✅ Es muy descriptiva
- ✅ Indica que comprueba algo (`validate`)
- ✅ Especifica qué comprueba: un correo electrónico (`EmailAddress`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `convertToCamelCase()`
**Significado:** "convertir a camelCase".
- ✅ Es muy descriptiva
- ✅ Indica que transforma un dato en otro (`convert`)
- ✅ Especifica el resultado esperado: formato camelCase (`CamelCase`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `filterActiveUsers()`
**Significado:** "filtrar usuarios activos".
- ✅ Es muy descriptiva
- ✅ Indica que selecciona solo algunos elementos (`filter`)
- ✅ Especifica el criterio y los elementos: usuarios activos (`ActiveUsers`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

---

## 2. Eventos o interacción

Son funciones que responden a lo que hace el usuario en la página (clics, envíos de formularios, cambios de pantalla) o que preparan la aplicación.

### `handleButtonClick()`
**Significado:** "manejar el clic del botón".
- ✅ Es muy descriptiva
- ✅ Indica que atiende un evento (`handle`)
- ✅ Especifica qué evento: el clic en un botón (`ButtonClick`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `onFormSubmit()`
**Significado:** "al enviar el formulario".
- ✅ Es muy descriptiva
- ✅ El prefijo `on` indica que se ejecuta cuando ocurre algo
- ✅ Especifica cuándo se ejecuta: cuando se envía un formulario (`FormSubmit`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `toggleDarkMode()`
**Significado:** "alternar el modo oscuro".
- ✅ Es muy descriptiva
- ✅ Indica que cambia entre dos estados, encendido y apagado (`toggle`)
- ✅ Especifica qué se alterna: el modo oscuro (`DarkMode`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `updateProgressBar()`
**Significado:** "actualizar la barra de progreso".
- ✅ Es muy descriptiva
- ✅ Indica que modifica algo que ya existe (`update`)
- ✅ Especifica qué actualiza: la barra de progreso (`ProgressBar`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `initializeApp()`
**Significado:** "inicializar la aplicación".
- ✅ Es muy descriptiva
- ✅ Indica que prepara todo para empezar (`initialize`)
- ✅ Especifica qué inicia: la aplicación (`App`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

---

## 3. Operaciones CRUD

CRUD son las siglas en inglés de **Create, Read, Update, Delete** (crear, leer, actualizar y eliminar): las cuatro operaciones básicas que se hacen con los datos.

### `createNewUser()`
**Significado:** "crear nuevo usuario" (operación **Create**).
- ✅ Es muy descriptiva
- ✅ Indica que agrega algo nuevo (`create`)
- ✅ Especifica qué crea: un usuario (`NewUser`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `fetchUserData()`
**Significado:** "obtener los datos del usuario" (operación **Read**).
- ✅ Es muy descriptiva
- ✅ Indica que busca y trae información (`fetch`)
- ✅ Especifica qué trae: los datos del usuario (`UserData`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `updateUserProfile()`
**Significado:** "actualizar el perfil del usuario" (operación **Update**).
- ✅ Es muy descriptiva
- ✅ Indica que modifica algo que ya existe (`update`)
- ✅ Especifica qué modifica: el perfil del usuario (`UserProfile`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `deleteUserAccount()`
**Significado:** "eliminar la cuenta del usuario" (operación **Delete**).
- ✅ Es muy descriptiva
- ✅ Indica que borra algo (`delete`)
- ✅ Especifica qué borra: la cuenta del usuario (`UserAccount`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

---

## 4. Utilidades

Son funciones de ayuda, pequeñas y reutilizables, que sirven para muchas partes de un programa.

### `generateRandomId()`
**Significado:** "generar un identificador aleatorio".
- ✅ Es muy descriptiva
- ✅ Indica que produce un valor nuevo (`generate`)
- ✅ Especifica qué produce: un ID al azar (`RandomId`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `formatCurrency()`
**Significado:** "dar formato de moneda".
- ✅ Es muy descriptiva
- ✅ Indica que cambia la forma en que se muestra un dato (`format`)
- ✅ Especifica a qué formato: dinero (`Currency`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `debounceSearch()`
**Significado:** "retrasar la búsqueda hasta que el usuario deje de escribir".
- ✅ Es muy descriptiva para quien conoce el término `debounce`
- ✅ Indica que controla cuándo se ejecuta una acción (`debounce`)
- ✅ Especifica sobre qué actúa: la búsqueda (`Search`)
- ✅ Suena natural en inglés
- ✅ Evita ejecutar la búsqueda en cada tecla y mejora el rendimiento

### `sanitizeInput()`
**Significado:** "limpiar lo que ingresa el usuario".
- ✅ Es muy descriptiva
- ✅ Indica que limpia datos peligrosos o no deseados (`sanitize`)
- ✅ Especifica qué limpia: la entrada del usuario (`Input`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

### `checkPermissions()`
**Significado:** "verificar permisos".
- ✅ Es muy descriptiva
- ✅ Indica que comprueba algo (`check`)
- ✅ Especifica qué comprueba: los permisos del usuario (`Permissions`)
- ✅ Suena natural en inglés
- ✅ Fácil de entender para otros desarrolladores

---

## Conclusión

Un buen identificador de función usa **camelCase**, está en **inglés**, empieza con un **verbo** que indica la acción y continúa con el **objeto** sobre el que actúa. Así cualquier desarrollador entiende qué hace la función sin leer su código.
