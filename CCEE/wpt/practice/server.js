const myPromise = new Promise((resolve, reject) => {
  const success = false; // Simulate success or failure

  if (success) {
    resolve("Operation was successful!");
  } else {
    reject("Operation failed.");
  }
});

// Consuming the promise
myPromise

  .then((result) => {
    console.log(result); // Logs: Operation was successful!
  })

  .catch((error) => {
    console.error(error); // Logs: Operation failed.
  });
