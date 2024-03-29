Array.prototype.Myfilter = function(callback) {
  var novoArray = []; // Create an empty array to store filtered elements

  for (let indice = 0; indice < this.length; indice++) {
    const filtro = callback(this[indice], indice, this); // Call the callback function with current element, index, and the array itself

    if (filtro) {
      novoArray.push(this[indice]); // If the callback returns true, add the element to the new array
    }
  }

  return novoArray; // Return the new filtered array
} 

const teste = [10, 1, 2, 3, 4, 5, 8];

console.log(teste.Myfilter((n, index, array) => n > 4)); // Filter elements greater than 4
