// Jordi Vázquez Uribe
// JavaScript del programa principal para gestionar el AÑADIR/MOVER/BORRAR una tarjeta.
document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('task-form');
    const imgPreview = document.getElementById('image-preview');
    const template = document.getElementById('task-template');
    const divPrincipal = document.getElementById('divPrincipal');
    const today = new Date().toISOString().split('T')[0];
    form.deadLine.setAttribute('min', today);


    form.image.addEventListener('change', () => {
      
      const file = form.image.files[0];

      // Comprobaciones para la imagen.
      if (!file) {
        imgPreview.src = '';
        imgPreview.classList.add('hidden');
        return;
      }

      if(!file.type.startsWith("image")) {
          form.image.setCustomValidity("El archivo debe ser de tipo imagen");
      } else if(file.size > 200000) {
          form.image.setCustomValidity("No puedes seleccionar imágenes de más de 200KB");
      } else {
          form.image.setCustomValidity(""); // No hay error
      }
      form.image.reportValidity(); 


      const reader = new FileReader();
      reader.readAsDataURL(file);
      reader.addEventListener('load', () => { 
        imgPreview.src = reader.result 
        imgPreview.classList.remove('hidden');
      });
    });

    form.addEventListener('submit', function (e) {
      e.preventDefault();
      const newTask = {
        title: form.title.value,
        description: form.description.value,
        date: form.deadLine.value,
        image: imgPreview.src,
        status: 0
      };

      addTaskCard(newTask)

      // El formulario vuelve a los valores predefinidos.
      form.reset();
      imgPreview.src = "";
      imgPreview.classList.add('hidden');
    });


    // Funcion que añade una tarjeta utilizando un template.
    function addTaskCard(newTask) {
      const firstDiv = template.content.cloneNode(true).firstElementChild;
      const h4 = firstDiv.querySelector('#task-title');
      const p = firstDiv.querySelector('#task-description');
      const date = firstDiv.querySelector('#task-date');
      const img = firstDiv.querySelector('img');
      const btnDelete = firstDiv.querySelector('#task-delete');
      const options = firstDiv.querySelector('#task-options')
      const infoImg = form.querySelector('#image'); //Se guarda el input del formulario principal

      h4.textContent = newTask.title;
      p.textContent = newTask.description;
      date.textContent = "Fecha límite: " + new Date(newTask.date).toLocaleDateString('es-ES'); // La guardamos en el formato español
      options.value = newTask.status;

      if(infoImg.value != ""){ // Comprobacion si el input del formulario esta contemplado.
        // Si esta contemplado lo mostramos.
        img.classList.remove('hidden');
        img.src = newTask.image;
      }

      btnDelete.addEventListener('click', () => {
        // Borramos la tarjeta
        firstDiv.remove();
      });

      options.addEventListener('change', () => {
        // Movemos la tarjeta dependiendo de la opcion del select
        moveCard(firstDiv, options.value);
      });
  
      // El lugar predefinido al añadir la tarjeta.
      divPrincipal.appendChild(firstDiv);
    }
    function moveCard(card, option) {
    const pending = document.getElementById('divPrincipal');
    const progress = document.getElementById('task-progress');

    const completed = document.getElementById('task-completed');

    switch (option) {
      case '0':
        pending.appendChild(card);
        break;

      case '1':
        progress.appendChild(card);
        break;

      case '2':
        completed.appendChild(card);
        break;
    }
  }
})