t = int(input())

while t != 0:
    n, k = map(int, input().split())
    arr = map(int, input().split())
    print(arr)
    index = n - (k % n)
    for i in range(index, n):
        print(arr[i])
    for i in range(index):
        print(arr[i])
    print("")
    t -= 1

