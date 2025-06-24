import axios from "axios";

async function fetchTodo() {
  try {
    const response = await axios.get(
      "https://jsonplaceholder.typicode.com/todos/1"
    );

    console.log(response.data);
  } catch (error) {
    console.error("Error fetching todo:", error);
  }
}

fetchTodo();
