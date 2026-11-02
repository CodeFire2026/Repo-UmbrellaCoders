/* Ejercicio 2: Crear un sistema simple de gestión de tareas */

function createTaskManager() {

    let tasks = []; /*Arreglo para las tareas*/
    let IdTask = 1; /*contador id*/

    return {

        addTask: function (task) {
            tasks.push({ id: IdTask++, text: task, completed: false });//Agrega una tarea al arreglo de tareas, le asigna un id y la marca como no completada
        },
        completeTask: function(taskId) {
            const task = tasks.find(t => t.id === taskId); //Busca la tarea por su id
            if (task) { //Si la tarea existe la marca como completada
                task.completed = true;
            }
        },
        listTasks: function() {
            return tasks.map(task => `
            ${task.id}. ${task.completed ? '[x]' : '[ ]'} ${task.text}`); //Devuelve un arreglo con las tareas, primero  muestra el id, si está completada o no y la descripcion de la tarea
        }
    };
}

const myTasks = createTaskManager();

myTasks.addTask("Aprender JavaScript");
myTasks.addTask("Practicar POO y funciones");
myTasks.addTask("Tomar un cafe");
myTasks.addTask("Estudiar Python");

myTasks.completeTask(1);
myTasks.completeTask(2);
myTasks.completeTask(3);

console.log(myTasks.listTasks());
