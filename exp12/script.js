const addBtn = document.getElementById('addBtn');
const taskInput = document.getElementById('taskInput');
const taskList = document.getElementById('taskList');

// Function to add a new task
addBtn.addEventListener('click', function() {
  const taskText = taskInput.value.trim();
  if (taskText === "") return;

  const li = document.createElement('li');
  li.textContent = taskText;

  // Toggle completion on click
  li.addEventListener('click', function() {
    li.classList.toggle('completed');
  });

  // Create remove button
  const removeBtn = document.createElement('button');
  removeBtn.textContent = "Remove";
  removeBtn.classList.add('remove-btn');

  removeBtn.addEventListener('click', function(event) {
    event.stopPropagation(); // Prevent toggling completion when clicking remove
    li.remove();
  });

  li.appendChild(removeBtn);
  taskList.appendChild(li);
  taskInput.value = "";
});
