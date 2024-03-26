Array.prototype.Mymap = function(callback){
  var novoArray = [];

  for (let indice = 0; indice < this.length; indice++){
    const resultado = callback(this[indice], indice, this)

    novoArray.push(resultado)
  }

  return novoArray;
}


var teste = [1, 3, 5, 6]

console.log(teste.Mymap(n => n + 3))