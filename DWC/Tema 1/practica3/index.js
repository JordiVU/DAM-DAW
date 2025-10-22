// Completa este archivo
document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('task-form');
    const imgPreview = document.getElementById('image-preview');
    const template = document.getElementById('task-template');
    const divPrincipal = document.getElementById('divPrincipal');


    form.image.addEventListener('change', () => {
      const file = form.image.files[0];
      if (!file) {
        imgPreview.src = '';
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
          image: imgPreview.src
        };

      addTaskCard(newTask)
      form.reset();
      imgPreview.src = "";
      imgPreview.classList.add('hidden');
    });


    function addTaskCard(newTask) {
      const firstDiv = template.content.cloneNode(true).firstElementChild;
      const h4 = firstDiv.querySelector('#task-title');
      const p = firstDiv.querySelector('#task-description');
      const date = firstDiv.querySelector('#task-date');
      const img = firstDiv.querySelector('img');
      const btnBorrar = firstDiv.querySelector('#task-delete');

      h4.textContent = newTask.title;
      p.textContent = newTask.description;
      date.textContent = "Fecha límite: " + newTask.date;

      img.classList.remove('hidden');

      btnBorrar.addEventListener('click', () => {
        firstDiv.remove();
      });
      
      divPrincipal.appendChild(firstDiv);
    }
})