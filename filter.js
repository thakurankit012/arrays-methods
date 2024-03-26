Array.prototype.Myfilter = function(callback) {
  var novoArray = []
  
  for (let indice = 0; indice < this.length; indice++){
    const filtro = callback(this[indice], indice, this)

    if (filtro){
      novoArray.push(this[indice])
    } 
  }

  return novoArray;
} 


const teste = [10, 1, 2, 3, 4, 5, 8]

console.log(teste.Myfilter((n, index, array) => n > 4))