
Array.prototype.myReduce = function(callback, valorIncial){
  let valorFinal = typeof valorIncial !== undefined ? valorIncial : this[0]

  for(let index = 0; index < this.length; index++){
    valorFinal = callback(valorFinal, this[index], this)

  }

  return valorFinal;
} 


let teste = [55, 42]


var resultadoTeste = teste.myReduce((anterior, proximo) =>  anterior + proximo, 0)

console.log(resultadoTeste)