# https://www.studytonight.com/data-structures/binary-search-algorithm
# Time Complexity of Binary Search O(log n)
# Expression: log2(n)
# - - - - - - - - - - - - - - -
# For n = 2:
# log2(2^1) = 1
# Output = 1
# - - - - - - - - - - - - - - -
# For n = 4
# log2(2^2) = 2
# Output = 2
# - - - - - - - - - - - - - - -
# For n = 8
# log2(2^3) = 3
# Output = 3
# - - - - - - - - - - - - - - -
# For n = 256
# log2(2^8) = 8
# Output = 8
# - - - - - - - - - - - - - - -
# For n = 2048
# log2(2^11) = 11
# Output = 11

# For n = 8, the output of log2 n comes out to be 3, 
# which means the array can be halved 3 times maximum, 
# hence the number of steps(at most) to find the target value will be (3 + 1) = 4.




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




