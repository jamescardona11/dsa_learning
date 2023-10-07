def binary_search(list, target):
    """
    Return the index position of the target if found, else returns None
    """
    first = 0
    last = len(list) - 1

    while(first <= last):
        midpoint = (first + last)//2
        if(list[midpoint] == target):
            return midpoint
        elif list[midpoint] < target:
            first = midpoint + 1
        else:
            last = midpoint - 1


    return None


def bs_recursive(list, target):
    """
    Return the index position of the target if found, else returns None
    """
    
    first = 0
    last = len(list) - 1
    midpoint = (first + last)//2


    if len(list) == 0:
        return None
    elif list[midpoint] == target:
        return midpoint
    elif list[midpoint] < target:
        return bs_recursive(list[midpoint+1:], target)
    else:
        return bs_recursive(list[first:midpoint], target)





def verify(index):
    if index is not None:
        print("Target found at index: ", index)
    else:
        print("Target not found in list")


numbers = [1,2,3,4,5,6,7,8,9,10]

result = binary_search(numbers, 6)
result2 = bs_recursive(numbers, 2)
verify(result)
verify(result2)




