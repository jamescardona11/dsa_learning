from single_linked import LinkedList

def merge_sort(linked_list):
    if linked_list.size() == 1:
        return linked_list
    elif linked_list.head is None:
        return linked_list

    left_half, right_half = split(linked_list)
    left = merge_sort(left_half)
    right = merge_sort(right_half)

    return merge(left, right)


def split(linked_list):
    if linked_list == None or linked_list.head == None:
        left_half = linked_list
        right_half = None

        return left_half, right_half
    else:
        size = linked_list.size()
        mid = size//2

        mid_node = linked_list.node_at_index(mid -1)

        left_half = linked_list
        right_half = LinkedList()
        right_half.head = mid_node.next_node
        mid_node.next_node = None


        return left_half, right_half


def merge(left, right):
    """
    Merges two linked lists, sorting by data in nodes
    Returns a new, merged list
    """

    # create a new linked list that contains nodes from
    # merging left and right
    merged = LinkedList()
    
    # add fake head that is discarded later
    merged.add(0)

    # set current to the head of the linked list
    current = merged.head

    # obtain head nodes for left and right linked list
    left_head = left.head
    right_head = right.head

    # iterate over left and right until we react the tail node of either

    while left_head or right_head:
        # if the head node of left is None, we're past the tail
        # add the node from right to merge linked list
        if left_head is None:
            current.next_node = right_head
            # call next on right to set loop condition to false
            right_head = right_head.next_node
        elif right_head is None:
            current.next_node = left_head
            # call next on left to set loop condition to false
            left_head = left_head.next_node
        else:
            # not at either tail node
            # obtain node data to perform comparison operations
            left_data = left_head.data
            right_data = right_head.data

            #if data on left is less that right, set current to left node
            if left_data < right_data:
                current.next_node = left_head
                # move left head to next node
                left_head = left_head.next_node
            else:
                current.next_node = right_head
                right_head = right_head.next_node
    
        # move current to next node
        current = current.next_node

    # discard fake head and set first merged node as head
    head = merged.head.next_node
    merged.head = head

    return merged


list = LinkedList()
list.add(1)
list.add(172)
list.add(91)
list.add(2)
list.add(45)
list.add(3)
list.add(10)
list.add(19)
list.add(-11)
list.add(-38)


r = merge_sort(list)

print(r)