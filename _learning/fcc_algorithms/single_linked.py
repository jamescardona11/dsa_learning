class Node:
    """
    An object for storing a single node of a linked list
    Models two attributes - data and the link to next node in the list
    """
    data = None
    next_node = None

    def __init__(self, data):
        self.data = data

    def __repr__(self):
        return "<Node data: %s>" % self.data

class LinkedList: 
    """
    Single Linked list
    """
    def __init__(self):
        self.head = None


    def __repr__(self):
        """
        Return a string representation of the list
        Takes 0(n) time
        """
        nodes = []
        current = self.head
        
        while current:
            if current is self.head:
                nodes.append (" [Head: %s]" % current.data)
            elif current. next_node is None:
                nodes.append ("[Tail: %s]" % current.data)
            else:
                nodes.append ("[%s]" % current.data)
            
            current = current.next_node

        return '->'.join(nodes)


    def is_empty(self):
        return self.head == None

    def size(self):
        current = self.head
        count = 0
        
        while current:
            count += 1
            current = current.next_node
        
        return count

    def add(self, data):
        new_node = Node(data)
        new_node.next_node = self.head
        self.head = new_node
    
    def insert(self, data, index):
        if index == 0:
            self.add(data)

        current = self.head
        position = index
        new_node = Node(data)

        while position > 1:
            current = current.next_node
            position -= 1

        prev_node = current
        next_node = current.next_node

        prev_node.next_node = new_node
        new_node.next_node = next_node

    def remove(self, key):
        current = self.head
        prev_node = None
        
        while current:
            if current.data == key and current is self.head:
                self.head = current.next_node
                break
            
            elif current.data == key:
                prev_node.next_node = current.next_node
                break

            else:
                prev_node = current
                current = current.next_node
    

    def node_at_index(self, index):
        if index == 0:
            return self.head
        else:
            current = self.head
            position = 0

            while position < index:
                current = current.next_node
                position += 1
        
            return current
        







list = LinkedList()
list.add(1)
list.add(2)
list.add(3)
list.add(5)
list.add(6)
list.insert(4,2)
print(list)
list.remove(6)
print(list)

print(list.is_empty())
print(list.size())


