Array.prototype.Mypush = function(items){
  for (let item of arguments){
    this[this.length] = item;
  }

  return this.length
}


const teste = [2, 3, 4]

teste.Mypush(2, 4, 8, 9, 10, 12)


console.log(teste)