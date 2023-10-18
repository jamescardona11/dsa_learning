class Node {
  constructor(data){
    this.data = data
    this.nextNode = null
  }
}


class LinkedList {
  constructor(){
    this.head = null
    
  }

  isEmpty() {
    return this.head == null
  }

  size(){
    let current = this.head
    let count = 0
    
    while (current != null){
      count++
      current = current.nextNode
    }

    return count
  }

  search(key){
    let current = this.head

    while(current != null){
      if(current.data === key){
        return current
      }

      current = current.nextNode
    }
    return null
  }

  add(data){
    let newNode = new Node(data)
    newNode.nextNode =  this.head
    this.head = newNode
  }

  toString() {
    let nodes = [];
    let current = this.head;
  
    while (current != null) {
      if (current === this.head) {
        nodes.push(`[Head: ${current.data}]`);
      } else if (current.nextNode === null) {
        nodes.push(`[Tail: ${current.data}]`);
      } else {
        nodes.push(`[${current.data}]`);
      }
  
      current = current.nextNode;
    }

  
    console.log(nodes)
    return nodes.join('->').toString();
  }
}


const list = new LinkedList()

console.log(list.isEmpty())
console.log(list.size())
list.add(1)
list.add(2)
list.add(3)
list.add(4)
list.add(5)
console.log(list.search(4))
console.log(list.search(9))

console.log('--')
console.log(list.toString())
