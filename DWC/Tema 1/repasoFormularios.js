document.addEventListener('DOMContentLoaded', () => {
  const form = document.getElementById('formPersona');
  const imgPreview = document.getElementById('imgPreview');
  
  form.avatar.addEventListener('change', () => {
    const file = form.avatar.files[0];
    if (!file) {
      imgPreview.src = '';
      return;
    }

    const reader = new FileReader();
    reader.readAsDataURL(file);
    reader.addEventListener('load', () => imgPreview.src = reader.result);
  });

  form.addEventListener('submit', function (event) {
    event.preventDefault();
    const nombre = form.nombre.value;
    const hobbies = Array.from(form.hobbies)
      .filter(h => h.checked)
      .map(h => h.value);

    console.log("Nombre: " + nombre);
    console.log("Aficiones: " + hobbies);
  });
});
