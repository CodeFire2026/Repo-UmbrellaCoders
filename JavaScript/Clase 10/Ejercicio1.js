/*Ejercicio 1: Función que valide una contraseña (mínimo 8 caracteres, 1 número, 1 mayúscula)*/


function validatePassword(password) {
    if (password.length >= 8 && /[A-Z]/.test(password) && /[0-9]/.test(password)) {
    /*La primer condicion evalua si la contraseña tiene al menos 8 caracteres,
    la segunda si contiene al menos una letra mayúscula y la ultima un número*/
        return true; /*Devuelve true si la contraseña cumple las condiciones*/

    }
    return false; /*False si no cumple alguna condicion*/
}

console.log(validatePassword("Weak123"));

console.log(validatePassword("HelloWorld"));

console.log(validatePassword("Abc12345"));

