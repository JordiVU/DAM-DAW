// Completa este archivo
document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('task-form');
    const imgPreview = document.getElementById('image-preview');
    const template = document.getElementById('task-template');


    form.image.addEventListener('change', () => {
    const file = form.image.files[0];
    if (!file) {
      imgPreview.src = '';
      return;
    }

    const reader = new FileReader();
    reader.readAsDataURL(file);
    reader.addEventListener('load', () => { 
        imgPreview.src = reader.result 
        imgPreview.classList.remove('hidden');
    });
  });

    form.addEventListener('submit', function (event) {
    event.preventDefault();
        const newTask = {
        title: form.title.value,
        description: form.description.value,
        date: form.deadLine.value,
        image: imgPreview.src
    };

    addTaskCard(newTask)

  });

    function addTaskCard(newTask) {
        const tr = template.content.cloneNode(true).firstElementChild;
        const tdName = tr.querySelector('.name');
        const tdPrice = tr.querySelector('.price');
        const img = tr.querySelector('img');
        const btnBorrar = tr.querySelector('.delete');

        tdName.textContent = product.name;
        tdPrice.textContent = product.price;
        img.src = product.image;

        btnBorrar.addEventListener('click', () => {
            tr.remove();
            // btnBorrar.closest('tr').remove();
        });
        
        tbody.append(tr);
    }

})